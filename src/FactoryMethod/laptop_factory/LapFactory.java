package FactoryMethod.laptop_factory;

import FactoryMethod.laptop.Apple;
import FactoryMethod.laptop.Huawei;
import FactoryMethod.laptop.Laptop;
import FactoryMethod.laptop.Lenovo;

public class LapFactory {
    public Laptop createLaptop(String lapType) {

            if (lapType.equalsIgnoreCase("Apple")) {return new Apple();}
            if (lapType.equalsIgnoreCase("Lenovo")){return new Lenovo();}
            if (lapType.equalsIgnoreCase("Huawei")){return new Huawei();}

        return null;
    }
}
