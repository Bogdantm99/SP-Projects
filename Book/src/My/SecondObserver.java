package My;

public class SecondObserver implements Observer {
    @Override
    public void update(String oldValue, String newValue){
        System.out.println("Old Value:" + oldValue + "New value:" + newValue);
    }
}
