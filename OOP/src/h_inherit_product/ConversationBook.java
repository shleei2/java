package h_inherit_product;
import java.util.ArrayList;

public class ConversationBook extends Book {
    String language;

    ConversationBook() {
    }

    ConversationBook(String description, String producer,
                     String price, String isbn_number,
                     String author, String book_title,
                     String language) {
        super.description = description;
        super.producer = producer;
        super.price = price;
        super.isbn_number = isbn_number;
        super.author = author;
        super.book_title = book_title;
        this.language = language;
    }

    public void showInfo() {
        String[] sub = {"상품 설명", "생산자", "가격",
                "책 제목", "저자", "언어", "ISBN"};

        Object[] data = {description, producer, price,
            book_title, author, language, isbn_number};

        for (int i = 0; i < data.length; i++) {
            System.out.println(sub[i] + ">>" + data[i]);
        }
    }

}

