package OCA;

public class S30_OCA_137 {
    public static void main(String[] args) {
        int [][]n={{1,3},{2,4}};
        for (int i = n.length-1; i >=0 ; i--) {// eger lenght te -1 yoksa Array index of OutOfBounds exception
            //for (int y:n[i]){
            for(int j=n.length-1;j>=0;j--){
               // System.out.println(y);//2413
                System.out.println(n[i][j]);//4231
            }

        }
    }
}
