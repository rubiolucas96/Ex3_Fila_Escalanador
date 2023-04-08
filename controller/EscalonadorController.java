package controller;

import br.edu.fateczl.filaobj.Fila;

public class EscalonadorController {
    
    public void escalonador(Fila filaProcessos) {
        int quantum = 10; // valor do quantum, pode ser alterado
        while (!filaProcessos.isEmpty()) {
            try {
                // remove o primeiro processo da fila
                String[] processoStr = ((String) filaProcessos.remove()).split(";");
                String nomeProcesso = processoStr[0];
                int qtdeRetornos = Integer.parseInt(processoStr[1]);
                
                // imprime o processo sendo executado e a quantidade de retornos restantes
                System.out.println("Executando " + nomeProcesso + ", retornos restantes: " + qtdeRetornos);
                
                // decrementa a quantidade de retornos do processo
                qtdeRetornos--;
                
                if (qtdeRetornos > 0) {
                    // se o processo ainda tem retornos restantes, insere novamente na fila
                    filaProcessos.insert(nomeProcesso + ";" + qtdeRetornos);
                } else {
                    // se não, processo é finalizado
                    System.out.println(nomeProcesso + " finalizado.");
                }
                
                // aguarda o tempo do quantum antes de executar o próximo processo
                Thread.sleep(quantum * 100);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    
}
