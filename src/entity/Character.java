package entity;

public class Character {
    private int health;
    private int attack;

    public Character(int health, int attack){
        this.health = health;
        this.attack = attack;
    }

    public void setHealth(int health){
        this.health = health;
    }

    public int getHealth(){
        return this.health;
    }

    public int getAttack() {
        return attack;
    }

    public void attack(Character character){
        int healthAfter = character.getHealth()-this.attack;
        character.setHealth(Math.max(healthAfter, 0));
    }

    public boolean isAlive(){
        return health != 0;
    }
}
