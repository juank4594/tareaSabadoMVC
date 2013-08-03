package mvnTaller7.Vista;
import mvnTaller7.Control.*;

/**
 * Created with IntelliJ IDEA.
 * User: danielavargas
 * Date: 2/08/13
 * Time: 20:30
 * To change this template use File | Settings | File Templates.
 */
public interface InterfazVista {

    void setControlador(ControlConversion c);
    void arranca(); // comienza la visualización
    double getCantidad(); // cantidad a convertir
    void escribeCambio(String s); //texto con la conversión
    // Constantes que definen las posibles operaciones:

    static final String AEUROS="Pesetas a Euros";
    static final String APESETAS="Euros a Pesetas";

}
