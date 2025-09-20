package FactoryMethod;

import FactoryMethod.laptop.Laptop;
import FactoryMethod.laptop_factory.LapFactory;

class Driver {
    private LapFactory factory = new LapFactory();

    public void run() {
        Laptop apple =  factory.createLaptop("Apple");
        Laptop lenove = factory.createLaptop("Lenovo");
        Laptop huawei = factory.createLaptop("Huawei");

        apple.specification();
        lenove.specification();
        huawei.specification();


    }

}
