import java.util.ArrayList;

public class Carrinho {

    private ArrayList<Item> items;

    public Carrinho() {
        items = new ArrayList<>();
    }

    public void adicionarItem(Item item) {
        items.add(item);
        System.out.println(item.getNome()+" adicionado com sucesso!");
    }

    public void removerItem(Item item) {
        for (int i = 0; i < items.size(); i++) {
            if (items.get(i).getCodigo() == item.getCodigo()) {
                System.out.println(items.get(i).getNome()+" removido com sucesso");
                items.remove(i);
            }
        }
    }

    public void calcularPreco(){
        double total = 0;
        for (int i = 0; i < items.size(); i++) {
            total += items.get(i).getPreco();
        }
        System.out.println("Total é R$: "+total);
    }
}
