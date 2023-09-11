package TemplateMethod;

public class ConcreteClass extends AbstractClass{

    @Override
    public void primitiveOperation1() {
        System.out.println("ConcreteClass - primitiveOperation1 - TemplateMethod");
    }

    @Override
    public void primitiveOperation2() {
        System.out.println("ConcreteClass - primitiveOperation2 - TemplateMethod");
    }
}
