package OCA;

public class S66_OCA_111 {
    public static void main(String[] args) {
        int ii = 0;
        int jj = 7;

        for (ii = 0; ii < jj; ii = ii + 2) {// jj-1  de 024  verir
            System.out.println(ii+" ");//0246
            for(jj=7;jj>ii;jj=jj-2){
                System.out.println("jj = " + jj);}//7531
        }
    }
}