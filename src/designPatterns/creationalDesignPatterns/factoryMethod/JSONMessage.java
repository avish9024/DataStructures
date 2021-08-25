package designPatterns.creationalDesignPatterns.factoryMethod;

public class JSONMessage extends Message{
    @Override
    public String getContent() {
        return "{\"JSON\": []}";
    }
}
