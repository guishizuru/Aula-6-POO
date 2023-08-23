package Herança;

import Herança.Inimigo.Inimigo;
import Herança.Inimigo.InimigoBoss;
import Herança.Inimigo.InimigoComum;
import Herança.Inimigo.InimigoSubBoss;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        InimigoComum inimigoComum = new InimigoComum(1, 10, 10, 100);
        inimigoComum.atacar();
        Thread.sleep(3000);
        InimigoSubBoss inimigoSubBoss = new InimigoSubBoss(2, 100, 100, 1000);
        inimigoSubBoss.atacar();
        Thread.sleep(3000);
        InimigoBoss inimigoBoss = new InimigoBoss(3,1000,1000,1000);
        inimigoBoss.atacar();
    }
}
