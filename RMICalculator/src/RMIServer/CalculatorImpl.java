package RMIServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

public class CalculatorImpl extends UnicastRemoteObject implements CalculatorInterface {


    protected CalculatorImpl() throws RemoteException {
    }

    @Override
    public int addition(int a, int b) throws RemoteException {
        return a+b;
    }

    @Override
    public int subtraction(int a, int b) throws RemoteException {
        return a-b;
    }

    @Override
    public int multiplication(int a, int b) throws RemoteException {
        return a*b;
    }

    @Override
    public double division(int a, int b) throws RemoteException {
        return (double)a/b;
    }
}
