import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;

public class Vacaciones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        // variables vac == Tiempo que lleva en la empresa Clave== clave a la que
        // pertenece
        int edad = 0;
        int clave = 0;

        System.out.println("********MENU********");
        System.out.println("1.Conozca su signo zodiacal");
        System.out.println("2.calculadora de cuantos dias a vivido");
        System.out.println("3.edad en dias de perro");
        System.out.println("4.El numero que te representa segun la numerologia");
        System.out.println("5.Salir");
        System.out.println("Ingrese una opcion");
        int opcion = 0;

        opcion = in.nextInt();

        if (opcion == 1) {

            int mes = 0;
            int dia = 0;
            System.out.println("Ingrese el mes de su nacimiento(En numeros por favor)");
            mes = in.nextInt();
            System.out.println("Ingrese el dia de su nacimiento");
            dia = in.nextInt();
            if ((mes == 1 && dia > 0 || dia <= 19)) {
                System.out.println("Su signo es capricornio");
            } else if ((mes == 1 && dia > 19) || (mes == 2 && dia <= 18)) {
                System.out.println("Su signo es acuario");
            } else if (mes == 2 && dia > 18 || mes == 3 && dia <= 20) {
                System.out.println("Su signo es piscis");
            } else if (mes == 3 && dia > 20 || mes == 4 && dia <= 19) {
                System.out.println("Su signo es ARIES");
            } else if (mes == 4 && dia > 19 || mes == 5 && dia <= 21) {
                System.out.println("Su signo es Tauro");
            } else if (mes == 5 && dia > 21 || mes == 6 && dia <= 20) {
                System.out.println("Su signo es Geminis");
            } else if (mes == 6 && dia > 20 || mes == 7 && dia <= 22) {
                System.out.println("Su signo es Cancer");
            } else if (mes == 7 && dia > 22 || mes == 8 && dia <= 22) {
                System.out.println("Su signo es Leo");
            } else if (mes == 8 && dia > 22 || mes == 9 && dia <= 22) {
                System.out.println("Su signo es Virgo");
            } else if (mes == 9 && dia > 22 || mes == 10 && dia <= 22) {
                System.out.println("Su signo es Libra");
            } else if (mes == 10 && dia > 22 || mes == 11 && dia <= 21) {
                System.out.println("Su signo es Escorpio");
            } else if (mes == 11 && dia > 21 || mes == 12 && dia <= 21) {
                System.out.println("Su signo es Sagitario");
            } else if (mes == 12 && dia > 21 || mes == 1 && dia <= 19) {
                System.out.println("Su signo es capricornio");
            } else {
                System.out.println("******A INGRESADO LA FECHA MAL******");
            }
        } else if (opcion == 2) {
            // esto esta malisimo pa
            System.out.print("Número día nacimiento: ");

            int dia = in.nextInt();

            System.out.print("Numero mes nacimiento: ");

            int mes = in.nextInt();

            System.out.print("Año nacimiento: ");

            int anio = in.nextInt();

            in.close();

            System.out.println("\nTu edad es: " + calcularEdad(dia, mes, anio));

        }

    }

    static int calcularEdad(int dia, int mes, int anio) {
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        Period periodo = Period.between(fechaNacimiento, fechaHoy);
        return periodo.getYears();
    }

}
// W4ND333R