package Reflection;

import java.lang.reflect.Method;

class Eagle{
    public String breed;
    private int weight;

    public void fly(){
        System.out.println("I'm flying");
    }

    public void eat(){
        System.out.println("I'm eating");
    }
}

public class Demo {
    public static void main(String[] args) {
        Class eagle = Eagle.class;
//        System.out.println(eagle.getName());
//        System.out.println(eagle.getModifiers());

        Class str = String.class;

        for(Method method : str.getDeclaredMethods()){
            System.out.println(method.getName());
        }
    }
}
