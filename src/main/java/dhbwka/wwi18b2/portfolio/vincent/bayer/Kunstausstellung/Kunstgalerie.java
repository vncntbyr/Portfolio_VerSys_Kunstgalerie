package dhbwka.wwi18b2.portfolio.vincent.bayer.Kunstausstellung;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

/*
 * Persistence-Entity für eine Kunstgalerie
 */
@Entity
@Data
public class Kunstgalerie implements Serializable {
	
	@Id
	@NotNull
	private String id = "";
	
	@NotNull(message = "Der Ort darf nicht leer sein.")
	private String ort = "";
	
	@Size(min = 1, max = 69, message = "Es können nur maximal 69 Exponate ausgestellt werden. Die Anzahl muss also zwischen 1 und 69 liegen")
	@NotNull(message = "Die Anzahl der Exponate darf nicht leer sein, eine Kunstausstellung ohne Exponate lohnt sich nicht!")
	private int exponate = 0;
	
	@OneToMany(mappedBy="kunstgalerie")
    private List<Gemaelde> gemaelde = new ArrayList<>();
	
	/*
	 * Standard-Konstruktor
	 */
	Kunstgalerie() {
		
	}
}
