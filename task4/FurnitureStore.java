package finalexam.task4;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FurnitureStore implements LegalEntity {
    private String address;
    private String vatNumber;
    private List<Collection> collections;

    public FurnitureStore(String address, String vatNumber) {
        this.address = address;
        this.vatNumber = vatNumber;
        this.collections = new ArrayList<>();
    }

    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public String getVatNumber() {
        return vatNumber;
    }

    public void addCollection(Collection collection) {
        collections.add(collection);
    }

    public boolean removeCollection(Collection collection) {
        return collections.remove(collection);
    }

    public List<Collection> getCollections() {
        return new ArrayList<>(collections);
    }

    public void saveCollectionsToFile(String filename) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filename))) {
            for (Collection collection : collections) {
                writer.write(collection.getName());
                writer.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void loadCollectionsFromFile(String filename) {
        collections.clear();
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            while ((line = reader.readLine()) != null) {
                collections.add(new Collection(line));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

