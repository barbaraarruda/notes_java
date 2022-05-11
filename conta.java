
/**
 *
 * @author Barbara
 */
public class Conta {
    
    private int numero;
    private Pessoa correntista;
    private float saldo;
    
    public Conta(){
        
    }
    public Conta(int numero, Pessoa correntista, float valor){
       //aqui temos a sobrecarga de métodos, são dois métodos, a diferença é que este segundo possui argumentos. 
       this.setNumero(numero);
       this.setCorrentista(correntista);
       this.setSaldo(valor);
       
    }
    
    public void setNumero(int numero){
        this.numero = numero;
    }
    
    public int getNumero (){
        return this.numero;
        
    }

    public Pessoa getCorrentista() {
        return correntista;
    }

    public void setCorrentista(Pessoa correntista) {
        this.correntista = correntista;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }
    
    
    
}
