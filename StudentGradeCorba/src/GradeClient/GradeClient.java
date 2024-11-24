package GradeClient;


import StudentInterfaceModule.StudentInterface;
import StudentInterfaceModule.StudentInterfaceHelper;

public class GradeClient {
    public static void main(String[] args) {
        try {
            org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init(args, null);
            org.omg.CORBA.Object distantWelcome = orb.string_to_object(
                    "IOR:000000000000003049444C3A53747564656E74496E746572666163654D6F64756C652F53747564656E74496E746572666163653A312E3000000000010000000000000058000102000000000D3139322E3136382E35392E310000E4CC00000014004F4F01FB2A50A492010000504F41FE0F71DA6000000001000000010000001C00000000050100010000000100010020000101090000000100010100");
            StudentInterface grade = StudentInterfaceHelper.narrow(distantWelcome);
            System.out.println("CORBA Client ready ...");
            System.out.println("\nCORBA Result: " + grade.getStudentGrade(10,"subject") + "\"");
        } catch (Exception e) {
            e.printStackTrace(System.out);
        }
    }
}
