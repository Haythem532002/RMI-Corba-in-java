package CalculatorServer;

import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;


public class CalculatorServer {
    public static void main(String[] args) {
        try
        {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);

//            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
//            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);
//
//            CalculatorInterfaceModule.CalculatorInterface calculator = CalculatorInterfaceModule.CalculatorInterfaceHelper.narrow(ncRef.resolve_str("Calculator"));
//
//            int addResult = calculator.addition(10,11);
//            System.out.println("Addition: " + addResult);
//
//            int subResult = calculator.subtraction(20, 10);
//            System.out.println("Subtraction: " + subResult);
//
//            int mulResult = calculator.multiplication(20, 4);
//            System.out.println("Division: " + mulResult);





            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();
            CalculatorImpl server = new CalculatorImpl();
            String IORServant = orb.object_to_string(rootPOA.servant_to_reference(server));
            System.out.println("Object reference: \n" + IORServant);
            System.out.println("\nCORBA Server ready and waiting ...");
            orb.run();
        }
        catch(Exception e) {
            e.printStackTrace(System.out);
        }
    }

}

