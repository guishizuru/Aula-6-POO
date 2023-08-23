package Herança.Inimigo;

public class Inimigo {
    protected int id;
    protected int ataque;
    protected int defesa;
    protected int pontosDeVida;

    public Inimigo() {

    }

    public  Inimigo(int id, int ataque, int defesa, int pontosDeVida) {
        this.id = id;
        this.ataque = ataque;
        this.defesa = defesa;
        this.pontosDeVida = pontosDeVida;
    }
    public void atacar(){
        System.out.println("O INIMIGO ATACOU E CAUSOU DANO " + this.ataque + " DE DANO");
    }


    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAtaque() {
        return ataque;
    }
    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }

    public int getDefesa() {
        return defesa;
    }

    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }
}
