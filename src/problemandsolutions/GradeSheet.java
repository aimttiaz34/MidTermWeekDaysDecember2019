package problemandsolutions;

import java.util.Scanner;

public class GradeSheet {
    // Write a Java program that determines a student’s grade.
    //The program will read three types of scores(quiz, mid-term, and final scores) and determine the grade based on
    // the following rules:
    //- if the average score >=90% =>grade=A
    //- if the average score >= 70% and <90% => grade=B
    //- if the average score>=50% and <70% =>grade=C
    //- if the average score<50% =>grade=F
    //
    //See the example output below:
    //
    //Quiz score: 80
    //
    //Mid-term score: 68
    //
    //Final score: 90
    //
    //Your grade +70

    public static void main(String[] args) {
        double quiz;
        double midTerm;
        double FinalScore;
        double score;

    Scanner sc = new Scanner(System.in);
        System.out.println("Enter your quiz score ");
        quiz=sc.nextDouble();
        System.out.println("Enter your midterm score ");
        midTerm=sc.nextDouble();
        System.out.println("Enter your final score");
        FinalScore=sc.nextDouble();
         score=(quiz+midTerm+FinalScore)/3;
         if(score>=90){
             System.out.println("Your grade is A");
         }else if(score>=70){
             System.out.println("Your grade is B");
         }else if (score>=50){
             System.out.println("your grade is C");
         }else{
             System.out.println("your grade is F");
         }

    }

}
