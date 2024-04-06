
public class ExercicioInverterString {

    public static String inverterString(String str) {

        char[] caracteres = str.toCharArray();

        int inicio = 0;
        int fim = caracteres.length - 1;

        while (inicio < fim) {

            char auxiliar = caracteres[inicio];

            caracteres[inicio] = caracteres[fim];
            caracteres[fim] = auxiliar;

            inicio++;
            fim--;
        }

        return new String(caracteres);
    }


    public static void main(String[] args) {
        
        // String a ser invertida
        String str = "Hello World!";

        System.out.println(inverterString(str));
    }
}
