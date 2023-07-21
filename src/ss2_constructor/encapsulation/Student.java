package ss2_constructor.encapsulation;

import java.util.Scanner;

public class Student {
    private int id;
    public String name;
    private double score;

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getId() {
        return id;
    }

    public double getScore() {
        return score;
    }

    public void setScore(double score) {
        if(score < 0 || score > 10) {
            //Ném ra ngoại lệ =>
            System.out.println("Điểm không hợp lệ!");
        } else {
            this.score = score;
        }
    }
}
