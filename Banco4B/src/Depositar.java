public class Depositar {
    public static void realizarDeposito(Cuenta cuenta, double cantidad) {
        if (cantidad > 0) {
            cuenta.depositar(cantidad);
            System.out.println("Deposito exitoso: $" + cantidad);
            System.out.println("Nueva feria: $" + cuenta.getSaldo());
        } else {
            System.out.println("No debes de ingresar numeros negativos");
        }
    }
}