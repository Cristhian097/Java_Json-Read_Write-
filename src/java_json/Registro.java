/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package java_json;

/**
 *
 * @author Otis
 */
public class Registro {
    private String codigo;
    private String materia;
    private String estudiante;
    private double corte1;
    private double corte2;
    private double corte3;
    private double porcentaje1;
    private double porcentaje2;
    private double porcentaje3;

    public Registro(String codigo, String materia, String estudiante, double corte1, double corte2, double corte3, double porcentaje1, double porcentaje2, double porcentaje3) {
        this.codigo = codigo;
        this.materia = materia;
        this.estudiante = estudiante;
        this.corte1 = corte1;
        this.corte2 = corte2;
        this.corte3 = corte3;
        this.porcentaje1 = porcentaje1;
        this.porcentaje2 = porcentaje2;
        this.porcentaje3 = porcentaje3;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public String getEstudiante() {
        return estudiante;
    }

    public void setEstudiante(String estudiante) {
        this.estudiante = estudiante;
    }

    public double getCorte1() {
        return corte1;
    }

    public void setCorte1(double corte1) {
        this.corte1 = corte1;
    }

    public double getCorte2() {
        return corte2;
    }

    public void setCorte2(double corte2) {
        this.corte2 = corte2;
    }

    public double getCorte3() {
        return corte3;
    }

    public void setCorte3(double corte3) {
        this.corte3 = corte3;
    }

    public double getPorcentaje1() {
        return porcentaje1;
    }

    public void setPorcentaje1(double porcentaje1) {
        this.porcentaje1 = porcentaje1;
    }

    public double getPorcentaje2() {
        return porcentaje2;
    }

    public void setPorcentaje2(double porcentaje2) {
        this.porcentaje2 = porcentaje2;
    }

    public double getPorcentaje3() {
        return porcentaje3;
    }

    public void setPorcentaje3(double porcentaje3) {
        this.porcentaje3 = porcentaje3;
    }
        
    

}


