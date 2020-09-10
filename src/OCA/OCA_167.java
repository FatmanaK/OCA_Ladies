package OCA;

public class OCA_167 {
    public static void main(String[] args) {
        int x=100;
        int a=x++;
        int b=++x;
        int c=x++;
        System.out.println(c);//102
        int d=(a<b)?(a<c)?a:(b<c)?b:c:x;
        System.out.println(d);//100
    }
}
