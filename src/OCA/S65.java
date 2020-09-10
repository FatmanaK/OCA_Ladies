package OCA;

public class S65 {
    int y,x;
    public  void doStuff(int x,int y){
        x=x;//this.x=x; boyle olursa 0 0 verir

        y=this.y;

    }
    public void display(){
        System.out.println(x+" "+y+":");
    }

    public static void main(String[] args) {
        S65 m1=new S65();
        m1.x=100;
        m1.y=200;
        S65 m2=new S65();
        m2.doStuff(m1.x,m1.y);
        m1.display();//100 200
        m2.display();//100 0
    }
}
