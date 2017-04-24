package br.gov.mec.aghu.model;

// Generated 14/09/2010 17:49:55 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MpmItemCuidadoSumario generated by hbm2java
 */
@Entity
@Table(name = "MPM_ITEM_CUIDADO_SUMARIOS", schema = "AGH")

public class MpmItemCuidadoSumario extends BaseEntityId<MpmItemCuidadoSumarioId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3576882364231095535L;
	private MpmItemCuidadoSumarioId id;
	private MpmTipoFrequenciaAprazamento tipoFreqAprazamento;
	private MpmCuidadoUsual cuidadoUsual;
	private MpmItemPrescricaoSumario itemPrescricaoSumario;
	private Integer frequencia;
	private String descricao;

	public MpmItemCuidadoSumario() {
	}

	public MpmItemCuidadoSumario(MpmItemCuidadoSumarioId id,
			MpmTipoFrequenciaAprazamento tipoFreqAprazamento,
			MpmCuidadoUsual cuidadoUsual,
			MpmItemPrescricaoSumario itemPrescricaoSumario) {
		this.id = id;
		this.tipoFreqAprazamento = tipoFreqAprazamento;
		this.cuidadoUsual = cuidadoUsual;
		this.itemPrescricaoSumario = itemPrescricaoSumario;
	}

	public MpmItemCuidadoSumario(MpmItemCuidadoSumarioId id,
			MpmTipoFrequenciaAprazamento tipoFreqAprazamento,
			MpmCuidadoUsual cuidadoUsual,
			MpmItemPrescricaoSumario itemPrescricaoSumario,
			Integer frequencia, String descricao) {
		this.id = id;
		this.tipoFreqAprazamento = tipoFreqAprazamento;
		this.cuidadoUsual = cuidadoUsual;
		this.itemPrescricaoSumario = itemPrescricaoSumario;
		this.frequencia = frequencia;
		this.descricao = descricao;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "ituSeq", column = @Column(name = "ITU_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 5, scale = 0)) })
	public MpmItemCuidadoSumarioId getId() {
		return this.id;
	}

	public void setId(MpmItemCuidadoSumarioId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TFQ_SEQ", nullable = false)
	public MpmTipoFrequenciaAprazamento getTipoFreqAprazamento() {
		return this.tipoFreqAprazamento;
	}

	public void setTipoFreqAprazamento(MpmTipoFrequenciaAprazamento tipoFreqAprazamento) {
		this.tipoFreqAprazamento = tipoFreqAprazamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CDU_SEQ", nullable = false)
	public MpmCuidadoUsual getCuidadoUsual() {
		return this.cuidadoUsual;
	}

	public void setCuidadoUsual(MpmCuidadoUsual cuidadoUsual) {
		this.cuidadoUsual = cuidadoUsual;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ITU_SEQ", nullable = false, insertable = false, updatable = false)
	public MpmItemPrescricaoSumario getItemPrescricaoSumario() {
		return this.itemPrescricaoSumario;
	}

	public void setItemPrescricaoSumario(MpmItemPrescricaoSumario itemPrescricaoSumario) {
		this.itemPrescricaoSumario = itemPrescricaoSumario;
	}

	@Column(name = "FREQUENCIA", precision = 5, scale = 0)
	public Integer getFrequencia() {
		return this.frequencia;
	}

	public void setFrequencia(Integer frequencia) {
		this.frequencia = frequencia;
	}

	@Column(name = "DESCRICAO", length = 240)
	@Length(max = 240, message="A descrição possui mais de 240 caracteres.")
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		MpmItemCuidadoSumario other = (MpmItemCuidadoSumario) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}
	
	public enum Fields {
		ID("id"),
		TIPO_FREQ_APRAZAMENTO("tipoFreqAprazamento"),
		CUIDADO_USUAL ("cuidadoUsual"),
		ITEM_PRESCRICAO_SUMARIO("itemPrescricaoSumario"),
		FREQUENCIA ("frequencia"),
		DESCRICAO ("descricao");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

}
