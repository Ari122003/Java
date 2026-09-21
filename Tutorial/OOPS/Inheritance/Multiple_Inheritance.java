package OOPS.Inheritance;

// An interface defines a behavior that implementing classes must provide.
interface Wave {
    void nature();
}

// A class can implement another independent interface as well.
interface Particle {
    void prop();
}

// Java does not support extending multiple classes, but it supports multiple
// inheritance through interfaces. Light inherits both interface contracts.
class Light implements Wave, Particle {
    // Implementation of the method declared in Wave.
    public void nature() {
        System.out.println("Light has wave nature");
    }

    // Implementation of the method declared in Particle.
    public void prop() {
        System.out.println("Light has wave prop");
    }
}

public class Multiple_Inheritance {
    public static void main(String[] args) {
        // A Light object has both behaviors because it implements both interfaces.
        // Light light = new Light();
        // light.nature();
        // light.prop();
    }
}
