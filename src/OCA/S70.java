package OCA;

class Vehicle {
    int x;

    Vehicle() {
        this(10);

    }
    Vehicle(int x){
        this.x=x;
    }

}
class Car extends Vehicle{
    int y;
    Car(){
        super(); // super ve this ayni constructorda olmaz
       // this(20);
    }
    Car(int y){
        this.y=y;
    }
    public String  toString(){
        return  super.x+" : "+this.y;
    }
}
public  class S70{
    public static void main(String[] args) {
        Vehicle y=new Car();
        Vehicle x=new Car();
        System.out.println(y+""+x);
    }
}
