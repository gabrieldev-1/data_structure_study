package arrays.exercises;

class Element {
    int[] positions;
    String value;  

    public Element() {
        this.value = null;
        this.positions = new int[2];

    }
}

public class FindDuplicatedStr {
    Element element = new Element();

    public Element find(String[] array) {
        for(int i = 0; i < array.length; i++) {

            // "int j = i + 1" empede que o valor seja comparado com ele mesmo;
            for(int j = i + 1; j < array.length; j++) {
                
                // "equals()" compara o conteudo, enqualto "==" compara o endereco da memoria;
                if(array[i].equals(array[j])) {
                    element.value = array[i];
                    element.positions[0] = i;
                    element.positions[1] = j;

                    return element;
                }
            }
        }
        // retorna o objeto vazio, caso ele nao encontre elementos duplicados;
        return element;
    }
    public static void main(String[] args) {
        String[] arrayStr = {"Uva", "Maca", "Banana", "Maca"};
        FindDuplicatedStr search = new FindDuplicatedStr();

        Element elementDuplicated = search.find(arrayStr);
        if(elementDuplicated.value != null) {
            System.out.println("O elemento duplicado e " + elementDuplicated.value);
            System.out.println("Ele aparece nas posicoes " + elementDuplicated.positions[0] + " e " + elementDuplicated.positions[1]);

        } else {
            System.out.println("Esse array nao possui elementos duplicados");

        }

    }
}
