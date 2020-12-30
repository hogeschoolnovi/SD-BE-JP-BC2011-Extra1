package nl.novi.bijles03;

public class CalculateMain {
    public static void main(String[] args) {
        int getal = 14;
        System.out.println(verdubbelaar(getal));
        int calculatedResult = verdubbelaar(getal);
        calculatedResult = calculatedResult - 1;
        System.out.println(calculatedResult);


    }

    // Methode die een getal ontvangt en deze verdubbelt.
    public static int verdubbelaar(int getal) {
        int result = getal * 2;
        return result;
    }

    public static void doubleIt(int getal) {
        int result = getal * 2;
    }

}
