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
 * @version 0.3
 * @since 14 de agosto de 2019
 * Classe Pessoa usada poara instânciar um objeto Nadacomnada
 */
public class Nadacomnada {
    //atributo nada
    public String nada;
    //atributo nadadenovo
    public int nadadenovo;
    //atributo nadenovooutravez
    public String nadadenovooutravez;
    
    
    /**
     * @author Eudes Soares Rumão
     * imprime nada
    */
    public static void mostrarnadab(){
        System.out.println("");
        System.out.println("b");
    }
    /**
     * @author Eudes Soares Rumão
     * imprime uma mensagem de boas vinda ao mundo!
     */
    public static void olamundo(){
        System.out.println("Olá mundo cruel...");
    }
    
    /**
     * método que contém uma verdade absoluta
     * @return String - retorna uma verdade "Java é o poder"
     * @author Eudes Soares Rumão
     */
    public String verdades(){
        return "Java é o poder!!! ;)";
    }

    
    /**
     *método usado para a criação de um objeto do tipo Nadacomnada
     * @param nada String - nada
     * @param nadadenovo int - nada mesmo
     * @param nadadenovooutravez String - já disse que não era nada
     * @author Eudes Soares Rumão
     */
    public Nadacomnada(String nada, int nadadenovo, String nadadenovooutravez) {
        this.nada = nada;
        this.nadadenovo = nadadenovo;
        this.nadadenovooutravez = nadadenovooutravez;
    }

}
