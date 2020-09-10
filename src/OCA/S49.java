package OCA;

public class S49 {
    String myStr="7007";
    int myNum=0;
    public void doStuff(String str){
        int myNum=0;
        try{
            String myStr=str;//String siz yaparsak myStr = 9009, myNum9009
            myNum=Integer.parseInt(myStr);

        }catch (NumberFormatException ne){
            System.err.println("Error " );//
        }
        System.out.println("myStr = " + myStr+" , myNum "+myNum);
    }

    public static void main(String[] args) {
        S49 obj=new S49();
        obj.doStuff("9009");
    }
}
