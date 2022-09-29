
package clases;

public class Retiro extends Inicio{
    
    @Override
    public void transaccion(){
        
        System.out.println("cuanto decea retirar:");
        Retiro();
        if(retiro <= getSaldo()){
            transaccion = getSaldo();
        setSaldo(transaccion - retiro);
            System.out.println("****************************************");
            System.out.println("retirar: "+ retiro);
            System.out.println("tu saldo actual es:"+getSaldo());
            System.out.println("****************************************");
        } else {
            System.out.println("****************************************");
            System.out.println("saldo insuficiente");
            System.out.println("****************************************");
        }
        
        
    }
   
}
