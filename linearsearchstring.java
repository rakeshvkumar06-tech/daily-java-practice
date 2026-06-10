

public class linearsearchstring {

    public static int search(String str, char target) {

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == target) {
                return i;
            }
        }

        return -1;
    }

    public static void main(String[] args) {

        String str = "Rakesh";
        char target = 'j';

        int result = search(str, target);

        System.out.println(result);
    }
}