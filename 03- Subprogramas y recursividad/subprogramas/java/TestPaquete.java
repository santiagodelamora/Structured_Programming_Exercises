import javax.swing.JOptionPane;
import paquete.OperacionesAritmeticas;

public class TestPaquete {
    public static void main(String[] args) {
        double serie = 0;
        int n = 2;

        serie = OperacionesAritmeticas.calcularSerie(n);
        JOptionPane.showMessageDialog(null, "El resultado de la serie es: " + serie);
    }
}