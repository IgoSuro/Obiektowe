public class KalkulatorTemperatur {
    static double celsiusToFahrenheit (double celsius){
        return ((celsius * 1.8) + 32);
    }

    static double fahrenheitToCelsius (double fahrenheit){
        return (((fahrenheit - 32) * 5) / 9);
    }

    public static void main(String[] args){
        KalkulatorTemperatur kalk = new KalkulatorTemperatur();

        System.out.println(celsiusToFahrenheit(20));
        System.out.println(fahrenheitToCelsius(68));
    }
}
