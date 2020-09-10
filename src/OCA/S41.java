package OCA;

public class S41 {
    public static void main(String[] args) {
        //boolean opt=true;
       String opt="true";//false olursa *** Done  yazdirir
        switch (opt){// compile error
            case "true":
                System.out.println("True");
              // break; eger break yoksa true *** done hepsini yazdirir
            default:
                System.out.println("***");
                break;
        }
        System.out.println("Done");// true Done yazdirir
    }
}
// switch not working boolean long double float