/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_16521659;
import java.util.Scanner;
/**
 *
 * @author tranngocduy
 */
public class Student {
    private String id;
    private String name;
    private float score;
    public Student(String id, String name, float score){
        this.id = id;
        this.name = name;
        this.score = score;
    }
    public void input(){
       Scanner scanner = new Scanner(System.in);
       System.out.print("Enter the id:");
       this.id = scanner.nextLine();
       System.out.print("Enter the name:");
       this.name = scanner.nextLine();
       System.out.print("Enter the score:");
       this.score = scanner.nextFloat();
    }
    public void output(){
        System.out.println(this.id + "\t" + this.name + "\t" + this.score);
    }

    public String getId() {
        return id;
    }
    

    public String getName() {
        return name;
    }

    public float getScore() {
        return score;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setScore(float score) {
        this.score = score;
    }
    
}

