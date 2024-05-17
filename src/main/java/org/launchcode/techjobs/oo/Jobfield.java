package org.launchcode.techjobs.oo;
import java.util.Objects;


 abstract class JobField {

    private int id;
    private static int nextId = 1;
    private String value;

    // Constructor that takes a String parameter
    public JobField(String value) {
        this.value = value;
        id = nextId;
        nextId++;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    // Custom toString, equals, and hashCode methods
    @Override
    public String toString() {
        return value;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        JobField jobField = (JobField) o;
        return id == jobField.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
