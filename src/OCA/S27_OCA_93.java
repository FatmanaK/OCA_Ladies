package OCA;

public class S27_OCA_93 {
    int id;
    String name;

    public S27_OCA_93(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public static void main(String[] args) {
        S27_OCA_93 p1 = new S27_OCA_93(101,"pen");
        S27_OCA_93 p2 = new S27_OCA_93(101,"pen");
        S27_OCA_93 p3 = p1;
        boolean ans1=p1==p2;// false eger p1==p3 true
        boolean ans2=p1.name.equals(p2.name);
        System.out.println(ans1 + " " + ans2);// false true

    }

}

