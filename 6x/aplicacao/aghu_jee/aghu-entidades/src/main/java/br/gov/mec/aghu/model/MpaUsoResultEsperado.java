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
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MpaUsoResultEsperado generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mpaUreSq1", sequenceName="AGH.MPA_URE_SQ1", allocationSize = 1)
@Table(name = "MPA_USO_RESULT_ESPERADOS", schema = "AGH")
public class MpaUsoResultEsperado extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3215933798619038849L;
	private Integer seq;
	private Integer version;
	private MpaUsoProtocolo mpaUsoProtocolo;
	private RapServidores rapServidores;
	private MpaCadResulEsperado mpaCadResulEsperado;
	private Date criadoEm;
	private String indMarcada;

	public MpaUsoResultEsperado() {
	}

	public MpaUsoResultEsperado(Integer seq, MpaUsoProtocolo mpaUsoProtocolo, RapServidores rapServidores,
			MpaCadResulEsperado mpaCadResulEsperado, Date criadoEm, String indMarcada) {
		this.seq = seq;
		this.mpaUsoProtocolo = mpaUsoProtocolo;
		this.rapServidores = rapServidores;
		this.mpaCadResulEsperado = mpaCadResulEsperado;
		this.criadoEm = criadoEm;
		this.indMarcada = indMarcada;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mpaUreSq1")
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
	@JoinColumns({ @JoinColumn(name = "USP_APA_ATD_SEQ", referencedColumnName = "APA_ATD_SEQ", nullable = false),
			@JoinColumn(name = "USP_APA_SEQ", referencedColumnName = "APA_SEQ", nullable = false),
			@JoinColumn(name = "USP_VPA_PTA_SEQ", referencedColumnName = "VPA_PTA_SEQ", nullable = false),
			@JoinColumn(name = "USP_VPA_SEQP", referencedColumnName = "VPA_SEQP", nullable = false),
			@JoinColumn(name = "USP_SEQ", referencedColumnName = "SEQ", nullable = false) })
	public MpaUsoProtocolo getMpaUsoProtocolo() {
		return this.mpaUsoProtocolo;
	}

	public void setMpaUsoProtocolo(MpaUsoProtocolo mpaUsoProtocolo) {
		this.mpaUsoProtocolo = mpaUsoProtocolo;
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
	@JoinColumns({ @JoinColumn(name = "CRS_CIT_VPA_PTA_SEQ", referencedColumnName = "CIT_VPA_PTA_SEQ", nullable = false),
			@JoinColumn(name = "CRS_CIT_VPA_SEQP", referencedColumnName = "CIT_VPA_SEQP", nullable = false),
			@JoinColumn(name = "CRS_CIT_SEQP", referencedColumnName = "CIT_SEQP", nullable = false),
			@JoinColumn(name = "CRS_SEQP", referencedColumnName = "SEQP", nullable = false) })
	public MpaCadResulEsperado getMpaCadResulEsperado() {
		return this.mpaCadResulEsperado;
	}

	public void setMpaCadResulEsperado(MpaCadResulEsperado mpaCadResulEsperado) {
		this.mpaCadResulEsperado = mpaCadResulEsperado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_MARCADA", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndMarcada() {
		return this.indMarcada;
	}

	public void setIndMarcada(String indMarcada) {
		this.indMarcada = indMarcada;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		MPA_USO_PROTOCOLOS("mpaUsoProtocolo"),
		RAP_SERVIDORES("rapServidores"),
		MPA_CAD_RESUL_ESPERADOS("mpaCadResulEsperado"),
		CRIADO_EM("criadoEm"),
		IND_MARCADA("indMarcada");

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
		if (!(obj instanceof MpaUsoResultEsperado)) {
			return false;
		}
		MpaUsoResultEsperado other = (MpaUsoResultEsperado) obj;
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