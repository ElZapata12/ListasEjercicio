package listas.ejemplos;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Lista {
    List<String> lista01 = new ArrayList<>();

    public void registrar(){
        //crear lista "lista01" con list y arraylist
        //agregar elementos a la lista "lista 01"
        lista01.add("COMPUTADORA");
        lista01.add("MOUSE");
    }
    public void crear_lista() {

        //imprimir elementos de la lista "lista01"
        for (String item : lista01) {
            System.out.println("" + item);
        }

    }

    public void tamanioLista() {
        System.out.println("El tamaño de la lista es de: " + lista01.size() + " elementos");

    }

    public void estaVacia() {
        if (lista01.isEmpty()) {
            System.out.println("La lista esta vacia");

        } else
            System.out.println("la lista tiene elementos");
    }
    public void buscarElemento(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Ingrese el elemento que desea buscar en la lista: ");
        String elemento= teclado.next();
        if (lista01.contains(elemento)){
            System.out.println("El elemento si se encuentra en la lista");
        }else
            System.out.println("el elemento no se encuentra en la lista");
    }

    public void eleminar() {
        Scanner teclado= new Scanner(System.in);
        System.out.println("¿Qué desea eliminar?\n"+
                "1.- un elemento de la lista\n"+
                "2.- toda la lista\n");
        int opc= teclado.nextInt();
        switch (opc){
            case 1:
                System.out.println("Ingrese la palabra a eliminar: ");
                String elemento = teclado.next();
                lista01.remove(elemento);
                if (lista01.remove(elemento)){
                    System.out.println("el elemento"+ elemento+ " fue eliminado de la lista");
                }else {
                    System.out.println("el elemento no esta en la lista");
                }
                break;
            case 2:
                lista01.clear();
                System.out.println("La lista ha sido eliminada");
                break;
        }
    }

    public void comprarar() {
        List<String> lista2= new ArrayList<>();
        List<String> lista3= new ArrayList<>();
        lista2.add("Peter");
        lista3.add("Peter");

        if (lista2.equals(lista3)){
            System.out.println("Las listas son identidas: ");
        }else{
            System.out.println("Las listas son distintas");
        }

    }
}