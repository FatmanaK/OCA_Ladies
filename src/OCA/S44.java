package OCA;

public class S44 {
    public static void main(String[] args) {
        String  stuff="TV";
        String  res=null;
        String res1=null;
        if(stuff.equals("Tv")){ // eger v kucuk harf ile olursa No result
            res="Walter";

        }else if(stuff.equals("Movie")){
            res="White";

        }else{
            res="No result";
        }
        System.out.println(res);//Walter
        res1=stuff.equals("TV")?"Walter":stuff.equals("Movie")?"White":"No result";
        System.out.println("res1 = " + res1);//res1 = Walter
    }
}
