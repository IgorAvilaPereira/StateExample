/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package negocio;

/**
 *
 * @author iapereira
 */
public class MarioMorto implements MarioState {

    @Override
    public MarioState pegarCogumelo() {
        return this;
    }

    @Override
    public MarioState levarDano() {
                return this;

    }

    @Override
    public MarioState pegarPena() {
                return this;

    }

    @Override
    public MarioState pegarFlor() {
                return this;

    }

  
    
}
