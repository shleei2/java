 package h_inherit_product;

import java.util.ArrayList;

public class Book extends Product {

    String isbn_number;
    String author;
    String book_title;

    Book() {
        super();
    }

    Book(String description, String producer, String price,
         String isbn_number, String author, String book_title) {
        super();
        super.description = description;
        super.producer = producer;
        super.price = price;
        this.isbn_number = isbn_number;
        this.author = author;
        this.book_title = book_title;
    }

    public void showInfo() {
        String[] sub = {"상품 설명", "생산자", "가격",
                "책 제목", "저자", "ISBN"};
        Object[] data = {description, producer, price,
            book_title, author, isbn_number};
        for (int i = 0; i < data.length; i++) {
            System.out.println(sub[i] + ">>" + data[i]);
        }
    }
}