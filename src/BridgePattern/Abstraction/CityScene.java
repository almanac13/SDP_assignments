package BridgePattern.Abstraction;

import BridgePattern.Implementor.Renderer3D;

public class CityScene extends Scene {
    public CityScene(Renderer3D renderer) {
        super(renderer);
    }

    @Override
    public void renderScene() {
        renderer.renderCamera("MainCamera", 90);
        renderer.renderLight("Directional", 1.0f);
        renderer.renderModel("Building", 0, 0, 0);
        renderer.renderModel("Car", 5, 0, 2);
    }
}
