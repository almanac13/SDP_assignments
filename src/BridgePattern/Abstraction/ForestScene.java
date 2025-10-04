package BridgePattern.Abstraction;

import BridgePattern.Implementor.Renderer3D;

public class ForestScene extends Scene {
    public ForestScene(Renderer3D renderer) {
        super(renderer);
    }

    @Override
    public void renderScene() {
        renderer.renderCamera("WideView", 75);
        renderer.renderLight("Ambient", 0.5f);
        renderer.renderModel("Tree", 2, 0, 1);
        renderer.renderModel("Rock", 4, 0, -3);
    }
}