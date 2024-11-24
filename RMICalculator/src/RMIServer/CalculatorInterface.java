package RMIServer;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface CalculatorInterface extends Remote {
    public int addition(int a, int b) throws RemoteException;
    public int subtraction(int a, int b) throws RemoteException;
    public int multiplication(int a, int b) throws RemoteException;
    public double division(int a, int b) throws RemoteException;
}
