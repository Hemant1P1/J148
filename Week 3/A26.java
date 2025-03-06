public class HighestNumbers {
    public static void main(String[] args) {
        int[] arr = {10, 20, 5, 50, 30, 40};
        findHighestNumbers(arr);
    }

    public static void findHighestNumbers(int[] arr) {
        if (arr.length < 2) {
            System.out.println("Array should have at least two elements.");
            return;
        }

        int highest = Integer.MIN_VALUE;
        int secondHighest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > highest) {
                secondHighest = highest;
                highest = num;
            } else if (num > secondHighest && num != highest) {
                secondHighest = num;
            }
        }

        if (secondHighest == Integer.MIN_VALUE) {
            System.out.println("No second highest value found.");
        } else {
            System.out.println("Highest: " + highest);
            System.out.println("Second Highest: " + secondHighest);
        }
    }
}

