package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * RapPppAtendimento generated by hbm2java
 */
@Entity
@Table(name = "RAP_PPP_ATENDIMENTOS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = { "ser_matricula",
		"ser_vin_codigo", "data", "natureza", "tipo", "atd_nome" }))
public class RapPppAtendimento extends BaseEntityId<RapPppAtendimentoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7813354756787689876L;
	private RapPppAtendimentoId id;
	private Integer version;
	private RapServidores rapServidores;
	private Date data;
	private String natureza;
	private String tipo;
	private String origem;
	private Integer atdSeq;
	private String descricao;
	private String atdNome;

	public RapPppAtendimento() {
	}

	public RapPppAtendimento(RapPppAtendimentoId id, RapServidores rapServidores, Date data, String natureza, String tipo) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.data = data;
		this.natureza = natureza;
		this.tipo = tipo;
	}

	public RapPppAtendimento(RapPppAtendimentoId id, RapServidores rapServidores, Date data, String natureza, String tipo,
			String origem, Integer atdSeq, String descricao, String atdNome) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.data = data;
		this.natureza = natureza;
		this.tipo = tipo;
		this.origem = origem;
		this.atdSeq = atdSeq;
		this.descricao = descricao;
		this.atdNome = atdNome;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "serMatricula", column = @Column(name = "SER_MATRICULA", nullable = false)),
			@AttributeOverride(name = "serVinCodigo", column = @Column(name = "SER_VIN_CODIGO", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public RapPppAtendimentoId getId() {
		return this.id;
	}

	public void setId(RapPppAtendimentoId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false, insertable = false, updatable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA", nullable = false, length = 29)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "NATUREZA", nullable = false, length = 3)
	@Length(max = 3)
	public String getNatureza() {
		return this.natureza;
	}

	public void setNatureza(String natureza) {
		this.natureza = natureza;
	}

	@Column(name = "TIPO", nullable = false, length = 2)
	@Length(max = 2)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "ORIGEM", length = 1)
	@Length(max = 1)
	public String getOrigem() {
		return this.origem;
	}

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	@Column(name = "ATD_SEQ")
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	@Column(name = "DESCRICAO", length = 20)
	@Length(max = 20)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "ATD_NOME", length = 20)
	@Length(max = 20)
	public String getAtdNome() {
		return this.atdNome;
	}

	public void setAtdNome(String atdNome) {
		this.atdNome = atdNome;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		DATA("data"),
		NATUREZA("natureza"),
		TIPO("tipo"),
		ORIGEM("origem"),
		ATD_SEQ("atdSeq"),
		DESCRICAO("descricao"),
		ATD_NOME("atdNome");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof RapPppAtendimento)) {
			return false;
		}
		RapPppAtendimento other = (RapPppAtendimento) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}