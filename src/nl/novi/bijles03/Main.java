package nl.novi.bijles03;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> names = new ArrayList<>();
        addNameToList("Sjaak", names);
        addNameToList("Sjaak", names);
        addNameToList("Sjaak", names);

        System.out.println("Aantal namen in de lijst: " + names.size());

        printResultOfSumTwo();

        sumOfNumbers(12, 12);
        sumOfNumbers(122, 6767);
        sumOfNumbers(345234, 231);
        sumOfNumbers(4544, 24354);
        sumOfNumbers(325, 666);

        double priceExBtw = 100;
        double priceWithBtw = priceExBtw + (priceExBtw/100*getBtw());
    }


    /**
     * Methode ontvangt twee parameters. Voegt de string toe aan de lijst.
     * @param name : Naam om toegevoegd te worden
     * @param nameList : List waaraan de naam wordt toegevoegd
     */
    public static void addNameToList(String name, List<String> nameList) {
        if(isNameUnique(name, nameList) == true) {
            nameList.add(name);
        }
    }

    /**
     * Methode ontvangt een List en een Naam. De methode checkt of de naam in de lijst
     * voorkomst
     * @param name Naam die gecheckt wordt of deze uniek is.
     * @param nameList Lijst met namen waartegen vergeleken wordt.
     * @return True of false. False wanneer de name voorkomt in de nameList.
     */
    public static boolean isNameUnique(String name, List<String> nameList) {
        for(String nameFromList : nameList) {
            if(nameFromList.equals(name)) {
                return false;
            }
        }
        return true;
    }

    public static void printResultOfSumTwo() {
        int firstInteger = 12;
        int secondInteger = 3554;
        int result = firstInteger + secondInteger;
        System.out.println(firstInteger + secondInteger);
    }

    public static void sumOfNumbers(int amountOne, int amountTwo) {
        int result = amountOne + amountTwo;
        System.out.println("Het resultaat is: " + result);
    }

    public static int getBtw() {
        return 21;
    }

}
