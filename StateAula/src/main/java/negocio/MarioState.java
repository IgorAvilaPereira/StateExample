package negocio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author iapereira
 */
public interface MarioState {
    public MarioState pegarCogumelo();
    public MarioState levarDano();
    public MarioState pegarPena();
    public MarioState pegarFlor();
    
}
