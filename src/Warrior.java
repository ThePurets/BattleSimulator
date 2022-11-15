import java.util.Random;

public class Warrior extends Character implements Attacker {

    private int stamina;
    private int strength;

    public Warrior(String id, String name, int hp, boolean isAlive) {
        super(id,name, hp, isAlive);
        this.setId(RandomString.randomString());
        this.stamina = (int) (Math.random()*(50-10+1)+10);;
        this.strength = (int) (Math.random()*(10-1+1)+1);

        //para generar un hp aleatorio entre 100 y 200
        //int hp = (int) (Math.random()*(200-100+1)+100);
    }

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        this.stamina = stamina;
        this.strength = strength;
    }

    @Override
    public void attack(Character character) {

        System.out.println("Preparando un ataque!");
     //Generar un booleano aleatorio
        Random randomAttack = new Random();

    // Genera un boolean de forma aleatoria
        boolean attack = randomAttack.nextBoolean();

    // Si es verdadero heavy y si no weak
        if (attack) {
            heaveyAttack();
            System.out.println("Enhorabuena! Es un heavy Attack!");
        } else {
            weakAttack();
            System.out.println("Que tengas suerte, jedai... Es un weak Attack ;/");
        }
    }

    private void weakAttack() {
    }

    private void heaveyAttack() {
    }

    public int getStamina() {
        return stamina;
    }

    public void setStamina(int stamina) {
        this.stamina = stamina;
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }
}

