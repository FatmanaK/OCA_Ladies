package OCA;

public class S72_OCA_112 {

     static int count;// static yazarsak hata yok  static olmazsa line 1 line 2 de hata verir
    public static  void displayMsg(){
        int count=10;
        count++;                                  //line 1
        System.out.println("Welcome "+"Visit count:"+count);//line2
        count++;
    }


    public static void main(String[] args) {
        S72_OCA_112.displayMsg();
        S72_OCA_112.displayMsg();
        displayMsg(); //sadece method lada cagirilabilir
    }

}
