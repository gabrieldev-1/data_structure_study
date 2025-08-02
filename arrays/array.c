#include <stdio.h>

int main() {
    int numbers[5]; // Cria um array de 5 inteiros;
    numbers[0] = 10; // Atribui valor a primeira posicao;
    numbers[1] = 20;

    for(int i = 0; i < 5; i++) {
        printf("%d\n", numbers[i]);
    }

    return 0;
}