//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("*-*-*-*-Lanchonete DevLanches*-*-*-*");

        Item xBurguer = new Item(1,"X-BURGUER", 15.99);
        Item xSalada = new Item(2,"X-SALADA", 11.99);
        Item cocaCola = new Item(3,"COCA COLA", 5.99);
        Item guarana = new Item(4,"GUARANA", 4.99);

        Carrinho c = new Carrinho();

        c.adicionarItem(xBurguer);
        c.adicionarItem(xSalada);
        c.adicionarItem(cocaCola);
        c.adicionarItem(guarana);

        c.removerItem(4);
        c.adicionarItem(cocaCola);
        System.out.println();
        System.out.println("Valor Final da conta:");

        c.calcularPreco();
    }
}