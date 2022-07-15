import java.util.Scanner;

public class CabMain {
    static CabFare cabFare = new CabFare();

    public static void main(String[] args) {
        System.out.println("Enter the number of rides: ");
        Scanner scanner = new Scanner(System.in);
        Byte rides = scanner.nextByte();
        int cost = 0;
        for (byte i = 1; i<=rides; i++){
            System.out.println("Enter the distance:");
            short distance = scanner.nextShort();
            System.out.println("Enter minutes:");
            short minutes = scanner.nextShort();
            cost += CabFare.fareCalc(distance,minutes);
        }
        System.out.println("Total cost for all rides: "+cost);
    }
}
