package OCA;

public class S45 {
    public static void main(String[] args) {
        StringBuilder sb1=new StringBuilder("Duke");
        String  str1=sb1.toString();
        String str2=str1;// burayi soruyor
        System.out.println(str1== str2);//true
    }
}
