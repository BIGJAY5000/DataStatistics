public class Main {
    public static void main(String[] args) {
        int [] dataPoints = new int[100];
        int max = 0;
        int min = 100;
        int average = 0;
        int sum = 0;
        for (int i = 0; i < dataPoints.length; i++) {
            dataPoints[i] = (int)(Math.random() * 100) + 1;
        }
        for (int i = 0; i < dataPoints.length; i++) {
            System.out.print("| " + dataPoints[i] + " |");
        }
        System.out.println();
        for (int i = 0; i < dataPoints.length; i++) {
            sum += dataPoints[i];
        }
        for (int i = 0; i < dataPoints.length; i++) {
            if (dataPoints[i] > max) {
                max = dataPoints[i];
            } if (dataPoints[i] < min) {
                min = dataPoints[i];
            }
        }
        average = sum/dataPoints.length;
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Min: " + min);
        System.out.println("Max: " + max);
    }
}