package Chapter_7;

public class CountGreaterThanAverage {

    public static int countElementsGreaterThanPreviousAverage(int[] responseTimes) {
        int count = 0;
        double sum = 0;

        for (int i = 0; i < responseTimes.length; i++) {

            if (i > 0) {
                double average = sum / i;

                if (responseTimes[i] > average) {
                    count++;
                }
            }

            sum += responseTimes[i];
        }

        return count;
    }

    public static void main(String[] args) {
        int[] responseTimes = {100, 200, 150, 300};

        int result = countElementsGreaterThanPreviousAverage(responseTimes);
        System.out.println(result);  
    }
}
