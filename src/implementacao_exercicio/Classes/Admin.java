/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao_exercicio.Classes;

/**
 *
 * @author Eudes Soares Rumão
 * @author João Victor da Silva Dias
 * @version 2.5
 * @since 07 de agosto de 2019
 * Classe usada para a criação de um administrador do sistema
 * nova atualização: 14-08-2019
 */
public class Admin extends Pessoa {
    
    /**
     * @author Eudes Soares Rumão
     * método usado para criar um adiministrado do sistema
     * @param email String - email do administrador
     * @param endereco String - endereçõ do administrador
     * @param idade int - idade do administrador
     * @param nome String - nome do administrador
     * @param senha String - senha do administrador
     */
    public Admin(String nome, int idade, String endereco, String email, String senha) {
        super(nome, idade, endereco, email, senha);
    }
    /**
     * realiza a subtração de dois números e imprime o resultado
     * @param r int - número a ser retirado uma quantidade
     * @param s int - quantidade a ser retirada
     * @author Eudes Soares Rumão
     */
     public void naosei(int r, int s){
         System.out.println("a subtração é: "+(r-s));
     }
     
     
     /**
      * @author Eudes Soares Rumão
      * @author João Victor da Silva Dias
      * método usado para saber se o tamanho de uma palavra é maior 09 letras ou menor que 11 letras
      * @param g String - palavra passada como parâmetro
      */
     public void testando(String g){
         if(g.length()>=10){
             System.out.println("a palavra "+g+"contém mais de/ou 10(dez) letras");
         } else{
             System.out.println("a palavra "+g+"contém menos de 10 letras");
         }
     } 
     
     /**
      * @author Eudes Soares Rumão
      * imprime as regras do uso do sistema
      */
     public static void algumacoisanadaimportante(){
         System.out.println("esse método era pra conter as regras em que o nosso "
                 + "sistema regeorém por falta de tempo use da maneira que vc quiser, sem regras...");
     }
    
}
