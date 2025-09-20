package Abstract_Factory_Method.laptopFactory;


import Abstract_Factory_Method.laptopType.BusinessLaptop;
import Abstract_Factory_Method.laptopType.GamingLaptop;
import Abstract_Factory_Method.laptops.HuaweiBussinessLaptop;
import Abstract_Factory_Method.laptops.HuaweiGamingLaptop;
import Abstract_Factory_Method.laptops.LenoveBussinessLaptop;
import Abstract_Factory_Method.laptops.LenovoGamingLaptop;

public class LenovoFactory implements LaptopFactory{
    @Override
    public BusinessLaptop createBusinessLaptop() {
        return new LenoveBussinessLaptop();
    }


    @Override
    public GamingLaptop createGamingLaptop() {
        return new LenovoGamingLaptop();
    }
}
