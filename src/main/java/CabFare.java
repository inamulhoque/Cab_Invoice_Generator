public class CabFare {
    int minFare = 5;
    public static float fareCalc(float distance, float minutes){
        float cost = (distance*10) + (1*minutes);
        System.out.println("Fare = "+cost);
        return cost;
    }
}
