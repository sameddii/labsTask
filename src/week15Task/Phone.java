package week15Task;

public abstract class Phone {

    private String model;
    private String color;

    public Phone(String model, String color) {
        setModel(model);
        setColor(color);
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public abstract void call(String number);
    public abstract void text();


    @Override
    public String toString() {
        return getClass().getSimpleName()+"{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
