public class Monster {
    private int hp;
    private int dmg;
    private String name;

    public Monster() {
        hp = 50;
        dmg = 10;
        name = "Fredrick";
    }

    public int setHp(int damage) {
        hp -= damage;
        return hp;
    }

    public int getHp() {
        return hp;
    }

    public int getDmg() {
        return dmg;
    }

    public String getName() {
        return name;
    }
}
