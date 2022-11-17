import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Wizard wizard1 = new Wizard();
        Warrior warrior1 = new Warrior();

        Wizard wizard2 = new Wizard();
        Warrior warrior2 = new Warrior();

        Character player2 = (selectPlayer2(wizard2, warrior2));

        Dialogs.welcome();

        boolean esc = false;
        //This the menu
        int selectOption;
        Scanner console = new Scanner(System.in);
        while (!esc){
            System.out.println("Elige a tu luchador: ");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("1.Warrior");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("2.Wizard");
            TimeUnit.SECONDS.sleep(1);
            System.out.println("3.Salir");
            TimeUnit.SECONDS.sleep(1);

            try{
                System.out.println("Escribe una de las opciones: ");
                selectOption = console.nextInt();
                switch (selectOption) {
                    //This case executes warrior1Battle method
                    case 1 -> {
                        System.out.println("Eliges un Warrior, los Dioses han hablado, tu Warrior será...");
                        TimeUnit.SECONDS.sleep(4);
                        System.out.println(warrior1.getName() + " con " + warrior1.getHp() + " puntos de vida, " + warrior1.getStrength() + " de fuerza " + " y " + warrior1.getStamina() + " de resistencia");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Lucharás contra...");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println(player2.getName());
                        System.out.println("Que los Dioses te acompañen");
                        warrior1Battle( warrior1,  player2,  wizard2,  warrior2,  wizard1);
                        esc = true;

                    }
                    //This case executes wizard1Battle method
                    case 2 -> {
                        System.out.println("Eliges un Wizard, los Dioses te favorecen, tu Wizard será...");
                        TimeUnit.SECONDS.sleep(4);
                        System.out.println(wizard1.getName() + " con " + wizard1.getHp() + " puntos de vida, " + wizard1.getMana() + " de Mana " + " y " + wizard1.getIntelligence() + " de Inteligencia");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Lucharás contra...");
                        TimeUnit.SECONDS.sleep(3);
                        System.out.println(player2.getName());
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Que los Dioses te acompañen");
                        wizard1Battle( warrior1,  player2,  wizard2,  warrior2,  wizard1);
                        esc = true;
                    }
                    //This case executes exit
                    case 3 -> {
                        System.out.println("GAME OVER");
                        esc = true;
                    }
                    default -> System.out.println("Sólo números del 1 al 3");
                }
            } catch (Exception e) {
                System.out.println("Debes insertar un número");
                console.next();
            }
        }
    }

    //Player1 chooses warrior and this method executes the warrior battle
    public static void warrior1Battle(Warrior warrior1, Character player2, Wizard wizard2, Warrior warrior2, Wizard wizard1) throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        Dialogs.loading1();
        Dialogs.round1();

        while (warrior1.isAlive() && player2.isAlive()){
            warrior1.attack(player2);

            System.out.println("Player 1 " + warrior1.getName() + " HEALTH " + warrior1.getHp()+" ----------VS---------- " + " HEALTH " +
                    player2.getHp() + " Player 2 " + player2.getName());
            System.out.println("\n");
            System.out.println(warrior1.getName() + " Golpea dejando a "
                    + player2.getName() + " con una vida de " + player2.getHp());
            player2Attack(player2, wizard2, warrior2, warrior1, wizard1);
            System.out.println(player2.getName() + " Devuelve un hechizo y deja a  "
                    + warrior1.getName() + " con " + warrior1.getHp() + " de vida.");
            System.out.println("\n");
            TimeUnit.SECONDS.sleep(2);
        }
        if (warrior1.isAlive()){
            System.out.println("Enhorabuena " + warrior1.getName() + " ganas la batalla ");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Avergüenzate " + player2.getName() + " tu pierdes");
            TimeUnit.SECONDS.sleep(4);
        }else{
            System.out.println("Enhorabuena " + player2.getName() + " ganas la batalla ");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Avergüenzate " + warrior1.getName() + " tu pierdes");
            TimeUnit.SECONDS.sleep(4);
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nFin de la partida, hasta pronto");
    }
    //Player1 chooses wizard and this method executes the wizard battle
    public static void wizard1Battle(Warrior warrior1, Character player2, Wizard wizard2, Warrior warrior2, Wizard wizard1) throws InterruptedException {
        TimeUnit.SECONDS.sleep(4);
        Dialogs.loading1();
        Dialogs.round1();

        while (wizard1.isAlive() && player2.isAlive()){
            wizard1.attack(player2);

            System.out.println("Player 1 " + wizard1.getName() + " HEALTH " + wizard1.getHp()+" ----------VS---------- " + " HEALTH " +
                    player2.getHp() + " Player 2 " + player2.getName());
            System.out.println("\n");
            System.out.println(wizard1.getName() + " Golpea dejando a "
                    + player2.getName() + " con una vida de " + player2.getHp());
            player2Attack(player2, wizard2, warrior2, warrior1, wizard1);
            System.out.println(player2.getName() + " Devuelve un hechizo y deja a  "
                    + wizard1.getName() + " con " + wizard1.getHp() + " de vida.");
            System.out.println("\n");
            TimeUnit.SECONDS.sleep(2);

        }
        if (wizard1.isAlive()){
            System.out.println("Enhorabuena " + wizard1.getName() + " ganas la batalla ");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Avergüenzate " + player2.getName() + " tu pierdes");
            TimeUnit.SECONDS.sleep(4);
        }else{
            System.out.println("Enhorabuena " + player2.getName() + " ganas la batalla ");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Avergüenzate " + wizard1.getName() + " tu pierdes");
            TimeUnit.SECONDS.sleep(4);
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nFin de la partida, hasta pronto");
    }
    //This method selects randomly an opponent for the battle
    public static Character selectPlayer2(Wizard wizard2, Warrior warrior2){
        ArrayList<Character> arrayCharacters = new ArrayList<>();
        arrayCharacters.add(wizard2);
        arrayCharacters.add(warrior2);
        return (arrayCharacters.get((int) (Math.random() * (arrayCharacters.size()))));
    }
    //This method determines who is attacking
    public static void player2Attack(Character player2, Wizard wizard2, Warrior warrior2, Warrior warrior1, Wizard wizard1){
            if (player2.equals(wizard2)){
                wizard2.attack(warrior1);
                wizard2.attack(wizard1);
            }else{
                warrior2.attack(wizard1);
                warrior2.attack(warrior1);
            }
        }
    }



