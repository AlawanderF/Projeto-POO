import java.util.ArrayList;

public class GerenciadorDePratos 
{
    private ArrayList<Prato> pratos = new ArrayList<>();

    public void cadastrarPrato(Prato prato) 
    {
        pratos.add(prato);
    }

    public void modificarPrato(String nome, Prato novoPrato) 
    {
        for (int i = 0; i < pratos.size(); i++) 
        {
            if (pratos.get(i).getNome().equalsIgnoreCase(nome)) 
            {
                pratos.set(i, novoPrato);
                break;
            }
        }
    }

    public void excluirPrato(String nome) 
    {
        pratos.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
    }

    public ArrayList<Prato> listarPratos() 
    {
        return pratos;
    }
}