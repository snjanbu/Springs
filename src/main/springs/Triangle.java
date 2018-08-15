package main.springs;

class Triangle {
	
	String type;
	
	String degree;
	
	public Triangle(String type,String degree) {
		this.type=type;
		this.degree=degree;
	}
	
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getDegree() {
		return degree;
	}

	public void draw() {
		System.out.println(getType() +"Triangle Drawn of degree "+getDegree());
	}
}
