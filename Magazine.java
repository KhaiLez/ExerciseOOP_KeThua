public class Magazine extends LibraryItem
{
    private int issueNumber;
    private String publisher;

    public Magazine(String title, int yearPublished, int issueNumber, String publisher)
    {
        super(title, yearPublished);
        this.issueNumber=issueNumber;
        this.publisher=publisher;
    }

    public int getIssueNumber()
    {
        return this.issueNumber;
    }

    public void setIssueNumber(int issueNumber)
    {
        this.issueNumber = issueNumber;
    }

    public String getPublisher()
    {
        return this.publisher;
    }

    public void setPublisher(String publisher)
    {
        this.publisher = publisher;
    }

    public String getDetails()
    {
        String infoMagazine= super.getDetails();
        return "Magazine Info: "+infoMagazine+", IssueNumber: "+this.issueNumber+", Publisher: "+this.publisher;
    }
}
