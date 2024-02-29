package atividade2.Menu.Segments;

public class Window {
    protected String name;
    protected int sizeX, sizeY;

    public Window(String name, int sizeX,int sizeY) {
        this.name = name;
        this.sizeX = sizeX;
        this.sizeY = sizeY;
    }

    public String getName() {
        return name;
    }

    public int getSizeX() {
        return sizeX;
    }

    public void setSizeX(int sizeX) {
        this.sizeX = sizeX;
    }

    public int getSizeY() {
        return sizeY;
    }
    public void setSizeY(int sizeY) {
        this.sizeY = sizeY;
    }
}
