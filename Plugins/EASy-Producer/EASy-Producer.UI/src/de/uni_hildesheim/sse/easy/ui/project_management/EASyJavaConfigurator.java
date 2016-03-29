/*
 * Copyright 2009-2015 University of Hildesheim, Software Systems Engineering
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package de.uni_hildesheim.sse.easy.ui.project_management;

import java.io.File;

import org.eclipse.core.resources.IFolder;
import org.eclipse.core.resources.IProject;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IPath;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.JavaCore;
import org.eclipse.jdt.ui.wizards.JavaCapabilityConfigurationPage;

import de.uni_hildesheim.sse.easy.ui.internal.Activator;
import de.uni_hildesheim.sse.easy_producer.ProjectConstants;
import de.uni_hildesheim.sse.easy_producer.persistency.project_creation.IEASyProjectConfigurator;
import net.ssehub.easy.basics.logger.EASyLoggerFactory;

/**
 * Configures a new created {@link IProject} to an Java project with lib and ressources folder.
 * @author El-Sharkawy
 *
 */
public class EASyJavaConfigurator implements IEASyProjectConfigurator {

    @Override
    public void configure(IProject project) {
        JavaCapabilityConfigurationPage jcpage = new JavaCapabilityConfigurationPage();
        IJavaProject javaProject = JavaCore.create(project);

        jcpage.init(javaProject, null, null, false);
        try {
            jcpage.configureJavaProject(null);
        } catch (CoreException e1) {
            EASyLoggerFactory.INSTANCE.getLogger(EASyJavaConfigurator.class, Activator.PLUGIN_ID).exception(e1);
        } catch (InterruptedException e1) {
            EASyLoggerFactory.INSTANCE.getLogger(EASyJavaConfigurator.class, Activator.PLUGIN_ID).exception(e1);
        }
        
        
        // Create default java folders and settings
        try {
            project.getFolder(ProjectConstants.FOLDER_LIBS).create(false, true, null);
            IFolder resFolder = project.getFolder(ProjectConstants.FOLDER_RES);
            resFolder.create(false, true, null);
            IClasspathEntry resEntry = JavaCore.newSourceEntry(resFolder.getFullPath());
            IClasspathEntry[] currentEntries = javaProject.getRawClasspath();
            IClasspathEntry[] newEntries = new IClasspathEntry[currentEntries.length + 1];
            System.arraycopy(currentEntries, 0, newEntries, 0, currentEntries.length);
            newEntries[newEntries.length - 1] = resEntry;
            javaProject.setRawClasspath(newEntries, null);
        } catch (CoreException e) {
            EASyLoggerFactory.INSTANCE.getLogger(EASyJavaConfigurator.class, Activator.PLUGIN_ID).exception(e);
        }
    }

    @Override
    public void configure(IProject project, IProject parentProject) {
        JavaCapabilityConfigurationPage jcpage = new JavaCapabilityConfigurationPage();
        IJavaProject javaProject = JavaCore.create(project);
        IJavaProject javaParentProject = JavaCore.create(parentProject);

        jcpage.init(javaProject, null, null, false);
        try {
            jcpage.configureJavaProject(null);
        } catch (CoreException e1) {
            EASyLoggerFactory.INSTANCE.getLogger(EASyJavaConfigurator.class, Activator.PLUGIN_ID).exception(e1);
        } catch (InterruptedException e1) {
            EASyLoggerFactory.INSTANCE.getLogger(EASyJavaConfigurator.class, Activator.PLUGIN_ID).exception(e1);
        }
        
        // Try to copy settings from parent
        try {
            project.getFolder(ProjectConstants.FOLDER_LIBS).create(false, true, null);
            IFolder resFolder = project.getFolder(ProjectConstants.FOLDER_RES);
            resFolder.create(false, true, null);
            IClasspathEntry[] parrentEntries = javaParentProject.getRawClasspath();
            IClasspathEntry[] newEntries = new IClasspathEntry[parrentEntries.length];
            
            // Copy Classpath Entries
            for (int i = 0; i < newEntries.length; i++) {
                IClasspathEntry parentEntry = parrentEntries[i];
                newEntries[i] = javaProject.decodeClasspathEntry(javaParentProject.encodeClasspathEntry(parentEntry));
                
                try {
                    IPath entryPath = newEntries[i].getPath().makeAbsolute();
                    if (project.getFullPath().matchingFirstSegments(entryPath) > 0) {
                        File entryFile = entryPath.toFile();
                        IFolder folder = project.getFolder(entryFile.getName());
                        if (!folder.exists()) {
                            folder.create(false, true, null);
                        }
                    }
                } catch (CoreException e) {
                    EASyLoggerFactory.INSTANCE.getLogger(EASyJavaConfigurator.class, Activator.PLUGIN_ID).exception(e);
                }
            }
            javaProject.setRawClasspath(newEntries, null);
        } catch (CoreException e) {
            EASyLoggerFactory.INSTANCE.getLogger(EASyJavaConfigurator.class, Activator.PLUGIN_ID).exception(e);
        }
        
    }

}
