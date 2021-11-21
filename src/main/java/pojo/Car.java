package pojo;

import com.google.gson.annotations.Expose;

public class Car extends Entity {
    private String name;
    private String state;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                ", state='" + state + '\'' +
                '}';
    }
}