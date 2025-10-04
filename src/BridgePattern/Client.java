package BridgePattern;

import BridgePattern.Abstraction.CityScene;
import BridgePattern.Abstraction.ForestScene;
import BridgePattern.Abstraction.Scene;
import BridgePattern.Implementor.DirectXRenderer;
import BridgePattern.Implementor.OpenGLRenderer;
import BridgePattern.Implementor.Renderer3D;

public class Client {
    public void run() {
        Renderer3D opengl = new OpenGLRenderer();
        Renderer3D directx = new DirectXRenderer();

        Scene city = new CityScene(opengl);
        Scene forest = new ForestScene(directx);


        System.out.println("City using OpenGL");
        city.renderScene();
        System.out.println("Forest using DirectX");
        forest.renderScene();
    }
}
