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

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle) {
        author = bookAuthor;
        title = bookTitle;
    }

    // Add the methods here ...
    /**
     * Get the author and title fields when this object is called.
     */
    
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
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
    
}
