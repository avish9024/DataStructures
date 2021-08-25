package designPatterns.creationalDesignPatterns.abstractFactory;

public class GoogleComputeEngineInstance implements Instance{

    public GoogleComputeEngineInstance(Capacity capacity) {
        System.out.println("Created GCP");
    }

    @Override
    public void start() {
        System.out.println("Started GCP");
    }

    @Override
    public void attachStorage(Storage storage) {
        System.out.println("Attached " + storage + " to GCP");
    }

    @Override
    public void stop() {
        System.out.println("GCP stopped");
    }
}
