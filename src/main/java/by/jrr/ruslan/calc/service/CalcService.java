package by.jrr.ruslan.calc.service;

import by.jrr.ruslan.calc.bean.Calc;

public class CalcService {
    public int additionOfIntegers(Calc calc) {
        return calc.getA() + calc.getB();
    }
    public int multiplicationOfIntegers(Calc calc) {
        return calc.getA() * calc.getB();
    }
    public int subtructionOfIntegers(Calc calc) {
        return calc.getA() - calc.getB();
    }
    public int divisionOfIntegers(Calc calc) {
        return calc.getA() / calc.getB();
    }
    public int remainderOfIntegers(Calc calc) {
        return calc.getA() % calc.getB();
    }
    public long additionOfLongs(Calc calc) {
        return calc.getZ() + calc.getX();
    }
}
