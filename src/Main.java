import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {
    public static void main(String[] args) throws InterruptedException {

        Wizard wizard1 = new Wizard("","", ((int)(Math.random()*50+50)),true,(int)(Math.random()*50+50),67);
        Warrior warrior1 = new Warrior("","",((int)(Math.random()*100+100)),true,((int)(Math.random()*25+25)),((int)(Math.random()*50+50)));

        Wizard wizard2 = new Wizard("","", ((int)(Math.random()*50+50)),true,(int)(Math.random()*50+50),67);
        Warrior warrior2 = new Warrior("","",((int)(Math.random()*100+100)),true,((int)(Math.random()*25+25)),((int)(Math.random()*50+50)));

        Dialogs.welcome();

        //se inicia el menu
        //Menu.menu(0);
        boolean esc = false;
        int control = 0;
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
                switch (selectOption){
                    case 1:
                        System.out.println("Eliges un Warrior, los Dioses han hablado, tu Warrior será...");
                        TimeUnit.SECONDS.sleep(4);
                        System.out.println( warrior1.getName() + " con " + warrior1.getHp() + " puntos de vida, "  + warrior1.getStrength() + " de fuerza " + " y " + warrior1.getStamina() + " de resistencia");
                        TimeUnit.SECONDS.sleep(1);
                        System.out.println("Que los Dioses te acompañen");
                        esc = true;
                        break;
                    case 2:
                        System.out.println("Eliges un Wizard, los Dioses te favorecen, tu Wizard será...");
                        System.out.println( wizard1.getName() + " con " + wizard1.getHp() + " puntos de vida, " + wizard1.getMana() + " de Mana " + " y " + wizard1.getIntelligence() + " de Inteligencia");
                        TimeUnit.SECONDS.sleep(4);
                        System.out.println("Que los Dioses te acompañen");
                        esc = true;
                        break;
                    case 3:
                        esc = true;
                        break;
                    default:
                        System.out.println("Sólo números del 1 al 3");
                }
            } catch (Exception e) {
                System.out.println("Debes insertar un número");
                console.next();
            }
        }
        //selección del contricante
        selectPlayer2(wizard2,warrior2);

        //Player player2 = new Player(selectPlayer2(wizard2,warrior2));

        TimeUnit.SECONDS.sleep(4);

        //Cuadro de dialogo
        Dialogs.loading1();

        Dialogs.round1();

        while (warrior1.isAlive()){
            warrior1.attack(wizard1);
            System.out.println("Player 1 " + warrior1.getName() + " HEALTH " + warrior1.getHp()+" ----------VS---------- " + " HEALTH " + wizard1.getHp() + " Player 2 " + wizard1.getName());
            System.out.println("\n");
            System.out.println(warrior1.getName() + " Golpea dejando a " + wizard1.getName() + " con una vida de" + wizard1.getHp());
            wizard1.attack(warrior1);
            System.out.println(wizard1.getName() + " Devuelve un hechizo y deja a  " + warrior1.getName() + " con " + warrior1.getHp() + " de vida.");
            System.out.println("\n");
            TimeUnit.SECONDS.sleep(2);

        }
        if (wizard1.isAlive()){
            System.out.println("Enhorabuena " + wizard1.getName() + " ganas la batalla ");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Avergüenzate " + warrior1.getName() + " tu pierdes");
            TimeUnit.SECONDS.sleep(4);
        }else{
            System.out.println("Enhorabuena " + warrior1.getName() + " ganas la batalla ");
            TimeUnit.SECONDS.sleep(3);
            System.out.println("Avergüenzate " + wizard1.getName() + " tu pierdes");
            TimeUnit.SECONDS.sleep(4);
        }
        System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\nFin de la partida, hasta pronto");
    }

    //Metodo que hace el random para el contrincante
    public static Character selectPlayer2(Wizard wizard2, Warrior warrior2){
        ArrayList<Character> arrayCharacters = new ArrayList();
        arrayCharacters.add(wizard2);
        arrayCharacters.add(warrior2);

        return (arrayCharacters.get((int) (Math.random() * (arrayCharacters.size()))));
    }

}
