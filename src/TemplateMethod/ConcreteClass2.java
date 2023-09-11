package TemplateMethod;

public class ConcreteClass2 extends AbstractClass{
    @Override
    public void primitiveOperation1() {
        System.out.println("ConcreteClass2 - primitiveOperation1 - TemplateMethod");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("ConcreteClass2 - primitiveOperation2 - TemplateMethod");
    }
}
