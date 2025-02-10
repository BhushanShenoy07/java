import java.util.Scanner;
public class repeat {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = "";
        int i, j;
        int flag = 0;
        System.out.println("Enter the string");
        str = sc.next();
        boolean found = false;
        for (i = 0; i < str.length(); i++) {
            flag = 1;
            for (j = 0; j < str.length(); j++) {
                if (i != j && str.charAt(i) == str.charAt(j)) {
                    flag = 0;
                    break;
                }
            }
            if (flag == 1) {
                System.out.println("First unique character: " + str.charAt(i));
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("-1");
        }
    }
}
