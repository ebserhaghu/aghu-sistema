package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * RarConclusaoIam generated by hbm2java
 */
@Entity
@Table(name = "RAR_CONCLUSAO_IAM", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = { "cro_ava_seq", "cro_seqp",
		"cpm_pga_seq", "cpm_cnd_seq", "ser_vin_codigo", "ser_matricula", "dt_inicio", "dt_fim" }))
public class RarConclusaoIam extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -5814726793665528403L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidores;
	private RarCronogramaAvaliacao rarCronogramaAvaliacao;
	private RarCandidatoPrograma rarCandidatoPrograma;
	private Date concluidoEm;
	private Date dtInicio;
	private Date dtFim;

	public RarConclusaoIam() {
	}

	public RarConclusaoIam(Integer seq, RarCronogramaAvaliacao rarCronogramaAvaliacao, Date dtInicio, Date dtFim) {
		this.seq = seq;
		this.rarCronogramaAvaliacao = rarCronogramaAvaliacao;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}

	public RarConclusaoIam(Integer seq, RapServidores rapServidores, RarCronogramaAvaliacao rarCronogramaAvaliacao,
			RarCandidatoPrograma rarCandidatoPrograma, Date concluidoEm, Date dtInicio, Date dtFim) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.rarCronogramaAvaliacao = rarCronogramaAvaliacao;
		this.rarCandidatoPrograma = rarCandidatoPrograma;
		this.concluidoEm = concluidoEm;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}

	@Id
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "CRO_AVA_SEQ", referencedColumnName = "AVA_SEQ", nullable = false),
			@JoinColumn(name = "CRO_SEQP", referencedColumnName = "SEQP", nullable = false) })
	public RarCronogramaAvaliacao getRarCronogramaAvaliacao() {
		return this.rarCronogramaAvaliacao;
	}

	public void setRarCronogramaAvaliacao(RarCronogramaAvaliacao rarCronogramaAvaliacao) {
		this.rarCronogramaAvaliacao = rarCronogramaAvaliacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "CPM_PGA_SEQ", referencedColumnName = "PGA_SEQ"),
			@JoinColumn(name = "CPM_CND_SEQ", referencedColumnName = "CND_SEQ") })
	public RarCandidatoPrograma getRarCandidatoPrograma() {
		return this.rarCandidatoPrograma;
	}

	public void setRarCandidatoPrograma(RarCandidatoPrograma rarCandidatoPrograma) {
		this.rarCandidatoPrograma = rarCandidatoPrograma;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CONCLUIDO_EM", length = 29)
	public Date getConcluidoEm() {
		return this.concluidoEm;
	}

	public void setConcluidoEm(Date concluidoEm) {
		this.concluidoEm = concluidoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO", nullable = false, length = 29)
	public Date getDtInicio() {
		return this.dtInicio;
	}

	public void setDtInicio(Date dtInicio) {
		this.dtInicio = dtInicio;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM", nullable = false, length = 29)
	public Date getDtFim() {
		return this.dtFim;
	}

	public void setDtFim(Date dtFim) {
		this.dtFim = dtFim;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		RAR_CRONOGRAMA_AVALIACOES("rarCronogramaAvaliacao"),
		RAR_CANDIDATOS_PROGRAMA("rarCandidatoPrograma"),
		CONCLUIDO_EM("concluidoEm"),
		DT_INICIO("dtInicio"),
		DT_FIM("dtFim");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof RarConclusaoIam)) {
			return false;
		}
		RarConclusaoIam other = (RarConclusaoIam) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}