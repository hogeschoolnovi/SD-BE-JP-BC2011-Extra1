package nl.novi.donderdag;

public class MainUppercase {
    public static void main(String[] args) {
        String firstname = "sjaak";
        String lastname = "polak";


        firstname = capitalizeFirstLetter(firstname); // pakketje de waarde van firstname
        lastname = capitalizeFirstLetter(lastname); // pakketje de waarde van lastname

        String fullName = firstname + " " + lastname;
        System.out.println(fullName);

        System.out.println(capitalizeFirstLetter("hallo"));
        System.out.println(capitalizeFirstLetter("doei"));
        System.out.println(capitalizeFirstLetter("kerst is leuk"));
        System.out.println(capitalizeFirstLetter("vakantie"));
        System.out.println(capitalizeFirstLetter("vriendshcap"));
        System.out.println(capitalizeFirstLetter("lalala"));

        // laat user iets invoeren
        // Check of user iets 'normaals' heeft in ingevoerd (X of O)


    }

    public static String capitalizeFirstLetter(String word) {
        return word.substring(0,1).toUpperCase() + word.substring(1).toLowerCase();
    }
}
