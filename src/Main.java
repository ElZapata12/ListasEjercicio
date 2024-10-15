import listas.ejemplos.Lista;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        menuLista();
    }
    public static void menuLista() {
        Scanner teclado = new Scanner(System.in);
        Lista lista = new Lista();
        lista.registrar();
        System.out.println("1. Agregar un elemento a la lista\n" +
                "2. Ver tamaño de la lista\n" +
                "3. Verificar si la lista està vacia\n" +
                "4. Buscar elementos en la lista\n" +
                "5.Eliminar elementos de la lista\n" +
                "6. Comprarar listas\n"+
                "Seleccione una opcion: ");
        int op = teclado.nextInt();
        switch (op) {
            case 1:
                lista.crear_lista();
                break;
            case 2:
                lista.tamanioLista();
                break;
            case 3:
                lista.estaVacia();
                break;
            case 4:
                lista.buscarElemento();
                break;
            case 5:
                lista.eleminar();
                break;
            case 6:
                lista.comprarar();
            case 7:
                System.out.println("Finalizar programa");

                break;
            default:
                System.out.println("inserte un correcto");
        }
    }
}