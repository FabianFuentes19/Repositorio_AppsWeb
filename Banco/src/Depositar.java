import java.util.Scanner;
public class Depositar {
    private Scanner sc = new Scanner(System.in);

    public void ejecutar(Cuenta cuenta) {
        try {
            System.out.print("Ingrese cantidad a depositar: ");
            double cantidad = sc.nextDouble();

            if (cantidad <= 0){
                System.out.println(" no se permiten ingresar valores negativos o cero");
                return;
            }
            cuenta.setSaldo(cuenta.getSaldo() + cantidad);
            System.out.println("Deposito exitoso, saldo actual: $" + cuenta.getSaldo());
        }catch (Exception e){
            System.out.println("entrada invalida, solo se permiten numeros");
            sc.nextLine();
        }

    }
}

