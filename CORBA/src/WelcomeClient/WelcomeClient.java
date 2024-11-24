package WelcomeClient;

import WelcomeInterfaceModule.WelcomeInterface;
import WelcomeInterfaceModule.WelcomeInterfaceHelper;

public class WelcomeClient {
    public static void main(String[] args) {
        try {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
            org.omg.CORBA.Object distantWelcome = orb.string_to_object(
                    "IOR:000000000000003049444C3A57656C636F6D65496E746572666163654D6F64756C652F57656C636F6D65496E746572666163653A312E300000000001000000000000005C000102000000000D3139322E3136382E35392E310000E4E600000015004F4F018BE652A492010000504F41FE0F8FE9FDFE00000000000001000000010000001C00000000050100010000000100010020000101090000000100010100");
            WelcomeInterface welcome = WelcomeInterfaceHelper.narrow(distantWelcome);
            System.out.println("CORBA Client ready ...");
            System.out.println("\nCORBA Result: " + welcome.echoWelcome() + "\"");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
