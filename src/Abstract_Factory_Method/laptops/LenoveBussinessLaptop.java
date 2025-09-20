package Abstract_Factory_Method.laptops;

import Abstract_Factory_Method.laptopType.BusinessLaptop;
import FactoryMethod.laptop.Laptop;

public class LenoveBussinessLaptop implements BusinessLaptop {
    @Override
    public void specification() {
        System.out.println("Lenove Bussiness Laptop");
    }
}
