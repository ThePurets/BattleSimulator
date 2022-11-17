import java.util.concurrent.atomic.AtomicInteger;

public abstract class Character {

    private String id;
    private String name;
    private int hp;
    private boolean isAlive = true;


    public Character( int hp ) {
        setId(RandomClass.randomString());
        this.hp = hp;
    }

    public Character(){

    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getHp() {
        return hp;
    }

    public boolean isAlive() {
        return isAlive;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHp(int hp) {
        this.hp = hp;

        if (hp >= 0)
            this.hp = hp;
        else{
            this.hp = 0;
        }


    }
    public void setAlive(boolean alive) {
        isAlive = alive;
    }

    @Override
    public String toString() {
        return "Character{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", hp=" + hp +
                ", isAlive=" + isAlive +
                '}';
    }


}
