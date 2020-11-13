package cisc3130Lab6;
//Jason Li
//CISC3130 Katherine Chuang
//Lab 6 Due November 15th 2020
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Lab6 {
	public static void showGrade(int totalGrade, PrintWriter outputWriter) { // Shows current state of grades
		int neededGrade=0;
			if(totalGrade <60) {
				neededGrade=60-totalGrade;
				System.out.println("Current Grade :  F needs "+neededGrade +" more points for a D");
				outputWriter.println("Current Grade :  F needs "+neededGrade +" more points for a D");
			}
			if(totalGrade>=60 && totalGrade<70) {
				neededGrade=70-totalGrade;
				System.out.println("Current Grade :  D needs "+neededGrade +" more points for a C");
				outputWriter.println("Current Grade :  D needs "+neededGrade +" more points for a C");
			}
			if(totalGrade>=70 && totalGrade<80) {
				neededGrade=80-totalGrade;
				System.out.println("Current Grade :  C needs "+neededGrade +" more points for a B");
				outputWriter.println("Current Grade :  C needs "+neededGrade +" more points for a B");
			}
			if(totalGrade>=80 && totalGrade<90) {
				neededGrade=90-totalGrade;
				System.out.println("Current Grade :  B needs "+neededGrade +" more points for a A");	
				outputWriter.println("Current Grade :  B needs "+neededGrade +" more points for a A");
			}
			if(totalGrade>=90 && totalGrade<=100) {
				System.out.println("Current Grade :  A");
				outputWriter.println("Current Grade :  A");
			}
	}

	public static void main(String[]args) throws FileNotFoundException {
		Scanner keyboard=new Scanner(System.in);
		File outPut= new File(("D:\\JavaFile\\Lab6 Output Files\\Lab6 Output"));
		PrintWriter outputWriter = new PrintWriter(outPut);
		int[] grades=new int[4];
		int i=0;
		System.out.println("Enter the current total grade of your Lab assignment.(-1 to finish)");
		outputWriter.println("Enter the current total grade of your Lab assignment.(-1 to finish)");
		int answer= keyboard.nextInt();
		outputWriter.println(answer);
		
		while(answer!=-1) {
			grades[i]=answer;
			i++;
			
			System.out.println("Enter the total grade of your Practice Problem assignment.(-1 to finish)");
			outputWriter.println("Enter the total grade of your Practice Problem assignment.(-1 to finish)");
			answer= keyboard.nextInt();
			outputWriter.println(answer);
			grades[i]=answer;
			i++;
			
			System.out.println("Enter the total grade of your Midterm Exams.(-1 to finish)");
			outputWriter.println("Enter the total grade of your Midterm Exams.(-1 to finish)");
			answer= keyboard.nextInt();
			outputWriter.println(answer);
			grades[i]=answer;
			i++;
			
			System.out.println("Enter the total grade or desired grade of your Final Exam .(-1 to finish)");
			outputWriter.println("Enter the total grade or desired grade of your Final Exam.(-1 to finish)");
			answer= keyboard.nextInt();
			outputWriter.println(answer);
			grades[i]=answer;
			
			answer=-1;
			
		}
		System.out.println("Lab Grade: "+grades[0]);
		outputWriter.println("Lab Grade: "+grades[0]);
		
		System.out.println("Practice Problem Grade: "+grades[1]);
		outputWriter.println("Practice Problem Grade: "+grades[1]);
		
		System.out.println("Midterm Exams Grade: "+grades[2]);
		outputWriter.println("Midterm Exams Grade: "+grades[2]);
		
		System.out.println("Final Exam Grade: "+grades[3]);
		outputWriter.println("Final Exam Grade: "+grades[3]);
		
		int totalGrade=0;
		for (i=0;i<=3;i++) {
			totalGrade=totalGrade+grades[i];
		}
		System.out.println("Our total grade " +totalGrade);
		outputWriter.println("Our total grade " +totalGrade);
		
		showGrade(totalGrade,outputWriter);
		keyboard.close();
		outputWriter.close();
		
	}
}
