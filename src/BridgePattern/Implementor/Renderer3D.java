package BridgePattern.Implementor;


public interface Renderer3D {
    void renderModel(String modelName, float x, float y, float z);
    void renderLight(String type, float intensity);
    void renderCamera(String name, float fov);
}
