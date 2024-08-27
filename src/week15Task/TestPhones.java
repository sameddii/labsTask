package week15Task;

public class TestPhones {

    public static void main(String[] args) {

        Iphone iphone = new Iphone("15 Pro","Titanum");
        System.out.println(iphone);
        iphone.call("123456789");
        iphone.text();
        iphone.hasIOS();
        iphone.hasSiri();

        System.out.println("--------------------------------------------------------");

        Samsung samsung = new Samsung("S24 Ultra","Black");
        System.out.println(samsung);
        samsung.call("987654321");
        samsung.text();
        samsung.hasAndroid();
        samsung.hasBixby();
    }
}

