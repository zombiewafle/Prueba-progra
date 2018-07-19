package Lista_de_tareas;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.*;
public class Main {
    private static Scanner input = new Scanner( System.in);
    public static void main (String[] args){
        Scanner sn = new Scanner(System.in);
        boolean salir = false;
        int opcion;
        while (!salir){
            System.out.println("Menu:");
            System.out.println("1. Crear lista de tareas>>");
            System.out.println("2. Salir");
            try{
                System.out.println("Escribe una de las opciones>>");
                opcion = sn.nextInt();
                switch (opcion){
                    case 1:
                        int opcionmenu2;
                        while (!salir);{
                        System.out.println("Menu: ");
                        System.out.println("1. Ingrese el nombre de su nueva lista de tareas ");
                        System.out.println("2. Ver todas las listas de tareas ");
                        System.out.println("3. Seleccione una lista de tareas");
                        System.out.println("4. Salir ");
                        try{
                            System.out.println("Escribe una de las opciones >>");
                            opcionmenu2 = sn.nextInt();
                            switch (opcionmenu2){
                                case 1:
                                    System.out.println("Has seleccionado la opcion 1 >>");
                                    System.out.println("Ingrese el nombre de su nueva lista de tareas >>");
                                    System.out.println("La lista de tareas ha sido creada ");
                                    break;
                                case 2:
                                    System.out.println("Has seleccionado la opcion 2 >>");
                                    System.out.println("Las listas disponibles son: >>");
                                    break;
                                case 3:
                                    System.out.println("Has seleccionado la opcion 3 >>");
                                    System.out.println("Selecione una lista de tareas >>");
                                    break;
                                    int opcionmenu3;
                                    while (!salir); {
                                        System.out.println("Menu:");
                                        System.out.println("1. Deseleccionar la lista actual");
                                        System.out.println("2. Agregar una tarea");
                                        System.out.println("3. Completar una tarea");
                                        System.out.println("4. Ver todas las tareas en esta lista");
                                        System.out.println("5. Salir");
                                        try{
                                            System.out.println("Escribe una de las opciones");
                                            opcionmenu3 = sn.next();

                                        }
                                }

                                case 4:
                                    System.out.println("Has seleccionado la opcion 4 >>");
                                    System.out.println("Vuelva pronto !!");
                                    break;
                            }
                        }catch (InputMismatchException e){
                            System.out.println("Debes de insertar un numero >>");
                            sn.next();
                        }

                    }

                    case 2:
                        System.out.println("Has seleccionado la opcion 4 >>");
                        System.out.println("Vuelve pronto >>");
                        salir = true;
                        break;

                }

            }catch (InputMismatchException e){
                System.out.println("Debes de insertar un numero>>");
                sn.next();
            }
        }
    }
}
