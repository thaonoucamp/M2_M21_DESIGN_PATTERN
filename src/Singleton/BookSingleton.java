package Singleton;

public class BookSingleton {
    private String author;
    private String title;
    private static BookSingleton book;
    private static boolean isLoanedOut;

    public BookSingleton() {
        author = "Ghamma, Helm,Johnson,Vlissides";
        title = "Design Patterns";
        book = null;
        isLoanedOut = false;
    }

    // xay dung phuong thuc muon sach;
    public static BookSingleton borrowBook() {
        if (!isLoanedOut) {
            if (book == null) {
                book = new BookSingleton();
            }
            isLoanedOut = true;
            return book;
        }
        return null;
    }

    // phuong thuc tra sach;
    public void returnBook(BookSingleton bookReturned) {
        isLoanedOut = false;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthorAndTitle() {
        return getTitle() + "by" + getAuthor();
    }
}
