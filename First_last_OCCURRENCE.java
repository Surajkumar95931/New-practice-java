public class First_last_OCCURRENCE {
    public static void main(String[] args) {
        String name = "helloo woorld";
        String target = "o";

        int first=name.indexOf(target);
        int last=name.lastIndexOf(target);

        if (first != -1) {
            System.out.println("'" + target + "' is present first time at index " + first);
        } else {
            System.out.println("'" + target + "' is not present in the string.");
        }

        if (last != -1) {
            System.out.println("'" + target + "' is present last time at index " + last);
        } else {
            System.out.println("'" + target + "' is not present in the string.");
        }
    }}