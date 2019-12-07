public class Student 
{
	private int facNum;
	private String name;
	
	public Student(int facNum, String name)
	{
		this.facNum = facNum;
		this.name = name;
	}
	
	public Student(Student other)
	{
		this.facNum = other.facNum;
		this.name = other.name;
	}
	
	void SetFacNum(int facNum)
	{
		this.facNum = facNum;
	}
	
	void SetName(String name)
	{
		this.name = name;
	}
	
	void PrintStudent()
	{
		System.out.println("facNum : " + facNum + " name : " + name + '\n');
	}	
}
