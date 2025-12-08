import java.util.*;

class UserMainCode {
    public static String repeatFront(String str, int n) {
        String front;
        if (str.length() < 3) {
            front = str;
        } else {
            front = str.substring(0, 3);
        }

        String result = "";
        for (int i = 0; i < n; i++) {
            result += front;
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int n = sc.nextInt();
        System.out.println(repeatFront(s, n));
    }
}
