package leetCode;

import java.util.Arrays;

public class Carfleet {
    public int carFleet(int target, int[] positions, int[] speeds) {
        // Number of cars
        int carCount = positions.length;
        // Array to hold the indices of the cars
        Integer[] indices = new Integer[carCount];

        // Populate the indices array with the array indices
        for (int i = 0; i < carCount; ++i) {
            indices[i] = i;
        }

        // Sort the indices based on the positions of the cars in descending order
        Arrays.sort(indices, (a, b) -> positions[b] - positions[a]);

        // Count of car fleets
        int fleetCount = 0;
        // The time taken by the previous car to reach the target
        double previousTime = 0;

        // Iterate through the sorted indices array
        for (int index : indices) {
            // Calculate the time taken for the current car to reach the target
            double timeToReach = 1.0 * (target - positions[index]) / speeds[index];

            // If the time taken is greater than the previous time, it forms a new fleet
            if (timeToReach > previousTime) {
                fleetCount++;
                previousTime = timeToReach; // Update the previous time
            }
            // If the time is less or equal, it joins the fleet of the previous car
        }
        // Return the total number of fleets
        return fleetCount;
    }
}
