package BridgePattern.Implementor;



public class OpenGLRenderer implements Renderer3D {
    public void renderModel(String modelName, float x, float y, float z) {
        System.out.println("OpenGL: Drawing model " + modelName + " at " + x + ", " + y + ", " + z);
    }
    public void renderLight(String type, float intensity) {
        System.out.println("OpenGL: Drawing light " + type + " at " + intensity);
    }
    public void renderCamera(String name, float fov){
        System.out.println("OpenGL: Setting up camera " + name + " at " + fov);
    }
}
