package RMIClient;

import RMIServer.CalculatorInterface;

import java.rmi.Naming;
import java.util.Scanner;

public class CalculatorClient {
    public static void main(String[] args)
    {
        try
        {
            CalculatorInterface calculator = (CalculatorInterface) Naming.lookup("rmi://localhost:1236/Calculator");

            Scanner scanner = new Scanner(System.in);
            int choix = 0;

            while(true) {
                System.out.println ("Welcome to our Calculator");
                System.out.println("1-Addition");
                System.out.println("2-Substraction");
                System.out.println("3-Multiplication");
                System.out.println("4-Division");
                System.out.println("5-Exit");
                System.out.println("Enter the type of operation needed");
                choix=scanner.nextInt();
                if(choix==5) {
                    System.out.println("Thanks for visiting us");
                    break;
                }
                if(choix>5 || choix<1) {
                    System.out.println("Invalid Operation");
                    continue;
                }
                System.out.println("Enter First Operand");
                int a = scanner.nextInt();
                System.out.println("Enter Second Operand");
                int b = scanner.nextInt();

                switch (choix) {
                    case 1:
                        System.out.println("Addition result = "+calculator.addition(a,b));
                        break;
                    case 2:
                        System.out.println("Addition result = "+calculator.subtraction(a,b));
                        break;
                    case 3:
                        System.out.println("Addition result = "+calculator.multiplication(a,b));
                        break;
                    case 4:
                        System.out.println("Addition result = "+calculator.division(a,b));
                        break;
                }

            }


        }
        catch (Exception e)
        {
            System.out.println ("RMI Client is failed because " + e);
        }
    }
}
