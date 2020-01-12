package My;

public class UndoCommand implements Command {
    @Override
    public void execute() {

        DocumentManager.getInstance().getCommand().unexecute();
    }

    @Override
    public void unexecute() {

    }
}
