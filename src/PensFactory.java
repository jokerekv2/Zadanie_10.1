import java.util.Scanner;

public class PensFactory {
    private Scanner sc = new Scanner(System.in);

    public Pen createPen() {
        System.out.print("Podaj kolor długopisu: ");
        String color = sc.nextLine();
        System.out.print("Podaj grubość pisma długopisu: ");
        double thickness = sc.nextDouble();
        sc.nextLine();

        return new Pen(color, thickness);
    }
}
