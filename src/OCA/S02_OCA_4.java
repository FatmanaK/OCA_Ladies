package OCA;

public class S02_OCA_4 {
    public static void main(String[] args) {
        int ivar = 100;
        double dvar = 123;
        float fvar = 200;
        ivar = (int) fvar;
        fvar = ivar;
        dvar = fvar;
        fvar = (int) dvar;
        dvar = ivar;
        // ivar=(double )dvar;
        //  byte/short/int/long/float/double/char/boolean

        System.out.println("Result A" + 0 + 1);//Result A01
        System.out.println("Result B" + (1) + (2));//Result B12
        System.out.println("Result C" + (1 + 2));//Result C3
    }
}