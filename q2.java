import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Jar Capacity:");
        int N = sc.nextInt();

        System.out.println("Enter Minimum Candies:");
        int K = sc.nextInt();

        int candies = N;

        System.out.println("Enter Candies to Buy:");
        int input = sc.nextInt(); 

        if(input > candies || input <= 0) {
            System.out.println("INVALID INPUT");
        }
        else {
            candies = candies - input;
            System.out.println("Number of Candies Sold: " + input);
            if(candies <= K) {
                candies = N;
            }
            System.out.println("Number of Candies available: " + candies);
        }
    }
}
