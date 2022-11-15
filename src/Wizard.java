public class Wizard extends Character implements Attacker{

    private int mana;
    private int intelligence;

    public Wizard(String id, String name, int hp, boolean isAlive, int mana, int intelligence) {
        super(id, name, hp, isAlive);
        this.mana = mana;
        this.intelligence = intelligence;
        //para generar un hp aleatorio entre 50 y 100
        //int hp = (int) (Math.random()*(100-50+1)+50);
    }

    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    @Override
    public void attack(Character character) {

        /*Generar un booleano aleatorio
        Random randomAttack = new Random();

    // Genera un boolean de forma aleatoria
        boolean attack = randomAttack.nextBoolean();

    // Si es verdadero cara y sino cruz
        if (attack) {
            System.out.println("Cara"); //HeaveyAttack();
        } else {
            System.out.println("Cruz"); //weakAttack();
        }*/

    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }
}


