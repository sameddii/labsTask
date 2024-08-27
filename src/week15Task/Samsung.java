package week15Task;

public class Samsung extends Phone implements HasAndroid,HasBixby{

    public Samsung(String model, String color) {
        super(model, color);
    }

    @Override
    public void call(String number) {
        System.out.println("Calling number ... "+number);
    }

    @Override
    public void text() {
        System.out.println("Texting on discord ....");
    }

    @Override
    public void hasAndroid() {
        System.out.println("This "+getModel()+" has android system");
    }

    @Override
    public void hasBixby() {
        System.out.println(getModel()+ " has bixby");
    }
}