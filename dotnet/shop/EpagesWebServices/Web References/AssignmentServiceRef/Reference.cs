//------------------------------------------------------------------------------
// <auto-generated>
//     Dieser Code wurde von einem Tool generiert.
//     Laufzeitversion:4.0.30319.18444
//
//     Änderungen an dieser Datei können falsches Verhalten verursachen und gehen verloren, wenn
//     der Code erneut generiert wird.
// </auto-generated>
//------------------------------------------------------------------------------

namespace EpagesWebServices.AssignmentServiceRef {
    using System;
    using System.Web.Services;
    using System.Diagnostics;
    using System.Web.Services.Protocols;
    using System.Xml.Serialization;
    using System.ComponentModel;
    
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Web.Services.WebServiceBindingAttribute(Name="bind_Assignment_SOAP", Namespace="urn://epages.de/WebService/AssignmentService/2005/01")]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TAssignedCatalog))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TGetCatalogsAssignedToProduct_Return))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TAssignedProduct))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TGetProductsAssignedToCatalog_Return))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TIsProductAssignedToCatalog_Return))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TIsProductAssignedToCatalog_Input))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TRemoveProductFromCatalog_Return))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TRemoveProductFromCatalog_Input))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TAssignProductToCatalog_Return))]
    [System.Xml.Serialization.SoapIncludeAttribute(typeof(TAssignProductToCatalog_Input))]
    public partial class AssignmentService : System.Web.Services.Protocols.SoapHttpClientProtocol {
        
        /// <remarks/>
        public AssignmentService() {
            this.Url = "http://localhost/epages/Store.soap";
        }
        
        public AssignmentService(string url) {
            this.Url = url;
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("urn://epages.de/WebService/AssignmentService/2005/01#assignProductToCatalog", RequestNamespace="urn://epages.de/WebService/AssignmentService/2005/01", ResponseNamespace="urn://epages.de/WebService/AssignmentService/2005/01")]
        [return: System.Xml.Serialization.SoapElementAttribute("Assignments")]
        public TAssignProductToCatalog_Return[] assignProductToCatalog(TAssignProductToCatalog_Input[] Assignments) {
            object[] results = this.Invoke("assignProductToCatalog", new object[] {
                        Assignments});
            return ((TAssignProductToCatalog_Return[])(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult BeginassignProductToCatalog(TAssignProductToCatalog_Input[] Assignments, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("assignProductToCatalog", new object[] {
                        Assignments}, callback, asyncState);
        }
        
        /// <remarks/>
        public TAssignProductToCatalog_Return[] EndassignProductToCatalog(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((TAssignProductToCatalog_Return[])(results[0]));
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("urn://epages.de/WebService/AssignmentService/2005/01#removeProductFromCatalog", RequestNamespace="urn://epages.de/WebService/AssignmentService/2005/01", ResponseNamespace="urn://epages.de/WebService/AssignmentService/2005/01")]
        [return: System.Xml.Serialization.SoapElementAttribute("Assignments")]
        public TRemoveProductFromCatalog_Return[] removeProductFromCatalog(TRemoveProductFromCatalog_Input[] Assignments) {
            object[] results = this.Invoke("removeProductFromCatalog", new object[] {
                        Assignments});
            return ((TRemoveProductFromCatalog_Return[])(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult BeginremoveProductFromCatalog(TRemoveProductFromCatalog_Input[] Assignments, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("removeProductFromCatalog", new object[] {
                        Assignments}, callback, asyncState);
        }
        
        /// <remarks/>
        public TRemoveProductFromCatalog_Return[] EndremoveProductFromCatalog(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((TRemoveProductFromCatalog_Return[])(results[0]));
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("urn://epages.de/WebService/AssignmentService/2005/01#isProductAssignedToCatalog", RequestNamespace="urn://epages.de/WebService/AssignmentService/2005/01", ResponseNamespace="urn://epages.de/WebService/AssignmentService/2005/01")]
        [return: System.Xml.Serialization.SoapElementAttribute("Assignments")]
        public TIsProductAssignedToCatalog_Return[] isProductAssignedToCatalog(TIsProductAssignedToCatalog_Input[] Assignments) {
            object[] results = this.Invoke("isProductAssignedToCatalog", new object[] {
                        Assignments});
            return ((TIsProductAssignedToCatalog_Return[])(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult BeginisProductAssignedToCatalog(TIsProductAssignedToCatalog_Input[] Assignments, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("isProductAssignedToCatalog", new object[] {
                        Assignments}, callback, asyncState);
        }
        
        /// <remarks/>
        public TIsProductAssignedToCatalog_Return[] EndisProductAssignedToCatalog(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((TIsProductAssignedToCatalog_Return[])(results[0]));
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("urn://epages.de/WebService/AssignmentService/2005/01#getProductsAssignedToCatalog" +
            "", RequestNamespace="urn://epages.de/WebService/AssignmentService/2005/01", ResponseNamespace="urn://epages.de/WebService/AssignmentService/2005/01")]
        [return: System.Xml.Serialization.SoapElementAttribute("Assignments")]
        public TGetProductsAssignedToCatalog_Return[] getProductsAssignedToCatalog(string[] Catalogs) {
            object[] results = this.Invoke("getProductsAssignedToCatalog", new object[] {
                        Catalogs});
            return ((TGetProductsAssignedToCatalog_Return[])(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult BegingetProductsAssignedToCatalog(string[] Catalogs, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("getProductsAssignedToCatalog", new object[] {
                        Catalogs}, callback, asyncState);
        }
        
        /// <remarks/>
        public TGetProductsAssignedToCatalog_Return[] EndgetProductsAssignedToCatalog(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((TGetProductsAssignedToCatalog_Return[])(results[0]));
        }
        
        /// <remarks/>
        [System.Web.Services.Protocols.SoapRpcMethodAttribute("urn://epages.de/WebService/AssignmentService/2005/01#getCatalogsAssignedToProduct" +
            "", RequestNamespace="urn://epages.de/WebService/AssignmentService/2005/01", ResponseNamespace="urn://epages.de/WebService/AssignmentService/2005/01")]
        [return: System.Xml.Serialization.SoapElementAttribute("Assignments")]
        public TGetCatalogsAssignedToProduct_Return[] getCatalogsAssignedToProduct(string[] Products) {
            object[] results = this.Invoke("getCatalogsAssignedToProduct", new object[] {
                        Products});
            return ((TGetCatalogsAssignedToProduct_Return[])(results[0]));
        }
        
        /// <remarks/>
        public System.IAsyncResult BegingetCatalogsAssignedToProduct(string[] Products, System.AsyncCallback callback, object asyncState) {
            return this.BeginInvoke("getCatalogsAssignedToProduct", new object[] {
                        Products}, callback, asyncState);
        }
        
        /// <remarks/>
        public TGetCatalogsAssignedToProduct_Return[] EndgetCatalogsAssignedToProduct(System.IAsyncResult asyncResult) {
            object[] results = this.EndInvoke(asyncResult);
            return ((TGetCatalogsAssignedToProduct_Return[])(results[0]));
        }
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/AssignmentTypes/2005/01")]
    public partial class TAssignProductToCatalog_Input {
        
        /// <remarks/>
        public string Catalog;
        
        /// <remarks/>
        public string Product;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapElementAttribute(DataType="integer")]
        public string Position;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/AssignmentTypes/2005/01")]
    public partial class TAssignedCatalog {
        
        /// <remarks/>
        public string Path;
        
        /// <remarks/>
        public bool assigned;
        
        /// <remarks/>
        public bool assignedWithParent;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/AssignmentTypes/2005/01")]
    public partial class TGetCatalogsAssignedToProduct_Return {
        
        /// <remarks/>
        public string Product;
        
        /// <remarks/>
        public TAssignedCatalog[] Catalogs;
        
        /// <remarks/>
        public TError Error;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/EpagesTypes/2005/01")]
    public partial class TError {
        
        /// <remarks/>
        public string Message;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/AssignmentTypes/2005/01")]
    public partial class TAssignedProduct {
        
        /// <remarks/>
        public string Path;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapElementAttribute(DataType="integer")]
        public string Position;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/AssignmentTypes/2005/01")]
    public partial class TGetProductsAssignedToCatalog_Return {
        
        /// <remarks/>
        public string Catalog;
        
        /// <remarks/>
        public TAssignedProduct[] Products;
        
        /// <remarks/>
        public TError Error;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/AssignmentTypes/2005/01")]
    public partial class TIsProductAssignedToCatalog_Return {
        
        /// <remarks/>
        public string Catalog;
        
        /// <remarks/>
        public string Product;
        
        /// <remarks/>
        public bool assigned;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool assignedSpecified;
        
        /// <remarks/>
        public bool assignedWithParent;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool assignedWithParentSpecified;
        
        /// <remarks/>
        public TError Error;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/AssignmentTypes/2005/01")]
    public partial class TIsProductAssignedToCatalog_Input {
        
        /// <remarks/>
        public string Catalog;
        
        /// <remarks/>
        public string Product;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/AssignmentTypes/2005/01")]
    public partial class TRemoveProductFromCatalog_Return {
        
        /// <remarks/>
        public string Catalog;
        
        /// <remarks/>
        public string Product;
        
        /// <remarks/>
        public bool removed;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool removedSpecified;
        
        /// <remarks/>
        public bool assignedWithParent;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool assignedWithParentSpecified;
        
        /// <remarks/>
        public TError Error;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/AssignmentTypes/2005/01")]
    public partial class TRemoveProductFromCatalog_Input {
        
        /// <remarks/>
        public string Catalog;
        
        /// <remarks/>
        public string Product;
    }
    
    /// <remarks/>
    [System.CodeDom.Compiler.GeneratedCodeAttribute("XamarinStudio", "4.0.0.0")]
    [System.SerializableAttribute()]
    [System.Diagnostics.DebuggerStepThroughAttribute()]
    [System.ComponentModel.DesignerCategoryAttribute("code")]
    [System.Xml.Serialization.SoapTypeAttribute(Namespace="urn://epages.de/WebService/AssignmentTypes/2005/01")]
    public partial class TAssignProductToCatalog_Return {
        
        /// <remarks/>
        public string Catalog;
        
        /// <remarks/>
        public string Product;
        
        /// <remarks/>
        public bool assigned;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool assignedSpecified;
        
        /// <remarks/>
        public bool assignedWithParent;
        
        /// <remarks/>
        [System.Xml.Serialization.SoapIgnoreAttribute()]
        public bool assignedWithParentSpecified;
        
        /// <remarks/>
        public TError Error;
    }
}
