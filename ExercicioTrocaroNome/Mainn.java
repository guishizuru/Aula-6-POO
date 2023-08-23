package ExercicioTrocaroNome;

import java.util.Scanner;

public class Mainn {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = scanner.next();

        Mudar_TamanhoDeLetra mudarTamanhoDeLetra = new Mudar_TamanhoDeLetra(nome);
    }
}
