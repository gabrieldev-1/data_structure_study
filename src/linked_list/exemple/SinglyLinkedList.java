package linked_list.exemple;

class Node {
    int value; // conteudo do no;
    Node next; // ponteiro para o proximo no;

    public Node(int value) {
        this.value = value;
        this.next = null;
    }
}

public class SinglyLinkedList {
    Node head = null;

    public void addNode(int value) {
        Node newNode = new Node(value);
        
        // caso a lista esteje vazia, o novo no se torna o head;
        if (head == null) {
            this.head = newNode;

        } else {
            Node last = head;

            while(last.next != null) { // Percorre a lista atras do ultimo no;
                last = last.next;

            }
            last.next = newNode; // Adiciona o novo no no final da lista;
        }
    }

    public void deleteNode(int key) {
        Node currentNode = head;
        Node previousNode = null;

        if (currentNode != null && currentNode.value == key) { // Remove o head caso ele seja o elemento buscado;
            head = currentNode.next;
            System.out.println("Nó com valor " + key + " removido.");
            return;

        }

        while (currentNode != null && currentNode.value != key) { // Remove caso o elemento chave esteje no meio da lista;
            previousNode = currentNode;
            currentNode = currentNode.next;

        }

        if (currentNode != null) { // Se 'currentNode' não é nulo, o valor foi encontrado
            previousNode.next = currentNode.next;
            System.out.println("Nó com valor " + key + " removido.");

        } else { // Caso o valor nao tenha sido encontrado na lista;
            System.out.println("Valor " + key + " não encontrado na lista.");

        }

    }

    public void printList() { // Mostra a lista
        Node currentNode = head;
        
        while(currentNode != null) {
            System.out.println(" -> " + currentNode.value);
            currentNode = currentNode.next;

        }
    }

    public static void main(String[] args) {
        SinglyLinkedList myList = new SinglyLinkedList();

        myList.addNode(10);
        myList.addNode(20);
        myList.addNode(30);
        myList.addNode(40);

        System.out.println("Lista original:");
        myList.printList(); // Saída: 10 -> 20 -> 30 -> 40 -> null

        // Removendo um nó do meio
        myList.deleteNode(30);
        System.out.println("\nLista após remover 30:");
        myList.printList(); // Saída: 10 -> 20 -> 40 -> null

        // Removendo o 'head'
        myList.deleteNode(10);
        System.out.println("\nLista após remover 10:");
        myList.printList(); // Saída: 20 -> 40 -> null
        
        // Tentando remover um nó que não existe
        myList.deleteNode(99);
        System.out.println("\nLista após tentar remover 99:");
        myList.printList(); // Saída: 20 -> 40 -> null
    }


}