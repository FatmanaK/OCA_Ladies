package OCA;

public class S48 {
    public static void main(String[] args) {
        String  args1=args[1];
        String  args2=args[2];
        String  args3=args[3];
        System.out.println("Args = " + args3);//ArrayIndexOutOfBoundsException: 8
    }
    // java MyFile 1 3 2 2
}
