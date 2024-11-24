package WelcomeServer;

import WelcomeInterfaceModule.WelcomeInterfacePOA;

public class WelcomeImpl extends WelcomeInterfacePOA {
    @Override
    public String echoWelcome() {
        return "Welcome to everyone";
    }
}
