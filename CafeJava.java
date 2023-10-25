public class CafeJava {
    public static void main(String[] args) {
        // APP VARIABLES
        // Lines of text that will appear in the app. 
        String generalGreeting = "Welcome to Cafe Java, ";
        String pendingMessage = ", your order will be ready shortly";
        String readyMessage = ", your order is ready";
        String displayTotalMessage = "Your total is $";
        
        // Menu variables (add yours below)
        double mochaPrice = 3.5;
        double dripCoffeePrice = 2.0;
        double lattePrice = 5.0;
        double cappuccinoPrice = 4.0;
    
        // Customer name variables (add yours below)
        String customer1 = "Cindhuri";
        String customer2 = "Sam";
        String customer3 = "Jimmy";
        String customer4 = "Noah";
    
        // Order completions (add yours below)
        boolean isReadyOrder1 = false;
        boolean isReadyOrder2 = false;
        boolean isReadyOrder3 = false;
        boolean isReadyOrder4 = false;
    
        // APP INTERACTION SIMULATION (Add your code for the challenges below)
        // Example:
        System.out.println(generalGreeting + customer1); // Displays "Welcome to Cafe Java, Cindhuri"
    	// ** Your customer interaction print statements will go here ** //
        if(isReadyOrder1 == true){
            System.out.println(customer1 + readyMessage);
            System.out.println(displayTotalMessage + dripCoffeePrice);
        }
        else{
            System.out.println(customer1 + pendingMessage);
        }

        mochaPrice = 1.50;
        dripCoffeePrice = 2.00;
        lattePrice = 2.50;
        cappuccinoPrice = 3.00;

        isReadyOrder1 = true;
        isReadyOrder2 = true;
        isReadyOrder3 = true;
        isReadyOrder4 = true;

        // Noah's order
        if(isReadyOrder4){
            System.out.println(customer4 + readyMessage);
            System.out.println(displayTotalMessage + cappuccinoPrice);
        }
        else{
            System.out.println(customer4 + pendingMessage);
        }

        // Sam's Order
        isReadyOrder2 = true;
        
        if(isReadyOrder2){
            System.out.println(customer2 + readyMessage);
            System.out.println(displayTotalMessage + (lattePrice + lattePrice));
        }
        else{
            System.out.println(customer2 + pendingMessage);
        }

        System.out.println(customer3 + ", " + displayTotalMessage + (lattePrice - dripCoffeePrice));
        
    }
}
