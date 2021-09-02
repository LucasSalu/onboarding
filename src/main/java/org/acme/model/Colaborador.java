package org.acme.model;

import lombok.Data;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
@Entity
@Table(name = "colaborador")
public class Colaborador {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idcolaborador;

	@Column(name = "nome", nullable = false)
	@Size(max = 45)
	@NotBlank
	private String nome;

	@Column(name = "matricula", nullable = false)
	@Size(max = 45)
	@NotBlank
	private String matricula;
}

