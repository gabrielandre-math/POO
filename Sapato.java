import java.util.Scanner;

public class Sapato extends CalcadoCadarco {
    protected String modelo;

    //Construtor padrão
    public Sapato() {}

    public Sapato(String modelo) {
        this.modelo = modelo;
    }

    //Construtores da superclasse CalcadoCadarco
    public Sapato(String marca, Double preco, int tamanho) {
        super(marca, preco, tamanho);
    }
    public Sapato(String marca, Double preco, int tamanho, String modelo) {
        super(marca, preco, tamanho);
        this.modelo = modelo;
    }
    public Sapato(String marca, Boolean cadarco, String modelo) {
        super(marca, cadarco);
        this.modelo = modelo;
    }
    public Sapato(Double preco) {
        super(preco);
    }
    public Sapato(String marca, String modelo) {
        super(marca);
        this.modelo = modelo;
    }
    public Sapato(String marca, Boolean cadarco) {
        super(marca, cadarco);
    }

    //Getter
    public String getModelo() {
        return modelo;
    }
    //Setters
    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
    //Sobrescrevendo os métodos de CalcadoCadarco
    public void mostrarTudo() {
        super.mostrarTudo();
        System.out.println("Modelo: " + modelo);
    }
    public void entradaDados() {
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o modelo: ");
        setModelo(sc.nextLine());
    }
    public void cadastrar(String marca, Double preco, int tamanho, boolean cadarco, String modelo) {
        super.cadastrar(marca, preco, tamanho, cadarco);
        setModelo(modelo);
    }
}
