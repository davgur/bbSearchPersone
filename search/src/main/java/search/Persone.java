package search;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Persone implements Serializable, IPersoneEntity {
	public Persone(String name, String translit, String telephone, String carNumber, PersoneStatusEnum status) {
		super();
		this.name = name;
		this.translit = translit;
		this.telephone = telephone;
		this.carNumber = carNumber;
		this.status = status;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	public String name;

	public String translit;

	public String telephone;

	public String carNumber;

	public PersoneStatusEnum status;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTranslit() {
		return translit;
	}

	public void setTranslit(String translit) {
		this.translit = translit;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getCarNumber() {
		return carNumber;
	}

	public void setCarNumber(String carNumber) {
		this.carNumber = carNumber;
	}

	public PersoneStatusEnum getStatus() {
		return status;
	}

	public void setStatus(PersoneStatusEnum status) {
		this.status = status;
	}

}
