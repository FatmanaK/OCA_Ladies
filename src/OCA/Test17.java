package OCA;

public class Test17 {
    int x,y;
    public Test17(int x, int y){

        initialize(this.x, this.y);
    }

     private void initialize(int x, int y) {
        this.x=x*x;
        this.y=y*y;

    }

    public static void main(String[] args) {
        int x=3,y=5;
        Test17 obj=new Test17(x,y);
        System.out.println(x+""+y);//35



    }
}
