public class LibraryItem
{
    private String title;
    private int yearPublished;

    LibraryItem(String title, int yearPublished)
    {
        this.title=title;
        this.yearPublished=yearPublished;
    }

    public String getTitle()
    {
        return this.title;
    }

    public void setTitle(String title)
    {
        this.title=title;
    }

    public int getYearPublished()
    {
        return this.yearPublished;
    }

    public void setYearPublished(int yearPublished)
    {
        this.yearPublished = yearPublished;
    }

    public String getDetails()
    {
        return "LibraryItem{" +
                "title='" + title + '\'' +
                ", yearPublished=" + yearPublished +
                '}';
    }
}