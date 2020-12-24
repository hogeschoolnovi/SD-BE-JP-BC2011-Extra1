package nl.novi.uitleg;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Person nick = new Person("Harry", "Stuivenberg");
        System.out.println("De startpositie van " + nick.getFirstName() + " "
                + nick.getxPostion());

        String voornaam = nick.getFirstName();

        nick.moveLeft();

        System.out.println("De nieuwe positie van " + nick.getFirstName() + " "
                + nick.getxPostion());

        nick.moveAmountLeft(100);

        System.out.println("De nieuwe positie van " + nick.getFirstName() + " "
                + nick.getxPostion());

        System.out.println(nick.givePosition());

        String position = nick.givePosition();

        position = position + " noorderbreedte";

        System.out.println(position);

        nick.getxPostion();

        // We hadden Nick al, we gaan nu Marjolein
        Person marjolein = new Person("Marjolein", "Achternaam");

        nick.setPartner(marjolein);

        System.out.println(marjolein.getFirstName());
        System.out.println(nick.getPartner().getFirstName());

        Person newPartner = new Person("Hallo", "Doei");
        nick.setPartner(newPartner);
        System.out.println(nick.getPartner().getFirstName());

        // Winkel

        Product p = new Product("Shampoo", 2.22);
        Product p2 = new Product("cremespoeling", 3);

        Shop shop = new Shop("Novi");

        shop.addProduct(p);
        System.out.println(shop.giveAmountOfProducts());

        shop.addProduct(p2);
        System.out.println(shop.giveAmountOfProducts());

        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            String name = i + "";
            Product product = new Product(name, random.nextDouble());
            shop.addProduct(product);
        }
        System.out.println(shop.giveAmountOfProducts());

        System.out.println(shop.toString());


	// write your code here
        // Getters en setters
        // Methodes
        // klassen en objecten
        // wat is this nou weer?
        //


        // StringBuilder

    }
}
