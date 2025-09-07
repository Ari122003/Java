package Referance_Variables;



interface Person{
    public String profession();
}

class Engineer implements Person{
    @Override
        public String profession(){
            return "Developper";
        }
}

class Doctor implements Person{
    @Override
     public String profession(){
            return "Surgeon";
        }
}

public class Interface {
    
    public static void main(String[] args) {
        Person dev = new Engineer();
        Person doc = new Doctor();

        System.out.println(dev.profession());
    }
}
