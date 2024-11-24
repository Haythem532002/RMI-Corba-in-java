package CalculatorInterfaceModule;

/**
 * Interface definition : CalculatorInterface
 * 
 * @author OpenORB Compiler
 */
public class CalculatorInterfacePOATie extends CalculatorInterfacePOA
{

    //
    // Private reference to implementation object
    //
    private CalculatorInterfaceOperations _tie;

    //
    // Private reference to POA
    //
    private org.omg.PortableServer.POA _poa;

    /**
     * Constructor
     */
    public CalculatorInterfacePOATie(CalculatorInterfaceOperations tieObject)
    {
        _tie = tieObject;
    }

    /**
     * Constructor
     */
    public CalculatorInterfacePOATie(CalculatorInterfaceOperations tieObject, org.omg.PortableServer.POA poa)
    {
        _tie = tieObject;
        _poa = poa;
    }

    /**
     * Get the delegate
     */
    public CalculatorInterfaceOperations _delegate()
    {
        return _tie;
    }

    /**
     * Set the delegate
     */
    public void _delegate(CalculatorInterfaceOperations delegate_)
    {
        _tie = delegate_;
    }

    /**
     * _default_POA method
     */
    public org.omg.PortableServer.POA _default_POA()
    {
        if (_poa != null)
            return _poa;
        else
            return super._default_POA();
    }

    /**
     * Operation addition
     */
    public int addition(int a, int b)
    {
        return _tie.addition( a,  b);
    }

    /**
     * Operation subtraction
     */
    public int subtraction(int a, int b)
    {
        return _tie.subtraction( a,  b);
    }

    /**
     * Operation multiplication
     */
    public int multiplication(int a, int b)
    {
        return _tie.multiplication( a,  b);
    }

}
