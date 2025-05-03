

class dumble {
    int wgt;

    dumble(int w){
        wgt=w;
    }
}


public class Constructor {
    int x;

    Constructor(int x) {
        this.x = x;
    }
    public static void main(String[] args) {
        Constructor c=new Constructor(10);
        System.out.println(c.x);

        dumble d=new dumble(20);
        System.out.println(d.wgt);
    }
}
