import java.util.ArrayList;
import java.util.List;

public class Main
{
    public static void main(String[] args)
    {
        // Create a collection to hold LibraryItem objects
        List<LibraryItem> libraryItems = new ArrayList<>();


        Book book1 = new Book("GodFather", 1969, "Mario Puzo", "9780743273565");
        Book book2 = new Book("The Sicilian", 1984, "Mario_Puzo", "9780451524935");


        Magazine magazine1 = new Magazine("National Geographic", 2023, 7, "National Geographic Partners");
        Magazine magazine2 = new Magazine("Time", 2023, 42, "Time USA, LLC");

        // Add items to the collection
        libraryItems.add(book1);
        libraryItems.add(book2);
        libraryItems.add(magazine1);
        libraryItems.add(magazine2);


        for (LibraryItem item : libraryItems)
        {
            System.out.println(item.getDetails());
        }
    }
}
