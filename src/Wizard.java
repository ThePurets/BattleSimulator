import java.util.Random;

public class Wizard extends Character implements Attacker{

    private int mana;
    private int intelligence;


    public Wizard(String id, String name, int hp, boolean isAlive, int mana, int intelligence) {
        super(id, name, hp, isAlive);
        setName(name);
        setId(id);
        setHp(hp);
        setMana(mana);
        setIntelligence(intelligence);

    }

    @Override
    public void setId(String id) {
        int idCounter = (int)(Math.random()*1000+1000);
        super.setId(Integer.toString(idCounter));
    }

    @Override
    public void setHp(int hp) {
        int wizardHp = ((int)(Math.random()*50+50));
        super.setHp(wizardHp);
    }

    @Override
    public void setName(String name) {
        String wizardName = "";
        //String wizard = "Wizard";
        String[] nameArray = { "Belassha", "Derius", "Albael", "Harrho", "Sirchres","Ellkra","Bridark"};
        for (int i = 0; i < nameArray.length; i++) {
            nameArray[i] = nameArray[(int) (Math.random() * (nameArray.length - 1))];
            wizardName = nameArray[i];
        }
        //super.setName(wizard + " " + wizardName);
        super.setName(wizardName);
    }
    


    public Wizard(String name, int hp, int mana, int intelligence) {
        super(name, hp);
        this.mana = mana;
        this.intelligence = intelligence;
    }

    @Override
    public void attack(Character character) {
        int fireball = intelligence;
        int staffHit = 2;

        int[] attackArr={fireball,staffHit};
        Random r=new Random();
        int randomNumber=r.nextInt(attackArr.length);

        if (attackArr[randomNumber]==fireball){
            setMana(getMana()-5);
        }else{
            setMana(getMana()-5);
        }
        character.setHp(character.getHp()-attackArr[randomNumber]);
    }


    public int fireball(){
        return getIntelligence();
    }


    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = (int)(Math.random()*50+5);
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = (int)(Math.random()*50+1);
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


