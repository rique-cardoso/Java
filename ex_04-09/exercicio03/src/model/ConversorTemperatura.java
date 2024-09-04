package model;

public class ConversorTemperatura {
    public static void celciusParaFahrenheit(double celcius){
        double fah = (9 * celcius / 5) + 32;
        System.out.println(celcius + "°C equivale(em) a " + fah + "°F.");
    }
    public static void fahrenheitParaCelcius(double fah){
        double celcius = (fah - 32) * 5 / 9;
        System.out.println(fah + "°F equivale(em) a " + celcius + "°C.");
    }
    public static void celciusParaKelvin(double celcius){
        double kelvin = celcius + 273.15;
        System.out.println(celcius + "°C equivale(em) a " + kelvin + "K.");
    }
    public static void kelvinParaCelcius(double kelvin){
        double celcius = kelvin - 273.15;
        System.out.println(kelvin + "K equivale(em) a " + celcius + "°C.");
    }
    public static void celciusParaReamur(double celcius){
        double reamur = celcius * 4 / 5;
        System.out.println(celcius + "°C equivale(em) a " + reamur + "°Re.");
    }
    public static void reamurParaCelcius(double reamur){
        double celcius = reamur * 5 / 4;
        System.out.println(reamur + "°Re equivale(em) a " + celcius + "°C.");
    }
    public static void kelvinParaRankine(double kelvin){
        double rankine = kelvin * 1.8;
        System.out.println(kelvin + "K equivale(em) a " + rankine + "°Ra.");
    }
    public static void rankineParaKelvin(double rankine){
        double kelvin = rankine / 1.8;
        System.out.println(rankine + "°Ra equivale(em) a " + kelvin + "K.");
    }
}
