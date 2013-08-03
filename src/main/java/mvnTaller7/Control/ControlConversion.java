package mvnTaller7.Control;

import mvnTaller7.Modelo.ConversorEurosPesetas;
import mvnTaller7.Vista.InterfazVista;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


/**
 * Created with IntelliJ IDEA.
 * User: danielavargas
 * Date: 2/08/13
 * Time: 20:30
 * To change this template use File | Settings | File Templates.
 */
public class ControlConversion implements ActionListener {

    private InterfazVista vista;
    private ConversorEurosPesetas modelo;

    public ControlConversion (InterfazVista vista, ConversorEurosPesetas modelo)

    {
        this.vista = vista;
        this.modelo = modelo;
    }

    public void actionPerformed(ActionEvent evento) {
        double cantidad = vista.getCantidad();
        if ( evento.getActionCommand().equals(InterfazVista.AEUROS) ) {
            vista.escribeCambio( cantidad + " pesetas son:"
                    + modelo.pesetasAeuros(cantidad) + " euros" );
        }
        else if ( evento.getActionCommand().equals(InterfazVista.APESETAS)) {
            vista.escribeCambio( cantidad + " euros son:"
                    + modelo.eurosApesetas(cantidad) + " pesetas" );
        }
        else
            vista.escribeCambio( "ERROR" );
    }
}