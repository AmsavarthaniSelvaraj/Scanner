import java.util.Scanner;

public class ReversedSentence {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String sentence = input.nextLine();
        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed sentence is:" + reversedSentence);
    }

    public static String reverseWords(String sentence) {
        String[] words = sentence.split("");
        StringBuilder reversed = new StringBuilder();
        for (int i = words.length-1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i != 0) {
                reversed.append(" ");
            }
        }
        return reversed.toString();
    }
}
