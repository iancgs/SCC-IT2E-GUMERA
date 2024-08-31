
package gumerae;

import java.util.Scanner;


public class Grade {
    
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
            gr[i].addGrades(id, name, p, m, pf, f);
        }
        
        double tca = 0;
        int passed = 0;
        int failed = 0;
        
        for(int i = 0; i < np; i++){
            gr[i].average = (gr[i].p+gr[i].m+gr[i].pf+gr[i].f)/4;
            tca += gr[i].average;
            
            gr[i].viewGrades();
            
            if(gr[i].average < 3.0){
                passed++;
            } else{
                failed++;
            }
        }
        System.out.println("--------------------------------------");
        System.out.println("No. of students: "+np);
        System.out.println("Total Class Average: "+tca/np);
        System.out.println("No. of Passed: "+passed);
        System.out.println("No. of Failed: "+failed);
    }
}
     