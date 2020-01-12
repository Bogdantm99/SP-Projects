package My;

import java.util.ArrayList;

public class Table implements Element,Observable{

    public String oldContent;
    private String _tableName;
    public String Value;
    public String oldValue;
    ArrayList<Observer> observerList=new ArrayList<Observer>();

    public String get_tableName() {
        return _tableName;
    }

    public void set_tableName(String _tableName) {
        this._tableName = _tableName;
    }

    public Table(String tableName){
        _tableName = tableName;
    }

    @Override
    public void print() {
        System.out.println("Table name: "+get_tableName());
    }

    @Override
    public void Accept(BookStatistics bookStatistics) {
        bookStatistics.Visit(this);
    }

    @Override
    public void setNewValue(String newValue) {
            oldValue = _tableName;
            this._tableName = newValue;
            notifyObserver();
    }

    @Override
    public Element copy() {
        return new Table(_tableName);
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
            o.update(oldValue,_tableName);
        }
    }
}
