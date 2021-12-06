package ProblemsonMap;

public class EntityTeacher {
	
	private String name;
	private String subject;
	
	
	@Override
	public String toString() {
		return " [ name = " + name + ", subject=" + subject + "]";
	}
	
	public EntityTeacher(String name, String subject) {
		super();
		this.name = name;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	@Override
	public int hashCode() {
		int result = 1;
		result = name.hashCode()+subject.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		EntityTeacher details = (EntityTeacher) obj;
		if(details.getName().equals(name) && details.getSubject().equals(subject))
			return true;
		return false;
	}

	//@Override
	/*public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((subject == null) ? 0 : subject.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		EntityTeacher other = (EntityTeacher) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (subject == null) {
			if (other.subject != null)
				return false;
		} else if (!subject.equals(other.subject))
			return false;
		return true;
	}*/
	
	
	
	
	
	

}
