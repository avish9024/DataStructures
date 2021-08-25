package designPatterns.creationalDesignPatterns.abstractFactory;

public class GoogleCoudStorage implements Storage{

    public GoogleCoudStorage(int capacityInMib) {
        System.out.println("Allocated " + capacityInMib + " on Google cloud storage");
    }

    @Override
    public String getId() {
        return "GCPS1";
    }

    @Override
    public String toString() {
        return "GoogleCoudStorage{}";
    }
}
