package za.ac.cput.ngosa;

import za.ac.cput.ngosa.garageServices.Implementation.GarageInterface;


/**
 * Created by User on 2015/02/20.
 */
public class TeslaImpl implements GarageInterface {
    String name;
    double val;
    int horPow;
    String cate;
    String col;

    @Override
    public String name(String name) {
        return name;
    }

    @Override
    public double value(double val) {
        return val;
    }

    @Override
    public int bhp(int horPow) {
        return horPow;
    }

    @Override
    public String colour(String col) {
        return col;
    }

    @Override
    public String category(String cate) {
        return cate;
    }
}
