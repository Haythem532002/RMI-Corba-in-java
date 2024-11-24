package CalculatorInterfaceModule;

/**
 * Interface definition : CalculatorInterface
 * 
 * @author OpenORB Compiler
 */
public class _CalculatorInterfaceStub extends org.omg.CORBA.portable.ObjectImpl
        implements CalculatorInterface
{
    static final String[] _ids_list =
    {
        "IDL:CalculatorInterfaceModule/CalculatorInterface:1.0"
    };

    public String[] _ids()
    {
     return _ids_list;
    }

    private final static Class _opsClass = CalculatorInterfaceModule.CalculatorInterfaceOperations.class;

    /**
     * Operation addition
     */
    public int addition(int a, int b)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("addition",true);
                    _output.write_long(a);
                    _output.write_long(b);
                    _input = this._invoke(_output);
                    int _arg_ret = _input.read_long();
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("addition",_opsClass);
                if (_so == null)
                   continue;
                CalculatorInterfaceModule.CalculatorInterfaceOperations _self = (CalculatorInterfaceModule.CalculatorInterfaceOperations) _so.servant;
                try
                {
                    return _self.addition( a,  b);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation subtraction
     */
    public int subtraction(int a, int b)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("subtraction",true);
                    _output.write_long(a);
                    _output.write_long(b);
                    _input = this._invoke(_output);
                    int _arg_ret = _input.read_long();
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("subtraction",_opsClass);
                if (_so == null)
                   continue;
                CalculatorInterfaceModule.CalculatorInterfaceOperations _self = (CalculatorInterfaceModule.CalculatorInterfaceOperations) _so.servant;
                try
                {
                    return _self.subtraction( a,  b);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

    /**
     * Operation multiplication
     */
    public int multiplication(int a, int b)
    {
        while(true)
        {
            if (!this._is_local())
            {
                org.omg.CORBA.portable.InputStream _input = null;
                try
                {
                    org.omg.CORBA.portable.OutputStream _output = this._request("multiplication",true);
                    _output.write_long(a);
                    _output.write_long(b);
                    _input = this._invoke(_output);
                    int _arg_ret = _input.read_long();
                    return _arg_ret;
                }
                catch(org.omg.CORBA.portable.RemarshalException _exception)
                {
                    continue;
                }
                catch(org.omg.CORBA.portable.ApplicationException _exception)
                {
                    String _exception_id = _exception.getId();
                    throw new org.omg.CORBA.UNKNOWN("Unexpected User Exception: "+ _exception_id);
                }
                finally
                {
                    this._releaseReply(_input);
                }
            }
            else
            {
                org.omg.CORBA.portable.ServantObject _so = _servant_preinvoke("multiplication",_opsClass);
                if (_so == null)
                   continue;
                CalculatorInterfaceModule.CalculatorInterfaceOperations _self = (CalculatorInterfaceModule.CalculatorInterfaceOperations) _so.servant;
                try
                {
                    return _self.multiplication( a,  b);
                }
                finally
                {
                    _servant_postinvoke(_so);
                }
            }
        }
    }

}
