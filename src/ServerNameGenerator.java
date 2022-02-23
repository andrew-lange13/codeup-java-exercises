import java.util.Arrays;
import java.util.Random;

public class ServerNameGenerator {

    public static String getRando(String[] array) {
        int rando = new Random().nextInt(array.length);
        return array[rando];
    }

    static String[] adjectives = {"bored", "angry", "annoyed", "average", "frail", "jittery", "grumpy", "pleasant", "selfish", "quaint"};

    static String[] nouns = {"taco", "basketball", "computer", "truck", "picture", "chair", "turtle", "fan", "robot", "goldfish"};

    public static void main(String[] args) {

        String randoAdj = getRando(adjectives);
        String randoNoun = getRando(nouns);
        System.out.println("Here is your server name:");
        System.out.println(randoAdj + "-" + randoNoun);


    }
}
