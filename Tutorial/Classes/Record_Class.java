package Classes;

record Student(String name , int roll,int marks){


    private static final int total = 200;


    public Student{
        if(roll<0 || roll > 50 ){
            throw new IllegalArgumentException("Roll out of range");
        }
        if( marks <0 || marks>200){
            throw new IllegalArgumentException("Marks out of range");
        }
    }
    public float getPercentage(){
        return Math.round((float)(this.marks*100)/total);
    }
 }


public class Record_Class {
    public static void main(String[] args) {
        Student student1 = new Student("Mary", 20,98);
        Student student2 = new Student("John", 21,113);

        System.out.println(student1.getPercentage());
        System.out.println(student2.getPercentage());


    }
}
