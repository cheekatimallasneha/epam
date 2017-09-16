import java.util.Date;
public class Main {

	public static void main(String[] args) {
StudentGroup a1=new StudentGroup(3);
Student m1=new Student(601,"sneha",new Date(1996,9,25),60.4);
Student m2=new Student(602,"sweety",new Date(1995,8,26),70.4);
Student m3=new Student(603,"sweet",new Date(1998,7,27),60.3);
a1.addFirst(m1);
a1.setStudent(m2,1);

a1.setStudent(m3,2);

ShowUser(m1);
ShowUser(m2);
ShowUser(m3);

}
		public static void ShowUser(Student men)
{
System.out.println("\n\n id:"+men.getId());

System.out.println("\n\n name:"+men.getFullName());


	

}
}