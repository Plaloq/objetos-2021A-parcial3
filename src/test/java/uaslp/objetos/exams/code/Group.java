package uaslp.objetos.exams.code;

import java.util.List;

public class Group {
    private int size;
    private double averageGroup;
    private int capacity;

    public Group(int capacity) {
        this.capacity = capacity;
    }

    public void addStudent(String nombre, int clave )
    {

        size++;
    }
    public List<Student> getStudents()
    {
        return null;
    }

    public int getCapacity()
    {
        return capacity;
    }

    public int getAvailability()
    {
        return capacity-size;
    }

    public double getAverage() {
        for(int i=0; i<size; i++)
            averageGroup=getAverage()+averageGroup;
        return averageGroup;
    }

    public void addStudent(Student name) {

    }
}
