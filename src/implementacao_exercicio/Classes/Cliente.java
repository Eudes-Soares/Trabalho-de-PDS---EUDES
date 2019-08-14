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
 * @version 0.2
 * @since 07 de agosto de 2019
 */
public class Cliente extends Pessoa{
 
    
    /*variável usada para armazenar os projetos do cliente*/
    public Projeto projetos[];
    
    
    
    /* método usado para excluir projetos do clientes, atraves de um número passado (posição do projeto no vetor) 
    * @author Eudes Soares Rumão
    * @param MiProjects[] Projeto - vetor contendo os projetos do cliente
    * @param numprojeto int - número usado na identificação do projeto em que o cliente deseja fazer uma alteração
    */
    public void excluirProjetos(Projeto MiProjets[], int numProjeto){
        
        if(MiProjets[numProjeto]!=null){
            MiProjets[numProjeto]= null;
        }else{
            System.out.println("esse projeto nao existe mais!!!");
        }
        
    }
    
    /** método usado para adicionar projetos do clientes 
    * @author João Victor da Silva Dias
    * @param p Projeto - projeto que será adicionado 
    */
    public void addProjeto(Projeto p){
        int x = this.projetos.length;
        projetos[x] = p;
    }
    
    
    
    /** método usado retornar todos os projetos que o cliente possui 
    * @author Eudes Soares Rumão
    * @return Projeto[] - projetos do cliente
    */
    public Projeto[] retornarProjetos(){
        return this.projetos;
    }

    
    
    
    /** método usado retornar instanciar um objeto do tipo Cliente 
    * @author Eudes Soares Rumão
    * @param projetos Projeto[] - projetos do cliente
    * @param nome String - nome do cliente
    * @param idade int - idade do cliente
    * @param endereco String - endereço do cliente
    * @param email String - email do cliente
    * @param senha String - senha do cliente
    */
    public Cliente(Projeto[] projetos, String nome, int idade, String endereco, String email, String senha) {
        super(nome, idade, endereco, email, senha);
        this.projetos = projetos;
    }
    
    
    
}
