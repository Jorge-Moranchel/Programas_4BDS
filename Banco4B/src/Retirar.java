public class Retirar {
    public static double realizarRetiro(double saldoActual, double cantidad) {
        if (cantidad <= 0) {
            System.out.println("Error: La cantidad debe ser mayor a cero");
            return saldoActual;
        }

        if (cantidad > saldoActual) {
            System.out.println("Error: Fondos insuficientes");
            System.out.println("Saldo disponible: $" + saldoActual);
            return saldoActual;
        }

        double nuevoSaldo = saldoActual - cantidad;
        System.out.println("Retiro exitoso: $" + cantidad);
        System.out.println("Nuevo saldo: $" + nuevoSaldo);
        return nuevoSaldo;
    }
}
