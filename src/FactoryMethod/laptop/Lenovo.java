package FactoryMethod.laptop;

public class Lenovo implements Laptop {
    @Override
    public void specification() {
        System.out.println("You are in Lenovo fab");
    }
}
