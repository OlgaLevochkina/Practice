package module15;

import java.util.Scanner;

public class Task46 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int weight = 0, maxPeople = 6, maxWeight = 450, count = 0, sum = 0;
        while (sum <= maxWeight && count <= maxPeople) {
            weight = sc.nextInt();
            sum += weight;
            count++;
            System.out.println("The number of people is " + count + " and total weight is " + sum);
        }
        if (count > maxPeople && sum < maxWeight) {
            System.out.println("Too many people");
        }
        if (count < maxPeople && sum > maxWeight) {
            System.out.println("Weight is exceeded");
        }
        if (count > maxPeople && sum > maxWeight) {
            System.out.println("Too many people + weight is exceeded");
            System.out.println();
            System.out.println((count - 1) + " " + (sum - weight));
        }
    }
}
