public class minimoMonedas {

    public static int calcularMinimo(int[] monedas, int n)
    {
        // si el total es 0, no se necesitan monedas
        if (n == 0) {
            return 0;
        }

        // devuelve infinito si el total se vuelve negativo
        if (n < 0) {
            return Integer.MAX_VALUE;
        }

        // inicializa el número mínimo de monedas necesarias hasta el infinito
        int minMon = Integer.MAX_VALUE;

        // hacer por cada moneda
        for (int c: monedas)
        {
            // recurre para ver si se puede alcanzar el total incluyendo la moneda actual `c`
            int resultado =calcularMinimo(monedas, n - c);

            // actualice el número mínimo de monedas necesarias si elige el actual
            // la moneda resultó en una solución
            if (resultado != Integer.MAX_VALUE) {
                minMon = Integer.min(minMon, resultado + 1);
            }
        }

        // devuelve el número mínimo de monedas necesarias
        return minMon;
    }

    public static void main(String[] args)
    {
        int[] monedas = { 1, 2, 5, 10 };
        int n = 5;

        int minMon = calcularMinimo(monedas, n);
        if (minMon != Integer.MAX_VALUE)
        {
            System.out.print("El mínimo de monedas para dar cambios  " + minMon);
        }
    }


}