import java.util.ArrayList;
import java.util.List;

public class Product implements Subject {

    private List<Observer> observers = new ArrayList<>();
    private String name;
    private String availabity;

    public Product(String name, String availabity) {
        this.name = name;
        this.availabity = availabity;
    }

    public void setAvailabity(String availabity){
        this.availabity = availabity;
        System.out.println("Observer.Product is available now! Notify all the observers.");
        notifyObservers();
    }

    public String getAvailabity() {
        return availabity;
    }

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregisterObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObservers() {
        for(Observer observer : observers){
            observer.update(availabity);
        }
    }
}
