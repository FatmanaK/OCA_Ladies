package OCA;

public class S43 {
    public static void main(String[] args) {
        String str1 = "Java";
        String str2 = new String("java");
        str2 = str1;
        // if (str1 == str2) {
//        if(str1.equalsIgnoreCase(str2)){//
        if (str1.toLowerCase() == str2.toLowerCase()) {

            System.out.println("Equal");
        } else {
            System.out.println("Not equal");
        }

    }


}
