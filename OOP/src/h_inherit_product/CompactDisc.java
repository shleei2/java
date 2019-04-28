package h_inherit_product;
import java.util.ArrayList;

public class CompactDisc extends Product {

    String album_title;
    String singer;

    CompactDisc() {
        super();
    }

    CompactDisc(String description, String producer,
                String price, String album_title, String singer) {
        super();
        super.description = description;
        super.producer = producer;
        super.price = price;
        this.album_title = album_title;
        this.singer = singer;
    }

    public void showInfo() {
        String[] sub = {"상품 설명", "생산자", "가격",
                "앨범 제목", "가수"};
        Object[] data = {description, producer, price, album_title,
        singer};
        for (int i = 0; i < data.length; i++) {
            System.out.println(sub[i] + ">>" + data[i]);
        }
    }

}