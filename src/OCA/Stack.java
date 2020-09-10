package OCA;

public class Stack {
    public static void main(String[] args) {
        int []stack={10,20,30};
        int size=3;
        int idx=0;// da 10,1 de20 2.index num 30 i verir
      //  System.out.println("The top element  = " +stack[ idx]); burda yazarsak 10  verir
        do{
            idx++;

        }while(idx<size-1);
        System.out.println("The top element  = " +stack[ idx]);// 30 u  verir
    }
}
