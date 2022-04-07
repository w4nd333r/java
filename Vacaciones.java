import java.util.Scanner;

public class Vacaciones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // variables vac == Tiempo que lleva en la empresa Clave== clave a la que
        // pertenece
        int vac = 0;
        int clave = 0;

        System.out.println("");
        System.out.println("");
        System.out.println("***************************************************");
        System.out.println("*********Programa vacacional de w's company********");
        System.out.println("***************************************************");
        System.out.println("");
        System.out.println("Recuerde que:");
        System.out.println("Administratico = Clave 3");
        System.out.println("Gente normal = Clave 2");
        System.out.println("Venecos = Clave 1");
        // Tienes que cambiar esta vaina pa no verte rasista:)

        // Poniendole valor a la variable nombre
        System.out.println("Introduzca su nombre: ");
        String name = in.nextLine();
        System.out.println("");
        System.out.println("");
        // Poniendole valor a la variable clave
        System.out.println("Introduzca la clave a la que pertenece: ");
        clave = in.nextInt();
        System.out.println("");
        System.out.println("");
        // Poniendole valor a la variable vac==Tiempo que llevan trabajando
        System.out.println("Introduzca los años que lleva trabajando en la empresa");
        vac = in.nextInt();
        System.out.println("");
        System.out.println("");

        if (clave == 1 && vac == 1) {
            System.out.println("sr" + name + "Sus vacaciones seran de 10  dias");

        } else if (clave == 1 && vac > 1 && vac <= 3) {
            System.out.println("sr" + name + "Sus vacaciiones seran de 20 dias");
        } else if (clave == 1 && vac > 3 && vac <= 10) {
            System.out.println("sr" + name + "Sus vacaciiones seran de 30 dias");

        } else if (clave == 2 && vac == 1) {
            System.out.println("sr" + name + "Sus vacaciiones seran de 15 dias");

        } else if (clave == 2 && vac > 1 && vac <= 3) {
            System.out.println("sr" + name + "Sus vacaciiones seran de 25 dias");

        } else if (clave == 2 && vac > 3 && vac <= 10) {
            System.out.println("sr" + name + "Sus vacaciiones seran de 35 dias");

        } else if (clave == 3 && vac == 1) {
            System.out.println("sr" + name + "Sus vacaciiones seran de 20 dias");

        } else if (clave == 3 && vac > 1 && vac <= 3) {
            System.out.println("sr" + name + "Sus vacaciiones seran de 30 dias");

        } else if (clave == 3 && vac > 3 && vac <= 10) {
            System.out.println("sr" + name + "Sus vacaciiones seran de 40 dias");

        }

    }

}
// W4ND333R