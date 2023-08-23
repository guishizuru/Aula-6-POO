import java.security.spec.RSAOtherPrimeInfo;
import java.util.ArrayList;

public class Grupo {
    private ArrayList<Heroi> herois;
    private int totalMoedasDeouro;

    public Grupo(){
        this.herois = new ArrayList<>();
    }
    public void adicionarHeroi(Heroi heroi){
        this.totalMoedasDeouro = this.totalMoedasDeouro + heroi.getQuantidadeMoedasDeOuro();
        this.herois.add(heroi);
        System.out.println("O heroi" + heroi.getNome() + "foi adicionado ao grupo !");
    }
    public void removerHeroi(int idHeroi){
        for (int i = 0; i < this.herois.size(); i++) {
            if(herois.get(i).getId() == idHeroi){
                this.totalMoedasDeouro = this.totalMoedasDeouro - this.herois.get(i).getQuantidadeMoedasDeOuro();
                System.out.println("O heroi" + this.herois.get(i).getNome() + "foi removido da lista!");
                herois.remove(i);
            }
        }
    }
    public ArrayList<Heroi> getHerois(){
        return  herois;
    }

    public void setHerois(ArrayList<Heroi> herois) {
        this.herois = herois;
    }

    public int getTotalMoedasDeouro() {
        return totalMoedasDeouro;
    }

    public void setTotalMoedasDeouro(int totalMoedasDeouro) {
        this.totalMoedasDeouro = totalMoedasDeouro;
    }
}
