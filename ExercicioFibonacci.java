
public class ExercicioFibonacci {

    public static boolean estaNaSequenciaFibonacci(int numero) {

        // Casos triviais
        if (numero == 0 || numero == 1) return true;

        int fibonacciAnterior = 0;
        int fibonacciAtual = 1;

        while (fibonacciAtual < numero) {

            int fibonacciProximo = fibonacciAnterior + fibonacciAtual;

            fibonacciAnterior = fibonacciAtual;
            fibonacciAtual = fibonacciProximo;
        }

        return numero == fibonacciAtual;
    }


    public static void main(String[] args) {
        
        // Numero a ser verificado
        int numero = 21;

        if (estaNaSequenciaFibonacci(numero)) {

            System.out.printf("%d está na sequencia fibonacci\n", numero);
        } else {

            System.out.printf("%d não está na sequencia fibonacci\n", numero);
        }
    }
}
