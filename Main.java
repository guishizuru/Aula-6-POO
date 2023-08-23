public class Main {
    public static void main(String[] args) {
        Grupo grupo = new Grupo();
        grupo.adicionarHeroi(new Heroi(1, "lyn", 10));
        grupo.adicionarHeroi(new Heroi(2, "olivia", 1000));
        grupo.adicionarHeroi(new Heroi(3, "surce", 10));

    //    System.out.println(grupo.getTotalMoedasDeouro());
        for(Heroi heroi : grupo.getHerois()){
            System.out.println(heroi.getNome());
        }
    }
}
