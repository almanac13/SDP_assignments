package Abstract_Factory_Method.laptopFactory;


import Abstract_Factory_Method.laptopType.BusinessLaptop;
import Abstract_Factory_Method.laptopType.GamingLaptop;
import Abstract_Factory_Method.laptops.HuaweiBussinessLaptop;
import Abstract_Factory_Method.laptops.HuaweiGamingLaptop;


public class HuaweiFactory implements LaptopFactory {

    @Override
    public GamingLaptop createGamingLaptop() {
        return new HuaweiGamingLaptop();
    }

    @Override
    public BusinessLaptop createBusinessLaptop() {
        return new HuaweiBussinessLaptop();
    }

}
