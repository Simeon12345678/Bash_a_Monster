public class Player {
    private String name;
    private int hp;
    private int dmg;

    public Player(String NewName) {
        name = NewName;
        hp = 40;
        dmg = 20;
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
