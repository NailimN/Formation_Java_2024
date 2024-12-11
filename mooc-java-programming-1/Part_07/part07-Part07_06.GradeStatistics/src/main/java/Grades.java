/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author milia
 */
public class Grades {
    
    private ArrayList<Integer> grades;
    
    public Grades(){
        this.grades = new ArrayList();
    }
    
    public ArrayList getGrades(){
        return grades;
    }
    
    public void addGrades(int point){
        grades.add(point);
    }
    
    public ArrayList<Integer> gradesFromPoints(ArrayList<Integer> points){
        for (int point : points){
            if (point >= 90){
                addGrades(5);
            } else if (point >= 80){
                addGrades(4);
            } else if (point >= 70){
                addGrades(3);
            } else if (point >= 60){
                addGrades(2);
            } else if (point >= 50){
                addGrades(1);
            } else {
                addGrades(0);
            }
        }
        return grades;
    }
    
    public void printGrades(ArrayList<Integer> points){
        gradesFromPoints(points);
        
        for (int i = 5; i > -1; i--){
            int count = 0;
            for (int grade : grades){
                if (grade == i){
                    count++;
                }
            }
            System.out.println(i + ": " + stars(count));
        }
    }
    
    public String stars(int numberOfStars){
        String stars = "";
        for (int i =0; i < numberOfStars; i++){
            stars = stars + "*";
        }
            
        return stars;
    }
}
