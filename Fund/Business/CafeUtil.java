import java.util.ArrayList;
import java.util.Arrays;

public class CafeUtil {

    public int getStreakGoal() {
        int purchases = 0;
        for(int i = 1; i <= 10; i++) {
            purchases += i;
        }
        return purchases;
    }

    public double getOrderTotal(double[] prices) {
        double total = 0;
        for(int i = 0; i<prices.length; i++) {
            total += prices[i];
        }
        return total;
    }

    public void displayMenu(ArrayList<String> menuItems) {
        int index = 0;
        for (String item : menuItems) {
            System.out.println(index + " " + item);
            index++;
        }
    }

    public void addCustomer(ArrayList<String> customers) {
        System.out.println("Please enter your name:");
        String username = System.console().readLine();
        System.out.println("Hello, " + username + "!");
        int people = customers.size();
        System.out.println("There are " + people + " people in front of you.");
        customers.add(username);
    }
}