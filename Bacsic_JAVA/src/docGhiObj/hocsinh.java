package docGhiObj;

import java.io.Serializable;

import kethua.Person.Person;

public class hocsinh implements Serializable 
		private String   studentID;
		private int      studentyears;
		private int      unitRecord;
		private String	 qualification;
		private float	 tution;

		public Student(String studentID, int studentyears, int unitRecord, String qualification,float tution) {
			this.studentID = studentID;
			this.studentyears = studentyears;
			this.unitRecord = unitRecord;
			this.qualification = qualification;
			this.tution      = tution;
		}
		
		public String getStudentID() {
			return studentID;
		}
		public void setStudentID(String studentID) {
			this.studentID = studentID;
		}
		public int getStudentyears() {
			return studentyears;
		}
		public void setStudentyears(int studentyears) {
			this.studentyears = studentyears;
		}
		public int getUnitRecord() {
			return unitRecord;
		}
		public void setUnitRecord(int unit) {
			this.unitRecord = unit;
		}
		
		public String getQualification() {
			return qualification;
		}

		public void setQualification(String qualification) {
			this.qualification = qualification;
		}

		public float getTution() {
			return tution;
		}

		public void setTution(float tution) {
			this.tution = tution;
		}

		public void showInfo() {
			String str1 = "Student ID :" + studentID + "\nStudent year : " + studentyears 
					     + "\nUnit Recorded : " + unitRecord + "\nQualified : " + qualification  + "\nTution : " +  tution;
			System.out.println(str1);
		}
	
		public String toString() {
			String str2 ="Student ID:" + studentID +"/Year Class :" + studentyears + "/UnitRecord" + unitRecord +
			 "/Qualification:"+ qualification + "/Tution:" + tution + "]";
			System.out.println(str2);
			return str2;
		}
		
	}

}
