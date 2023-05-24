/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package apresentacao;

import negocio.Mario;

/**
 *
 * @author iapereira
 */
public class Main {

    public static void main(String[] args) {
        Mario mario = new Mario();
        System.out.println(mario.getEstado().getClass().getSimpleName());
        mario.pegarCogumelo();
        System.out.println(mario.getEstado().getClass().getSimpleName());
        mario.levarDano();
        System.out.println(mario.getEstado().getClass().getSimpleName());
        mario.levarDano();
        System.out.println(mario.getEstado().getClass().getSimpleName());
        mario.pegarCogumelo();
        System.out.println(mario.getEstado().getClass().getSimpleName());

    }
}
