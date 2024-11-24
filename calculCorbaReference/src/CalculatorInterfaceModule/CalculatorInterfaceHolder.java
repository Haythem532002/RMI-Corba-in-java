package CalculatorInterfaceModule;

/**
 * Holder class for : CalculatorInterface
 * 
 * @author OpenORB Compiler
 */
final public class CalculatorInterfaceHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal CalculatorInterface value
     */
    public CalculatorInterfaceModule.CalculatorInterface value;

    /**
     * Default constructor
     */
    public CalculatorInterfaceHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public CalculatorInterfaceHolder(CalculatorInterfaceModule.CalculatorInterface initial)
    {
        value = initial;
    }

    /**
     * Read CalculatorInterface from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = CalculatorInterfaceHelper.read(istream);
    }

    /**
     * Write CalculatorInterface into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        CalculatorInterfaceHelper.write(ostream,value);
    }

    /**
     * Return the CalculatorInterface TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return CalculatorInterfaceHelper.type();
    }

}
