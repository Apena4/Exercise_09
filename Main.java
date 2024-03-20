//Andres Pena Fuentes Exercise 9
public class Main {
    public static void main(String[] args) {
        Phone juan = new Phone("Juan", 614645920);
        Email john = new Email("John","JohnJohnny123@gmail.com");
        juan.contact();
        john.contact();
}}
abstract class Contact{
    private String name;

    public Contact(String name) {
        this.name = name;
    }
    abstract public void contact();

}
class Email extends Contact{
    private String email;

    public Email(String name, String email) {
        super(name);
        this.email = email;
    }

    @Override
    public void contact() {
        System.out.println("You are emailing "+email+"...");

    }

}
class Phone extends Contact{
    private int phoneNum;

    public Phone(String name, int phoneNum) {
        super(name);
        this.phoneNum = phoneNum;
    }

    @Override
    public void contact() {
        System.out.println("Calling "+phoneNum+".");

    }
}