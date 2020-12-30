package nl.novi.bijles03;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class MainList {
    public static void main(String[] args) {

        List<String> footballClubList = new ArrayList<>();

        footballClubList.add("Ajax");
        footballClubList.addAll(Arrays.asList("Utrecht", "Emmen", "PSV"));

        footballClubList.isEmpty(); // true of false
        footballClubList.size(); // grootte in int
        footballClubList.get(0); //waarde van specifieke positie opvragen
        footballClubList.remove(0);

        footballClubList.addAll(Arrays.asList("De Graafschap", "Feyenoord", "Sparta Rotterdam", "Excelsior"));

        for (String nameOfClub : footballClubList) {
            System.out.println(nameOfClub);
        }

        for (int i = 0; i < footballClubList.size(); i++) {
            System.out.println(footballClubList.get(i));
        }

        footballClubList.add("Ajax");



        if(footballClubList.contains("Sjaak") == false) {
            footballClubList.add("Sjaak");
        }

        System.out.println(footballClubList);

        Scanner scanner = new Scanner(System.in);  // Create a Scanner object

        boolean wantsToAddClub = true;

        while(wantsToAddClub) {
            System.out.println("Enter clubname:");
            String userInputClubname = scanner.nextLine();  // Read user input
            System.out.println("Ingevoerde naam: " + userInputClubname);  // Output user input

            footballClubList.add(userInputClubname);
            System.out.println(footballClubList);

            System.out.println("Wilt u nog een club toevoegen? [yes] or [no]");
            String userResponse = scanner.nextLine();
            if(userResponse.equals("no")) {
                wantsToAddClub = false;
            }
        }






    }
}
