
import java.util.Random;

public class Wizard extends Character implements Attacker{

    private int mana;
    private int intelligence;


    public Wizard(int hp, int mana, int intelligence) {
        super ( hp );
        setName(generateRandomName());
        setHp(hp);
        setMana(mana);
        setIntelligence(intelligence);
        //setAlive(true);
    }

    public Wizard() {
        super(RandomClass.randomNumber(50,100));
        this.mana = RandomClass.randomNumber(10,50);
        setName(generateRandomName());
        this.intelligence = RandomClass.randomNumber(1,50);
    }



    @Override
    public void attack(Character character) {
        int fireball = intelligence;
        int staffHit = 2;

        int[] attackArr = {fireball, staffHit};
        Random r = new Random();
        int randomNumber = r.nextInt(attackArr.length);

        if (getMana() < 5)
            character.setHp(character.getHp() - staffHit);

        if (attackArr[randomNumber] == fireball) {
            setMana(getMana() - 5);
            character.setHp(character.getHp() - fireball);

        } else {
            if (mana > 0) {
                setMana(getMana() + 1);
                character.setHp(character.getHp() - staffHit);
            } else {
                setMana(getMana() + 2);
            }
        }
    }



    public int fireball(){
        return getIntelligence();
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


    @Override
    public String toString() {
        return "Wizard{" +
                "mana=" + mana +
                ", intelligence=" + intelligence +
                '}';
    }

    public String generateRandomName(){
        String warriorName;
        String wizardIs = "Wizard ";
        String[] nameArray = { "Belassha", "Derius", "Albael", "Harrho", "Sirchres","Ellkra","Bridark"};
        warriorName = nameArray[(int) (Math.random() * (nameArray.length - 1))];
        return wizardIs + warriorName;
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




