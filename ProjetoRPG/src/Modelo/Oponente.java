/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author dmdullius
 */
public class Oponente {
    private String nome;
    private int vida;
    private int ataque_op;
    private int classe;

    public Oponente(String nome, int vida, int ataque_op) {
        this.nome = nome;
        this.vida = vida;
        this.ataque_op = ataque_op;
        this.classe = classe;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque_op() {
        return ataque_op;
    }

    public void setAtaque_op(int ataque_op) {
        this.ataque_op = ataque_op;
    }

    public int getClasse() {
        return classe;
    }

    public void setClasse(int classe) {
        this.classe = classe;
    }
    
    
}

