package Collection_Framework.Comparable_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Car implements Comparable<Car>{
    String name;

    public Car(String name) {
        this.name = name;
    }

    @Override
    public int compareTo(Car o) {
        return this.name.compareTo(o.name);
    }
}

public class Comparable_using_Implementation {
    public static void main(String[] args) {
        List<Car> cars = new ArrayList<Car>();
        cars.add(new Car("BMW"));
        cars.add(new Car("Audi"));
        cars.add(new Car("Honda"));
        Collections.sort(cars);

        cars.forEach((Car car) -> {
            System.out.println(car.name);
        });
    }
}

