import java.util.Scanner;

public class Retirar {

    private Scanner sc = new Scanner(System.in);

    public void ejecutar(Cuenta cuenta) {
        System.out.println("Saldo actual: $" + cuenta.getSaldo());
        System.out.print("Ingrese cantidad a retirar: ");
        double cantidad = sc.nextDouble();

        if (cantidad > cuenta.getSaldo()) {
            System.out.println("Fondos insuficientes.");
        } else {
            cuenta.setSaldo(cuenta.getSaldo() - cantidad);
            System.out.println("Retiro exitoso. Nuevo saldo: $" + cuenta.getSaldo());
        }
    }
}
