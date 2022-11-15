import java.util.concurrent.ThreadLocalRandom;

public class RandomString {

    //este método se aplica en el constructor de Character

    public static String randomString() {
        // El banco de caracteres
        String dataBase = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        // La cadena en donde iremos agregando un carácter aleatorio
        String randomString = "";
        for (int x = 0; x < 10; x++) {
            int randomIndex = randomNumber(0, dataBase.length() - 1);
            char randomCharacter = dataBase.charAt(randomIndex);
            randomString += randomCharacter;
        }
        return randomString;
    }

    public static int randomNumber(int minimo, int maximo) {
        // nextInt regresa en rango pero con límite superior exclusivo, por eso sumamos 1
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
}
