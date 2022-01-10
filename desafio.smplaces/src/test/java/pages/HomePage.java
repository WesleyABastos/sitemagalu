package pages;

import elements.Elementos;

public class HomePage {

	Metodos metodos = new Metodos();
	Elementos element = new Elementos();

	public void menu(String menu) {

		menu.equalsIgnoreCase("opções do Menu");

		metodos.clicar(element.celulares);
		metodos.clicar(element.selecao1);
		metodos.pausa(3000);
		metodos.clicar(element.adcsacola);
		metodos.pausa(3000);
		metodos.clicar(element.continuar);
		metodos.pausa(3000);
		metodos.clicar(element.comprarmais);
		metodos.pausa(3000);

		// Informática

		metodos.clicar(element.informatica);
		metodos.pausa(3000);
		metodos.clicar(element.ofertasdia);
		metodos.pausa(3000);
		metodos.clicar(element.adcsacola);
		metodos.pausa(3000);
		metodos.clicar(element.continuar);
		metodos.pausa(3000);
		metodos.clicar(element.comprarmaispc);
		metodos.pausa(3000);

		// "TV e Vídeo"

		metodos.clicar(element.tvevideo);
		metodos.pausa(3000);
		metodos.clicar(element.ofdia);
		metodos.pausa(3000);
		metodos.clicar(element.adcsacola);
		metodos.pausa(3000);
		metodos.clicar(element.continuar);
		metodos.pausa(3000);

	}

}
