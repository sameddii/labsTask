package week15Task;

public class Iphone extends Phone implements HasSiri,HasIOS{

    public Iphone(String model, String color) {
        super(model, color);
    }

    @Override
    public void call(String number) {
        System.out.println("Calling -> "+number);
    }

    @Override
    public void text() {
        System.out.println("Texting on messenger ...");
    }

    @Override
    public void hasIOS() {
        System.out.println("All iphone models contains IOS");
    }

    @Override
    public void hasSiri() {
        System.out.println(getModel() + " has Siri");
    }
}