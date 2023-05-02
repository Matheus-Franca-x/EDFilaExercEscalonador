package controller;

import controllerFila.FilaObject;
import model.Processos;

public class EscalonadorController 
{
	
	public EscalonadorController()
	{
		super();
	}
	
	public void roundRobin(FilaObject fila)
	{
		while (!fila.filaVazia())
		{
			Processos process = null;
			
			try {
				process = (Processos) fila.remove();
			} catch (Exception e) {
				e.printStackTrace();
			}
			process.decrementRtr();
			if(process.getQtdRetornos() > 1)
			{
				fila.insert(process);
				System.out.println("Process " + process.getNome() + " loading - retornos restante: " + process.getQtdRetornos());
			}
			else
			{
				System.out.println("Process " + process.getNome() + " encerrado.");
			}
			
		}
	}
	
}
