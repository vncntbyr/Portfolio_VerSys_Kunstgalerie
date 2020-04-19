package dhbwka.wwi18b2.portfolio.vincent.bayer.Kunstausstellung;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.Data;

/*
 * Persistence-Entity für ein Gemälde
 */
@Entity
@Data
public class Gemaelde implements Serializable {

	@ManyToOne
        private Kunstgalerie kunstgalerie;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@NotNull
	private long id;
	 
	@Column(length = 64)
        @Size(min = 1, max = 64, message = "Der Künstlername muss zwischen einem und 64 Zeichen lang sein.")
        @NotNull(message = "Es muss einen Künstler geben, das Feld darf nicht leer sein.")
        private String kuenstler = "";
	
	@NotNull(message = "Das Jahr darf nicht leer sein.")
         private int jahr = 0;
	
	@Column(length = 64) //Bedeutet, dass für die Datenspeicherung die Maximallänge der Spalte 64 Zeichen ist
	@Size(min = 1, max = 64, message = "Der Name muss zwischen einem und 64 Zeichen lang sein.")
	@NotNull(message = "Der Name darf nicht leer sein.")
	private String name = "";
	
	@NotNull(message = "In den Ausstellungen wird nichts verschenkt, der Kaufpreis darf nicht leer sein!")
	private int preis = 0;	
	
}
