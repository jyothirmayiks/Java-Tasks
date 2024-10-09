abstract class Mobile {
    private String brand;

    public Mobile() {
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getBrand() {
        return brand;
    }

    public abstract void specs();
}

class Samsung extends Mobile {
    private String model;
    private double price;

    public Samsung(String brand, String model, double price) {
        setBrand(brand);
        this.model = model;
        this.price = price;
    }

    @Override
    public void specs() {
        System.out.println("Brand: " + getBrand() + "\nModel: " + model + "\nPrice: Rs." + price);
    }

    public void features() {
        System.out.println(model + " has fast charging and wireless charging.");
    }

    public void features(String additionalFeature) {
        System.out.println(model + " has fast charging, wireless charging, and " + additionalFeature);
    }
}

class Apple extends Mobile {
    private String model;
    private String iOSVersion;
    private double price;

    public Apple(String brand, String model, String iOSVersion, double price) {
        setBrand(brand);
        this.model = model;
        this.iOSVersion = iOSVersion;
        this.price = price;
    }

    @Override
    public void specs() {
        System.out.println("\nBrand: " + getBrand() + "\nModel: " + model + "\niOS Version: " + iOSVersion + "\nPrice: Rs." + price);
    }
}

class Xiaomi extends Mobile {
    private String model;
    private double price;

    public Xiaomi(String brand, String model, double price) {
        setBrand(brand);
        this.model = model;
        this.price = price;
    }

    @Override
    public void specs() {
        System.out.println("\nBrand: " + getBrand() + "\nModel: " + model + "\nPrice: Rs." + price);
    }

    public void features() {
        System.out.println(model + " has a high refresh rate display and fast charging.");
    }

    public void features(String additionalFeature) {
        System.out.println(model + " has a high refresh rate display, fast charging, and " + additionalFeature);
    }
}

public class OopsConcepts {

    public static void main(String[] args) {
        Mobile mySamsung = new Samsung("Samsung", "Galaxy S23", 64999);
        Mobile myApple = new Apple("Apple", "iPhone 15 Pro", "iOS 17", 134900);
        Mobile myXiaomi = new Xiaomi("Xiaomi", "Xiaomi 14 Ultra", 99999);

        mySamsung.specs();
        myApple.specs();
        myXiaomi.specs();

        if (mySamsung instanceof Samsung) {
            ((Samsung) mySamsung).features();
            ((Samsung) mySamsung).features("water resistance");
        }

        if (myXiaomi instanceof Xiaomi) {
            ((Xiaomi) myXiaomi).features();
            ((Xiaomi) myXiaomi).features("gaming mode");
        }
    }
}
