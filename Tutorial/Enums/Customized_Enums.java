package Enums;

enum Phone{
    Iphone(100),Samsung(200),Realme(300),Motorola(400);

    private int price ;

    private Phone(int price){
        this.price = price;
    }

    void getPrice(){
        System.out.println(price);}
    }



public class Customized_Enums {
    public static void main(String[] args) {
        Phone phone = Phone.Iphone;

        phone.getPrice();
    }
}
