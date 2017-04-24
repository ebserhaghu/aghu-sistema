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
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * PdtCidDesc generated by hbm2java
 */
@Entity
@Table(name = "PDT_CID_DESCS", schema = "AGH")
public class PdtCidDesc extends BaseEntityId<PdtCidDescId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 341075731196008430L;
	private PdtCidDescId id;
	private Integer version;
	private AghCid aghCid;
	private PdtComplementoPorCid pdtComplementoPorCid;
	private PdtDescricao pdtDescricao;
	private RapServidores rapServidores;
	private String complementoLivre;
	private Date criadoEm;

	public PdtCidDesc() {
	}

	public PdtCidDesc(PdtCidDescId id, AghCid aghCid, PdtDescricao pdtDescricao, RapServidores rapServidores, Date criadoEm) {
		this.id = id;
		this.aghCid = aghCid;
		this.pdtDescricao = pdtDescricao;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
	}

	public PdtCidDesc(PdtCidDescId id, AghCid aghCid, PdtComplementoPorCid pdtComplementoPorCid, PdtDescricao pdtDescricao,
			RapServidores rapServidores, String complementoLivre, Date criadoEm) {
		this.id = id;
		this.aghCid = aghCid;
		this.pdtComplementoPorCid = pdtComplementoPorCid;
		this.pdtDescricao = pdtDescricao;
		this.rapServidores = rapServidores;
		this.complementoLivre = complementoLivre;
		this.criadoEm = criadoEm;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "ddtSeq", column = @Column(name = "DDT_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public PdtCidDescId getId() {
		return this.id;
	}

	public void setId(PdtCidDescId id) {
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
	@JoinColumn(name = "CID_SEQ", nullable = false)
	public AghCid getAghCid() {
		return this.aghCid;
	}

	public void setAghCid(AghCid aghCid) {
		this.aghCid = aghCid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "CXC_CXP_DPT_SEQ", referencedColumnName = "CXP_DPT_SEQ"),
			@JoinColumn(name = "CXC_CXP_CID_SEQ", referencedColumnName = "CXP_CID_SEQ"),
			@JoinColumn(name = "CXC_SEQP", referencedColumnName = "SEQP") })
	public PdtComplementoPorCid getPdtComplementoPorCid() {
		return this.pdtComplementoPorCid;
	}

	public void setPdtComplementoPorCid(PdtComplementoPorCid pdtComplementoPorCid) {
		this.pdtComplementoPorCid = pdtComplementoPorCid;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "DDT_SEQ", nullable = false, insertable = false, updatable = false)
	public PdtDescricao getPdtDescricao() {
		return this.pdtDescricao;
	}

	public void setPdtDescricao(PdtDescricao pdtDescricao) {
		this.pdtDescricao = pdtDescricao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@Column(name = "COMPLEMENTO_LIVRE", length = 45)
	@Length(max = 45)
	public String getComplementoLivre() {
		return this.complementoLivre;
	}

	public void setComplementoLivre(String complementoLivre) {
		this.complementoLivre = complementoLivre;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	public enum Fields {

		ID("id"),
		DDT_SEQ("id.ddtSeq"),
		SEQP("id.seqp"),
		VERSION("version"),
		AGH_CID("aghCid"),
		CID_SEQ("aghCid.seq"),
		PDT_COMPLEMENTO_POR_CIDS("pdtComplementoPorCid"),
		PDT_DESCRICAO("pdtDescricao"),
		RAP_SERVIDORES("rapServidores"),
		COMPLEMENTO_LIVRE("complementoLivre"),
		CRIADO_EM("criadoEm");

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
		if (!(obj instanceof PdtCidDesc)) {
			return false;
		}
		PdtCidDesc other = (PdtCidDesc) obj;
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