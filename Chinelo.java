import java.util.Scanner;

public class Chinelo extends Calcado {
    protected boolean tiras;
    protected boolean acessorios;

    //Método construtor padrão
    public Chinelo() {}

    public Chinelo(boolean tiras, boolean acessorios) {
        this.tiras = tiras;
        this.acessorios = acessorios;
    }
    public Chinelo(boolean tiras) {
        this.tiras = tiras;
    }


    public Chinelo (String marca, Double preco, int tamanho) {
        super(marca, preco, tamanho);
    }
    public Chinelo (String marca, Double preco, int tamanho, boolean tiras, boolean acessorios) {
        super(marca, preco, tamanho);
        this.tiras = tiras;
        this.acessorios = acessorios;
    }
    public Chinelo (String marca, Double preco, int tamanho, boolean tiras) {
        super(marca, preco, tamanho);
        this.tiras = tiras;
    }

    public Chinelo (String marca, Double preco) {
        super(marca, preco);
    }
    public Chinelo (String marca) {
        super(marca);
    }
    //Getters
    public boolean getTiras() {
        return tiras;
    }
    public boolean getAcessorios() {
        return acessorios;
    }
    //Setters
    public void setTiras(boolean tiras) {
        this.tiras = tiras;
    }
    public void setAcessorios(boolean acessorios) {
        this.acessorios = acessorios;
    }

    //Herdando métodos auxiliares da superclasse
    public void mostrarTudo() {
        super.mostrarTudo();
        System.out.println("Tiras? " + getTiras());
        System.out.println("Acessorios? " + getAcessorios());
    }
    public void entradaDados() {
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite true ou false se o chinelo tem tiras: ");
        setTiras(Boolean.parseBoolean(sc.nextLine()));
        System.out.println("Digite true ou false se o chinelo tem acessórios: ");
        setAcessorios(Boolean.parseBoolean(sc.nextLine()));
    }
    public void cadastrar(String marca, Double preco, int tamanho, boolean tiras, boolean acessorios) {
        super.cadastrar(marca, preco, tamanho);
        setTiras(tiras);
        setAcessorios(acessorios);
    }
}
