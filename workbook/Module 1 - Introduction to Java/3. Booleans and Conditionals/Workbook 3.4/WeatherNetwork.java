public class WeatherNetwork {
    public static void main(String[] args) {

        //See Learn the Part for the complete instructions (link in resources folder of Udemy video).  

        
        int temp = 25;  

        String forecast = "";

        //IF - ELSE IF - ELSE STATEMENTS HERE!
        if (temp > 10) {
            forecast = "It's warm. Go outside!";
        }else if (temp > 0) {
            forecast = "The forecast is Chilly. Wear a coat!";
        }else {
            forecast = "The forecast is FREEZING! Stay home!";
        }
        
        System.out.println(forecast);
    }
}
