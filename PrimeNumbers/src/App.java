import java.io.*;
import java.util.*;

public class App {
    public static void main(String[] args) {
        int i;
        Scanner sc = new Scanner(System.in);
        int c = 0;
        String a, str = " ", wrd = " ";
        System.out.println("Enter the String ");
        a = sc.nextLine();
        String s[] = a.split(" ");
        for (i = 0; i < s.length; i++) {
            wrd = s[i];
            str = str + wrd.charAt(0);
        }
        System.out.println("Initials is" + str);

    }
}
