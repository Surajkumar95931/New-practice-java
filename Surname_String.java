public class Surname_String {
    public static void main(String[] args) {
        String name = "Harshal mahendra bhoi";

        StringBuilder s = new StringBuilder();

        // Add the first character of the first word
        if (name.length() > 0) {
            s.append(name.charAt(0));
        }

        for (int i = 1; i < name.length(); i++) {
            char currentChar = name.charAt(i);
            char previousChar = name.charAt(i - 1);

            if (previousChar == ' ' && currentChar != ' ') {
                s.append(currentChar);
            }
        }

        System.out.println(s.toString().toUpperCase());
    }
}
