// Classe: Lutador.java
// Utilizacao de polimorfismo
// Se entrar zero para
// Autor: Prof. Marcos
// Data: Abril/2019

public class EX2lutador
{
    private int peso;
    public EX2lutador(int p)
    {
        peso = p;
    }
    public String defineCategoria()
    {
        String cat;
        if(peso <= 54)
           cat = "Pluma"; 
        else if(peso <= 60)
           cat = "Leve";
        else if(peso <= 75)
           cat = "Meio-Pesado";
        else 
           cat = "Pesado";
        return cat;
    }
}