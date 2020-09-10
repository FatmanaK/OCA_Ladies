package OCA;

public class S52 {
    abstract  class Planet{
        protected  void revolve(){ }
        abstract void rotate();

    }
    class Earth extends Planet{
        protected void revolve(){ }//line 3  compile because public yada protected olmali more visible olmali
        protected  void rotate(){}
    }
    // method  line 3 de public ve protected olursa calisir

}
