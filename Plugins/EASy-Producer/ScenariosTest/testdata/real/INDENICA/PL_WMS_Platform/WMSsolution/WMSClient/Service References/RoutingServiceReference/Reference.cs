﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.239
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace WMSClient.RoutingServiceReference {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="RoutingServiceReference.IRoutingService")]
    public interface IRoutingService {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IRoutingService/GetNextDestination", ReplyAction="http://tempuri.org/IRoutingService/GetNextDestinationResponse")]
        string GetNextDestination(string boxId, string binId);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IRoutingService/GetNextTransportMedium", ReplyAction="http://tempuri.org/IRoutingService/GetNextTransportMediumResponse")]
        string GetNextTransportMedium(string boxId);
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface IRoutingServiceChannel : WMSClient.RoutingServiceReference.IRoutingService, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class RoutingServiceClient : System.ServiceModel.ClientBase<WMSClient.RoutingServiceReference.IRoutingService>, WMSClient.RoutingServiceReference.IRoutingService {
        
        public RoutingServiceClient() {
        }
        
        public RoutingServiceClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public RoutingServiceClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public RoutingServiceClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public RoutingServiceClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        public string GetNextDestination(string boxId, string binId) {
            return base.Channel.GetNextDestination(boxId, binId);
        }
        
        public string GetNextTransportMedium(string boxId) {
            return base.Channel.GetNextTransportMedium(boxId);
        }
    }
}
