package OCA;

public class S26_OCA_179 {
    static int count=0;
     int i=0; // eger birasi static olursa i de  count da 5:5 verir
    public void changeCount(){
        while(i<5){// eger esitlik koyarsak 6 olur
            i++;
            count++;

        }
    }

    public static void main(String[] args) {
        S26_OCA_179 check1=new S26_OCA_179();
        S26_OCA_179 check2=new S26_OCA_179();
        //S26 check2=check1;//new S26();//5:5
        check1.changeCount();
        check2.changeCount();
        System.out.println(check1.count+" :"+check2.count);//10:10

        System.out.println(check1.i +"= " + check2.i);//5:5
    }
}
