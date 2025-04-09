/*Atividade de criação de tabuada para aula de lógica de programação
Professor: Celso Furtado
Data: 02/04/2025
*/

package br.dev.kauan.tabuada;

import javax.swing.JFrame;

import br.dev.kauan.tabuada.gui.TelaTabuada;
import br.dev.kauan.tabuada.model.Tabuada;

public class Main {
	
	public static void main(String[] args) {
		System.out.println("Hello Word");
		TelaTabuada tela = new TelaTabuada();
		tela.criarTela("Tabuadas DS1MA");
		
	}

}
