public class reverseString {

    public static void main(String[] args) {

        System.out.println(reversedString("JohnSmith"));

    }

    public static String reversedString(String target) {

        if (target.length() < 2) {
            return target;
        }

        StringBuilder sb = new StringBuilder();

        for (int i = target.length() - 1; i >= 0; i--) {
            sb.append(target.charAt(i));
        }

        return sb.toString();

    }
}
