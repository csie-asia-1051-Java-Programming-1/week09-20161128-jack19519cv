package ex;
/*
 * Topic: 設計一 class 包含下列資訊:學號、姓名、國文成績、英文成績、數學成績，
 並於主程式讓使用者輸入位學生的資料並根據平均成績由高至低輸出如下:
 ID    NAME     Chinese     English       Math        Avg
 * Date: 2016/11/28
 * Author: 105021059 王俊鑌
 */

import java.util.ArrayList;
import java.util.Scanner;
public class ex02 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		ArrayList <Student> studList = new ArrayList <Student>();
		studList.add(new Student(scn.next(),scn.next()));
		studList.get(1).show();

	}
	public class Student {
		
		private String id , name;
		private ArrayList <Course> courList = new ArrayList<Course>();
		public Student(String name1 , String id1){
			name = name1;
			id = id1;
		}
		public void show(){
			System.out.println("name:" + name);
			System.out.println("id:" + id);
		}

	}
	public class Course {

	}

}