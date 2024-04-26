import java.util.Scanner;

public class CalcadoCadarco extends Calcado {
    protected boolean cadarco;

    //Construtor
    public CalcadoCadarco() {
        //Construtor padrão
    }
    public CalcadoCadarco(boolean cadarco) {
        this.cadarco = cadarco;
    }
   public CalcadoCadarco(String marca, Double preco, int tamanho, boolean cadarco) {
        super(marca, preco, tamanho);
        this.cadarco = cadarco;
   }  //OK
   public CalcadoCadarco(String marca, Double preco, boolean cadarco) {
        super(marca, preco);
        this.cadarco = cadarco;
   } //OK
   public CalcadoCadarco(String marca, Double preco) {
        super(marca, preco);
   }
   public CalcadoCadarco(String marca, boolean cadarco) {
        super(marca);
        this.cadarco = cadarco;
   } //OK
   public CalcadoCadarco(String marca, Double preco, int tamanho) {
        super(marca, preco, tamanho);
   } //OK
   public CalcadoCadarco(String marca) {
        super(marca);
   } //OK
   public CalcadoCadarco(Double preco) {
        super(preco);
   } //OK
   public CalcadoCadarco(int tamanho) {
        super(tamanho);
   }
   //Getters e Setters
    public boolean getCadarco() {
        return cadarco;
    }
    public void setCadarco(boolean cadarco) {
        this.cadarco = cadarco;
    }
    //Métodos herdados da superclasse
    public void mostrarTudo() {
        super.mostrarTudo();
        System.out.println("Tem cadarço? " + getCadarco());
    }
    public void entradaDados() {
        Scanner sc = new Scanner(System.in);
        super.entradaDados();
        System.out.println("Digite true ou false para cadarço: ");
        setCadarco(Boolean.parseBoolean(sc.nextLine()));
    }
    public void cadastrar(String marca, Double preco, int tamanho, boolean cadarco) {
        super.cadastrar(marca, preco, tamanho);
        setCadarco(cadarco);
    }
}
