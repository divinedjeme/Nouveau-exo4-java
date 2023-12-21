public class Main {
    public static void main(String[] args) {
        Person person1 = new Person("Doe", "Joe", 29, "01/01/1991");
        person1.setNom("popoui");
        person1.setPrenom("DIOP");
        person1.setAge(120);
        person1.setDateNaissance("01/01/1991");
        System.out.println(person1.toString());

        System.out.print("l'Age calculee est: " + person1.calculAge() + " ans");

    }
}