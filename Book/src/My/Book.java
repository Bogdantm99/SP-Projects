package My;
import java.util.ArrayList;
import java.util.List;

public class Book {
    private String title;
    private Author bookAuthor;
    public ArrayList<Element> content;

    public Book(String Title) {
        this.title = Title;
        content = new ArrayList<Element>();
    }

    public void AddAuthor(Author author) {
        bookAuthor = author;
    }

    public void AddContent(Element element)
    {
        content.add(element);
    }

    public String get_title() {
        return title;
    }

    public void set_title(String _title) {
        this.title = _title;
    }

    public Author get_bookAuthor() {
        return bookAuthor;
    }

    public void set_bookAuthor(Author _bookAuthor) {
        this.bookAuthor = _bookAuthor;
    }

    public ArrayList<Element> get_content() {
        return content;
    }

    public void set_content(ArrayList<Element> _content) {
        this.content = _content;
    }

    public void Print()
    {

        System.out.println("Book Title: "+title);
        if(bookAuthor != null) {
            System.out.println("Author: " + bookAuthor.get_authorName());
        }
        for (var element:content)
        {
            element.print();
        }

    }
}