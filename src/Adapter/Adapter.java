package Adapter;

public class Adapter extends Adaptee implements Target{
    @Override
    public String resquest() {
        return  this.specificRequest();
    }
}
