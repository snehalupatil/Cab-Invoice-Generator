public class InvoiceGenerator {
    private static final int COST_PER_KILOMETER = 10;
    private static final int COST_PER_MINUTE = 1;
    private static final int MINIMUM_COST=5;

    public double calculateFare(double distance, int time) {
        double totalCost = COST_PER_KILOMETER*distance+time*COST_PER_MINUTE;
        return Math.max(totalCost,MINIMUM_COST);
    }


    public double calculateFare(Ride[] rides) {
        double totalFare = 0;
        for(Ride ride : rides)
            totalFare += calculateFare(ride.distance,ride.time);
        return totalFare;
    }


}
