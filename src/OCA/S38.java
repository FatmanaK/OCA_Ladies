package OCA;

public class S38 {
    public static void main(String[] args) {
        String  myStr=" Hello World";
        String str="HelloWorld";
        myStr=myStr.trim();
        int i1=myStr.indexOf(" ");
        int i2=str.indexOf(" ");
        System.out.println("i1 = " + i1);//5
        System.out.println("i2 = " + i2);//-1
    }
}
