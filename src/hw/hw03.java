package hw;
/*
 * Topic: 設計Student與course 兩個 class，Student Class包含下列資訊:學號、姓名與課程(Course)，Course的class包含 課程名稱、課程代號、課程分數、授謀老師、學分數，並於主程式讓使用者輸入位學生的資料及修課資料，並根據平均成績由高至低輸出這些同學的資料
 * Date: 2016/11/28
 * Author: 1050210XX 周永振老師
 */
import java.util.ArrayList;

public class hw03 {

	public static void main(String[] args) {
		ArrayList<student> studList = new
				ArrayList<student>();
		studList.add (new student("David,1899");
				studList.get(1).showInfo();
				studList.get(1).addCourse("程式1","1050807");
	           studList.get(1).showInfo();
		}
		public class student{
			private String id,name;
			private ArrayList<Course>couList = new ArrayList<Course>();
			public student(String name1,String id1){
				name=name1; id=id1;
				
			}
			public void showInfo(){
			System.out.println("name"+name);
			System.out.println("id"+id);
			System.out.println("# of course"+couList.size());
			for(int i=0;i<couList.size();i++){
				System.out.println("course name"+couList.get(i).getName());
			}
			
			}
			public void addCourse(String name1,String id1){
				
				couList.add(new Course(name1,id1));
				
				
			}
			public class Course{
				private  String couName,couID,teacher;
				private int score;
				public Course(String name1,String id1){
					name=name1;id=id1;
					
				}
				public String getName(){
					return name;
					
				}
				
				
			}
			
			
		}

}
