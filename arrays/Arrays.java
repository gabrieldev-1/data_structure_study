package arrays;

public class Arrays {
    public static void main(String[] args) {
        // Declaracao e alocacao de espaco vazio:
        int[] notas = new int[5];
        String[] nomes = new String[3];

        // Declaracao e inicializacao com valores:
        int[] numeros = {10, 20, 30, 40, 50};
        String[] frutas  = {"Maca", "Banana", "Morango"};

        System.out.println("-----------------------");

        // Acessando elementos via indice:
        int primeiroNumero = numeros[0];
        String ultimaFruta = frutas[2];
        System.out.println("Elementos Acessados: " + primeiroNumero + " " + ultimaFruta);

        // Modificando via indice: 
        numeros[2] = 23;

        System.out.println("-----------------------");

        // Propriedade 'length': retorna o tamanho do array.
        // muito util para percorrer elementos. Ex:
        System.out.println("Array percorrido(for com length):");
        int[] idades = {25, 30, 18, 45};
        for(int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);

        }

        System.out.println("-----------------------");


    }
}