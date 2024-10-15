public class Book extends LibraryItem
{
    private String author;
    private String isbn;

    public Book(String title, int yearPublished, String author, String isbn)
    {
        super(title, yearPublished);
        this.author=author;
        this.isbn=isbn;
    }

    public String getAuthor()
    {
        return this.author;
    }

    public String getIsbn()
    {
        return this.isbn;
    }

    public void setAuthor(String author)
    {
        this.author=author;
    }

    public void setIsbn(String isbn)
    {
        this.isbn = isbn;
    }

    public String getDetails()
    {
        String infoBook= super.getDetails();
        return "Book Info: "+infoBook+", Author: "+this.author+", Isbn: "+this.isbn;
    }
}
