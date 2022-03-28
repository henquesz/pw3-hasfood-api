package br.com.etechoracio.hasfoodapi.entity;


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
public class Entrega {
	@Id

	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name = "ID_ENTREGA")
	private Long id;
	
	@Column(name = "TX_NOME_CLIENTE")
	private String nome_cliente;
	
	@Column(name = "TX_ENDERECO")
	private String endereco;
	
	@Column(name = "ID_PEDIDO")
	private Long id_pedido;
}
