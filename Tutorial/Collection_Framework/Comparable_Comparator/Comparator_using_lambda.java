package Collection_Framework.Comparable_Comparator;

class Students{
    String name;
    int marks;

    public Students(String name, int marks){
        this.name = name;
        this.marks = marks;
    }
}

public class Comparator_using_lambda {
    public static void main(String[] args) {
        Students[] list = new Students[5];

        list[0] = new Students("Alex", 95);
        list[1] = new Students("Bob", 80);
        list[2] = new Students("John", 90);
        list[3] = new Students("Jane", 85);
        list[4] = new Students("Jack", 90);



//        sort by marks

//        Arrays.sort(list,(Students s1 , Students s2)->s1.marks-s2.marks); // sort in ascending order
//        Arrays.sort(list,(Students s1 , Students s2)->s2.marks-s1.marks); // sort in ascending order




//        sort by name

//        Arrays.sort(list,(Students s1,Students s2) -> s1.name.compareTo(s2.name)); // ascending
//        Arrays.sort(list,(Students s1,Students s2) -> s2.name.compareTo(s1.name)); // descending


        for(int i = 0; i < list.length; i++){
            System.out.println(list[i].name+" "+list[i].marks);
        }

    }
}
