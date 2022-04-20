import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Vacaciones {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        DecimalFormat format = new DecimalFormat("###,###.##");

        // variables vac == Tiempo que lleva en la empresa Clave== clave a la que
        // pertenece
        int edad = 0;
        int clave = 0;

        System.out.println("   ________________________________________");
            System.out.println(" / \\                                       \\.");
            System.out.println("|   |                                      |.");
            System.out.println(" \\_ |                                      |.");
            System.out.println("    |      Que accion deseas realizar      |.");
            System.out.println("    |                                      |.");
            System.out.println("    | 1) Calcular su signo del zodiaco.    |.");
            System.out.println("    | 2) Calcular los días vividos.        |.");
            System.out.println("    | 3) Calcular edad en años perro.      |.");
            System.out.println("    | 4) Calcular su número de numerología.|.");
            System.out.println("    | 5) Creditos.                         |.");
            System.out.println("    | 6) Salir.                            |.");
            System.out.println("    |                                      |.");
            System.out.println("    |                                      |.");
            System.out.println("    |                                      |.");
            System.out.println("    |   ___________________________________|___");
            System.out.println("    |  /                                      /.");
            System.out.println("    \\_/______________________________________/.");
            System.out.println("");
            System.out.println("");
            System.out.println("Elija una opcion:");
        int opcion = 0;

        opcion = in.nextInt();

        if (opcion == 1) {

            int mes = 0;
            int dia = 0;
            System.out.println("Ingrese el mes de su nacimiento(En numeros por favor)");
            mes = in.nextInt();
            System.out.println("Ingrese el dia de su nacimiento");
            dia = in.nextInt();
            if ((mes == 1 && dia > 0 && dia <= 19)) {
                System.out.println("Su signo es CAPRICORNIO");
            } else if ((mes == 1 && dia > 19) || (mes == 2 && dia <= 18)) {
                System.out.println("Su signo es ACUARIO");
            } else if (mes == 2 && dia > 18 || mes == 3 && dia <= 20) {
                System.out.println("Su signo es PISCIS");
            } else if (mes == 3 && dia > 20 || mes == 4 && dia <= 19) {
                System.out.println("Su signo es ARIES");
            } else if (mes == 4 && dia > 19 || mes == 5 && dia <= 21) {
                System.out.println("Su signo es TAURO");
            } else if (mes == 5 && dia > 21 || mes == 6 && dia <= 20) {
                System.out.println("Su signo es GEMINIS");
            } else if (mes == 6 && dia > 20 || mes == 7 && dia <= 22) {
                System.out.println("Su signo es CANCER");
            } else if (mes == 7 && dia > 22 || mes == 8 && dia <= 22) {
                System.out.println("Su signo es LEO");
            } else if (mes == 8 && dia > 22 || mes == 9 && dia <= 22) {
                System.out.println("Su signo es VIRGO");
            } else if (mes == 9 && dia > 22 || mes == 10 && dia <= 22) {
                System.out.println("Su signo es LIBRA");
            } else if (mes == 10 && dia > 22 || mes == 11 && dia <= 21) {
                System.out.println("Su signo es ESCORPIO");
            } else if (mes == 11 && dia > 21 || mes == 12 && dia <= 21) {
                System.out.println("Su signo es SAGITARIO");
            } else if (mes == 12 && dia > 21 || mes == 1 && dia <= 19) {
                System.out.println("Su signo es CAPRICORNIO");
            } else {
                System.out.println("******A INGRESADO LA FECHA MAL******");
                
            } 
        } else if (opcion == 2) {
            // compae esto es la parte 2 de las horitas y como que los commits no se
            // realizan

            System.out.println("Has seleccionado la opcion 2");
            System.out.print("Ingresa tu edad: ");
            edad = in.nextInt();

            int meses = edad * 12;
            int msn;
            System.out.println("Ingrese el mes en el que nacio");
            msn = in.nextInt();
            int mes = meses + msn;
            int dias = edad * 365 + (msn * 30);
            int horas = dias * 24;

            System.out.println("Has vivido aproximadamente " + (format.format(mes)) + " meses");
            System.out.println("Has vivido aproximadamente " + (format.format(dias)) + " dias");
            System.out.println("Has vivido aproximadamente " + (format.format(horas)) + " horas");
            

        } else if(opcion == 3){
            System.out.println("Ha registrado la opcion 3: edad en años de perro");
            int edad1 = 0;
            int perro = 0;
            System.out.println("Ingrese su edad");
            edad1 = in.nextInt();
            perro =edad1*7;
            System.out.println("Su edad en años perro es: "+ perro + "años");
            

            


        } else if(opcion == 4) {
            System.out.println("Ha registrado la opcion 4: Número según la nuemrología");
            System.out.println("Ingrese el primer dígito de su día de nacimiento:");
            int digito1 = in.nextInt();

            if (digito1 <10) {

                System.out.println("Ingrese el segundo dígito de su día de nacimiento:");
                int digito2 = in.nextInt();
                if (digito2 <10) {
                 int numero = digito1 + digito2;
                 System.out.println("\nSu número es el" + " " + numero);

                 if (numero >10) {
                     System.out.println("Ya que la suma de los dos dígitos del día de su nacimiento es mayor que 10, ingrese los dos dígitos del resultado de sumar los dos número de su día de nacimiento:");
                     System.out.println("Ingrese el primer dígito del resultado:");
                     int digito3 = in.nextInt();

                     System.out.println("Ingrese el segundo dígito del resultado:");
                     int digito4 = in.nextInt();







        }

    }

   }
  }

}
// W4ND333R
// Mateoacevedo15