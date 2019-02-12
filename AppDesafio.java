
/**
 * Write a description of class AppDesafio here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AppDesafio
{
    public void executa(){
        ListaDeNumeros lNum = new ListaDeNumeros();
        System.out.println("\fLista Original: "+lNum);
        System.out.println("Retorno do método: "+lNum.zeraMaiorSequencia()+"\nLista após a modificação: "+lNum);
    }
    public static void main(String args[]){
        new AppDesafio().executa();
    }
}
