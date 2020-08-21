package by.jrr.ruslan.calc.bean;

import by.jrr.ruslan.calc.service.CalcService;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalcTest {

    @Test
    public void getA() {
        Calc calc=new Calc(20,5,100,40);
        int expected  = 20;
        int actual = calc.getA();
        assertEquals(expected,actual);
    }

    @Test
    public void getB() {
        Calc calc=new Calc(20,5,100,40);
        int expected  = 5;
        int actual = calc.getB();
        assertEquals(expected,actual);
    }

    @Test
    public void getZ() {
        Calc calc=new Calc(20,5,100,40);
        long expected  = 100;
        long actual = calc.getZ();
        assertEquals(expected,actual);
    }

    @Test
    public void getX() {
        Calc calc=new Calc(20,5,100,40);
        long expected  = 40;
        long actual = calc.getX();
        assertEquals(expected,actual);
    }

    @Test
    public void testEquals() {
        Calc calc1= new Calc(20,5,100,40);
        calc1.equals(20);
        Calc calc2= new Calc(20,5,100,40);
        calc2.equals(20);
        boolean expected  = true;
        boolean actual = calc1.equals(calc2);
        assertEquals(expected,actual);
    }
    @Test
    public void testEqualsNegative() {
        Calc calc1= new Calc(20,5,100,40);
        calc1.equals(20);
        Calc calc2= new Calc(10,15,1100,140);
        calc2.equals(10);
        boolean expected  = false;
        boolean actual = calc1.equals(calc2);
        assertEquals(expected,actual);
    }

    @Test
    public void testHashCode() { Calc calc=new Calc(20,5,100,40);
        int expected  = 1527286;
        int actual = calc.hashCode();
        System.out.println("calc.hashCode() = " + calc.hashCode());
        assertEquals(expected,actual);
    }

    @Test
    public void testToString() {
        Calc calc= new Calc();
        calc.toString();
        String expected  = "Calc{a=0, b=0, z=0, x=0}";
        String actual = calc.toString();
        assertEquals(expected,actual);
    }
}