package Abstract_Factory_Method.laptops;

import Abstract_Factory_Method.laptopType.GamingLaptop;

public class LenovoGamingLaptop implements GamingLaptop {
    @Override
    public void specification() {
        System.out.println("Lenovo GamingLaptop");
    }
}
