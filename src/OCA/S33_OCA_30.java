package OCA;

import java.util.ArrayList;
import java.util.List;

public class S33_OCA_30 {
    public static void main(String[] args) {
        List<String > names=new ArrayList<>();
        names.add("Robb");
        names.add("Bran");
        names.add("Rick");
        names.add("Bran");
        if(names.remove("Bran")){
        //if(names.remove("Bran")){// if(names.remove("Jon)){ yazarsak Jon remove edemiyor ve false
            names.remove("Jon");


        }
        System.out.println("names = " + names);//names = [Robb, Rick, Bran]
    }
}
