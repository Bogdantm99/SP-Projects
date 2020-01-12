package My;

public class OpenCommand implements Command {
    String command;

    public OpenCommand(String c) {
        command = c;
    }

    public void execute() {

    }

    @Override
    public void unexecute(){

    }
}
