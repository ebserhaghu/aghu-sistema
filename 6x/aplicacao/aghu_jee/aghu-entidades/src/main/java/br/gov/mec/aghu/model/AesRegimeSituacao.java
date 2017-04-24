package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AesRegimeSituacao generated by hbm2java
 */
@Entity
@Table(name = "AES_REGIMES_SITUACAO", schema = "AGH")
public class AesRegimeSituacao extends BaseEntityId<AesRegimeSituacaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1178210866067580831L;
	private AesRegimeSituacaoId id;
	private Integer version;
	private AesTipoRegime aesTipoRegime;
	private AesSituacaoEscala aesSituacaoEscala;
	private Float fator;
	private String indCalculaSeHistorico;
	private Short baseCalculo;

	public AesRegimeSituacao() {
	}

	public AesRegimeSituacao(AesRegimeSituacaoId id, AesTipoRegime aesTipoRegime, AesSituacaoEscala aesSituacaoEscala,
			Float fator, String indCalculaSeHistorico) {
		this.id = id;
		this.aesTipoRegime = aesTipoRegime;
		this.aesSituacaoEscala = aesSituacaoEscala;
		this.fator = fator;
		this.indCalculaSeHistorico = indCalculaSeHistorico;
	}

	public AesRegimeSituacao(AesRegimeSituacaoId id, AesTipoRegime aesTipoRegime, AesSituacaoEscala aesSituacaoEscala,
			Float fator, String indCalculaSeHistorico, Short baseCalculo) {
		this.id = id;
		this.aesTipoRegime = aesTipoRegime;
		this.aesSituacaoEscala = aesSituacaoEscala;
		this.fator = fator;
		this.indCalculaSeHistorico = indCalculaSeHistorico;
		this.baseCalculo = baseCalculo;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "treCodigo", column = @Column(name = "TRE_CODIGO", nullable = false, length = 3)),
			@AttributeOverride(name = "sesSeq", column = @Column(name = "SES_SEQ", nullable = false)) })
	public AesRegimeSituacaoId getId() {
		return this.id;
	}

	public void setId(AesRegimeSituacaoId id) {
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
	@JoinColumn(name = "TRE_CODIGO", nullable = false, insertable = false, updatable = false)
	public AesTipoRegime getAesTipoRegime() {
		return this.aesTipoRegime;
	}

	public void setAesTipoRegime(AesTipoRegime aesTipoRegime) {
		this.aesTipoRegime = aesTipoRegime;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SES_SEQ", nullable = false, insertable = false, updatable = false)
	public AesSituacaoEscala getAesSituacaoEscala() {
		return this.aesSituacaoEscala;
	}

	public void setAesSituacaoEscala(AesSituacaoEscala aesSituacaoEscala) {
		this.aesSituacaoEscala = aesSituacaoEscala;
	}

	@Column(name = "FATOR", nullable = false, precision = 8, scale = 8)
	public Float getFator() {
		return this.fator;
	}

	public void setFator(Float fator) {
		this.fator = fator;
	}

	@Column(name = "IND_CALCULA_SE_HISTORICO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndCalculaSeHistorico() {
		return this.indCalculaSeHistorico;
	}

	public void setIndCalculaSeHistorico(String indCalculaSeHistorico) {
		this.indCalculaSeHistorico = indCalculaSeHistorico;
	}

	@Column(name = "BASE_CALCULO")
	public Short getBaseCalculo() {
		return this.baseCalculo;
	}

	public void setBaseCalculo(Short baseCalculo) {
		this.baseCalculo = baseCalculo;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		AES_TIPOS_REGIME("aesTipoRegime"),
		AES_SITUACOES_ESCALA("aesSituacaoEscala"),
		FATOR("fator"),
		IND_CALCULA_SE_HISTORICO("indCalculaSeHistorico"),
		BASE_CALCULO("baseCalculo");

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
		if (!(obj instanceof AesRegimeSituacao)) {
			return false;
		}
		AesRegimeSituacao other = (AesRegimeSituacao) obj;
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