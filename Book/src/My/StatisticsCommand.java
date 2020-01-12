package My;

public class StatisticsCommand implements Command {

@Override
public void execute() {
        // TODO Auto-generated method stub
        BookStatistics visitor = new BookStatistics();
        //DocumentManager.getInstance().getBook().get_content().Accept(visitor);
        for(var i : DocumentManager.getInstance().getBook().get_content()) {
        i.Accept(visitor);
        }
        visitor.PrintStatistics();

        }

        @Override
        public void unexecute() {

        }
}