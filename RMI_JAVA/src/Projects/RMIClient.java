/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Projects;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

/**
 *
 * @author Danish
 */
public class RMIClient {
    public static void main(String args[])throws RemoteException
    {
        try
        {
            Registry reg=LocateRegistry.getRegistry("localhost",4444);
            Calc ob=(Calc) reg.lookup("hi_server");
            System.out.println("Addition is "+ob.add(10, 5));
            System.out.println("Subtraction is "+ob.sub(10, 5));
            System.out.println("Multiplication is "+ob.mul(10, 5));
            System.out.println("Division is "+ob.div(10, 5));
            System.out.println("Remainder is "+ob.rem(10, 5));
            
            
        }catch(Exception e)
        {
            System.out.println("Exception "+e);
        }
    }
    
}
