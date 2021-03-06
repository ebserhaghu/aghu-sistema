package br.gov.mec.aghu.model;

// Generated 24/02/2010 18:52:08 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.validation.constraints.NotNull;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MamTrgAlergias generated by hbm2java
 */
@Entity
@Table(name = "MAM_TRG_ALERGIAS", schema = "AGH")
public class MamTrgAlergias extends BaseEntityId<MamTrgAlergiasId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1406543638620404452L;
	private MamTrgAlergiasId id;
	private MamTriagens mamTriagens;
	private String descricao;
	private Integer pacCodigo;
	private String micNome;
	private Date criadoEm;
	private Integer serMatricula;
	private Short serVinCodigo;

	public MamTrgAlergias() {
	}

	public MamTrgAlergias(MamTrgAlergiasId id, MamTriagens mamTriagens,
			String descricao, Integer pacCodigo, Date criadoEm, Integer serMatricula,
			Short serVinCodigo) {
		this.id = id;
		this.mamTriagens = mamTriagens;
		this.descricao = descricao;
		this.pacCodigo = pacCodigo;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	public MamTrgAlergias(MamTrgAlergiasId id, MamTriagens mamTriagens,
			String descricao, Integer pacCodigo, String micNome, Date criadoEm,
			Integer serMatricula, Short serVinCodigo) {
		this.id = id;
		this.mamTriagens = mamTriagens;
		this.descricao = descricao;
		this.pacCodigo = pacCodigo;
		this.micNome = micNome;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "trgSeq", column = @Column(name = "TRG_SEQ", nullable = false, precision = 14, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 4, scale = 0)) })
	@NotNull
	public MamTrgAlergiasId getId() {
		return this.id;
	}

	public void setId(MamTrgAlergiasId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TRG_SEQ", nullable = false, insertable = false, updatable = false)
	public MamTriagens getMamTriagens() {
		return this.mamTriagens;
	}

	public void setMamTriagens(MamTriagens mamTriagens) {
		this.mamTriagens = mamTriagens;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 2000)
	@NotNull
	@Length(max = 2000)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "MIC_NOME", length = 50)
	@Length(max = 50)
	public String getMicNome() {
		return this.micNome;
	}

	public void setMicNome(String micNome) {
		this.micNome = micNome;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	@NotNull
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA", nullable = false, precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	public enum Fields {
		PAC_CODIGO("pacCodigo"),
		TRG_SEQ("id.trgSeq"),
		SEQP("id.seqp"),
		DESCRICAO("descricao");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
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
		if (!(obj instanceof MamTrgAlergias)) {
			return false;
		}
		MamTrgAlergias other = (MamTrgAlergias) obj;
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
