public class Operadores {
    public static void main(String[] args) {
        String nomeCompleto = "LINGUAGEM" + "JAVA";
        // Qual o resultado das expressoes abaixo?

        String concatenacao = "?";

        concatenacao = 1 + 1 + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + 1;

        System.out.println(concatenacao);

        concatenacao = 1 + "1" + 1 + "1";

        System.out.println(concatenacao);

        concatenacao = "1" + (1 + 1 + 1);

        System.out.println(nomeCompleto);
        System.out.println(concatenacao);

        int numero = 5;

        numero = -numero;

        System.out.println(numero);
        numero = +numero * -1;
        System.out.println(numero);

    }
}
