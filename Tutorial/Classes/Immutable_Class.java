package Classes;

import java.util.ArrayList;

final class MyImmutableClass {
    private final String name;
    private final ArrayList<String> petNames;

    public MyImmutableClass(String name, ArrayList<String> petNames) {
        this.name = name;
        this.petNames = petNames;
    }

    public String getName() {
        return name;
    }

    public ArrayList<String> getPetNames() {

        return new ArrayList<>(petNames); // return copy of the original list
       // return petNames; it will return the original list
    }


}

public class Immutable_Class {
    public static void main(String[] args) {
        ArrayList<String> petNames = new ArrayList<>();
        petNames.add("Bob");
        petNames.add("Alice");

        MyImmutableClass obj = new MyImmutableClass("Aritra", petNames);

        obj.getPetNames().add("Json");

        for(String name : obj.getPetNames()) {
            System.out.println(name);
        }
    }
}
