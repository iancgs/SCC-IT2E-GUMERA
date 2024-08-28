
package gumerae;

import java.util.Scanner;


public class Gradesss {
    
     public void getGrades(){
    
    Scanner sc = new Scanner(System.in);
    
    Grades[] gr = new Grades[100];
    
        System.out.println("Enter no. of student:");
        int np = sc.nextInt();
    for(int  i=0; i < np; i++){
         
         System.out.println("Enter details of student");
         System.out.println("ID: ");
         int id = sc.nextInt();
         
        System.out.println("Name:");
        String name = sc.next();
        
        System.out.println("Prelim:");
        double p = sc.nextDouble();
        
        System.out.println("Midterm:");
        double m = sc.nextDouble();
        
        System.out.println("Prefinal:");
        double pf =sc.nextDouble();
        
        System.out.println("Final:");
        double f =sc.nextDouble();
        
       gr[i] = new Grades();
       gr[i] .addGrade(id, name, p, m, pf, f.);
       
  
}
     