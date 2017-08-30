package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class testSelectCourse {

	public List selectcourse;
	
	public testSelectCourse() {

       this.selectcourse = new ArrayList();
	}
	
	public void add()
	{
		Course c1 = new Course(1, "java 语言");
		selectcourse.add(c1);
		Course temp1 = (Course)(selectcourse.get(0));
		System.out.println("课程id是： " + temp1.id + " "+"所选的课程是：" + temp1.name );
		
		Course c2 = new Course(2, "高等数学");
		selectcourse.add(c2);
		Course temp2 = (Course)selectcourse.get(1);
		System.out.println("课程id是： " + temp2.id + " "+"所选的课程是：" + temp2.name );
		
		Course[] cs = {new Course(3, "大学英语"),new Course(4, "大学语文")};
		selectcourse.addAll(0, Arrays.asList(cs));
		Course  temp3 = (Course)selectcourse.get(0);
		Course  temp4 = (Course)selectcourse.get(1);
		System.out.println("课程id是： " + temp3.id + " "+"所选的课程是：" + temp3.name );
		System.out.println("课程id是： " + temp4.id + " "+"所选的课程是：" + temp4.name );
	}
	
	public void testcours()
	{
		System.out.println("可以选择的课程如下：");
		
		int size = selectcourse.size();
		for(int i = 0 ; i < size; i++)
		{
			Course cs = (Course)selectcourse.get(i);
		    System.out.println(cs.id + " " + cs.name);
		}
		
	}
	public void testIterator()
	{
		Iterator it = selectcourse.iterator();
		System.out.println("可以选择的课程如下(Iterator)：");
		while (it.hasNext()) {
			Course cs = (Course) it.next();
			 System.out.println(cs.id + " " + cs.name);
			
		}
	}
	public void foreach()
	{
		System.out.println("可以选择的课程如下(foreach)：");
		for(Object obj : selectcourse)
		{
			Course cs = (Course) obj;
			System.out.println(cs.id + " " + cs.name);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		testSelectCourse tsc = new testSelectCourse();
		tsc.add();
		tsc.testcours();
		tsc.testIterator();
		tsc.foreach();
	}

}
