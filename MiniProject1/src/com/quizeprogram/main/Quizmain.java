package com.quizeprogram.main;

import java.sql.SQLException;
import java.util.Scanner;
import com.quizprogram.selectdata.RetriveQuizdata;
import com.quizprogram.studentdata.InsertDataToDB;


public class Quizmain {

	public static void main(String[] args) throws SQLException
	{
		//call retrive class
		Scanner sc1 = new Scanner(System.in);
		System.out.println("Enter the student name :- ");
		String nameOfStudent = sc1.next();
		InsertDataToDB insert = new InsertDataToDB();
		insert.insertData(nameOfStudent);
		String gradeOfStudent = "";
		RetriveQuizdata retrieve=new RetriveQuizdata();
		retrieve.selectquizdata();
		if(retrieve.mark >= 8 && retrieve.mark <= 10) {
			System.out.println(gradeOfStudent = "A");
		}else if(retrieve.mark >= 6 && retrieve.mark <= 8) {
			System.out.println(gradeOfStudent = "B");
		}else if(retrieve.mark == 5) {
			System.out.println(gradeOfStudent = "C");
		}else if(retrieve.mark < 5) {
			System.out.println(gradeOfStudent = "Fail");
		}
		
	insert.insertData1(nameOfStudent, retrieve.mark, gradeOfStudent);
	}

		
}
