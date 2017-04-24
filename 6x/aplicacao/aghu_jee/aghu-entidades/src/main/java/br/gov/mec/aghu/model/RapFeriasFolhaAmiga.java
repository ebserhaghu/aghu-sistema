package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * RapFeriasFolhaAmiga generated by hbm2java
 */
@Entity
@SequenceGenerator(name="rapFerSq1", sequenceName="AGH.RAP_FER_SQ1", allocationSize = 1)
@Table(name = "RAP_FERIAS_FOLHA_AMIGA", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = { "ser_matricula",
		"ser_vin_codigo", "dt_inicio", "dt_fim", "dt_ini_periodo_aquisitivo", "dt_fim_periodo_aquisitivo", "dt_inicio_real",
		"dt_fim_real", "prog_ferias" }))
public class RapFeriasFolhaAmiga extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5913046226089040082L;
	private Integer seq;
	private Integer version;
	private RapServidores rapServidores;
	private Date dtInicio;
	private Date dtFim;
	private Date dtInicioReal;
	private Date dtFimReal;
	private Date dtIniPeriodoAquisitivo;
	private Date dtFimPeriodoAquisitivo;
	private String progFerias;

	public RapFeriasFolhaAmiga() {
	}

	public RapFeriasFolhaAmiga(Integer seq, RapServidores rapServidores, Date dtInicio, Date dtFim) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
	}

	public RapFeriasFolhaAmiga(Integer seq, RapServidores rapServidores, Date dtInicio, Date dtFim, Date dtInicioReal, Date dtFimReal,
			Date dtIniPeriodoAquisitivo, Date dtFimPeriodoAquisitivo, String progFerias) {
		this.seq = seq;
		this.rapServidores = rapServidores;
		this.dtInicio = dtInicio;
		this.dtFim = dtFim;
		this.dtInicioReal = dtInicioReal;
		this.dtFimReal = dtFimReal;
		this.dtIniPeriodoAquisitivo = dtIniPeriodoAquisitivo;
		this.dtFimPeriodoAquisitivo = dtFimPeriodoAquisitivo;
		this.progFerias = progFerias;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "rapFerSq1")
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
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO_REAL", length = 29)
	public Date getDtInicioReal() {
		return this.dtInicioReal;
	}

	public void setDtInicioReal(Date dtInicioReal) {
		this.dtInicioReal = dtInicioReal;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM_REAL", length = 29)
	public Date getDtFimReal() {
		return this.dtFimReal;
	}

	public void setDtFimReal(Date dtFimReal) {
		this.dtFimReal = dtFimReal;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INI_PERIODO_AQUISITIVO", length = 29)
	public Date getDtIniPeriodoAquisitivo() {
		return this.dtIniPeriodoAquisitivo;
	}

	public void setDtIniPeriodoAquisitivo(Date dtIniPeriodoAquisitivo) {
		this.dtIniPeriodoAquisitivo = dtIniPeriodoAquisitivo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FIM_PERIODO_AQUISITIVO", length = 29)
	public Date getDtFimPeriodoAquisitivo() {
		return this.dtFimPeriodoAquisitivo;
	}

	public void setDtFimPeriodoAquisitivo(Date dtFimPeriodoAquisitivo) {
		this.dtFimPeriodoAquisitivo = dtFimPeriodoAquisitivo;
	}

	@Column(name = "PROG_FERIAS", length = 1)
	@Length(max = 1)
	public String getProgFerias() {
		return this.progFerias;
	}

	public void setProgFerias(String progFerias) {
		this.progFerias = progFerias;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		RAP_SERVIDORES("rapServidores"),
		DT_INICIO("dtInicio"),
		DT_FIM("dtFim"),
		DT_INICIO_REAL("dtInicioReal"),
		DT_FIM_REAL("dtFimReal"),
		DT_INI_PERIODO_AQUISITIVO("dtIniPeriodoAquisitivo"),
		DT_FIM_PERIODO_AQUISITIVO("dtFimPeriodoAquisitivo"),
		PROG_FERIAS("progFerias");

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
		if (!(obj instanceof RapFeriasFolhaAmiga)) {
			return false;
		}
		RapFeriasFolhaAmiga other = (RapFeriasFolhaAmiga) obj;
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