/* Alunos:
            Fabrício Sanches Paranhos (201609626)
            Arthur Costa e Sousa      (201600713) */
package prova3;

public class Prova3 {

    public static void main(String[] args) {
        
        //Criar tarefas
        TarefaFatorial tarefa1 = new TarefaFatorial(9);
        TarefaFatorial tarefa2 = new TarefaFatorial(10);
        
        //Criar threads
        Thread t1 = new Thread(tarefa1);
        Thread t2 = new Thread(tarefa2);
        
        //Iniciar threads
        t1.start();
        t2.start();                
    }
    
}
