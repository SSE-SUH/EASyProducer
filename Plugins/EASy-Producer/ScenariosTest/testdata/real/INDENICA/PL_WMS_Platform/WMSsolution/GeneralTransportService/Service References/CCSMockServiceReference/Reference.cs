﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.239
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace GeneralTransportService.CCSMockServiceReference {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="CCSMockServiceReference.ICCSMockService", CallbackContract=typeof(ICCSMockServiceCallback))]
    public interface ICCSMockService {
        
        [System.ServiceModel.OperationContractAttribute(IsOneWay=true, Action="http://tempuri.org/ICCSMockService/Move")]
        void Move(string boxId, string transportMedium, string startLocId, string entLocId);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/ICCSMockService/Dummy", ReplyAction="http://tempuri.org/ICCSMockService/DummyResponse")]
        void Dummy();
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface ICCSMockServiceCallback {
        
        [System.ServiceModel.OperationContractAttribute(IsOneWay=true, Action="http://tempuri.org/ICCSMockService/MoveFinished")]
        void MoveFinished(string boxId, string endDestId);
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface ICCSMockServiceChannel : ICCSMockService, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class CCSMockServiceClient : System.ServiceModel.DuplexClientBase<ICCSMockService>, ICCSMockService {
        
        public CCSMockServiceClient(System.ServiceModel.InstanceContext callbackInstance) : 
                base(callbackInstance) {
        }
        
        public CCSMockServiceClient(System.ServiceModel.InstanceContext callbackInstance, string endpointConfigurationName) : 
                base(callbackInstance, endpointConfigurationName) {
        }
        
        public CCSMockServiceClient(System.ServiceModel.InstanceContext callbackInstance, string endpointConfigurationName, string remoteAddress) : 
                base(callbackInstance, endpointConfigurationName, remoteAddress) {
        }
        
        public CCSMockServiceClient(System.ServiceModel.InstanceContext callbackInstance, string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(callbackInstance, endpointConfigurationName, remoteAddress) {
        }
        
        public CCSMockServiceClient(System.ServiceModel.InstanceContext callbackInstance, System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(callbackInstance, binding, remoteAddress) {
        }
        
        public void Move(string boxId, string transportMedium, string startLocId, string entLocId) {
            base.Channel.Move(boxId, transportMedium, startLocId, entLocId);
        }
        
        public void Dummy() {
            base.Channel.Dummy();
        }
    }
}
