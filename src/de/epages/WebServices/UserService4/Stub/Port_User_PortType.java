/**
 * Port_User_PortType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.3 Oct 05, 2005 (05:23:37 EDT) WSDL2Java emitter.
 */

package de.epages.WebServices.UserService4.Stub;

public interface Port_User_PortType extends java.rmi.Remote {

    /**
     * get information about a list of users
     */
    public de.epages.WebServices.UserService4.Stub.TGetInfo_Return[] getInfo(java.lang.String[] users, java.lang.String[] attributes, java.lang.String[] addressAttributes) throws java.rmi.RemoteException;

    /**
     * check if a list of users exist.
     */
    public de.epages.WebServices.UserService4.Stub.TExists_Return[] exists(java.lang.String[] users) throws java.rmi.RemoteException;

    /**
     * delete a list of users
     */
    public de.epages.WebServices.UserService4.Stub.TDelete_Return[] delete(java.lang.String[] users) throws java.rmi.RemoteException;

    /**
     * update a list of users
     */
    public de.epages.WebServices.UserService4.Stub.TUpdate_Return[] update(de.epages.WebServices.UserService4.Stub.TUpdate_Input[] users) throws java.rmi.RemoteException;

    /**
     * create new users
     */
    public de.epages.WebServices.UserService4.Stub.TCreate_Return[] create(de.epages.WebServices.UserService4.Stub.TCreate_Input[] users) throws java.rmi.RemoteException;
}
