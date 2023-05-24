/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class MarioPequeno implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        return new MarioGrande();
    }

    @Override
    public MarioState levarDano() {
        return new MarioMorto();
    }

    @Override
    public MarioState pegarPena() {
        return new MarioCapa();
    }

    @Override
    public MarioState pegarFlor() {
        return new MarioFogo();
    }
    
}
