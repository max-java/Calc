package by.jrr.ruslan.calc.bean;

import java.util.Objects;

public class Calc {
    private int a;
    private int b;
    private long z;
    private long x;

    public Calc() {
    }

    public Calc(int a, int b, long z, long x) {
               this.a = a;
        this.b = b;
        this.z = z;
        this.x = x;
    }

        public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public long getZ() {
        return z;
    }

    public long getX() {
        return x;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Calc)) return false;
        Calc calc = (Calc) o;
        return a == calc.a &&
                b == calc.b &&
                z == calc.z &&
                x == calc.x;
    }

    @Override
    public int hashCode() {
        return Objects.hash(a, b, z, x);
    }

    @Override
    public String toString() {
        return "Calc{" +
                "a=" + a +
                ", b=" + b +
                ", z=" + z +
                ", x=" + x +
                '}';
    }
}


