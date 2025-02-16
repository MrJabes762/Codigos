public class Bomba 
{
    private static Bomba unicaInstância;

    //Construtor privado -> ele impede que novas instancias sejam criadas
    private Bomba()
    {
        System.out.println("Bomba ativada");
    }
    
    //Método estático que retorna a unica instância da Bomba
    public static Bomba getInstance()
    {
        //se a bomba não existir, vai ser criada
        if (unicaInstância == null) 
        {
            unicaInstância = new Bomba();
        }
        return unicaInstância;
    }

    public void explodir()
    {
        System.out.println("Bomba explodiu");
    }
}
