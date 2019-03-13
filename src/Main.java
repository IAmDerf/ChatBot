import java.util.Scanner;

public class Main {


    public static void main (String[] args) {
        Scanner s = new Scanner(System.in);
        Query.setBannedWords();
        while (true) {
            Query test = new Query(s.nextLine());
            for (String keyword : test.getKeywords()) {
                System.out.println(keyword);
            }
            System.out.println(test.getFunktion());
        }
    }
}
