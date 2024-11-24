package CalculatorInterfaceModule;

/** 
 * Helper class for : CalculatorInterface
 *  
 * @author OpenORB Compiler
 */ 
public class CalculatorInterfaceHelper
{
    /**
     * Insert CalculatorInterface into an any
     * @param a an any
     * @param t CalculatorInterface value
     */
    public static void insert(org.omg.CORBA.Any a, CalculatorInterfaceModule.CalculatorInterface t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract CalculatorInterface from an any
     * @param a an any
     * @return the extracted CalculatorInterface value
     */
    public static CalculatorInterfaceModule.CalculatorInterface extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return CalculatorInterfaceModule.CalculatorInterfaceHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the CalculatorInterface TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"CalculatorInterface");
        }
        return _tc;
    }

    /**
     * Return the CalculatorInterface IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:CalculatorInterfaceModule/CalculatorInterface:1.0";

    /**
     * Read CalculatorInterface from a marshalled stream
     * @param istream the input stream
     * @return the readed CalculatorInterface value
     */
    public static CalculatorInterfaceModule.CalculatorInterface read(org.omg.CORBA.portable.InputStream istream)
    {
        return(CalculatorInterfaceModule.CalculatorInterface)istream.read_Object(CalculatorInterfaceModule._CalculatorInterfaceStub.class);
    }

    /**
     * Write CalculatorInterface into a marshalled stream
     * @param ostream the output stream
     * @param value CalculatorInterface value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, CalculatorInterfaceModule.CalculatorInterface value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to CalculatorInterface
     * @param obj the CORBA Object
     * @return CalculatorInterface Object
     */
    public static CalculatorInterface narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof CalculatorInterface)
            return (CalculatorInterface)obj;

        if (obj._is_a(id()))
        {
            _CalculatorInterfaceStub stub = new _CalculatorInterfaceStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to CalculatorInterface
     * @param obj the CORBA Object
     * @return CalculatorInterface Object
     */
    public static CalculatorInterface unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof CalculatorInterface)
            return (CalculatorInterface)obj;

        _CalculatorInterfaceStub stub = new _CalculatorInterfaceStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
