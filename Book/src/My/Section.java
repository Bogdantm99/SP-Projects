package My;

import com.fasterxml.jackson.databind.deser.std.CollectionDeserializer;

import java.util.ArrayList;
import java.util.Iterator;

public class Section implements Element,Observable{

    private String _sectionTitle;
    public ArrayList<Element> content;
    public ArrayList<Observer> observerList = new ArrayList<Observer>();
    public String Content;
    public String OldContent;


    public Section(){}

    public Section(String title){
        this._sectionTitle = title;
        content = new ArrayList<Element>();
    }

    public int add(Element element){
        content.add(element);
        return content.indexOf(element);
    }

    public void RemoveElement(Element element){
        content.remove(element);
    }

    public Element GetElement(int indexOfElement){
        return content.get(indexOfElement);
    }

    public String get_sectionTitle() {
        return _sectionTitle;
    }

    public void set_sectionTitle(String _sectionTitle) {
        this._sectionTitle = _sectionTitle;
    }

    public ArrayList<Element> getContent() {
        return content;
    }

    public void setContent(ArrayList<Element> content) {
        this.content = content;
    }

    @Override
    public void print() {
        System.out.println();
        System.out.println("Title: "+get_sectionTitle());

        for(var element:content){
            element.print();
        }
    }

    @Override
    public void Accept(BookStatistics bookStatistics) {
        for(Element element:content){
            element.Accept(bookStatistics);
        }
    }

    @Override
    public void setNewValue(String newValue) {
        OldContent = _sectionTitle;
        this._sectionTitle = newValue;
        notifyObserver();
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
        for(Observer o :observerList ){
            o.update(OldContent,_sectionTitle);
        }
    }

    public Section copy() {
        Section section1 = new Section(this._sectionTitle);
        Iterator var3 = this.content.iterator();

        while(var3.hasNext()) {
            Element element = (Element)var3.next();
            section1.add(element.copy());
        }

        return section1;
    }
}
