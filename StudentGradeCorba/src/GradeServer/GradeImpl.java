package GradeServer;

import StudentInterfaceModule.StudentInterfacePOA;

public class GradeImpl extends StudentInterfacePOA {
    @Override
    public double getStudentGrade(int StudentID, String SubjectName) {
        return 10+Math.random()*10;
    }
}
