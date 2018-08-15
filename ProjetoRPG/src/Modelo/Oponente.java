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
    private String nome_op;
    private int vida_op;
    private int ataque_op;
    private String classe_op;

    public Oponente(String nome_op, int Vida_op, int ataque_op, String classe_op) {
        this.nome_op = nome_op;
        this.vida_op = Vida_op;
        this.ataque_op = ataque_op;
        this.classe_op = classe_op;
    }

    public String getNome_op() {
        return nome_op;
    }

    public void setNome_op(String nome) {
        this.nome_op = nome;
    }

    public int getVida_op() {
        return vida_op;
    }

    public void setVida_op(int vida_op) {
        this.vida_op = vida_op;
    }

    public int getAtaque_op() {
        return ataque_op;
    }

    public void setAtaque_op(int ataque_op) {
        this.ataque_op = ataque_op;
    }

    public String getClasse_op() {
        return classe_op;
    }

    public void setClasse_op(String classe_op) {
        this.classe_op = classe_op;
    }
    
    
}

