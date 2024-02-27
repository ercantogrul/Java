package day24_Encapsulation.DE24_Encapsulation_ilk.Tasks.task05;

public class Book {
    private  String bookName;
    private String authorName;
    private boolean okunduMu;
    public Book() {
    }
    public Book(String bookName, String authorName,boolean okunduMu) {
        this.bookName = bookName;
        this.authorName = authorName;
        this.okunduMu =okunduMu;
    }
    @Override
    public String toString() {
        return "Book name is " + bookName.toUpperCase() +
                "\nAuthor is " + authorName.toUpperCase() +
                "\nokunduMu =" + okunduMu;
    }
    public String isOkunduMu() {
        if (okunduMu)return "Kitap okundu";
        else return "kitap henuz okunmadi";
    }
    public void setOkunduMu(boolean okunduMu) {
        this.okunduMu = okunduMu;
    }
    public String getBookName() {
        return bookName;
    }
    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
    public String getAuthorName() {
        return authorName;
    }
    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }
}
