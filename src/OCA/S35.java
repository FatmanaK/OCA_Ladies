package OCA;

public class S35 {
    public static void main(String[] args) {
        int numbers[];
        numbers=new int[2];
        numbers[0]=10;
        numbers[1]=20;

        System.out.println("numbers = " + numbers);
        numbers=new  int[4];
        numbers[2]=30;
        numbers[3]=40;
        for (int x:numbers){
            System.out.println("x = " + x);
        }
        
    }
}
