package one.digitalinnovation.example.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;
import javax.persistence.Id;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable=false)
	private String firstName;
	
	@Column(nullable=false)
	private String lastName;
	
	@Column(nullable=false, unique=true)
	private String cpf;
	
	@SuppressWarnings("unused")
	private LocalDate birthDate;
	
	@OneToMany(fetch = FetchType.LAZY,cascade =  {CascadeType.PERSIST, CascadeType.MERGE, CascadeType.REMOVE })			
	private List<Phone> phones; 
	
	
	
	
}
