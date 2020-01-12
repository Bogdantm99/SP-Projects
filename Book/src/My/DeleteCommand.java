package My;

public class DeleteCommand implements Command {
    Memento mem = new Memento();

    public void execute() {

    var section = DocumentManager.getInstance().getBook().content.get(0);
    var content =((Section)(section)).content;
    mem.setState(section);
    content.remove(content.size()-1);
    }

    public void unexecute() {
        var section = DocumentManager.getInstance().getBook().content;
        section.clear();
        section.add(mem.getState());
    }
}
