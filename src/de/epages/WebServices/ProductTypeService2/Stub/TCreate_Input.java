/**
 * TCreate_Input.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductTypeService2.Stub;


/**
 * input arguments of a single create() product type call.
 *         a set of product specific attributes that will be used to
 * create a product.
 *         alias is mandatory.
 *         all others are optional.
 */
public class TCreate_Input  implements java.io.Serializable {
    /* product type alias */
    private java.lang.String alias;

    /* product type's name */
    private de.epages.WebServices.ProductTypeService2.Stub.TLocalizedValue[] name;

    /* layout template for product details display */
    private java.lang.String layoutContentBase;

    /* layout template for variations display */
    private java.lang.String layoutContentVariation;

    /* layout template for bundle products display */
    private java.lang.String layoutContentBundles;

    public TCreate_Input() {
    }

    public TCreate_Input(
           java.lang.String alias,
           de.epages.WebServices.ProductTypeService2.Stub.TLocalizedValue[] name,
           java.lang.String layoutContentBase,
           java.lang.String layoutContentVariation,
           java.lang.String layoutContentBundles) {
           this.alias = alias;
           this.name = name;
           this.layoutContentBase = layoutContentBase;
           this.layoutContentVariation = layoutContentVariation;
           this.layoutContentBundles = layoutContentBundles;
    }


    /**
     * Gets the alias value for this TCreate_Input.
     * 
     * @return alias   * product type alias
     */
    public java.lang.String getAlias() {
        return alias;
    }


    /**
     * Sets the alias value for this TCreate_Input.
     * 
     * @param alias   * product type alias
     */
    public void setAlias(java.lang.String alias) {
        this.alias = alias;
    }


    /**
     * Gets the name value for this TCreate_Input.
     * 
     * @return name   * product type's name
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TLocalizedValue[] getName() {
        return name;
    }


    /**
     * Sets the name value for this TCreate_Input.
     * 
     * @param name   * product type's name
     */
    public void setName(de.epages.WebServices.ProductTypeService2.Stub.TLocalizedValue[] name) {
        this.name = name;
    }


    /**
     * Gets the layoutContentBase value for this TCreate_Input.
     * 
     * @return layoutContentBase   * layout template for product details display
     */
    public java.lang.String getLayoutContentBase() {
        return layoutContentBase;
    }


    /**
     * Sets the layoutContentBase value for this TCreate_Input.
     * 
     * @param layoutContentBase   * layout template for product details display
     */
    public void setLayoutContentBase(java.lang.String layoutContentBase) {
        this.layoutContentBase = layoutContentBase;
    }


    /**
     * Gets the layoutContentVariation value for this TCreate_Input.
     * 
     * @return layoutContentVariation   * layout template for variations display
     */
    public java.lang.String getLayoutContentVariation() {
        return layoutContentVariation;
    }


    /**
     * Sets the layoutContentVariation value for this TCreate_Input.
     * 
     * @param layoutContentVariation   * layout template for variations display
     */
    public void setLayoutContentVariation(java.lang.String layoutContentVariation) {
        this.layoutContentVariation = layoutContentVariation;
    }


    /**
     * Gets the layoutContentBundles value for this TCreate_Input.
     * 
     * @return layoutContentBundles   * layout template for bundle products display
     */
    public java.lang.String getLayoutContentBundles() {
        return layoutContentBundles;
    }


    /**
     * Sets the layoutContentBundles value for this TCreate_Input.
     * 
     * @param layoutContentBundles   * layout template for bundle products display
     */
    public void setLayoutContentBundles(java.lang.String layoutContentBundles) {
        this.layoutContentBundles = layoutContentBundles;
    }

    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof TCreate_Input)) return false;
        TCreate_Input other = (TCreate_Input) obj;
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
            ((this.name==null && other.getName()==null) || 
             (this.name!=null &&
              java.util.Arrays.equals(this.name, other.getName()))) &&
            ((this.layoutContentBase==null && other.getLayoutContentBase()==null) || 
             (this.layoutContentBase!=null &&
              this.layoutContentBase.equals(other.getLayoutContentBase()))) &&
            ((this.layoutContentVariation==null && other.getLayoutContentVariation()==null) || 
             (this.layoutContentVariation!=null &&
              this.layoutContentVariation.equals(other.getLayoutContentVariation()))) &&
            ((this.layoutContentBundles==null && other.getLayoutContentBundles()==null) || 
             (this.layoutContentBundles!=null &&
              this.layoutContentBundles.equals(other.getLayoutContentBundles())));
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
        if (getName() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getName());
                 i++) {
                java.lang.Object obj = java.lang.reflect.Array.get(getName(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getLayoutContentBase() != null) {
            _hashCode += getLayoutContentBase().hashCode();
        }
        if (getLayoutContentVariation() != null) {
            _hashCode += getLayoutContentVariation().hashCode();
        }
        if (getLayoutContentBundles() != null) {
            _hashCode += getLayoutContentBundles().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(TCreate_Input.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/ProductTypeTypes2/2007/11", "TCreate_Input"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("alias");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Alias"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("name");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("urn://epages.de/WebService/EpagesTypes/2005/01", "TLocalizedValue"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutContentBase");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Layout.Content-Base"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutContentVariation");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Layout.Content-Variation"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("layoutContentBundles");
        elemField.setXmlName(new javax.xml.namespace.QName("", "Layout.Content-Bundles"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
