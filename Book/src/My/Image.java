package My;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class Image implements Element,Observable {
    private String _imageName;
    public String Value;
    public String oldValue;
    ArrayList<Observer> observerList = new ArrayList<Observer>();

    public String get_imageName() {
        return _imageName;
    }

    public void set_imageName(String _imageName) {
        this._imageName = _imageName;
    }

    public Image(String imageName){
        _imageName = imageName;

        /*try {
            TimeUnit.SECONDS.sleep(5);
        }catch (Exception ex){
            System.out.println(ex);
        }*/

    }

    @Override
    public void print() {
        System.out.println("Image name: "+get_imageName());
    }

    @Override
    public void Accept(BookStatistics bookStatistics) {
        bookStatistics.Visit(this);
    }

    @Override
    public void setNewValue(String newValue) {
        oldValue = _imageName;
        this._imageName = newValue;
        notifyObserver();
    }

    @Override
    public Element copy() {
        return new Image(_imageName);
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
            o.update(oldValue,_imageName);
    }}

}