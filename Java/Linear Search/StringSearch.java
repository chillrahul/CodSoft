public class StringSearch {
    public static void main(String[] args) {
        String name = "Rahul";
        char target = 'u';
        boolean result = stringSearch2(name, target);
        System.out.println(result);

    }

    static boolean stringSearch(String str, char target) {
        if (str.length() == 0) {
            return false;

        }
        for (int i = 0; i < str.length(); i++) {
            if (target == str.charAt(i)) {
                return true;
            }
        }
        return false;
    }

    static boolean stringSearch2(String str, char target) {
        if (str.length() == 0) {
            return false;

        }
        for (char ch : str.toCharArray()) {
            if (ch == target) {
                return true;
            }
        }
        return false;
    }
}