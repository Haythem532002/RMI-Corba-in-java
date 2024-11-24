package RMIServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class CalculatorServer {
    public static void main(String[] args)
    {
        try
        {
            CalculatorImpl rmiObj = new CalculatorImpl();
            LocateRegistry.createRegistry(1236);
            Naming.rebind ("rmi://localhost:1236/Calculator", rmiObj);
            System.out.println ("RMI server is ready!");
        }
        catch (Exception e)
        {
            System.out.println ("RMI Server is failed because " + e);
        }
    }
}
