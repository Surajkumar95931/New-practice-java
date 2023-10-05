public class String_First_letter {
    public static void main(String[] args) {
        String input = "hello world my name is suraj kumar and iam very ";
        String name = UpperFirst(input);
        System.out.println(name);
    }

    public static String UpperFirst(String input) {
        String[] words = input.split(" ");
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            if (!word.isEmpty()) {
                // Capitalize the first letter
                result.append(Character.toUpperCase(word.charAt(0)))
                        .append(word.substring(1))
                        .append(" ");
            }
        }
        // Remove the trailing space and return the capitalized string
        return result.toString();
    }

}
