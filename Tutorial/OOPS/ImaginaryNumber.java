package OOPS;

public class ImaginaryNumber {
    private int a;
   private int b;

    protected String img = "";

    public ImaginaryNumber(int a, int b) {
        this.a = a;
        this.b = b;
        img = ""+(char)(a+'0')+'+'+'i'+(char)(b+'0');
    }

    public String getImg() {
        return img;
    }

    public static void main(String[] args) {
        ImaginaryNumber i = new ImaginaryNumber(2,3);
        System.out.println(i.a);

    }
}
