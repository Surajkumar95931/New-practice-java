public class String_palindrome {

        public static void main(String[] args) {
            String str = "racecar"; // Change this to the string you want to check
            System.out.println(isPalindrome(str));
        }
        public static boolean isPalindrome(String str) {
            str = str.replaceAll("\\s+", "").toLowerCase(); // Remove spaces and convert to lowercase
            int length = str.length();

            for (int i = 0; i < length / 2; i++) {
                if (str.charAt(i) != str.charAt(length - 1 - i)) {
                    return false;
                }
            }

            return true;
        }
    }


