package OCA;

public class Oca37 {
    public static void main(String[] args) {
        int data[]={2010,2013,2020,2014,2015,2014,2014,2015};
        int key=2014;
        int count=0;
        for(int e:data){
            if(e!=key){
               count++;// 5 verir
              // break;
                continue;// 2014 3 adet
              // continue;
             // count++;// Compilation fails
            }
            break;
//continue;
           // count++;
        }
        System.out.println("count = " + count);
    }
}
