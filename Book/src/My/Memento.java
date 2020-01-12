package My;

public class Memento{
    public Element state;

    public Element getState() {
        return state;
    }

    public void setState(Element state) {
        this.state = state.copy();
    }
}
