﻿//------------------------------------------------------------------------------
// <auto-generated>
//     This code was generated by a tool.
//     Runtime Version:4.0.30319.239
//
//     Changes to this file may cause incorrect behavior and will be lost if
//     the code is regenerated.
// </auto-generated>
//------------------------------------------------------------------------------

namespace TransportPlanningService.MaterialMgtServiceReference {
    
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    [System.ServiceModel.ServiceContractAttribute(ConfigurationName="MaterialMgtServiceReference.IMaterialMgtService")]
    public interface IMaterialMgtService {
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/CreateBox", ReplyAction="http://tempuri.org/IMaterialMgtService/CreateBoxResponse")]
        [System.ServiceModel.TransactionFlowAttribute(System.ServiceModel.TransactionFlowOption.Allowed)]
        bool CreateBox(string boxId);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/CreateMaterial", ReplyAction="http://tempuri.org/IMaterialMgtService/CreateMaterialResponse")]
        [System.ServiceModel.TransactionFlowAttribute(System.ServiceModel.TransactionFlowOption.Allowed)]
        bool CreateMaterial(string materialNumber, string name, string description);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/InsertMaterial", ReplyAction="http://tempuri.org/IMaterialMgtService/InsertMaterialResponse")]
        [System.ServiceModel.TransactionFlowAttribute(System.ServiceModel.TransactionFlowOption.Allowed)]
        bool InsertMaterial(string boxId, string content, int quantity);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/CreateLocation", ReplyAction="http://tempuri.org/IMaterialMgtService/CreateLocationResponse")]
        [System.ServiceModel.TransactionFlowAttribute(System.ServiceModel.TransactionFlowOption.Allowed)]
        bool CreateLocation(string locId, string typeId, string rackId, bool reserved);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/CreateTransportentry", ReplyAction="http://tempuri.org/IMaterialMgtService/CreateTransportentryResponse")]
        [System.ServiceModel.TransactionFlowAttribute(System.ServiceModel.TransactionFlowOption.Allowed)]
        bool CreateTransportentry(string boxId, string binId);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/DeleteTransportentry", ReplyAction="http://tempuri.org/IMaterialMgtService/DeleteTransportentryResponse")]
        bool DeleteTransportentry(string boxId);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/CreateOrder", ReplyAction="http://tempuri.org/IMaterialMgtService/CreateOrderResponse")]
        bool CreateOrder(string orderId, string dockId, bool isUnloading, bool toBeCleaned);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/DeleteOrder", ReplyAction="http://tempuri.org/IMaterialMgtService/DeleteOrderResponse")]
        bool DeleteOrder(string orderId);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/Ready", ReplyAction="http://tempuri.org/IMaterialMgtService/ReadyResponse")]
        bool Ready(bool unloading, int numberOfBoxes, bool toBeCleaned);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/ProcessOrder", ReplyAction="http://tempuri.org/IMaterialMgtService/ProcessOrderResponse")]
        void ProcessOrder(string orderId, string dockId, bool isUnloading, bool toBeCleaned);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/Finished", ReplyAction="http://tempuri.org/IMaterialMgtService/FinishedResponse")]
        void Finished(string orderId);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/ReserveBin", ReplyAction="http://tempuri.org/IMaterialMgtService/ReserveBinResponse")]
        [System.ServiceModel.TransactionFlowAttribute(System.ServiceModel.TransactionFlowOption.Allowed)]
        bool ReserveBin(string binId);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/UnReserveBin", ReplyAction="http://tempuri.org/IMaterialMgtService/UnReserveBinResponse")]
        [System.ServiceModel.TransactionFlowAttribute(System.ServiceModel.TransactionFlowOption.Allowed)]
        bool UnReserveBin(string binId);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/SetLocation", ReplyAction="http://tempuri.org/IMaterialMgtService/SetLocationResponse")]
        [System.ServiceModel.TransactionFlowAttribute(System.ServiceModel.TransactionFlowOption.Allowed)]
        bool SetLocation(string boxId, string binId);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/GetBoxes", ReplyAction="http://tempuri.org/IMaterialMgtService/GetBoxesResponse")]
        DataAccess.Box[] GetBoxes();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/GetBoxesOnRS", ReplyAction="http://tempuri.org/IMaterialMgtService/GetBoxesOnRSResponse")]
        DataAccess.Box[] GetBoxesOnRS();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/GetMaterials", ReplyAction="http://tempuri.org/IMaterialMgtService/GetMaterialsResponse")]
        DataAccess.Material[] GetMaterials();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/GetPositions", ReplyAction="http://tempuri.org/IMaterialMgtService/GetPositionsResponse")]
        DataAccess.Position[] GetPositions();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/GetLocations", ReplyAction="http://tempuri.org/IMaterialMgtService/GetLocationsResponse")]
        DataAccess.Location[] GetLocations();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/GetStorageBins", ReplyAction="http://tempuri.org/IMaterialMgtService/GetStorageBinsResponse")]
        DataAccess.Location[] GetStorageBins();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/GetLocationTypes", ReplyAction="http://tempuri.org/IMaterialMgtService/GetLocationTypesResponse")]
        DataAccess.Locationtype[] GetLocationTypes();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/GetRacks", ReplyAction="http://tempuri.org/IMaterialMgtService/GetRacksResponse")]
        DataAccess.Rack[] GetRacks();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/GetTransportentries", ReplyAction="http://tempuri.org/IMaterialMgtService/GetTransportentriesResponse")]
        DataAccess.Transportentry[] GetTransportentries();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/GetOrders", ReplyAction="http://tempuri.org/IMaterialMgtService/GetOrdersResponse")]
        DataAccess.Order[] GetOrders();
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/GetLocationtypeIdByName", ReplyAction="http://tempuri.org/IMaterialMgtService/GetLocationtypeIdByNameResponse")]
        string GetLocationtypeIdByName(string locationName);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/GetRackIdByName", ReplyAction="http://tempuri.org/IMaterialMgtService/GetRackIdByNameResponse")]
        string GetRackIdByName(string rackName);
        
        [System.ServiceModel.OperationContractAttribute(Action="http://tempuri.org/IMaterialMgtService/RecreateSampleDatabase", ReplyAction="http://tempuri.org/IMaterialMgtService/RecreateSampleDatabaseResponse")]
        bool RecreateSampleDatabase(string sqlConnString);
    }
    
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public interface IMaterialMgtServiceChannel : IMaterialMgtService, System.ServiceModel.IClientChannel {
    }
    
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.CodeDom.Compiler.GeneratedCodeAttribute("System.ServiceModel", "4.0.0.0")]
    public partial class MaterialMgtServiceClient : System.ServiceModel.ClientBase<IMaterialMgtService>, IMaterialMgtService {
        
        public MaterialMgtServiceClient() {
        }
        
        public MaterialMgtServiceClient(string endpointConfigurationName) : 
                base(endpointConfigurationName) {
        }
        
        public MaterialMgtServiceClient(string endpointConfigurationName, string remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public MaterialMgtServiceClient(string endpointConfigurationName, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(endpointConfigurationName, remoteAddress) {
        }
        
        public MaterialMgtServiceClient(System.ServiceModel.Channels.Binding binding, System.ServiceModel.EndpointAddress remoteAddress) : 
                base(binding, remoteAddress) {
        }
        
        public bool CreateBox(string boxId) {
            return base.Channel.CreateBox(boxId);
        }
        
        public bool CreateMaterial(string materialNumber, string name, string description) {
            return base.Channel.CreateMaterial(materialNumber, name, description);
        }
        
        public bool InsertMaterial(string boxId, string content, int quantity) {
            return base.Channel.InsertMaterial(boxId, content, quantity);
        }
        
        public bool CreateLocation(string locId, string typeId, string rackId, bool reserved) {
            return base.Channel.CreateLocation(locId, typeId, rackId, reserved);
        }
        
        public bool CreateTransportentry(string boxId, string binId) {
            return base.Channel.CreateTransportentry(boxId, binId);
        }
        
        public bool DeleteTransportentry(string boxId) {
            return base.Channel.DeleteTransportentry(boxId);
        }
        
        public bool CreateOrder(string orderId, string dockId, bool isUnloading, bool toBeCleaned) {
            return base.Channel.CreateOrder(orderId, dockId, isUnloading, toBeCleaned);
        }
        
        public bool DeleteOrder(string orderId) {
            return base.Channel.DeleteOrder(orderId);
        }
        
        public bool Ready(bool unloading, int numberOfBoxes, bool toBeCleaned) {
            return base.Channel.Ready(unloading, numberOfBoxes, toBeCleaned);
        }
        
        public void ProcessOrder(string orderId, string dockId, bool isUnloading, bool toBeCleaned) {
            base.Channel.ProcessOrder(orderId, dockId, isUnloading, toBeCleaned);
        }
        
        public void Finished(string orderId) {
            base.Channel.Finished(orderId);
        }
        
        public bool ReserveBin(string binId) {
            return base.Channel.ReserveBin(binId);
        }
        
        public bool UnReserveBin(string binId) {
            return base.Channel.UnReserveBin(binId);
        }
        
        public bool SetLocation(string boxId, string binId) {
            return base.Channel.SetLocation(boxId, binId);
        }
        
        public DataAccess.Box[] GetBoxes() {
            return base.Channel.GetBoxes();
        }
        
        public DataAccess.Box[] GetBoxesOnRS() {
            return base.Channel.GetBoxesOnRS();
        }
        
        public DataAccess.Material[] GetMaterials() {
            return base.Channel.GetMaterials();
        }
        
        public DataAccess.Position[] GetPositions() {
            return base.Channel.GetPositions();
        }
        
        public DataAccess.Location[] GetLocations() {
            return base.Channel.GetLocations();
        }
        
        public DataAccess.Location[] GetStorageBins() {
            return base.Channel.GetStorageBins();
        }
        
        public DataAccess.Locationtype[] GetLocationTypes() {
            return base.Channel.GetLocationTypes();
        }
        
        public DataAccess.Rack[] GetRacks() {
            return base.Channel.GetRacks();
        }
        
        public DataAccess.Transportentry[] GetTransportentries() {
            return base.Channel.GetTransportentries();
        }
        
        public DataAccess.Order[] GetOrders() {
            return base.Channel.GetOrders();
        }
        
        public string GetLocationtypeIdByName(string locationName) {
            return base.Channel.GetLocationtypeIdByName(locationName);
        }
        
        public string GetRackIdByName(string rackName) {
            return base.Channel.GetRackIdByName(rackName);
        }
        
        public bool RecreateSampleDatabase(string sqlConnString) {
            return base.Channel.RecreateSampleDatabase(sqlConnString);
        }
    }
}
