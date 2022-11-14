import java.util.concurrent.atomic.AtomicInteger;

public abstract class Character {

    private String id;
    private String name;
    private int hp;
    private boolean isAlive = true;



    //private static AtomicInteger ID_GENERATOR = new AtomicInteger(1000);
    //String.valueOf(ID_GENERATOR.getAndIncrement()) En el constructor

    public Character(String id, String name, int hp, boolean isAlive) {
        setId(id);
        this.name = name;
        this.hp = hp;
        this.isAlive = isAlive;
    }

    public Character(String name, int hp) {
        this.name = name;
        this.hp = hp;
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
