import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Introduce la nota del primer examen: ");
        double notaPrimerExamen = scanner.nextDouble();

        System.out.print("QUe nota quieres sacar en el trimestre ");
        double notaDeseada = scanner.nextDouble();

        double notaSegundoExamen = ((notaDeseada - (notaPrimerExamen * 0.4)) / 0.6);

        System.out.println("Para tener un " + notaDeseada + " en el trimestre necesitas sacar un " + notaSegundoExamen + " en el segundo examen.");

        
    }
}
