package designPatterns.creationalDesignPatterns.factoryMethod;

public class TextMessage extends Message{
    @Override
    public String getContent() {
        return "Text";
    }
}
