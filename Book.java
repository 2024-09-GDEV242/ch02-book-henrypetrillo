/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Henry Petrillo)
 * @version (9/10/2024)
 */
public class Book
{
    // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber = "";

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int totalPages) {
        author = bookAuthor;
        title = bookTitle;
        pages = totalPages;
    }
    /**
     * Set the reference Number field when this object
     * is constructed.
     */
    public void setRefNumber(String ref) {
        refNumber = ref;
    }

    // Add the methods here ...
    /**
     * Gets the author,title, pages, or reference number 
     * field when each object is called.
     */
    
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public int getPages() {
        return pages;
    }
    public String getRefNumber() {
        return refNumber;
    }
    /**
     * Methods used to print the author and title to terminal.
     */
    public void printTitle() {
        System.out.println(title);
    }
    public void printAuthor() {
        System.out.println(author);
    }
    public void printDetails() {
        System.out.println("Author: " + author);
        System.out.println("Title: " + title);
        System.out.println("Pages: " + pages);
        if (refNumber.length() == 0) {
            System.out.println("ZZZ");
        } else {
            System.out.println("Reference Number: " + refNumber);
        }
    }
}
