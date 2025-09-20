package Abstract_Factory_Method.laptops;

import Abstract_Factory_Method.laptopType.BusinessLaptop;

public class HuaweiBussinessLaptop implements BusinessLaptop {
    @Override
    public void specification() {
        System.out.println("Huawei Bussiness Laptop");
    }
}
