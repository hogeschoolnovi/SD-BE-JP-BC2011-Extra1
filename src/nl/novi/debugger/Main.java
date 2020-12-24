package nl.novi.debugger;

public class Main {
    public static void main(String[] args) {

        Person teacher = new Person("Nick", "Stuivenberg", 30);
        Person henk = new Person("Henk", "van 't Kruijs", 42);

        teacher.setFirstName("Harry");

        System.out.println(teacher.getFirstName());

    }
}
