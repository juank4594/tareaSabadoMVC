package mvnTaller7.Modelo;

/**
 * Created with IntelliJ IDEA.
 * User: danielavargas
 * Date: 2/08/13
 * Time: 20:29
 * To change this template use File | Settings | File Templates.
 */

public class ConversorEurosPesetas extends ConversorEuros
{ // Adaptador de clase



    public ConversorEurosPesetas () {
        super(166.386D);


    }

    public double eurosApesetas(double cantidad) {
        return eurosAmoneda(cantidad);
    }

    public double pesetasAeuros(double cantidad) {
        return monedaAeuros(cantidad);
    }
}







