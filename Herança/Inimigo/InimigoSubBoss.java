package Herança.Inimigo;

public class InimigoSubBoss extends Inimigo{
    public InimigoSubBoss(){

    }public InimigoSubBoss(int id, int ataque, int defesa, int pontosDeVida){
        super(id, ataque, defesa, pontosDeVida);

    }
    @Override
    public void atacar(){
        System.out.println("O SUB BOSS ATACOU E CAUSOU " + ataque + " DE DANO "
                +"\nRISADA FORÇADA DO SUB BOSS: UAHHRARARA");
    }
}
