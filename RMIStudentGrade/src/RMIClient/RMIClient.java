package RMIClient;


import RMIServer.StudentGradeInterface;

import java.rmi.Naming;

public class RMIClient
{
    public static void main(String[] args)
    {
        // TODO Auto-generated method stub
//        if(System.getSecurityManager()==null)
//        {
//            System.setSecurityManager (new RMISecurityManager()) ;
//        }
        try
        {
            StudentGradeInterface student = (StudentGradeInterface) Naming.lookup("rmi://localhost:1235/Student");
            System.out.println ("RMI client is ready!");
            System.out.println(student.getStudentGrade(10,"subject"));
        }
        catch (Exception e)
        {
            System.out.println ("RMI Client is failed because " + e);
        }
    }
}