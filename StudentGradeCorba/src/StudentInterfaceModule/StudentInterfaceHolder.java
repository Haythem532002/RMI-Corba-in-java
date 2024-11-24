package StudentInterfaceModule;

/**
 * Holder class for : StudentInterface
 * 
 * @author OpenORB Compiler
 */
final public class StudentInterfaceHolder
        implements org.omg.CORBA.portable.Streamable
{
    /**
     * Internal StudentInterface value
     */
    public StudentInterfaceModule.StudentInterface value;

    /**
     * Default constructor
     */
    public StudentInterfaceHolder()
    { }

    /**
     * Constructor with value initialisation
     * @param initial the initial value
     */
    public StudentInterfaceHolder(StudentInterfaceModule.StudentInterface initial)
    {
        value = initial;
    }

    /**
     * Read StudentInterface from a marshalled stream
     * @param istream the input stream
     */
    public void _read(org.omg.CORBA.portable.InputStream istream)
    {
        value = StudentInterfaceHelper.read(istream);
    }

    /**
     * Write StudentInterface into a marshalled stream
     * @param ostream the output stream
     */
    public void _write(org.omg.CORBA.portable.OutputStream ostream)
    {
        StudentInterfaceHelper.write(ostream,value);
    }

    /**
     * Return the StudentInterface TypeCode
     * @return a TypeCode
     */
    public org.omg.CORBA.TypeCode _type()
    {
        return StudentInterfaceHelper.type();
    }

}
