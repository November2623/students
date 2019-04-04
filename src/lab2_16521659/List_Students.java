/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_16521659;
import java.util.ArrayList;
import java.util.Scanner;
/**
 *
 * @author tranngocduy
 */
public class List_Students {
    private int num_students;
    ArrayList<Student> students = new ArrayList<Student>();
    public void inputNumberStudent(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number students in list:");
        this.num_students = scanner.nextInt();
    }
    public void creareStudentList(){
        for(int i = 1;i<=this.num_students;i++){
            Student st = new Student("Unknow","Unknow",0);
            System.out.println("Student "+i+"");
            st.input();
            students.add(st);
        }
    }
    public void printStudentList(){
        for(Student st:students){
            st.output();
        }
    }
    public Student getHighestScoce(){
        Student best_st = students.get(0);
        float temp = students.get(0).getScore();
        for(Student st:students){
            if(st.getScore()>=temp){
                temp = st.getScore();
                best_st = st;
            }
        }
        return best_st;
    }
    public Student findStudent(String name){
        for(Student st:students){
            if(st.getName().equals(name)){
                return st;
            }     
        }
        return null;
    }
    
    public Student findStudentId(String id){
        for(Student st:students){
            if(st.getId().equals(id)){
                return st;
            }
        }
        return null;
    }
    public void deleteStudentID(String id){
       Student st = findStudentId(id);
       if(st !=null){
           students.remove(st);
           System.out.print("Deleted");
       }
       else{
           System.out.print("No data to delete");
       }
    }
    public void printListGoodStudent(){
        for(Student st: students){
            if(st.getScore()>= 5){
                st.output();
            }
        }
    }
    public void sortList(){
        for(int i =0;i< num_students-1;i++){
            for(int j = 0; j< num_students-i-1; j++){
                if(students.get(j).getScore() > students.get(j+1).getScore()){
                    Student temp = students.get(j);
                    students.set(j,students.get(j+1));
                    students.set(j+1, temp);
                    
                }
            }
        }
            
    }
    public void insertList(Student st){
        int flag = -1;
        for(int i =0;i < num_students; i++){
            if(st.getScore() < students.get(i).getScore()){
                System.out.print(i);
                students.add(i, st);
                flag = 0;
  
            }
        }
        if(flag == -1){
            students.add(st);
        }
    }
//        
    
}
