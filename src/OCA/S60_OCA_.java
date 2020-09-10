package OCA;

public class S60_OCA_ {
    public static void main(String[] args) {
        S60_OCA_ ts=new S60_OCA_();
        System.out.println(isAvailable+"");
        isAvailable=S60_OCA_.doStuff();// ts sonuc degismiyor
        System.out.println(isAvailable);
    }
    public static  boolean doStuff(){
        return ! isAvailable;
    }
    static  boolean isAvailable=false;
}
