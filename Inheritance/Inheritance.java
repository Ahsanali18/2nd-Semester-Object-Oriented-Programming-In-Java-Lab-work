package SirMohsin;

class Studentt{
	String studentName;
	String studentAdress;
	String studentContactNumber;
	
	Studentt(String studentName, String studentAdress, String studentContactNumber){
		this.studentName=studentName;
		this.studentAdress=studentAdress;
		this.studentContactNumber=studentContactNumber;
	}
}
class SchoolStudent extends Studentt{
	String schoolName;
	String schoolType;
	
	SchoolStudent( Studentt s,String schoolName, String schoolType){
		super(s.studentName,s.studentAdress,s.studentContactNumber);
		this.schoolName=schoolName;
		this.schoolType=schoolType;
	}
}
class CollageStudent extends Studentt{
	String collageName;
	String collageGroup;
	String collageType;
	
	CollageStudent(Studentt s, String collageName, String collageGroup, String collageType){
		super(s.studentName,s.studentAdress,s.studentContactNumber);
		this.collageName=collageName;
		this.collageGroup=collageGroup;
		this.collageType=collageType;
	}
}
class UniversityStudent extends Studentt{
	String universityName;
	String universityType;
	String universityDepartment;
	
	UniversityStudent(Studentt s,String uniName, String uniType, String universityDepartment){
		super(s.studentName,s.studentAdress,s.studentContactNumber);
		this.universityName=uniName;
		this.universityType=uniType;
		this.universityDepartment=universityDepartment;
	}
}
public class Inheritance {

	public static void main(String[] args) {
	Studentt student= new Studentt("Ahsan", "Default Address", "X9293993");
	SchoolStudent schoolstd= new SchoolStudent(student,"CityModel","Private");
	CollageStudent collagestd= new CollageStudent(student,"MMTNS", "P.E", "Public");
	UniversityStudent universitystd= new UniversityStudent(student,"Mehran", "Public","SW");
	
	System.out.println("----------------- Student Management System -----------------");
	System.out.println("Student Name: "+student.studentName+"\nStudent Adress: "+student.studentAdress
						+"\nStudent contactNumber: "+student.studentContactNumber+"\n");
	System.out.println("*-*-*-*-*-* Student School Data *-*-*-*-*-*"+"\nStudent School Name: "+schoolstd.schoolName
						+"\nType of School: "+schoolstd.schoolType+"\n");
	System.out.println("*-*-*-*-*-* Student Collage Data *-*-*-*-*-*"+"\nStudent Collage Name: "+collagestd.collageName
					   +"\nCollage Group: "+collagestd.collageGroup+"\nType of Collage: "+collagestd.collageType+"\n");
	System.out.println("*-*-*-*-*-* Student University Data *-*-*-*-*-*"
	+"\nStudent University Name: "+universitystd.universityName+"\nUniversity Type: "+universitystd.universityType
	+"\nUniversity Department: "+universitystd.universityDepartment);
	}
}
