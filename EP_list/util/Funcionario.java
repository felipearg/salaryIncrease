package util;


public class Funcionario {
    
	private String id;
	private String name;
	private double salary;

	public Funcionario() {
	}

	public Funcionario(String id, String name, double salary) {
		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}
	public void increaseSalary(int porcentage) {
		salary += (porcentage * salary/100.00);
	}

	@Override
	public String toString() {
		return "Funcionario [id=" + id + ", name=" + name + ", salary=" + salary + "]";
	}
	
    

}
