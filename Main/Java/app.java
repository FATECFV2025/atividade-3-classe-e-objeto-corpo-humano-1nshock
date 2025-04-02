package Main.Java;
import java.util.Scanner;
 
public class app {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
       
        corpohumano c1 = new corpohumano(70, 1.75f);
 
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Volume: " + c1.getVolume() + " m³");
        System.out.println("Densidade: " + c1.getDensidade() + " kg/m**2");
        System.out.println("Altura: " + c1.getAltura() + " m");
 
       
        System.out.println("IMC: " + c1.calcularIMC());
 
   
        System.out.print("\nDigite uma nova massa (kg): ");
        double novaMassa = scanner.nextFloat();
        c1.setMassa(novaMassa);
 
        System.out.print("Digite uma nova altura (m): ");
        double novaAltura = scanner.nextFloat();
        c1.setAltura(novaAltura);
 
        System.out.println("\nNovos valores:");
        System.out.println("Massa: " + c1.getMassa() + " kg");
        System.out.println("Altura: " + c1.getAltura() + " m");
        System.out.println("Novo IMC: " + c1.calcularIMC());
 
        scanner.close();
    }
}
