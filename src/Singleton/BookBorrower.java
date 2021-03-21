package Singleton;

public class BookBorrower {
    private BookSingleton borrowedBook;
    private boolean haveBook = false;

    // phuong thuc muon sach;
    public void borrowBook() {
        borrowedBook = BookSingleton.borrowBook();
        if (borrowedBook == null) {
            haveBook = false;
        } else {
            haveBook = true;
        }
    }

    // phuong thuc lay ve thong tin sach muon;
    public String getAuthorAndTitle() {
        if (haveBook) {
            return borrowedBook.getAuthorAndTitle();
        }
        return "I don't have the book";
    }

    // phuong thuc tra sach;
    public void returnBook() {
        borrowedBook.returnBook(borrowedBook);
    }
}
