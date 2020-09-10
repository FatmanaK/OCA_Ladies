package OCA;
import p1.Acc;
public class S59 extends  Acc{
//    package 1;
//    public class Acc{}
//int p;
//private  int q;
//protected  int r;
//public int s;
//
//}
//Test.java:
//package 2;
//import  p1 .S59;

    public static void main(String[] args) {
        S59 obj2=new S59(); // eger  child classtan obj uretirsem s ve r yi gorururum
        obj2.s=1;
        obj2.r=2;

        Acc obj=new S59();// eger parents dan obj uretirsem sadece s gorur
        obj.s=0;
       // obj.r=5;
        //obj.p=10;
        Acc obj1=new S59();
        obj1.s=0;

    }
}
