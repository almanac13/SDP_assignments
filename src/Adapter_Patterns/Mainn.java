package Adapter_Patterns;

public class Mainn {
    public static void main(String[] args) {
        TubeAdapter tube = new TubeAdapter();
        Client.client(tube);
    }
}
