package Abstract_Factory_Method.laptopFactory;


import Abstract_Factory_Method.laptopType.BusinessLaptop;
import Abstract_Factory_Method.laptopType.GamingLaptop;

public interface LaptopFactory {
    GamingLaptop createGamingLaptop();
    BusinessLaptop createBusinessLaptop();
}
