import java.util.ArrayList;
public class CafeUtil {

    public int getStreakGoal(){
        int sum = 0;
        for(int i = 0; i < 11; i++){
            sum += i;
        }
        return sum;
    }

    public double getOrderTotal(double[] lineItems){
        double sum = 0;
        for(int i = 0; i < lineItems.length; i++){
            sum += lineItems[i];
        }
        return sum;
    }

    public ArrayList<String> displayMenu(ArrayList<String> menu){
        ArrayList<String> test = new ArrayList<String>();
        for(int i = 0; i < menu.size();i++){
            test.add(i +  " " + menu.get(i));
        }

        return test;
    }

    public ArrayList<String> addCustomer(ArrayList<String> customers){
        System.out.println("Please enter your name");
        String username = System.console().readLine();

        // Add each name to list
        customers.add(username);


        System.out.println("Hello, " + username + "! There are " + (customers.size()-1) + " people in front of you." );
        System.out.println(customers);

        return null;
    }
}
