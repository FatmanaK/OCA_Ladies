package OCA;

public class S63_OCA_ {
    int num;
    public  static void graceMarks(S63_OCA_ obj4){
        obj4.num +=10;

    }

    public static void main(String[] args) {
        S63_OCA_ obj1=new S63_OCA_();// how many instance are created 1 tane
        S63_OCA_ obj2=obj1;
        S63_OCA_ obj3=null;
        obj2.num=60;
        graceMarks(obj2);
        S63_OCA_ obj4=obj2;//obj4 = OCA.S63_OCA_@61bbe9ba
        System.out.println("obj4 = " + obj4);
        //sadece obj3 null digerleri hashcode
    }
}
