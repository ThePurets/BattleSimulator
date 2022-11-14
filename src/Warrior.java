import java.util.Random;

public class Warrior extends Character implements Attacker {

    private int stamina;
    private int strength;


    public Warrior(String id, String name, int hp, boolean isAlive, int stamina, int strength) {
        super(id, name, hp, isAlive);
        setId(id);
        setHp(hp);
        setName(name);
        setStamina(stamina);
        setStrength(strength);
        setAlive(isAlive);
    }

    public Warrior(String name, int hp, int stamina, int strength) {
        super(name, hp);
        this.stamina = stamina;
        this.strength = strength;
    }

    @Override
    public void setId(String id) {
        int idCounter = (int)(Math.random()*1000+1000);
        super.setId(Integer.toString(idCounter));
    }

    @Override
    public void setName(String name) {
        String warriorName = "";
        String warrior = "Warrior";
        String[] nameArray = { "Etorn", "Deadhallow", "Dragonshield", "Red Fury", "Frost Bow","Single Sworn","Zaras"};
        for (int i = 0; i < nameArray.length; i++) {
            nameArray[i] = nameArray[(int) (Math.random() * (nameArray.length - 1))];
            warriorName = nameArray[i];
        }
        super.setName(warrior + " " + warriorName);
    }

    @Override
    public void attack(Character character) {
        int heavyAttack = strength;
        int weakAttack = strength/2;

        int[] attackArr={heavyAttack,weakAttack};
        Random r=new Random();
        int randomNumber=r.nextInt(attackArr.length);

        if (attackArr[randomNumber]== heavyAttack){
            setStamina(getStamina()-5);
        }else{
            setStamina(getStamina()+1);
        }
        character.setHp(character.getHp()-attackArr[randomNumber]);
    }

    public int getStamina() {
        return stamina;
    }


    @Override
    public int getHp() {
        return super.getHp();
    }

    public void setStamina(int stamina) {
        this.stamina = (int)(Math.random()*50+5);
    }

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength =(int)(Math.random()*10+1);
    }


    @Override
    public boolean isAlive() {
        if (getHp() > 0){
            return true;
        }else{
            return false;
        }
    }
}

