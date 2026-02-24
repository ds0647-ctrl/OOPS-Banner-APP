public class Exercise2 {
    public static void main(String[] args) {

        boolean isRaining = false;
        boolean hasUmbrella = true;

        System.out.println("Is it raining? " + isRaining);
        System.out.println("Do you have an umbrella? " + hasUmbrella);

        if (isRaining && hasUmbrella) {
            System.out.println("You can go outside.");
        } else {
            System.out.println("Stay indoors!");
        }
    }
}