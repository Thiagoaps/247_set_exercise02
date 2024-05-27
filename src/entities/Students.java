package entities;

import java.util.Objects;

public class Students {
	
	private Integer studentID;

	public Students(Integer studentID) {
		this.studentID = studentID;
	}

	public Integer getStudentID() {
		return studentID;
	}

	public void setStudentID(Integer studentID) {
		this.studentID = studentID;
	}

	@Override
	public int hashCode() {
		return Objects.hash(studentID);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Students other = (Students) obj;
		return Objects.equals(studentID, other.studentID);
	}
}
