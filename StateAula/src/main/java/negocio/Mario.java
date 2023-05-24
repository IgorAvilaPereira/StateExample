package negocio;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author iapereira
 */
public class Mario  {
    private MarioState estado;

    public Mario() {
        this.estado = new MarioPequeno();
    }

    public MarioState getEstado() {
        return estado;
    }

    public void setEstado(MarioState estado) {
        this.estado = estado;
    }


    

    public void pegarCogumelo() {
        this.estado = this.estado.pegarCogumelo();
    }

    public void levarDano() {
        this.estado = this.estado.levarDano();

    }

    public void pegarPena() {
        this.estado = this.estado.pegarPena();

    }

    public void pegarFlor() {
        this.estado = this.estado.pegarFlor();
    }
}
