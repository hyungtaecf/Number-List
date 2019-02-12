public class Numero
{
    private int valor;
    
    public Numero(int valor){
        this.valor = valor;
    }
    public int getValor(){ return valor; }
    public void setValor(int valor){
        this.valor = valor;
    }
    public String toString(){
        return valor + "";
    }
}