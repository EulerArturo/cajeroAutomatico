
package clases;


public class Depocitar extends Inicio{
    
    @Override
    public void transaccion(){
        System.out.println("cuanto decea depocitar:");
        Depocito();
        
            transaccion = getSaldo();
            setSaldo(transaccion + depocito);
            System.out.println("****************************************");
            System.out.println("depocitaste: "+ depocito);
            System.out.println("tu saldo actual es:"+getSaldo());
            System.out.println("****************************************");
            
    } 
    }
    

