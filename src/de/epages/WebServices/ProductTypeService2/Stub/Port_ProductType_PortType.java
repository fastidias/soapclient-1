/**
 * Port_ProductType_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.ProductTypeService2.Stub;

public interface Port_ProductType_PortType extends java.rmi.Remote {

    /**
     * get the base product type
     */
    public java.lang.String getBaseProductType() throws java.rmi.RemoteException;

    /**
     * get information about a list of product types
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TGetInfo_Return[] getInfo(java.lang.String[] productTypes, java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * get information about all product types
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TGetInfo_Return[] getAllInfo(java.lang.String[] attributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of product types exist
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TExists_Return[] exists(java.lang.String[] productTypes) throws java.rmi.RemoteException;

    /**
     * delete a list of product types
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TDelete_Return[] delete(java.lang.String[] productTypes) throws java.rmi.RemoteException;

    /**
     * update a list of product types
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TUpdate_Return[] update(de.epages.WebServices.ProductTypeService2.Stub.TUpdate_Input[] productTypes) throws java.rmi.RemoteException;

    /**
     * create new product types
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TCreate_Return[] create(de.epages.WebServices.ProductTypeService2.Stub.TCreate_Input[] productTypes) throws java.rmi.RemoteException;

    /**
     * get information about a list of product attributes
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TGetProductAttributeInfo_Return[] getProductAttributeInfo(java.lang.String productType, java.lang.String[] productAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * get information about all product attibutes of a product type
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TGetProductAttributeInfo_Return[] getAllProductAttributesInfo(java.lang.String productType, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of product attributes exist
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TExistsProductAttribute_Return[] existsProductAttribute(java.lang.String productType, java.lang.String[] productAttributes) throws java.rmi.RemoteException;

    /**
     * delete a list of product attributes
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TDeleteProductAttribute_Return[] deleteProductAttribute(java.lang.String productType, java.lang.String[] productAttributes) throws java.rmi.RemoteException;

    /**
     * update a list of product attributes
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TUpdateProductAttribute_Return[] updateProductAttribute(java.lang.String productType, de.epages.WebServices.ProductTypeService2.Stub.TUpdateProductAttribute_Input[] productAttributes) throws java.rmi.RemoteException;

    /**
     * create a list of product attributes
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TCreateProductAttribute_Return[] createProductAttribute(java.lang.String productType, de.epages.WebServices.ProductTypeService2.Stub.TCreateProductAttribute_Input[] productAttributes) throws java.rmi.RemoteException;

    /**
     * get information about a list of predefined attributes
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TGetPreDefAttributeInfo_Return[] getPreDefAttributeInfo(java.lang.String productAttribute, java.lang.String[] preDefAttributes, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * get information about all predefined attibutes of a product
     * attribute
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TGetPreDefAttributeInfo_Return[] getAllPreDefAttributesInfo(java.lang.String productAttribute, java.lang.String[] languageCodes) throws java.rmi.RemoteException;

    /**
     * check if a list of predefined attributes exist
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TExistsPreDefAttribute_Return[] existsPreDefAttribute(java.lang.String productAttribute, java.lang.String[] preDefAttributes) throws java.rmi.RemoteException;

    /**
     * delete a list of predefined attributes
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TDeletePreDefAttribute_Return[] deletePreDefAttribute(java.lang.String productAttribute, java.lang.String[] preDefAttributes) throws java.rmi.RemoteException;

    /**
     * update a list of predefined attributes
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TUpdatePreDefAttribute_Return[] updatePreDefAttribute(java.lang.String productAttribute, de.epages.WebServices.ProductTypeService2.Stub.TUpdatePreDefAttribute_Input[] preDefAttributes) throws java.rmi.RemoteException;

    /**
     * create a list of predefined attributes
     */
    public de.epages.WebServices.ProductTypeService2.Stub.TCreatePreDefAttribute_Return[] createPreDefAttribute(java.lang.String productAttribute, de.epages.WebServices.ProductTypeService2.Stub.TCreatePreDefAttribute_Input[] preDefAttributes) throws java.rmi.RemoteException;
}
