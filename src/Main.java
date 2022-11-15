import java.util.Random;

public class Main {
    public static void main(String[] args) {


        Warrior john = new Warrior(RandomString.randomString(),"John", 50, true);

        System.out.println("Este es tu id: " + john.getId());

        System.out.println("Estos son tus niveles de estamina y fuerza: " + john.toString());

        john.attack(john);

    }
}
