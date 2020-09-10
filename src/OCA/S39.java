package OCA;

public class S39 {
    public static String maskCC(String creditCard) {
        String x = "XXXX-XXXX-XXXX-";
//        StringBuilder sb= new StringBuilder(creditCard);
//        sb.substring(15,19);
//        return x+sb;
//       return x +creditCard.substring(15,19);
//        StringBuilder sb=new StringBuilder();
//        sb.append(creditCard,15,19);
//        return  sb.toString();//1121
        StringBuilder sb=new StringBuilder(creditCard);
        sb.replace(0,15,x);
        return sb.toString();//XXXX-XXXX-XXXX-1121
    }

    public static void main(String[] args) {
        System.out.println(maskCC("1234-5678-9101-1121"));//XXXX-XXXX-XXXX-1234-5678-9101-1121

    }
}