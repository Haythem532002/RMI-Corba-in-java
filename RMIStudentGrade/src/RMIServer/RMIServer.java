package RMIServer;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;

public class RMIServer {
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
//        if(System.getSecurityManager()==null)
//        {
//            System.setSecurityManager (new RMISecurityManager()) ;
//        }
        try
        {
            StudentGradeImpl rmiObj = new StudentGradeImpl(10,"subject");
            LocateRegistry.createRegistry(1235);
            Naming.rebind ("rmi://localhost:1235/Student", rmiObj);
            System.out.println ("RMI server is ready!");
        }
        catch (Exception e)
        {
            System.out.println ("RMI Server is failed because " + e);
        }
    }
}
