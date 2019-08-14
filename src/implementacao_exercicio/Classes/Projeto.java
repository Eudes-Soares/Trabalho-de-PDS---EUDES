/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package implementacao_exercicio.Classes;

/**
 * @author Eudes Soares Rumão
 * @author João Victor da Silva Dias
 * @version 1.3
 * @since 07 de agosto de 2019
 */
public class Projeto {
    
    //nome do Projeto
    public String nome;
    //nome do autor do projeto
    public String nome_do_autor;
    // descrição do da finalidade do projeto
    public String Descricao;
    //dias previsto para a finalização do projeto
    public int dias_para_finalizar;
    //identificador do projeto
    public int id;

    
   /** método usado retornar instanciar um objeto do tipo Cliente 
    * @author Eudes Soares Rumão
    * @param nome String - nome do projeto
    * @param nome_do_autor String - nome do autor
    * @param descricao String - descricao do projeto
    * @param dias_para_finalizar int - dias restantes para a finalização do projeto
    * @param id int - identificador do projeto
    */
    public Projeto(String nome, String nome_do_autor, String Descricao, int dias_para_finalizar, int id) {
        this.nome = nome;
        this.nome_do_autor = nome_do_autor;
        this.Descricao = Descricao;
        this.dias_para_finalizar = dias_para_finalizar;
        this.id = id;
    }
    
    /** método usado retornar os dados do Projeto, retornando o nome, nome do autor, descrição  e osdia para finalizar
    * @author Eudes Soares Rumã0
    */
    public String mostrarDados(){
        return this.nome+","+this.nome_do_autor+","+this.Descricao+",Dias para finalizar: "+this.faltaDias(15);
    }
    
    /** método usado para calcular quantos em quantos dias o Projeto estará pronto
    * @author Eudes Soares Rumão
    * @param dias_passados int - quantidade de tempo em dias que o projeto foi inicializado
    * @return int - retorna os dias previstos para a finalização do Projeto
    */
    public int faltaDias(int dias_passados){
        return this.dias_para_finalizar-dias_passados;
    }
        
   /** método usado para mostrar os recursos disponíveis para a execução do programa
    * @author Eudes Soares Rumão
    *
    */
    public String recursos(){
        return "os recursos disponiveis são: GitHub, Oracle Db";
    }
}
