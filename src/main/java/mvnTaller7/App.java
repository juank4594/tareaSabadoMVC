package mvnTaller7;


import mvnTaller7.Control.ControlConversion;
import mvnTaller7.Modelo.ConversorEurosPesetas;
import mvnTaller7.Vista.InterfazVista;
import mvnTaller7.Vista.VentanaConversor;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // el modelo:
        ConversorEurosPesetas modelo = new ConversorEurosPesetas();
// la vista:
        InterfazVista vista = new VentanaConversor();
// y el control:
        ControlConversion control = new ControlConversion (vista,
                modelo);
// configura la vista
        vista.setControlador(control);
// y arranca la interfaz (vista):
        vista.arranca();

    }
}
