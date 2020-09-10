package OCA;

import javax.smartcardio.Card;

public class S64_OCA_ {
    public static void main(String[] args) {
        S64_OCA_ ex=new S64_OCA_();
        int cardNo=123444;
        ex.checkCard(cardNo);
        //ex.readCard(cardNo);
    }
    void readCard(int cardNo)throws  Exception{ // exception olan hata veriyor
        System.out.println("Reading Card");
    }
    void  checkCard(int cardNo)throws RuntimeException{
        System.out.println("Checking Card" );
    }
}
