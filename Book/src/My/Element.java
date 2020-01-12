package My;

public interface Element {
    void print();
    void Accept(BookStatistics bookStatistics);
    void setNewValue(String newValue);
    Element copy();
}
