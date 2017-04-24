package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioOperacaoAgenda;
import br.gov.mec.aghu.dominio.DominioOrigem;
import br.gov.mec.aghu.dominio.DominioSituacaoAgendas;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MbcAgendaHistorico generated by hbm2java
 */
@Entity
@Table(name = "MBC_AGENDA_HISTORICOS", schema = "AGH")
public class MbcAgendaHistorico extends BaseEntityId<MbcAgendaHistoricoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -6049837647686140066L;
	private MbcAgendaHistoricoId id;
	private Integer version;
	private MbcAgendas mbcAgendas;
	private RapServidores rapServidores;
	private Date criadoEm;
	private DominioOrigem origem;
	private DominioOperacaoAgenda operacao;
	private String descricao;
	private DominioSituacaoAgendas indSitAgenda;

	public MbcAgendaHistorico() {
	}

	public MbcAgendaHistorico(MbcAgendaHistoricoId id, MbcAgendas mbcAgendas, RapServidores rapServidores, Date criadoEm,
			DominioOrigem origem, DominioOperacaoAgenda operacao, String descricao) {
		this.id = id;
		this.mbcAgendas = mbcAgendas;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
		this.origem = origem;
		this.operacao = operacao;
		this.descricao = descricao;
	}

	public MbcAgendaHistorico(MbcAgendaHistoricoId id, MbcAgendas mbcAgendas, RapServidores rapServidores, Date criadoEm,
			DominioOrigem origem, DominioOperacaoAgenda operacao, String descricao, DominioSituacaoAgendas indSitAgenda) {
		this.id = id;
		this.mbcAgendas = mbcAgendas;
		this.rapServidores = rapServidores;
		this.criadoEm = criadoEm;
		this.origem = origem;
		this.operacao = operacao;
		this.descricao = descricao;
		this.indSitAgenda = indSitAgenda;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "agdSeq", column = @Column(name = "AGD_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 17, scale = 17)) })
	public MbcAgendaHistoricoId getId() {
		return this.id;
	}

	public void setId(MbcAgendaHistoricoId id) {
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
	@JoinColumn(name = "AGD_SEQ", nullable = false, insertable = false, updatable = false)
	public MbcAgendas getMbcAgendas() {
		return this.mbcAgendas;
	}

	public void setMbcAgendas(MbcAgendas mbcAgendas) {
		this.mbcAgendas = mbcAgendas;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "ORIGEM", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioOrigem getOrigem() {
		return this.origem;
	}

	public void setOrigem(DominioOrigem origem) {
		this.origem = origem;
	}

	@Column(name = "OPERACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioOperacaoAgenda getOperacao() {
		return this.operacao;
	}

	public void setOperacao(DominioOperacaoAgenda operacao) {
		this.operacao = operacao;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 2000)
	@Length(max = 2000)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SIT_AGENDA", length = 2)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoAgendas getIndSitAgenda() {
		return this.indSitAgenda;
	}

	public void setIndSitAgenda(DominioSituacaoAgendas indSitAgenda) {
		this.indSitAgenda = indSitAgenda;
	}

	public enum Fields {

		ID("id"),
		ID_AGD_SEQ("id.agdSeq"),
		ID_SEQP("id.seqp"),
		VERSION("version"),
		MBC_AGENDAS("mbcAgendas"),
		RAP_SERVIDORES("rapServidores"),
		CRIADO_EM("criadoEm"),
		ORIGEM("origem"),
		OPERACAO("operacao"),
		DESCRICAO("descricao"),
		IND_SIT_AGENDA("indSitAgenda");

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
		if (!(obj instanceof MbcAgendaHistorico)) {
			return false;
		}
		MbcAgendaHistorico other = (MbcAgendaHistorico) obj;
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