import java.util.Scanner;

/**
 * Created by alumno on 3/07/2017.
 */
public class Principal {

    public static void main(String[] args) throws Exception {
        System.out.println("Ingrese un profesor");
        Scanner sn = new Scanner(System.in);
        Profesor profesor = new Profesor();
        System.out.println("Nombre del proversor");
        profesor.setNombre(sn.next());
        System.out.println("Especialidad del profesor");
        profesor.setEspecialidad(sn.next());
        System.out.println("Ahora debe agregar estudiantes");
        System.out.println("Cuantos estudiantes ingresará?");
        int cantidadEstudiantes = sn.nextInt();
        for (int i = 0; i <= cantidadEstudiantes; i++) {
            System.out.println("");
        }
    }
}
