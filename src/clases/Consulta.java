
package clases;


public class Consulta extends Inicio{
    
    @Override
    public void transaccion(){
        System.out.println("****************************************");
        System.out.println("Tu saldo actual es: "+ getSaldo());
        System.out.println("****************************************");
   }
}
 