package OOPS;

class Train {

    String name;
    int fare;

    Train(String name, int fare) {
        this.name = name;
        this.fare = fare;
    }

    Train(Train newTrain) {
        this(newTrain.name, newTrain.fare);
    }

    public void getInfo() {
        System.out.println("Name:" + name);
        System.out.println("Fare:" + fare);

    }
}

public class Copy_Constructor {

    public static void main(String[] args) {
        Train t1 = new Train("Rajdhani", 1700);

        Train t2 = new Train(t1);

        t2.getInfo();

    }

}
