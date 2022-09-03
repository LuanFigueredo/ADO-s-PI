/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.sp.senac.d160.foguete;

/**
 *
 * @author luan.fsilva17
 */
public class FabricaFoguetes {
    
    public static void main(String[] args){
        Foguete foguete1 = new Foguete();
        foguete1.setCor("branco");
        
        
        Foguete foguete2 = new Foguete();
        foguete2.setCor("preto");
        
        System.out.println(foguete1.getCor());
        System.out.println(foguete2.getCor());
        
    }
    
}
