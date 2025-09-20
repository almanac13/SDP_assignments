package FactoryMethod.laptop;

public class Apple implements Laptop {
    @Override
    public void specification() {
        System.out.println("You are in Apple Fab");
    }
}
