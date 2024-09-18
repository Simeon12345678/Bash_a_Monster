public class Main {
    public static void main(String[] args) {
        Monster m1 = new Monster();
        Player p1 = new Player("Felix");

        System.out.println("Monsters name is " + m1.getName() + " his damage is " + m1.getDmg() + " his health is " + m1.getHp());
        System.out.println("Players name is " + p1.getName() + " their damage is " + p1.getDmg() + " their health is " + p1.getHp());

        System.out.println(p1.getName() + " Bashes " + m1.getName());
        m1.setHp(p1.getDmg());
        System.out.println(m1.getName() + " takes damage! His hp now is " + m1.getHp() + "he fights back!");
        System.out.println(m1.getName() + " bashes " + p1.getName());
        p1.setHp(m1.getDmg());
        System.out.println(p1.getName() + " takes damage! His hp is now " + p1.getHp());
        System.out.println("The End");
    }
}

