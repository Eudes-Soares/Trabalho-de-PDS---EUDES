/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao_exercicio.Classes;

import java.util.Date;
import javax.swing.JOptionPane;

/**
 *
 * @author Eudes Soares Rumão
 * @author João Victor da Silva Dias
 * @version 2.445-09
 * @since 07 de agosto de 2019
 * Classe Pessoa usada poara instânciar um objeto Pessoa
 */
public class Pessoa {
    
    //nome da pessoa
    public String nome;
    //idade da pessoa
    public int idade;
    //endereco da pessoa
    public String endereco;
    //email da pessoa
    public String email;
    //senha da pessoa
    public String senha;

    
    /** método usado para instânciar um objeto Pessoa
    * @author João Victor da Silva Dias
    * @author Eudes Soares Rumão
    * @param nome String - nome da pessoa
    * @param idade int - idade da pessoa
    * @param endereco String - endereço da pessoa
    * @param email String - email da pessoa
    * @param senha String - senha da pessoa
    */
    public Pessoa(String nome, int idade, String endereco, String email, String senha) {
        this.nome = nome;
        this.idade = idade;
        this.endereco = endereco;
        this.email = email;
        this.senha = senha;
    }
    
    
   /** método usado para mudar a senha da Pessoa
    * @author Eudes Soares Rumão
    * @param senha String - nova senha da pessoa
    * verifica se a nova senha não é nula, igual a espaço em branco ou se tem menos de 08 caracteres, caso não seja o sistema autera a senha sa Pessoa
    */
    public void mudarsenha(String senha){
        if(senha==null|| senha.equals("")||senha.length()<8){
            JOptionPane.showMessageDialog(null,"sua senha não pode receber esses valores","Error", JOptionPane.ERROR_MESSAGE);
        } else {
            this.senha = senha;
        }
    }
    
   /** método usado retornar od dados de uma Pessoa, retornando o nome, endereço, email e a sua idade
    * @author João Victor da Silva Dias
    *
    */
    public String retornarDados(){
        return this.nome+","+this.endereco+","+this.email+","+this.idade;
    }
    
   /**método usado para retornar a data atual
    * @author João Victor da Silva Dias
    * @return Date - retorna a data atual 
    */
    public Date dataAtual(){
        return new Date();
    }
    
   
}
