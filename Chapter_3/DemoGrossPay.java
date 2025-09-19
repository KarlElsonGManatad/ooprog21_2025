public class DemoGrossPay {

    public static void main(String[] args) {
    
        calculateGross();
    }

    public static void calculateGross() {
        double perHour = 22.75;
        double hours1 = 10.0;
        double hours2 = 25.0;
        double hours3 = 37.5;

        System.out.println( hours1 + " hours at " + perHour + " per hour is $" + hours1 * perHour);
        System.out.println( hours2 + " hours at " + perHour + " per hour is $" + hours2 * perHour);
        System.out.println( hours3 + " hours at " + perHour + " per hour is $" + hours3 * perHour);
    }
}
