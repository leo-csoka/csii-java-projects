import java.util.Scanner;

public class MadLibs {

    public void main(String[] args) {
        // create scanner object
        Scanner scanner = new Scanner(System.in);

        int num;
        String name;
        String adjective;
        String place;

        // get all vars
        System.out.println("Provide a whole number:");
        num = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Provide a name:");
        name = scanner.nextLine();
        System.out.println("Provide a adjective:");
        adjective = scanner.nextLine();
        System.out.println("Provide a place:");
        place = scanner.nextLine();

        System.out.printf("Professor %s's 202%d %s university class decided they were tired of being treated like %s objects", name, num, place, adjective);

        // close scanner
        scanner.close();
    }
}
