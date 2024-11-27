package mypackage;

// subject id,name,maxmarks, maxmarksobtained

 
 

public class subjects {
	  String subid;
	 String subname;
	 int maxMarks;
	 int marksObtained;
	 //property methods get--read setter -write
	 public   subjects( String subid, String subname) {
		 this.subid=subid;
		 this.subname=subname;
	 }
	 public  	String getsubid() {
		 
		 
		 return subid;
	 }
public  	String getsubname() {
		
		 return subname;
	 }

public void setmaxMarks(int m) {
	 maxMarks=m;
	
	
}
public String toString() {
			
			String d = "\n SubjectID: "+subid+"\n Name "+subname+"\n MarksObtained "+maxMarks;
 return d;
		 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		subjects c=new subjects( "ssab",  "maths");
		c.setmaxMarks(50);
		System.out.println(c);
		
	}

}
