package OCA;

import java.util.ArrayList;
import java.util.List;

public class Oca30 {
    public static void main(String[] args) {
        List<String > names=new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        if(names.remove("Bran")){
            names.remove("Jon");
            
                    
        }
        System.out.println("names = " + names);//names = [Robb, Rick, Bran]
    }
}
