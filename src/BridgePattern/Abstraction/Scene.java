package BridgePattern.Abstraction;

import BridgePattern.Implementor.Renderer3D;

public abstract class Scene {
    protected Renderer3D renderer;

    public Scene(Renderer3D renderer) {
        this.renderer = renderer;
    }
    public abstract void renderScene();
}