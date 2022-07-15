public class CabFare {
    static int minFare = 5;
    public static float fareCalc(float distance, float minutes){
        float cost = 0;
        cost += (distance*10) + (1*minutes);
        System.out.println("Fare = "+cost);
        if (cost<5){
            System.out.println("Fare is less than minimum fare "+minFare);
        }
        return cost;
    }
}
