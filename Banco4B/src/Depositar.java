public class Depositar {
    public static double realizarDeposito(double saldoActual, double cantidad) {
        if (cantidad > 0) {
            double nuevoSaldo = saldoActual + cantidad;
            System.out.println("Depósito exitoso: $" + cantidad);
            System.out.println("Nuevo saldo: $" + nuevoSaldo);
            return nuevoSaldo;
        }else {
            System.out.println("Esta mal la cantidad debe ser mayor a cero");
            return saldoActual;
        }
    }
}
