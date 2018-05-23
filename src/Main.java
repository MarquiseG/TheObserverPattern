public class Main {
    public static void main (String ...args){
        Product product = new Product("iPhoneX", "notAvailable");
        new Person("Client1", product);
        new Person("Client2", product);
        System.out.println("iPhoneX availability state : " + product.getAvailabity());
        product.setAvailabity("Available");
    }
}
