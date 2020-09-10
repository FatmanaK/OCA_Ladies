package OCA;

public class StringBuilder15 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Duke");
        System.out.println("sb1 = " + sb1);//Duke
        String str1=sb1.toString();
        String str2=str1;
        System.out.println("str2 = " + str2);//Duke
        System.out.println(str1==str2);//true

        StringBuffer sb=new StringBuffer("Arzu");
        System.out.println("sb = " + sb);//Arzu
        String str3=sb.toString();
        String str4=str3;
        System.out.println(str3== str4);//true
    }
}
