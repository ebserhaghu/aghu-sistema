package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * PdtAchado generated by hbm2java
 */
@Entity
@Table(name = "PDT_ACHADOS", schema = "AGH")
public class PdtAchado extends BaseEntityId<PdtAchadoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6276437034518184590L;
	private PdtAchadoId id;
	private Integer version;
	private RapServidores rapServidores;
	private PdtGrupo pdtGrupo;
	private String descricao;
	private String mensagemAlerta;
	private Boolean indExigeComplemento;
	private Boolean indNormal;
	private DominioSituacao indSituacao;
	private Date criadoEm;
	private Set<PdtDescObjetiva> pdtDescObjetivaes = new HashSet<PdtDescObjetiva>(0);

	public PdtAchado() {
	}

	public PdtAchado(PdtAchadoId id, RapServidores rapServidores, PdtGrupo pdtGrupo, String descricao, DominioSituacao indSituacao,
			Date criadoEm) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.pdtGrupo = pdtGrupo;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
	}

	public PdtAchado(PdtAchadoId id, RapServidores rapServidores, PdtGrupo pdtGrupo, String descricao, String mensagemAlerta,
			Boolean indExigeComplemento, Boolean indNormal, DominioSituacao indSituacao, Date criadoEm, Set<PdtDescObjetiva> pdtDescObjetivaes) {
		this.id = id;
		this.rapServidores = rapServidores;
		this.pdtGrupo = pdtGrupo;
		this.descricao = descricao;
		this.mensagemAlerta = mensagemAlerta;
		this.indExigeComplemento = indExigeComplemento;
		this.indNormal = indNormal;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.pdtDescObjetivaes = pdtDescObjetivaes;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "dgrDptSeq", column = @Column(name = "DGR_DPT_SEQ", nullable = false)),
			@AttributeOverride(name = "dgrSeqp", column = @Column(name = "DGR_SEQP", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public PdtAchadoId getId() {
		return this.id;
	}

	public void setId(PdtAchadoId id) {
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "DGR_DPT_SEQ", referencedColumnName = "DPT_SEQ", insertable = false, updatable = false),
			@JoinColumn(name = "DGR_SEQP", referencedColumnName = "SEQP", insertable = false, updatable = false) })
	public PdtGrupo getPdtGrupo() {
		return this.pdtGrupo;
	}

	public void setPdtGrupo(PdtGrupo pdtGrupo) {
		this.pdtGrupo = pdtGrupo;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 120)
	@Length(max = 120)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "MENSAGEM_ALERTA", length = 120)
	@Length(max = 120)
	public String getMensagemAlerta() {
		return this.mensagemAlerta;
	}

	public void setMensagemAlerta(String mensagemAlerta) {
		this.mensagemAlerta = mensagemAlerta;
	}

	@Column(name = "IND_EXIGE_COMPLEMENTO", length = 1)	
	@Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndExigeComplemento() {
		return this.indExigeComplemento;
	}

	public void setIndExigeComplemento(Boolean indExigeComplemento) {
		this.indExigeComplemento = indExigeComplemento;
	}

	@Column(name = "IND_NORMAL", length = 1)	
	@Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndNormal() {
		return this.indNormal;
	}

	public void setIndNormal(Boolean indNormal) {
		this.indNormal = indNormal;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "pdtAchado")
	public Set<PdtDescObjetiva> getPdtDescObjetivaes() {
		return this.pdtDescObjetivaes;
	}

	public void setPdtDescObjetivaes(Set<PdtDescObjetiva> pdtDescObjetivaes) {
		this.pdtDescObjetivaes = pdtDescObjetivaes;
	}

	public enum Fields {

		ID("id"),
		ID_DGR_DPT_SEQ("id.dgrDptSeq"),
		ID_DGR_SEQP("id.dgrSeqp"),
		ID_SEQP("id.seqp"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		PDT_GRUPOS("pdtGrupo"),
		DESCRICAO("descricao"),
		MENSAGEM_ALERTA("mensagemAlerta"),
		IND_EXIGE_COMPLEMENTO("indExigeComplemento"),
		IND_NORMAL("indNormal"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		PDT_DESC_OBJETIVAES("pdtDescObjetivaes");

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
		if (!(obj instanceof PdtAchado)) {
			return false;
		}
		PdtAchado other = (PdtAchado) obj;
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