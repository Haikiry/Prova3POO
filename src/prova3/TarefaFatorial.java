package prova3;

public class TarefaFatorial implements Runnable {
    
    private final int _valor;

    public TarefaFatorial(int v) { this._valor = v; }
        
    @Override
    public void run() {
        double resultado = fatorial(_valor);
        System.out.println("Fatorial "+_valor+": "+resultado);
    }

    public double fatorial(int valor1) {
        int fat = 1;
        
        for(int i = 2; i <= valor1; i++)
            fat *= i;
        
        return fat;
    }
}
