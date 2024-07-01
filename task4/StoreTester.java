package finalexam.task4;

public class StoreTester {
    public static void main(String[] args) {
        FurnitureStore store = new FurnitureStore("123 Main St", "VAT123456");

        Collection collection1 = new Collection("Living Room");
        Collection collection2 = new Collection("Bedroom");

        store.addCollection(collection1);
        store.addCollection(collection2);

        System.out.println("Collections after adding: " + store.getCollections());

        store.saveCollectionsToFile("collections.txt");

        store.removeCollection(collection1);
        System.out.println("Collections after removing one: " + store.getCollections());

        store.loadCollectionsFromFile("collections.txt");
        System.out.println("Collections after loading from file: " + store.getCollections());
    }
}

