package RMIServer;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class StudentGradeImpl extends UnicastRemoteObject implements StudentGradeInterface
{
    private int StudentID;
    private String SubjectName;
    public StudentGradeImpl (int StudentID, String SubjectName) throws RemoteException
    {
        this.StudentID=StudentID;
        this.SubjectName=SubjectName;
    }

    @Override
    public double getStudentGrade(int StudentID, String SubjectName) throws RemoteException {
        return Math.random()*10;
    }
}
