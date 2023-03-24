import java.util.Scanner;

public class CalculoConsumoCombustivel {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a distância percorrida (em Km): ");
        double distancia = scanner.nextDouble();

        System.out.print("Digite a quantidade de combustível consumida (em litros): ");
        double quantidade = scanner.nextDouble();

        double consumo = distancia / quantidade;

        System.out.printf("O consumo médio de combustível é %.2f Km/l.", consumo);

        scanner.close();
    }
}
