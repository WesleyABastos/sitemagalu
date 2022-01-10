package tests;

import java.io.IOException;

import elements.Elementos;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.HomePage;
import pages.Metodos;

public class Steps {

	Metodos metodos = new Metodos();
	Elementos element = new Elementos();
	HomePage home = new HomePage();

	@Given("que acesse o site {string}")
	public void que_acesse_o_site(String site) {

		metodos.abrirNavegador(site);
		metodos.clicar(element.cookies);

	}

	@When("escolher os produtos desejados")
	public void escolher_os_produtos_desejados() {

		home.menu("opções do Menu");
		metodos.escrever(element.cep, "01310200");
		metodos.pausa(4000);
	}

	@Then("no carrinho sao apresentados os produtos escolhidos")
	public void no_carrinho_sao_apresentados_os_produtos_escolhidos() throws IOException {

		metodos.screenShot("CT-01 Carrinho de compras");
		metodos.pausa(3000);
	}

	@Given("que esteja no carrinho de compras")
	public void que_esteja_no_carrinho_de_compras() {

		metodos.validarTitle("Sacola de compras - Magazine Luiza");
		metodos.pausa(3000);
	}

	@When("realizar a alteracao das quantidades dos itens")
	public void realizar_a_alteracao_das_quantidades_dos_itens() {

		metodos.escrever(element.produto01, "2");
		// metodos.submit(element.produto01);
		metodos.pausa(3000);
		metodos.escrever(element.produto02, "3");
		// metodos.submit(element.produto02);
		metodos.pausa(5000);
	}

	@Then("carrinho apresentara as novas quantidades de produtos")
	public void carrinho_apresentara_as_novas_quantidades_de_produtos() throws IOException {

		metodos.screenShot("CT-02 Quantidades de produtos alterados");
		metodos.pausa(3000);
	}

	@Given("que queira desistir de um item")
	public void que_queira_desistir_de_um_item() {

		metodos.validarTitle("Sacola de compras - Magazine Luiza");
		metodos.pausa(3000);
	}

	@When("clicar para excluir")
	public void clicar_para_excluir() {

		metodos.clicar(element.excluirprod);
		metodos.pausa(5000);

	}

	@Then("produto sera retirado do carrinho")
	public void produto_sera_retirado_do_carrinho() throws IOException {

		metodos.screenShot("CT-03 Produto excluido da sacola");
		metodos.pausa(5000);
	}

	@Given("que esteja no carrinho")
	public void que_esteja_no_carrinho() {

		metodos.validarTitle("Sacola de compras - Magazine Luiza");
		metodos.pausa(3000);
	}

	@When("aumentar as quantidades da compra")
	public void aumentar_as_quantidades_da_compra() {

		metodos.escrever(element.produto01, "2");
		// metodos.submit(element.produto01);
		metodos.pausa(3000);
		metodos.escrever(element.produto02, "3");
		// metodos.submit(element.produto02);
		metodos.pausa(5000);
	}

	@Then("validar as quantidades e valores alterados")
	public void validar_as_quantidades_e_valores_alterados() throws IOException {

		metodos.screenShot("CT-04 Quantidades e valores Alterados no carrinho");
		metodos.pausa(3000);
	}

	@Given("que tenha feito a escolha dos itens")
	public void que_tenha_feito_a_escolha_dos_itens() {

		metodos.validarTitle("Sacola de compras - Magazine Luiza");
		metodos.pausa(3000);
	}

	@When("clicar em continuar")
	public void clicar_em_continuar() {

		metodos.clicar(element.contparafinalizar);
		metodos.pausa(4000);
	}

	@Then("sera direcionado para tela de login e cadastro")
	public void sera_direcionado_para_tela_de_login_e_cadastro() throws IOException {

		metodos.screenShot("CT-05 Tela de identificação");
		metodos.pausa(1000);
		metodos.fecharNavegador("encerrando teste");
	}
}
