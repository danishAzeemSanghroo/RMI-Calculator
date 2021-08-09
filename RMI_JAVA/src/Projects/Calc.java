/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author Danish
 */
public interface Calc extends Remote{
    int add(int a,int b)throws RemoteException;
    int sub(int a,int b)throws RemoteException;
    int mul(int a,int b)throws RemoteException;
    int div(int a,int b)throws RemoteException;
    int rem(int a,int b)throws RemoteException;
}
