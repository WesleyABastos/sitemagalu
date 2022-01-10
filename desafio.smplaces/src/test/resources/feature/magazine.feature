#Author: wesley.avilla@hotmail.com

@testesregressivos
Feature: carrinho e checkout magalu
  Eu como usuario quero acessar o site da magazine luiza para compras

  @adicaoprodutos
  Scenario: como cliente quero adicionar produtos no carrinho
    Given que acesse o site "https://www.magazineluiza.com.br/"
    When escolher os produtos desejados
    Then no carrinho sao apresentados os produtos escolhidos

  @alterarquantidade
  Scenario: como cliente quero fazer alterações no carrinho
    Given que esteja no carrinho de compras
    When realizar a alteracao das quantidades dos itens
    Then carrinho apresentara as novas quantidades de produtos
    
  @excluirproduto
  Scenario: como cliente quero excluir produtos do carrinho
    Given que queira desistir de um item
    When clicar para excluir
    Then produto sera retirado do carrinho

@quantidadeevaloresdocarrinho
  Scenario: como cliente quero alterar carrinho
    Given que esteja no carrinho
    When aumentar as quantidades da compra
    Then validar as quantidades e valores alterados
        
  @login
  Scenario: como cliente quero fazer login para finalizar a compra
    Given que tenha feito a escolha dos itens
    When clicar em continuar
    Then sera direcionado para tela de login e cadastro     
