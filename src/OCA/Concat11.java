package OCA;

public class Concat11 {
    public static void main(String[] args) {
        String []strs={"A","B"};
        int idx=0;
        for (String s:strs){
            strs[idx].concat("element"+idx);
            idx++;

        }
        System.out.println("idx = " + idx);// 2 size
        System.out.println(strs);//[Ljava.lang.String;@61bbe9ba
        for (idx= 0; idx < strs.length; idx++) {
            System.out.println(strs[idx]);//A B

        }

    }
}
