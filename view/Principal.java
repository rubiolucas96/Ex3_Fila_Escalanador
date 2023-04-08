package view;

import br.edu.fateczl.filaobj.Fila;
import controller.EscalonadorController;

public class Principal {

    public static void main(String[] args) {
        Fila filaProcessos = new Fila();
        filaProcessos.insert("notepad.exe;14");
        filaProcessos.insert("write.exe;35");
        filaProcessos.insert("chrome.exe;27");
        filaProcessos.insert("acrobat.exe;52");
        filaProcessos.insert("firefox.exe;18");
        filaProcessos.insert("word.exe;25");
        
        EscalonadorController escalonadorController = new EscalonadorController();
        escalonadorController.escalonador(filaProcessos);
    }

}
