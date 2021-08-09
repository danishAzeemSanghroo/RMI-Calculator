/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.rmi.server.UnicastRemoteObject;

/**
 *
 * @author Danish
 */
public class RMIServer extends UnicastRemoteObject implements Calc{

    public RMIServer()throws RemoteException
    {
        super();
    }
    @Override
    public int add(int a, int b) throws RemoteException {
        return a+b;
    }
    public int sub(int a, int b) throws RemoteException {
        return a-b;
    }
    public int mul(int a, int b) throws RemoteException {
        return a*b;
    }
    public int div(int a, int b) throws RemoteException {
        return a/b;
    }
    public int rem(int a, int b) throws RemoteException {
        return a%b;
    }    
    public static void main(String args[]){
    try
    {
        Registry reg=LocateRegistry.createRegistry(4444);
        reg.bind("hi_server", new RMIServer());
        System.out.println("Server is ready");
    }catch(Exception e)
    {
        System.out.println("Exception " + e);
    }
    
    }
}
