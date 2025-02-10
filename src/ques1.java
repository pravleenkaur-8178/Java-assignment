public class ques1 {
    public static void checkCharacter(char ch) {
        switch (Character.toLowerCase(ch)) {
            case 'a':
            case 'e':
            case 'i':
            case 'o':
            case 'u':
                System.out.println(ch + " is a vowel.");
                break;
            default:
                System.out.println(ch + " is a consonant.");
        }
    }

    public static void main(String[] args) {
        checkCharacter('a');
        checkCharacter('b');
    }
}