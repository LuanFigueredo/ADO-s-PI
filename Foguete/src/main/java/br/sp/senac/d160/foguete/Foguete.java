/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package br.sp.senac.d160.foguete;

/**
 *
 * @author luan.fsilva17
 */
public class Foguete {
    //Atributos
    private String modelo = "";
    private String cor = "";
    private static String marca ="SENAC";
    private long altitudeMetros = 0;
    
    //Contrutor
    public Foguete(){

    }
    
    public void setCor(String novaCor){
        this.cor = novaCor;
    }
    
    public String getCor(){
        return cor;
    }
    
    
    //Ações - Métodos
    public void decolar(){
        this.altitudeMetros = 50000;
    }
    
    public void pousar(){
        this.altitudeMetros = 0;
    }
}
