public class manerasCambio {
    public static int calcularCambio(int[]monedas, int n) {
        if (n == 0) {
            return 1;
        }
        // devuelve 0 si el total se vuelve negativo
        if (n < 0) {
            return 0;
        }
        // inicializa el número total de formas a 0
        int resultado = 0;
        // hacer por cada moneda
        for (int c : monedas) {
            // recurre para ver si se puede alcanzar el total incluyendo la moneda actual `c`
            resultado += calcularCambio(monedas, n - c);
        }
        // devuelve el número total de formas
        return resultado;
    }

    public static void main(String[] args) {

        int[] monedas = {1, 2, 5, 10};

        int n =10;

        System.out.println("Las maneras de dar cambio son  " + calcularCambio(monedas, n));
    }

}

