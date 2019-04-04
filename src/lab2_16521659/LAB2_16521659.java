/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab2_16521659;

/**
 *
 * @author tranngocduy
 */
public class LAB2_16521659 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        List_Students list = new List_Students();
        list.inputNumberStudent();
        list.creareStudentList();
        list.printStudentList();
        System.out.print("The Highest Score Student");
        Student best_student = list.getHighestScoce();
        best_student.output();
        System.out.println("Find a student with name");
        Student find_student = list.findStudent("Duy");
        if(find_student != null){
         find_student.output();
        }
        else{
          System.out.println("No result");
        }
        System.out.println("Find a student with id");
        Student find_studentId= list.findStudentId("123");
         if(find_studentId != null){
         find_studentId.output();
        }
        else{
          System.out.println("No result");
        }
        System.out.println("Delete a student");
        list.deleteStudentID("123");
        System.out.println("Print good student");
        list.printListGoodStudent();
        System.out.println("Sort list student");
        list.sortList();
        list.printStudentList();
        System.out.println("Insert a student");
        Student st1 = new Student("4","Ngan", 7);
        list.insertList(st1);
        list.printStudentList();
    } 
    
}
