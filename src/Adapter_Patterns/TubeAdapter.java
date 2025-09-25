package Adapter_Patterns;
//Adapter
public class TubeAdapter implements Water {
    private Well well = new Well();

    @Override
    public void watering() {
        well.well();
    }
}
