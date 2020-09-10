package OCA;

public class Vehicle18 {
    String type="4W";
    int maxSpeed=100;
    Vehicle18(String type,int maxSpeed){
        this.type=type;
        this.maxSpeed=maxSpeed;


    }
    Vehicle18(){

    }
    class Car extends Vehicle18 {
        String  trans;
        Car(String trans){
            this.trans=trans;

        }
        Car(String  type,int maxSpeed,String trans){
            super(type,maxSpeed);
            this.trans=trans;
        }
    }


}
