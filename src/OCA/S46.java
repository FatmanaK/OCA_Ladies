package OCA;

public class S46 {
    int a1;
    public  static  void doProduct(int a){
        a=a*a;

    }
    public static void doString(StringBuilder s){

        s.append(" "+s);
    }
    public static void main(String[] args) {
        S46 item=new S46();
        item.a1=11;
        StringBuilder sb=new StringBuilder("Hello");// String  de yazsak ayni  sonuc
        Integer i=10;
        doProduct(i);
        doString(sb);
        doProduct(item.a1);
        System.out.println( i+" "+sb+" "+item.a1);//10 Hello 11
    }

}
