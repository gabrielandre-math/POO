import java.util.Scanner;

public class Calcado {
    protected String marca;
    protected Double preco;
    protected int tamanho;

    //Método Construtor
    public Calcado() {
        //Construtor padrão
    }
    //Construtor completo da superclasse
    public Calcado(String marca, Double preco, int tamanho) {
        this.marca = marca;
        this.preco = preco;
        this.tamanho = tamanho;
    }
    public Calcado(String marca, Double preco) {
        this.marca = marca;
        this.preco = preco;
    }
    public Calcado(String marca) {
        this.marca = marca;
    }
    public Calcado(Double preco) {
        this.preco = preco;
    }
    public Calcado(int tamanho) {
        this.tamanho = tamanho;
    }
    //Getters
    public String getMarca() {
        return marca;
    }
    public Double getPreco() {
        return preco;
    }
    public int getTamanho() {
        return tamanho;
    }
    //Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }
    //Métodos auxiliares
    public void mostrarTudo() {
        System.out.println("Especificações do objeto criado: ");
        System.out.println("Marca: " + getMarca());
        System.out.println("Preço: " + getPreco());
        System.out.println("Tamanho: " + getTamanho());
    }
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o marca: ");
        setMarca(sc.nextLine());
        System.out.println("Digite o preco: ");
        setPreco(Double.parseDouble(sc.nextLine()));
        System.out.println("Digite a tamanho: ");
        setTamanho(Integer.parseInt(sc.nextLine()));
    }
    public void cadastrar(String marca, Double preco, int tamanho) {
        setMarca(marca);
        setPreco(preco);
        setTamanho(tamanho);
    }
}
