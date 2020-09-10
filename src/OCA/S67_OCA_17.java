package OCA;

public class S67_OCA_17 {

    int x, y;

    public S67_OCA_17(int x, int y) {

        initialize(x, y); // eger burda this x,this y dersek 0 veriyor
    }

    public void initialize(int x, int y) {
        this.x = x * x;
        this.y = y * y;

    }

    public static void main(String[] args) {
        int x = 3, y = 5;
        S67_OCA_17 obj = new S67_OCA_17(x, y);
        System.out.println(x + " " + y);//35
        System.out.println(obj.x);//9
        System.out.println(obj.y);//25
    }
}