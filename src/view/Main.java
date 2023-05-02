package view;

import controller.EscalonadorController;
import controllerFila.FilaObject;
import model.Processos;

public class Main {

	public static void main(String[] args) 
	{
		FilaObject fila = new FilaObject();
		
		fila.insert(new Processos("notepad.exe", 14));
		fila.insert(new Processos("write.exe", 35));
		fila.insert(new Processos("chrome.exe", 27));
		fila.insert(new Processos("acrobat.exe", 52));
		fila.insert(new Processos("firefox.exe", 18));
		fila.insert(new Processos("word.exe", 25));
		
		
		EscalonadorController escalonador = new EscalonadorController();
		
		escalonador.roundRobin(fila);
	}

}
