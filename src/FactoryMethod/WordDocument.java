package FactoryMethod;

/**
 * Esta classe representa um documento do Word
 */
public class WordDocument implements Document {

    @Override
    public void open() {

        System.out.println("Open Word Document - Factory Method");
    }

    @Override
    public void close() {
        System.out.println("Close Word Document - Factory Method");
    }

    @Override
    public void save() {
        System.out.println("Save Word Document - Factory Method");
    }

    @Override
    public void revert() {
        System.out.println("Revert Word Document - Factory Method");
    }
}
