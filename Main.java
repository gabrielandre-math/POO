public class Main {
   public static void main(String[] args) {
      //Criação de objetos para chinelo
      Chinelo objChinelo = new Chinelo();
      //objChinelo.entradaDados();
      objChinelo.cadastrar("nike", 129.99, 42, true, true);
      objChinelo.mostrarTudo();
      objChinelo.cadastrar("adidas", 99.99, 41, false, true);
      objChinelo.mostrarTudo();
      objChinelo.cadastrar("puma", 109.99, 42, true, true);
      objChinelo.mostrarTudo();

      //fim da criçaõ de objetos para chinelo

      //Criação de objetos para Tênis
      Tenis objTenis = new Tenis();
      objTenis.cadastrar("nike", 108.99, 42, true, false);
      objTenis.mostrarTudo();

      Tenis objTenis1 = new Tenis();
      objTenis1.cadastrar("adidas", 208.99, 42, true, false);
      objTenis1.mostrarTudo();

      Tenis objTenis2 = new Tenis();
      objTenis2.cadastrar("puma", 308.99, 42, true, false);
      objTenis2.mostrarTudo();
      //fim da crição de objetos para tênis

      //Criação de objetos para sapato
      Sapato objSapato = new Sapato();
      objSapato.cadastrar("goldeShoes", 209.99, 42, true, "premium");
      objSapato.mostrarTudo();

      Sapato objSapato1 = new Sapato();
      objSapato1.cadastrar("silveShoe", 309.99, 42, true, "silver");
      objSapato1.mostrarTudo();

      Sapato objSapato2 = new Sapato();
      objSapato2.cadastrar("plateShoes", 409.99, 42, true, "plate");
      objSapato2.mostrarTudo();


      //Fim da criação de objetos para sapato
   }
}