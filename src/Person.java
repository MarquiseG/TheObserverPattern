public class Person implements  Observer {

    private String name ;

    public Person(String name, Subject subject) {
        this.name = name;
        subject.registerObserver(this);
    }

    @Override
    public void update(String availability) {
        System.out.println("Hello, "+ name + ". Observer.Product is available now !");
    }
}
