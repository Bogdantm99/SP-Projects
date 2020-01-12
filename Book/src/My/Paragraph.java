package My;

import java.util.ArrayList;

public class Paragraph implements Element,Observable {
    private String _paragraphName;
    private AlignStrategy _strategy;
    public String Value;
    public String oldValue;
    ArrayList<Observer> observerList = new ArrayList<Observer>();

    public String get_paragraphName() {
        return _paragraphName;
    }

    public void set_paragraphName(String _paragraphName) {
        this._paragraphName = _paragraphName;
    }

    public Paragraph(String paragraphName){
        _paragraphName = paragraphName;
    }

    @Override
    public void print() {
        System.out.println("Paragraph name: "+get_paragraphName());
        if(_strategy == null){
            System.out.println(_paragraphName);
        }else{
            _strategy.Print(_paragraphName);
        }
    }

    public void SetStrategy(AlignStrategy Strategy){
        _strategy = Strategy;
    }

    @Override
    public void Accept(BookStatistics bookStatistics) {
        bookStatistics.Visit(this);
    }

    @Override
    public void setNewValue(String newValue) {
        oldValue = _paragraphName;
        this._paragraphName = newValue;
        notifyObserver();
    }

    @Override
    public Element copy() {
        return new Paragraph(_paragraphName);
    }

    @Override
    public void addObserver(Observer obs) {
        observerList.add(obs);

    }

    @Override
    public void removeObserver(Observer obs) {
        observerList.remove(obs);
    }

    @Override
    public void notifyObserver() {
        for(Observer o : observerList){
            o.update(oldValue,_paragraphName);
         }
    }
}
