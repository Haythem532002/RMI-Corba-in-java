package StudentInterfaceModule;

/** 
 * Helper class for : StudentInterface
 *  
 * @author OpenORB Compiler
 */ 
public class StudentInterfaceHelper
{
    /**
     * Insert StudentInterface into an any
     * @param a an any
     * @param t StudentInterface value
     */
    public static void insert(org.omg.CORBA.Any a, StudentInterfaceModule.StudentInterface t)
    {
        a.insert_Object(t , type());
    }

    /**
     * Extract StudentInterface from an any
     * @param a an any
     * @return the extracted StudentInterface value
     */
    public static StudentInterfaceModule.StudentInterface extract(org.omg.CORBA.Any a)
    {
        if (!a.type().equal(type()))
            throw new org.omg.CORBA.MARSHAL();
        try {
            return StudentInterfaceModule.StudentInterfaceHelper.narrow(a.extract_Object());
        } catch (final org.omg.CORBA.BAD_PARAM e) {
            throw new org.omg.CORBA.MARSHAL(e.getMessage());
        }
    }

    //
    // Internal TypeCode value
    //
    private static org.omg.CORBA.TypeCode _tc = null;

    /**
     * Return the StudentInterface TypeCode
     * @return a TypeCode
     */
    public static org.omg.CORBA.TypeCode type()
    {
        if (_tc == null) {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init();
            _tc = orb.create_interface_tc(id(),"StudentInterface");
        }
        return _tc;
    }

    /**
     * Return the StudentInterface IDL ID
     * @return an ID
     */
    public static String id()
    {
        return _id;
    }

    private final static String _id = "IDL:StudentInterfaceModule/StudentInterface:1.0";

    /**
     * Read StudentInterface from a marshalled stream
     * @param istream the input stream
     * @return the readed StudentInterface value
     */
    public static StudentInterfaceModule.StudentInterface read(org.omg.CORBA.portable.InputStream istream)
    {
        return(StudentInterfaceModule.StudentInterface)istream.read_Object(StudentInterfaceModule._StudentInterfaceStub.class);
    }

    /**
     * Write StudentInterface into a marshalled stream
     * @param ostream the output stream
     * @param value StudentInterface value
     */
    public static void write(org.omg.CORBA.portable.OutputStream ostream, StudentInterfaceModule.StudentInterface value)
    {
        ostream.write_Object((org.omg.CORBA.portable.ObjectImpl)value);
    }

    /**
     * Narrow CORBA::Object to StudentInterface
     * @param obj the CORBA Object
     * @return StudentInterface Object
     */
    public static StudentInterface narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof StudentInterface)
            return (StudentInterface)obj;

        if (obj._is_a(id()))
        {
            _StudentInterfaceStub stub = new _StudentInterfaceStub();
            stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
            return stub;
        }

        throw new org.omg.CORBA.BAD_PARAM();
    }

    /**
     * Unchecked Narrow CORBA::Object to StudentInterface
     * @param obj the CORBA Object
     * @return StudentInterface Object
     */
    public static StudentInterface unchecked_narrow(org.omg.CORBA.Object obj)
    {
        if (obj == null)
            return null;
        if (obj instanceof StudentInterface)
            return (StudentInterface)obj;

        _StudentInterfaceStub stub = new _StudentInterfaceStub();
        stub._set_delegate(((org.omg.CORBA.portable.ObjectImpl)obj)._get_delegate());
        return stub;

    }

}
