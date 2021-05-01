package banco;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private boolean status;
    
    public Conta(){ // constructor
        saldo = 0;
        status = false;
    }
    //metodos
    public abrirConta(String t){
        setTipo(t);
        setStatus(true);
        if (t = "CC"){
            setSaldo(50);
        } else (t = "CP"){
            setSaldo(150);
        }
    }
    
    public fecharConta(){
        if (saldo>0){
            System.out.println("Conta com dinheiro");
        } else if (saldo<0){
            System.out.println("Conta em debito");
        } else{
            setStatus(false);
        }
    }
    
    public depositar(int v){
        if (status = true){
            setSaldo(getSaldo() + v);
        } else{
            System.out.println("Conta desativada");
        }
    }
    
    public sacar (int v){
        if (getStatus()) {
            if (getSaldo()>v){
                setSaldo(getSaldo() - v);
            } else{
            System.out.println("Saldo insuficiente");
        }else{
                System.out.println("Impossivel sacar, conta desativada");
                }
    }

    public pagtoMensal(){
    int v;
    if (getTipo() = "CC"){
        v = 15;
    }else(getTipo() = "CP"){
        v = 20;
    }
    if (getStatus() = true){
        if (getSaldo()>v){
            saldo = getSaldo() - v;
        } else{
            System.out.println("Saldo insuficiente");
        }
    }
    }
        
    //setter e getter
    public int setNumConta(int n){
        numConta = n;
    }
    public int getNumConta(){
        return numConta;
    }
    
    public String setTipo(String t){
        tipo = t;
    }
    public String getTipo(){
        return tipo;
    }
    
    public String setDono(String s){
        dono = s;
    }
    public String getDono(){
        return dono;
    }
    
    public double setSaldo(double ss){
        saldo = ss;
    }
    public double getSaldo(){
        return saldo;
    }
    
    public boolean setStatus(boolean stt){
        status = stt;
    }
    public boolean getStatus(){
        return status;
    //fim setter e getter
    }
    }
