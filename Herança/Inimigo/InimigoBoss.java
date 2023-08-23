package Herança.Inimigo;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Random;

public class InimigoBoss extends Inimigo{
    public InimigoBoss(){

    }public InimigoBoss(int id, int ataque, int defesa, int pontosDeVida){
        super(id, ataque, defesa, pontosDeVida);
    }
    public void atacar(){
        Random random = new Random();
        int numeroSorteado = random.nextInt(10);
        if(numeroSorteado < 4){
            System.out.println("BOSS ATACOU E CAUSOU DANO " + ataque  + " DE DANO ");
        }else if(numeroSorteado >=4 && numeroSorteado <= 6){
            System.out.println("BOSS USOU UM ATAQUE  ESPECIAL !!");
            System.out.println("----LÁ VEM BOMBA----");
            System.out.println("O BOSS ATACOU E CAUSOU " + ataque * 2 + " DE DANO");
        }else {
            System.out.println("BOSS USOU UM ATAQUE ULTRA ESPECIAL !!");
            System.out.println("----SINTA UM POUCO DO MEU PODER----");
            System.out.println("O BOSS ATACOU E CAUSOU " + ataque * 3 + " DE DANO");
        }
    }

}
