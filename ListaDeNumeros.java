
/**
 * Write a description of class ListaDeNumeros here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.util.ArrayList;
import java.util.Random;
public class ListaDeNumeros
{
    private ArrayList<Numero> lista;

    public ListaDeNumeros(){
        lista = new ArrayList<Numero>();
        inicializa();
    }
    private void inicializa(){
        Random geraNumero = new Random();
        lista.clear();
        for(int cont=1; cont<=20; cont++){
            int valor = geraNumero.nextInt(100)+1;
            int quantidade = 1;
            if(cont%2==0) quantidade = geraNumero.nextInt(20)+1;
            while(quantidade>0){
                lista.add(new Numero(valor));
                quantidade--;
            }
        }
    }
    public ArrayList<Numero> zeraMaiorSequencia(){
        int posicaoInicial=0;
        int cont2=0;
        ArrayList<Numero> retorno = new ArrayList<Numero>();
        for(Numero n: lista){
            int cont=0;
            for(int pos = 0;pos<lista.size();pos++){
                if(pos!=0)if(n.getValor()==lista.get(pos).getValor()&&n.getValor()==lista.get(pos-1).getValor()) cont++;
                else{
                    if(cont>cont2){
                        cont2=cont;
                        posicaoInicial=pos-cont;
                        retorno.clear();
                        for(int i=0;i<cont;i++) retorno.add(n);
                    }
                    cont = 0;
                }
            }
        }
        for(int cont=0;cont<retorno.size();cont++){
            lista.get(posicaoInicial+cont).setValor(0);
        }
        return retorno;
    }
    public String toString(){
        return lista.toString();
    }
}