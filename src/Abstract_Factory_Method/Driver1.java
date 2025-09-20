package Abstract_Factory_Method;


import Abstract_Factory_Method.laptopFactory.HuaweiFactory;
import Abstract_Factory_Method.laptopFactory.LaptopFactory;
import Abstract_Factory_Method.laptopFactory.LenovoFactory;

import Abstract_Factory_Method.laptopType.BusinessLaptop;
import Abstract_Factory_Method.laptopType.GamingLaptop;


public class Driver1 {
    public void run(){

        LaptopFactory lenovoFactory = new LenovoFactory();
        GamingLaptop lenovoGaming = lenovoFactory.createGamingLaptop();
        BusinessLaptop lenovoBusiness = lenovoFactory.createBusinessLaptop();

        lenovoGaming.specification();
        lenovoBusiness.specification();

        // Huawei family
        LaptopFactory huaweiFactory = new HuaweiFactory();
        GamingLaptop huaweiGaming = huaweiFactory.createGamingLaptop();
        BusinessLaptop huaweiBusiness = huaweiFactory.createBusinessLaptop();

        huaweiGaming.specification();
        huaweiBusiness.specification();

    }
}
