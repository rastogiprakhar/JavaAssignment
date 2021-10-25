package Advance.AdvQues9.P2;

import Advance.AdvQues9.P1.TwoDim;

public class ThreeDim extends TwoDim {
    private double z;

    public ThreeDim(double x, double y, double z)
    {
        super(x,y);
        this.z=z;
    }

    @Override
    public String toString() {
        System.out.println(super.toString());
        return "ThreeDim{" +
                "z=" + z +
                '}';
    }
}
