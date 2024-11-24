package CalculatorClient;

import CalculatorInterfaceModule.CalculatorInterface;
import CalculatorInterfaceModule.CalculatorInterfaceHelper;

public class CalculatorClient {
    public static void main(String[] args) {
        try {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
            org.omg.CORBA.Object distantWelcome = orb.string_to_object(
                    "IOR:000000000000003649444C3A43616C63756C61746F72496E746572666163654D6F64756C652F43616C63756C61746F72496E746572666163653A312E30000000000000010000000000000058000102000000000D3139322E3136382E35392E310000DDDF00000014004F4F01ED2A14EC92010000504F41FE24DDD96E00000001000000010000001C00000000050100010000000100010020000101090000000100010100");
            CalculatorInterface calc = CalculatorInterfaceHelper.narrow(distantWelcome);
            System.out.println("CORBA Client ready ...");
            System.out.println("\nCORBA Addition Result: " + calc.addition(10,11) + "\"");
            System.out.println("\nCORBA Subtraction Result: " + calc.subtraction(10,11) + "\"");
            System.out.println("\nCORBA multiplication Result: " + calc.multiplication(10,11) + "\"");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
