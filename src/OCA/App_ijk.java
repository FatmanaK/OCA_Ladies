package OCA;

public class App_ijk {
    public static void main(String[] args) {
        int i=10;
        int j=20;
        int k=(j+=i)/5;
        System.out.println(i+":"+j+":"+k);//10:30:6
    }
}
