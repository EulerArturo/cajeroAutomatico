
package clases;
import java.util.Scanner;

public abstract class Inicio {
    protected int transaccion, retiro, depocito;
private static int saldo;
Scanner entrada =new Scanner(System.in);

public void operaciones(){
int bandera= 0;
int seleccion= 0;
do{
do{
System.out.println("por favor seleccione una opcion");
System.out.println("    1. consulte saldo.");
System.out.println("    2. retiro de efectivo.");
System.out.println("    3. depocitar efectivo.");
System.out.println("    4. salir.");
seleccion = entrada.nextInt();

if(seleccion>=1 && seleccion <=4){
 bandera= 1;   
}
else{
System.out.println("**********************************");
System.out.println("opsion no disponible, vuelve a intentar por favor");
System.out.println("**********************************");
}
}while(bandera ==0);
if( seleccion == 1){
Inicio mensajero = new Consulta();
mensajero.transaccion();
}else if(seleccion == 2){
Inicio mensajero = new Retiro();
mensajero.transaccion();
}else if(seleccion == 3){
Inicio mensajero = new Depocitar();
mensajero.transaccion();
}else if(seleccion == 4){
System.out.println("**********************************");
System.out.println("¨¡gracias!, vuelva pronto.");
System.out.println("**********************************");
bandera=2;
}
}while(bandera !=2);
}
// solicitar cantidad retiro
public void Retiro(){
retiro = entrada.nextInt();
}
//solicitar depocito
public void Depocito(){
depocito = entrada.nextInt();
}
// metodo abstracto
public abstract void transaccion();
// metodo selter y getter
public int getSaldo(){
return saldo;
}
public void setSaldo(int saldo){
this.saldo = saldo;
}


}
