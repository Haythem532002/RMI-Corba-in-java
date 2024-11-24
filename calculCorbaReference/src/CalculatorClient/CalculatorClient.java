package CalculatorClient;

import CalculatorInterfaceModule.CalculatorInterface;
import CalculatorInterfaceModule.CalculatorInterfaceHelper;
import org.omg.CosNaming.NamingContextExt;
import org.omg.CosNaming.NamingContextExtHelper;
import org.openorb.CORBA.ORB;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            ORB orb = (ORB) ORB.init(args, null);

            org.omg.CORBA.Object objRef = orb.resolve_initial_references("NameService");
            NamingContextExt ncRef = NamingContextExtHelper.narrow(objRef);

            String name = "Calculator";
            CalculatorInterface calc = CalculatorInterfaceHelper.narrow(ncRef.resolve_str(name));

            System.out.println("CORBA Client ready ...");
            System.out.println("\nCORBA Addition Result: " + calc.addition(10,11) + "\"");
            System.out.println("\nCORBA Subtraction Result: " + calc.subtraction(10,11) + "\"");
            System.out.println("\nCORBA multiplication Result: " + calc.multiplication(10,11) + "\"");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
