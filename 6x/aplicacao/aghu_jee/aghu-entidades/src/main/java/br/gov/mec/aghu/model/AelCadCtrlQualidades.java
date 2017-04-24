package br.gov.mec.aghu.model;

// Generated 18/04/2011 13:15:07 by Hibernate Tools 3.2.5.Beta

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
 * AelCadCtrlQualidades generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelCcqSq1", sequenceName="AGH.AEL_CCQ_SQ1", allocationSize = 1)
@Table(name = "AEL_CAD_CTRL_QUALIDADES", schema = "AGH")
public class AelCadCtrlQualidades extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -216245847405352042L;
	private Integer seq;
	private Integer version;
	private String material;
	private Date criadoEm;

	private RapServidores servidor;
	
	private FatConvenioSaudePlano convenioSaudePlano;
	private FatConvenioSaude convenioSaude;


	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelCcqSq1")
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

	@Column(name = "MATERIAL", nullable = false, length = 120)
	@Length(max = 120)
	public String getMaterial() {
		return this.material;
	}

	public void setMaterial(String material) {
		this.material = material;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "CSP_CNV_CODIGO", referencedColumnName = "CNV_CODIGO" ),
			@JoinColumn(name = "CSP_SEQ", referencedColumnName = "SEQ" ) })
	public FatConvenioSaudePlano getConvenioSaudePlano() {
		return convenioSaudePlano;
	}

	public void setConvenioSaudePlano(FatConvenioSaudePlano convenioSaudePlano) {
		this.convenioSaudePlano = convenioSaudePlano;
	}
	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CSP_CNV_CODIGO", insertable = false, updatable = false)
	public FatConvenioSaude getConvenioSaude() {
		return this.convenioSaude;
	}

	public void setConvenioSaude(FatConvenioSaude convenioSaude) {
		this.convenioSaude = convenioSaude;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false)})
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	public enum Fields {
		SEQ("seq"),		
		CONVENIO_SAUDE_PLANO("convenioSaudePlano"),
		CONVENIO_SAUDE("convenioSaude"),
		MATERIAL("material"),
		SERVIDOR("servidor")
		;
		
		private String fields;
		
		private Fields(String fields) {
			this.fields = fields;
		}
		
		@Override
		public String toString() {
			return this.fields;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
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
		AelCadCtrlQualidades other = (AelCadCtrlQualidades) obj;
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}

	
}