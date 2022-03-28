package br.com.etechoracio.hasfoodapi.entity;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "TBL_PEDIDO")
public class pedido {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID_PEDIDO")
	private Long id;
	
	@Column(name = "DT_PEDIDO")
	private LocalDate date;
	
	@Column(name = "TX_STATUS")
	private String status;
	
	@Column(name = "ID_RESTAURANTE")
	private Long id_restaurante;
}
