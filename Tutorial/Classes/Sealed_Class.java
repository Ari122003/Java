package Classes;

sealed class Shape permits Circle , Triangle{

}

final class Circle extends Shape{

}

non-sealed class Triangle extends Shape{

}


//class Rectangle extends Shape{
//    Not possible
//}

public class Sealed_Class {
}
