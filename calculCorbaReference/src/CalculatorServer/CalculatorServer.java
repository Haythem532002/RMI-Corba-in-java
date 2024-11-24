package CalculatorServer;

import org.omg.CosNaming.NameComponent;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.omg.PortableServer.POA;
import org.omg.PortableServer.POAHelper;


public class CalculatorServer {
    public static void main(String[] args) {
        try
        {
//            String[] param = {"-ORBInitialPort","2001","ORBInitialHost","localhost"};
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args,null);
            POA rootPOA = POAHelper.narrow(orb.resolve_initial_references("RootPOA"));
            rootPOA.the_POAManager().activate();


            CalculatorImpl calculator = new CalculatorImpl();

            org.omg.CORBA.Object ref = rootPOA.servant_to_reference(calculator);
            CalculatorInterfaceModule.CalculatorInterface href = CalculatorInterfaceModule.CalculatorInterfaceHelper.narrow(ref);


            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            NameComponent path[] = ncRef.to_name("Calculator");
            ncRef.rebind(path, href);

            System.out.println("CalculatorServer ready and waiting ...");
            orb.run();
        }
        catch(Exception e) {
            e.printStackTrace(System.out);
        }
    }

}

