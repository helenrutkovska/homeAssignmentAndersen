package school.lesson8.Task1_Words;

public class WordsArrayApp {
    public static String[] wordsArray = {"April", "June", "July", "SEPTEMBER", "septemBER", "JaNuArY", "march", "March", "October", "December", "february", "May", "may", "MAY", "November", "JuNE", "August"};

    public static void main(String[] args) {

        WordsArray.getUniqueWords(wordsArray);
        WordsArray.countWords(wordsArray);
    }
}
