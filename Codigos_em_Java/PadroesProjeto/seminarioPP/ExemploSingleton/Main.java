public class Main 
{
    public static void main(String[] args)
    {
        //tentando criar duas bombas
        Bomba bomba1 = Bomba.getInstance();
        Bomba bomba2 = Bomba.getInstance();

        //ativando a bomba
        bomba1.explodir();
        bomba2.explodir();

        //verificando se as duas bombas são iguais
        System.out.println(bomba1.equals(bomba2)); //se retornar true quer dizer que uma unica bomba explodiu 2 vezes e não que duas bombas diferentes explodiram 
    }    
}
