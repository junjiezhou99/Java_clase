package mvm.daw.actividades.clase;
import java.util.Random;
/**
 * @author Junjie
 */
public class GeoTester {
    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(15);
        
        Cuadrado cua = new Cuadrado(a);
        cua.calculate();
    }
}
