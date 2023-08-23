package ExercicioTrocaroNome;

public class Mudar_TamanhoDeLetra {

    public Mudar_TamanhoDeLetra(String nome) {
        String palavraMudarDeTamanho = nome;
        int posicao = 0;

        String[] partes = palavraMudarDeTamanho.split("");
        for (int i = 0; i < partes.length; i++) {
            String parte = partes[i];
            String palavraEmMaiusculo = parte.toUpperCase();

            if (i != posicao) {
                String palavraEmMinusculo = palavraEmMaiusculo.toLowerCase();

                System.out.print(palavraEmMinusculo);

            } else {
                parte = palavraEmMaiusculo.toUpperCase();
                System.out.print(parte);
            }

        }

    }
}



