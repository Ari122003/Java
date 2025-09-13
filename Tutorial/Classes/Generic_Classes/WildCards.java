package Classes.Generic_Classes;

import java.util.ArrayList;
import java.util.List;

class Vehicle{

}
class Car extends Vehicle{}
class Bike extends Vehicle{}

class PrintUpperBound{
    public void setPrintValues(List<?extends Vehicle> list){
//        wildcard upper bound
    }
}

class PrintLowerBound{
    public void setPrintValues(List<?super Vehicle> list){

    }
}

public class WildCards {
    public static void main(String[] args) {
        List<Vehicle> list = new ArrayList<Vehicle>();
        List<Car> cars = new ArrayList<Car>();
        List<Bike> bikes = new ArrayList<Bike>();

        PrintUpperBound pub = new PrintUpperBound();
        PrintLowerBound plb = new PrintLowerBound();

//        p.setPrintValues(cars); not possible if we use public void setPrintValues(List<Vehicle> list) ......that's why wildcards are needed

        pub.setPrintValues(cars);
        plb.setPrintValues(list);
    }
}
