/**
 * TCreate_Return.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.CatalogService3.Stub;


/**
 * a single return value of a create() catalog call.
 *         alias and parent catalog will be always returned.
 *         the error element will be returned in case of error.
 *         the updated flag and path will be returned if no error has
 * occured.
 */
public class TCreate_Return  implements java.io.Serializable {
    private java.lang.String alias;

    private java.lang.String parentCatalog;

    /* object path of the created catalog */
    private java.lang.String path;

    /* a boolean flag indicating that this catalog was created */
    private java.lang.Boolean created;

    /* error object (see epagestypes:TError) */
    private de.epages.WebServices.CatalogService3.Stub.TError error;

    public TCreate_Return() {
    }

    public TCreate_Return(
           java.lang.String alias,
           java.lang.String parentCatalog,
           java.lang.String path,
           java.lang.Boolean created,
           de.epages.WebServices.CatalogService3.Stub.TError error) {
           this.alias = alias;
           this.parentCatalog = parentCatalog;
           this.path = path;
           this.created = created;
           this.error = error;
    }


    /**
     * Gets the alias value for this TCreate_Return.
     * 
     * @return alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TCreate_Return.
     * 
     * @param alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the parentCatalog value for this TCreate_Return.
     * 
     * @return parentCatalog
     */
    public java.lang.String getParentCatalog() {
        return parentCatalog;
    }


    /**
     * Sets the parentCatalog value for this TCreate_Return.
     * 
     * @param parentCatalog
     */
    public void setParentCatalog(java.lang.String parentCatalog) {
        this.parentCatalog = parentCatalog;
    }


    /**
     * Gets the path value for this TCreate_Return.
     * 
     * @return path   * object path of the created catalog
     */
    public java.lang.String getPath() {
        return path;
    }


    /**
     * Sets the path value for this TCreate_Return.
     * 
     * @param path   * object path of the created catalog
     */
    public void setPath(java.lang.String path) {
        this.path = path;
    }


    /**
     * Gets the created value for this TCreate_Return.
     * 
     * @return created   * a boolean flag indicating that this catalog was created
     */
    public java.lang.Boolean getCreated() {
        return created;
    }


    /**
     * Sets the created value for this TCreate_Return.
     * 
     * @param created   * a boolean flag indicating that this catalog was created
     */
    public void setCreated(java.lang.Boolean created) {
        this.created = created;
    }


    /**
     * Gets the error value for this TCreate_Return.
     * 
     * @return error   * error object (see epagestypes:TError)
     */
    public de.epages.WebServices.CatalogService3.Stub.TError getError() {
        return error;
    }


    /**
     * Sets the error value for this TCreate_Return.
     * 
     * @param error   * error object (see epagestypes:TError)
     */
    public void setError(de.epages.WebServices.CatalogService3.Stub.TError error) {
        this.error = error;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCreate_Return)) return false;
        TCreate_Return other = (TCreate_Return) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.alias==null && other.getAlias()==null) || 
             (this.alias!=null &&
              this.alias.equals(other.getAlias()))) &&
            ((this.parentCatalog==null && other.getParentCatalog()==null) || 
             (this.parentCatalog!=null &&
              this.parentCatalog.equals(other.getParentCatalog()))) &&
            ((this.path==null && other.getPath()==null) || 
             (this.path!=null &&
              this.path.equals(other.getPath()))) &&
            ((this.created==null && other.getCreated()==null) || 
             (this.created!=null &&
              this.created.equals(other.getCreated()))) &&
            ((this.error==null && other.getError()==null) || 
             (this.error!=null &&
              this.error.equals(other.getError())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getAlias() != null) {
            _hashCode += getAlias().hashCode();
        }
        if (getParentCatalog() != null) {
            _hashCode += getParentCatalog().hashCode();
        }
        if (getPath() != null) {
            _hashCode += getPath().hashCode();
        }
        if (getCreated() != null) {
            _hashCode += getCreated().hashCode();
        }
        if (getError() != null) {
            _hashCode += getError().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCreate_Return.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/CatalogTypes/2008/11", "TCreate_Return"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parentCatalog");
        elemField.setXmlName(new javax.xml.namespace.QName("", "ParentCatalog"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("path");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Path"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("created");
        elemField.setXmlName(new javax.xml.namespace.QName("", "created"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("error");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Error"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TError"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           java.lang.String mechType, 
           java.lang.Class _javaType,  
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
