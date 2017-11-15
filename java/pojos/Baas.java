package pojos;

import javax.persistence.*;




@Entity(name="Baas")
public class Baas {

	
	
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	int id;
	
	@Column(length= 30, nullable = false)
	String naam;
	
	String hobby;

	
	
	public Baas() {
	}
	



	public Baas(int id, String naam, String hobby) {
		this.id = id;
		this.naam = naam;
		this.hobby = hobby;
	}




	public int getId() {
		return id;
	}
	public String getNaam() {
		return naam;
	}
	public void setId(int id) {
		this.id = id;
	}
	public void setNaam(String naam) {
		this.naam = naam;
	}
	@Override
	public String toString() {
		return "Baas [id=" + id + ", naam=" + naam + "]";
	}
	
}
