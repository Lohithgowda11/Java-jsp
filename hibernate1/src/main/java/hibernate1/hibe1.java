package hibernate1;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class hibe1 {
	@Id
	private int Id;
	private String Name;
	private long Number;

	public int getId() {
		return Id;
	}

	public void setId(int Id) {
		this.Id = Id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public long getNumber() {
		return Number;
	}

	public void setNumber(long number) {
		Number = number;
	}

}
