package OCA;

public class OcaP26 {
        char h;
        char c='a';
        boolean b;
        float f;
        Character a;
        String s;
        String z="";
        void printall(){
            System.out.println("h= " + h);//empty
            System.out.println("c = " + c);//a
            System.out.println("b = " + b);//false
            System.out.println("f = " + f);//0.0
            System.out.println("a = " + a);//null
            System.out.println("z = " + z);//empty
            System.out.println("s = " + s);//null

        }

        public static void main(String[] args) {
           OcaP26 f=new OcaP26();
            f.printall();
        }

    }

