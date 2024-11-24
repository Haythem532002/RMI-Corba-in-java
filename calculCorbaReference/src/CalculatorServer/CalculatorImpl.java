package CalculatorServer;

import CalculatorInterfaceModule.CalculatorInterfacePOA;

public class CalculatorImpl extends CalculatorInterfacePOA {
    @Override
    public int addition(int a, int b) {
        return a+b;
    }

    @Override
    public int subtraction(int a, int b) {
        return a-b;
    }

    @Override
    public int multiplication(int a, int b) {
        return a*b;
    }
}
