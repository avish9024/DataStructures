package designPatterns.creationalDesignPatterns.factoryMethod;

public class JSONMessageCreator extends MessageCreator{
    @Override
    public Message createMessage() {
        return new JSONMessage();
    }
}
