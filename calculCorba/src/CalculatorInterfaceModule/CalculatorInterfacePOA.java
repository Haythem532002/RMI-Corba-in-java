package CalculatorInterfaceModule;

/**
 * Interface definition : CalculatorInterface
 * 
 * @author OpenORB Compiler
 */
public abstract class CalculatorInterfacePOA extends org.omg.PortableServer.Servant
        implements CalculatorInterfaceOperations, org.omg.CORBA.portable.InvokeHandler
{
    public CalculatorInterface _this()
    {
        return CalculatorInterfaceHelper.narrow(_this_object());
    }

    public CalculatorInterface _this(org.omg.CORBA.ORB orb)
    {
        return CalculatorInterfaceHelper.narrow(_this_object(orb));
    }

    private static String [] _ids_list =
    {
        "IDL:CalculatorInterfaceModule/CalculatorInterface:1.0"
    };

    public String[] _all_interfaces(org.omg.PortableServer.POA poa, byte [] objectId)
    {
        return _ids_list;
    }

    public final org.omg.CORBA.portable.OutputStream _invoke(final String opName,
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler)
    {

        if (opName.equals("addition")) {
                return _invoke_addition(_is, handler);
        } else if (opName.equals("multiplication")) {
                return _invoke_multiplication(_is, handler);
        } else if (opName.equals("subtraction")) {
                return _invoke_subtraction(_is, handler);
        } else {
            throw new org.omg.CORBA.BAD_OPERATION(opName);
        }
    }

    // helper methods
    private org.omg.CORBA.portable.OutputStream _invoke_addition(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = _is.read_long();
        int arg1_in = _is.read_long();

        int _arg_result = addition(arg0_in, arg1_in);

        _output = handler.createReply();
        _output.write_long(_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_subtraction(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = _is.read_long();
        int arg1_in = _is.read_long();

        int _arg_result = subtraction(arg0_in, arg1_in);

        _output = handler.createReply();
        _output.write_long(_arg_result);

        return _output;
    }

    private org.omg.CORBA.portable.OutputStream _invoke_multiplication(
            final org.omg.CORBA.portable.InputStream _is,
            final org.omg.CORBA.portable.ResponseHandler handler) {
        org.omg.CORBA.portable.OutputStream _output;
        int arg0_in = _is.read_long();
        int arg1_in = _is.read_long();

        int _arg_result = multiplication(arg0_in, arg1_in);

        _output = handler.createReply();
        _output.write_long(_arg_result);

        return _output;
    }

}
