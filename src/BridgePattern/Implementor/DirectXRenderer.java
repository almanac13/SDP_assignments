package BridgePattern.Implementor;

public class DirectXRenderer implements Renderer3D {
    public void renderModel(String modelName, float x, float y, float z) {
        System.out.println("DirectX: Drawing model " + modelName + " at " + x + "," + y + "," + z);
    }

    public void renderLight(String type, float intensity) {
        System.out.println("DirectX: Lighting with " + type + " at intensity " + intensity);
    }

    public void renderCamera(String name, float fov) {
        System.out.println("DirectX: Initializing camera " + name + " (FOV " + fov + ")");
    }
}
