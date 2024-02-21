package Game;

public class Entity {
    private boolean alive = true;
    private int lifePoints = 100;
    private int atack = 20;
    private int armor = 0;
    private int resistance = 0;

    public boolean isAlive() {
        return alive;
    }
    public int getLifePoints() {
        return lifePoints;
    }
    public void setLifePoints(int lifePoints) {
        this.lifePoints = lifePoints;
    }
    public int getAtack() {
        return atack;
    }
    public void setAtack(int atack) {
        this.atack = atack;
    }
    public int getArmor() {
        return armor;
    }
    public void setArmor(int armor) {
        this.armor = armor;
    }
    public int getResistance() {
        return resistance;
    }
    public void setResistance(int resistance) {
        this.resistance = resistance;
    }

}
