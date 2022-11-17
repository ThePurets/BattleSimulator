import java.util.Random;

public class Warrior extends Character implements Attacker {

    private int stamina;
    private int strength;


    public Warrior( int hp, int stamina, int strength) {
        super( hp );
        setHp(hp);
        setName(generateRandomName());
        setStamina(stamina);
        setStrength(strength);
    }

    public Warrior( ) {
        super( RandomClass.randomNumber(100,200));
        setStamina(RandomClass.randomNumber(10,50));
        setStrength(RandomClass.randomNumber(1,10));
        setName(generateRandomName());
    }

    @Override
    public void attack(Character character) {
        int heavyAttack = strength;
        int weakAttack = strength/2;

        int[] attackArr={heavyAttack,weakAttack};
        Random r=new Random();
        int randomNumber=r.nextInt(attackArr.length);

        if (getStamina() < 5)
            character.setHp(character.getHp()-weakAttack);

        if (attackArr[randomNumber]== heavyAttack){
            setStamina(getStamina()-5);
            character.setHp(character.getHp()-heavyAttack);

        }else{
            if (stamina > 0){
                setStamina(getStamina()+1);
                character.setHp(character.getHp()-weakAttack);
            } else{
                setStamina(getStamina()+2);
            }
        }
    }

    public int getStamina() {
        return stamina;
    }


    @Override
    public int getHp() {
        return super.getHp();
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
    public boolean isAlive() {
        if (getHp() > 0){
            return true;
        }else{
            return false;
        }
    }
    @Override
    public String toString() {
        return super.toString() +
                "stamina=" + stamina +
                ", strength=" + strength +
                '}';
    }

    public String generateRandomName(){
        String warriorName;
        String isWarrior = "Warrior ";
        String[] nameArray = { "Etorn", "Deadhallow", "Dragonshield", "Red Fury", "Frost Bow","Single Sworn","Zaras"};
        warriorName = nameArray[(int) (Math.random() * (nameArray.length - 1))];
        return isWarrior + warriorName;
    }

}

