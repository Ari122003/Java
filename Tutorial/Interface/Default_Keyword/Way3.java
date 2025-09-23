package Interface.Default_Keyword;

import java.util.ArrayList;
import java.util.Collection;

interface Vehicle{
    default int wheels(){
        return 4;
    }
}

interface Bike extends Vehicle{
    @Override
    default int wheels() {
        int wheels = Vehicle.super.wheels();
        wheels -=2;
        return wheels;
    }

}

class SportBike implements Bike{
    Collection<Vehicle> vehicles = new ArrayList<Vehicle>();
}

public class Way3 {
    public static void main(String[] args) {
        Vehicle bike = new SportBike();
        System.out.println(bike.wheels());
    }
}
