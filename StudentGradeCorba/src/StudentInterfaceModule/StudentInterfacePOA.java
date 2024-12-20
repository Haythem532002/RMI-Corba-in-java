package StudentInterfaceModule;

/**
 * Interface definition : StudentInterface
 * 
 * @author OpenORB Compiler
 */
public abstract class StudentInterfacePOA extends org.omg.PortableServer.Servant
        implements StudentInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{
    public StudentInterface _this()
    {
        return StudentInterfaceHelper.narrow(_this_object());
    }

    public StudentInterface _this(org.omg.CORBA.ORB orb)
    {
        return StudentInterfaceHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:StudentInterfaceModule/StudentInterface:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("getStudentGrade")) {
                return _invoke_getStudentGrade(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_getStudentGrade(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = _is.read_long();
        String arg1_in = _is.read_string();

        double _arg_result = getStudentGrade(arg0_in, arg1_in);

        _output = handler.createReply();
        _output.write_double(_arg_result);

        return _output;
    }

}
