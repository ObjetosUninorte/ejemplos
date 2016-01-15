/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package aurorita;

/**
 *
 * @author Administrador
 */
public class Nota {
    
    private Estudiante estudiante;
    private Curso curso;
    private float valor;

    public Nota(Estudiante estudiante, Curso curso, float valor) {
        this.estudiante = estudiante;
        this.curso = curso;
        this.valor = valor;
    }

    public Estudiante getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(Estudiante estudiante) {
        this.estudiante = estudiante;
    }

    public Curso getCurso() {
        return curso;
    }

    public void setCurso(Curso curso) {
        this.curso = curso;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }
    
    
    
    
}
