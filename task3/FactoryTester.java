package finalexam.task3;

public class FactoryTester {
    public static void main(String[] args) {
        PaperFactory factory = new PaperFactory();

        Person person1 = new Person("John", "Doe");
        Person person2 = new Person("Jane", "Smith");

        factory.addPerson(person1);
        factory.addPerson(person2);

        System.out.println("Staff after adding two persons: " + factory.getStaff());

        factory.saveStaffToFile("staff.txt");

        factory.deletePerson(person1);
        System.out.println("Staff after deleting one person: " + factory.getStaff());

        factory.loadStaffFromFile("staff.txt");
        System.out.println("Staff after loading from file: " + factory.getStaff());
    }
}
