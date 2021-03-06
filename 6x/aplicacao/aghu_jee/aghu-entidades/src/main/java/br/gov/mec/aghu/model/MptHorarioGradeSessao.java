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
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * MptHorarioGradeSessao generated by hbm2java
 */
@Entity
@Table(name = "MPT_HORARIO_GRADE_SESSOES", schema = "AGH")
public class MptHorarioGradeSessao extends BaseEntityId<MptHorarioGradeSessaoId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5781563313495022612L;
	private MptHorarioGradeSessaoId id;
	private Integer version;
	private MptGradeSessao mptGradeSessao;
	private RapServidores rapServidores;
	private String diaSemana;
	private Date horario;
	private String tipoMovimento;
	private String observacao;
	private Date criadoEm;
	private Set<MptAgendaSessao> mptAgendaSessaoes = new HashSet<MptAgendaSessao>(0);
	private Set<MptExtratoHrGradeSessao> mptExtratoHrGradeSessaoes = new HashSet<MptExtratoHrGradeSessao>(0);

	public MptHorarioGradeSessao() {
	}

	public MptHorarioGradeSessao(MptHorarioGradeSessaoId id, MptGradeSessao mptGradeSessao, RapServidores rapServidores,
			String diaSemana, Date horario, String tipoMovimento, Date criadoEm) {
		this.id = id;
		this.mptGradeSessao = mptGradeSessao;
		this.rapServidores = rapServidores;
		this.diaSemana = diaSemana;
		this.horario = horario;
		this.tipoMovimento = tipoMovimento;
		this.criadoEm = criadoEm;
	}

	public MptHorarioGradeSessao(MptHorarioGradeSessaoId id, MptGradeSessao mptGradeSessao, RapServidores rapServidores,
			String diaSemana, Date horario, String tipoMovimento, String observacao, Date criadoEm,
			Set<MptAgendaSessao> mptAgendaSessaoes, Set<MptExtratoHrGradeSessao> mptExtratoHrGradeSessaoes) {
		this.id = id;
		this.mptGradeSessao = mptGradeSessao;
		this.rapServidores = rapServidores;
		this.diaSemana = diaSemana;
		this.horario = horario;
		this.tipoMovimento = tipoMovimento;
		this.observacao = observacao;
		this.criadoEm = criadoEm;
		this.mptAgendaSessaoes = mptAgendaSessaoes;
		this.mptExtratoHrGradeSessaoes = mptExtratoHrGradeSessaoes;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "gseSeq", column = @Column(name = "GSE_SEQ", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public MptHorarioGradeSessaoId getId() {
		return this.id;
	}

	public void setId(MptHorarioGradeSessaoId id) {
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
	@JoinColumn(name = "GSE_SEQ", nullable = false, insertable = false, updatable = false)
	public MptGradeSessao getMptGradeSessao() {
		return this.mptGradeSessao;
	}

	public void setMptGradeSessao(MptGradeSessao mptGradeSessao) {
		this.mptGradeSessao = mptGradeSessao;
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

	@Column(name = "DIA_SEMANA", nullable = false, length = 3)
	@Length(max = 3)
	public String getDiaSemana() {
		return this.diaSemana;
	}

	public void setDiaSemana(String diaSemana) {
		this.diaSemana = diaSemana;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HORARIO", nullable = false, length = 29)
	public Date getHorario() {
		return this.horario;
	}

	public void setHorario(Date horario) {
		this.horario = horario;
	}

	@Column(name = "TIPO_MOVIMENTO", nullable = false, length = 1)
	@Length(max = 1)
	public String getTipoMovimento() {
		return this.tipoMovimento;
	}

	public void setTipoMovimento(String tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}

	@Column(name = "OBSERVACAO", length = 500)
	@Length(max = 500)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mptHorarioGradeSessao")
	public Set<MptAgendaSessao> getMptAgendaSessaoes() {
		return this.mptAgendaSessaoes;
	}

	public void setMptAgendaSessaoes(Set<MptAgendaSessao> mptAgendaSessaoes) {
		this.mptAgendaSessaoes = mptAgendaSessaoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mptHorarioGradeSessao")
	public Set<MptExtratoHrGradeSessao> getMptExtratoHrGradeSessaoes() {
		return this.mptExtratoHrGradeSessaoes;
	}

	public void setMptExtratoHrGradeSessaoes(Set<MptExtratoHrGradeSessao> mptExtratoHrGradeSessaoes) {
		this.mptExtratoHrGradeSessaoes = mptExtratoHrGradeSessaoes;
	}

	public enum Fields {

		ID("id"),
		VERSION("version"),
		MPT_GRADE_SESSOES("mptGradeSessao"),
		RAP_SERVIDORES("rapServidores"),
		DIA_SEMANA("diaSemana"),
		HORARIO("horario"),
		TIPO_MOVIMENTO("tipoMovimento"),
		OBSERVACAO("observacao"),
		CRIADO_EM("criadoEm"),
		MPT_AGENDA_SESSAOES("mptAgendaSessaoes"),
		MPT_EXTRATO_HR_GRADE_SESSAOES("mptExtratoHrGradeSessaoes");

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
		if (!(obj instanceof MptHorarioGradeSessao)) {
			return false;
		}
		MptHorarioGradeSessao other = (MptHorarioGradeSessao) obj;
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
