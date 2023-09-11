package FactoryMethod;

/**
 * Esta classe representa um documento do excel
 */
public class ExcelDocument implements Document{

    @Override
    public void open() {

        System.out.println("Open Excel Document - Factory Method");
    }

    @Override
    public void close() {
        System.out.println("Close Excel Document - Factory Method");
    }

    @Override
    public void save() {
        System.out.println("Save Excel Document - Factory Method");
    }

    @Override
    public void revert() {
        System.out.println("Revert Excel Document - Factory Method");
    }
}
