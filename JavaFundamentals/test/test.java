import java.util.ArrayList;

public final class test {
    
    public static void main(String[] args){
        String[] words = {"it", "is", "this", "we", "do", "how"};
        ArrayList<String> phrase = new ArrayList<String>();

        // Pull words from the 'words' array to populate the 'phrase' array list
        // Print the 'phrase' array list
        // Expected output: [this, is, how, we, do, it]
        phrase.add(words[2]);
        phrase.add(words[1]);
        phrase.add(words[5]);
        phrase.add(words[3]);
        phrase.add(words[4]);
        phrase.add(words[0]);

        System.out.println(phrase);
    }

}
