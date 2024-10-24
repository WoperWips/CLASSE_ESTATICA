package scr.lib;

public class Main {
    public static void main(String[] args) {
        // Testando a conversão de Celsius para Fahrenheit
        double celsius = 25;
        double fahrenheit = ConversorUnidades.celsiusParaFahrenheit(celsius);
        System.out.println(celsius + "°C é igual a " + fahrenheit + "°F");

        // Testando a conversão de quilômetros para milhas
        double quilometros = 10;
        double milhas = ConversorUnidades.quilometrosParaMilhas(quilometros);
        System.out.println(quilometros + " km é igual a " + milhas + " milhas");

        // Testando a conversão de gramas para libras
        double gramas = 1000;
        double libras = ConversorUnidades.gramasParaLibras(gramas);
        System.out.println(gramas + " g é igual a " + libras + " lbs");
    }
}
