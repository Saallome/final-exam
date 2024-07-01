package finalexam.task2;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Smith");

        factory.addPerson(person1);
        factory.addPerson(person2);

        System.out.println("Staff after adding two persons: " + factory.getStaff());

        factory.deletePerson(person1);

        System.out.println("Staff after deleting one person: " + factory.getStaff());
    }
}