package OCA;

interface  Readable{
    public void  readBook();
    public  void setBookMark();

}

abstract  class Book implements Readable {
    public void readBook(){
}
        }

class EBook extends Book {
    
    public void readBook(){}

    @Override
    public void setBookMark() {
        
    }
}

public class S47 {
    public static void main(String[] args) {
        Book book1=new EBook();
        book1.readBook();
        System.out.println("book1 = " + book1);//book1 = OCA.EBook@61bbe9ba
    }

}

