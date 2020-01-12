package My;

import java.util.Stack;

public class DocumentManager {
    private static DocumentManager instance;
    private Book documentBook;
    private Section documentSection;
    private Stack<Command> stack = new Stack();

    private DocumentManager() {

    }
    public static DocumentManager getInstance() {
        if(instance == null)
            instance = new DocumentManager();

        return instance;

    }
    public void setBook(Book documentBook) {
        this.documentBook = documentBook;
    }
    public Book getBook() {
        return this.documentBook;
    }

    public void setSection(Section documentSection) {
        this.documentSection = documentSection;
    }

    public Section getSection() {
        return this.documentSection;
    }

    public void addCommand(Command com) {
        this.stack.push(com);
    }

    public Command getCommand() {
        return (Command)this.stack.pop();}
}
