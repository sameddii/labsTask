package week15Task;

public class SamsungNote extends Samsung implements HasPen{

    public SamsungNote(String model, String color) {
        super(model, color);
    }

    @Override
    public void hasPen() {
        System.out.println(getModel() + " has pen feature");
    }
}
