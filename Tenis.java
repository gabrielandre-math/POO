import java.util.Scanner;

public class Tenis extends CalcadoCadarco{
    protected boolean esportivo;

    //Construtor padrão
    public Tenis() {}

    public Tenis(boolean esportivo) {
        this.esportivo = esportivo;
    }

    //Construtores da superclasse CalcadoCadarco
    public Tenis(String marca, Double preco, int tamanho) {
        super(marca, preco, tamanho);
    } //OK
    public Tenis(String marca, Double preco) {
        super(marca, preco);
    }
    public Tenis(String marca, Double preco, int tamanho, boolean cadarco) {
        super(marca, preco, tamanho, cadarco);
    }

    public Tenis(String marca, Double preco, int tamanho, boolean cadarco, boolean esportivo) {
        super(marca, preco, tamanho, cadarco);
        this.esportivo = esportivo;
    } //OK
    public Tenis(String marca, boolean cadarco, boolean esportivo) {
        super(marca, cadarco);
        this.esportivo = esportivo;
    } // OK
    public Tenis(String marca) {
        super(marca);
    } //OK
    public Tenis(Double preco) {
        super(preco);
    } //OK
    public Tenis(String marca, boolean cadarco) {
        super(marca, cadarco);
    } //OK
    public Tenis(int tamanho) {
        super(tamanho);
    }


    //Getter
    public boolean getEsportivo() {
        return esportivo;
    }
    //Setter
    public void setEsportivo(boolean esportivo) {
        this.esportivo = esportivo;
    }

    //Sobrescrevendo métodos de CalcadoCadarco
    public void mostrarTudo() {
        super.mostrarTudo();
        System.out.println("Esportivo: " + getEsportivo());
    }
    public void cadastrar(String marca, Double preco, int tamanho, boolean cadarco, boolean esportivo) {
        super.cadastrar(marca, preco, tamanho);
        setEsportivo(esportivo);
    }
    public void entradaDados() {
        super.entradaDados();
        Scanner sc = new Scanner(System.in);
        System.out.println("É esportivo (true/false): ");
        setEsportivo(Boolean.parseBoolean(sc.nextLine()));
    }
}
