/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package senajava;

/**
 *
 * @author aluno
 */
public class Senajava {

  public static void main(String[] args) {
    //variaveis (logo, letra minúscula) declaradas e com valores atribuidos
    //variaveis do tipo inteiro
    short  variavelDoTipoShort = 10;
    int variavelDoTipoInt = 10;
    long variavelDoTipoLong = 10;
    //inteiros pequenos = variavel byte
    byte variavelDoTipoByte = 10;
    
    
    //variavel do tipo ponto flutuante ou real
    float variavelDoTipoReal = 134.444f;
    double variavelDoTipoDouble = 32131231232.123123123d;
    
    
    ///tipo logico
    boolean variavelDoTipoLogica = true;
    
    //variavel do tipo caracter
    char variavelDoTipoCaracter = ('a');
    
    //string é uma classe (logo, letra maiúscula), a palavra é nome da variavel ou nome do objeto
    // objeto do tipo string, que possui ações possui caracteristicas
    String palavra = "class do tipo String";
    
    if (variavelDoTipoShort == 10) {
        // System é também é uma classe, começa com letra maiúscula
            System.out.println("hello there bunch of dumbasses");
            System.out.println("esta variavel é do tipo short: " + variavelDoTipoShort);
            System.out.println("esta variavel é do tipo int: " + variavelDoTipoInt);
            System.out.println("esta variavel é do tipo long: " + variavelDoTipoLong);
            System.out.println("esta variavel é do tipo byte: " + variavelDoTipoByte);
            System.out.println("esta variavel é do tipo double: " + variavelDoTipoDouble);
            System.out.println("esta variavel é do tipo boolean: " + variavelDoTipoLogica);
            System.out.println("esta variavel é do tipo char: " + variavelDoTipoCaracter);
            System.out.println("esta variavel é do tipo float: " + variavelDoTipoReal);
            System.out.println("esta variavel é do tipo String: " +  palavra);
    }    
}
