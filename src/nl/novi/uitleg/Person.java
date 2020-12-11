package nl.novi.uitleg;

public class Person {
    private String firstName;
    private String lastName;

    private int xPostion;
    private int yPostion;

    // Persoon kan 0 of 1 partner hebben
    private Person partner;

    //Persoon kan 1 of meerdere vrienden hebben.

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.xPostion = 0;
        this.yPostion = 0;
    }

    public void setPartner(Person person) {
        this.partner = person;
    }

    public Person getPartner() {
        return this.partner;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void moveLeft() {
        this.xPostion = this.xPostion - 1;
    }

    public void moveAmountLeft(int amountOfSteps) {
        this.xPostion = this.xPostion - amountOfSteps;
    }

    public String givePosition() {
        String position = "[" + this.xPostion + "," + this.yPostion +  "]";

        return position;
    }

    public int getxPostion() {
        return this.xPostion;
    }

}
