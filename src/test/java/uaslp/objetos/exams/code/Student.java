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
        return average/3;
    }


    public void setScore(int parcial, int calificacion) {
        score=calificacion;
        average=score+average;
        this.parcial=parcial;
    }
}
