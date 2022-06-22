/* *****************************************************************************
 *  Name:              Ada Lovelace
 *  Coursera User ID:  123456
 *  Last modified:     October 16, 1842
 **************************************************************************** */

import java.util.Scanner;

public class HelloGoodbye {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter name1");
        String name1 = scanner.nextLine();
        System.out.println("enter name2");
        String name2 = scanner.nextLine();
        System.out.println("Hello "+name1+" and "+name2);
        System.out.println("Goodbye "+name2+" and "+name1);
    }
}
