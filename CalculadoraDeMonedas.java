package calculadora.de.monedas;
import java.util.Scanner;
/**
 *
 * @author Arian
 */
public class CalculadoraDeMonedas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner lectura = new Scanner (System.in);
        System.out.println("Escribe la cantidad en Pesos Mexicanos");
        double Pesos = lectura.nextDouble();
                
        double Dolar=17.07;
        double Euro=18.21;
        double Yen=0.12;
        double Libra =21.18;
        
   System.out.println("Conversion en dolar es:" + Pesos/Dolar 
                       + " Conversion en Euro es:" + Pesos/Euro
                         + " Conversion en Yen es:" + Pesos/Yen
                         + " Conversion en Libra es:" + Pesos/Libra);
    }
    
}
