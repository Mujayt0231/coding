public class ReverseWords {

    public static void main(String[] args) {
        String target = "How you doing?";

        System.out.println(reverseWords(target));

    }

    public static String reverseWords(String target) {

        String[] arrays = target.split(" ");

        String reversedString = "";

        for (String string : arrays) {

            reversedString = string + " " + reversedString;
        }

        return reversedString.trim();
    }

}
