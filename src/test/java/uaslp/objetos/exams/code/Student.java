package uaslp.objetos.exams.code;

import java.util.List;

public class Student {
    private String Nombre;
    private int clave;
    private int score;
    private double average;
    private int parcial;

    public Student(String nombre, int clave) {
        Nombre=nombre;
        this.clave=clave;
    }

    public int getCode() {
        return clave;
    }

    public String getName()
    {
        return Nombre;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public void setScore(int parcial, int calificacion) {
        score=calificacion;
        this.parcial=parcial;
    }
}
