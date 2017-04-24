package br.gov.mec.aghu.model;

// Generated 28/03/2012 15:17:44 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MbcFichaFluidoAdministrados generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mbcFfdSq1", sequenceName="AGH.MBC_FFD_SQ1", allocationSize = 1)
@Table(name = "MBC_FICHA_FLUIDO_ADMINISTRADOS", schema = "AGH")
public class MbcFichaFluidoAdministrados extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 787382608776712759L;
	private Integer seq;
	private Integer version;
	private String observacao;
	private MbcFluidoAdministrados fluidoAdministrado;
	private MbcFichaAnestesias fichaAnestesia;
	private RapServidores servidor;
	private Date criadoEm;
	private Integer volumeTotal;
	private Set<MbcAdministraFichaFluido> mbcAdministraFichaFluidoses = new HashSet<MbcAdministraFichaFluido>(
			0);

	public MbcFichaFluidoAdministrados() {
	}

	public MbcFichaFluidoAdministrados(Integer seq, Integer version,
			String observacao, MbcFluidoAdministrados fluidoAdministrado,
			MbcFichaAnestesias fichaAnestesia, RapServidores servidor,
			Date criadoEm, Integer volumeTotal,
			Set<MbcAdministraFichaFluido> mbcAdministraFichaFluidoses) {
		super();
		this.seq = seq;
		this.version = version;
		this.observacao = observacao;
		this.fluidoAdministrado = fluidoAdministrado;
		this.fichaAnestesia = fichaAnestesia;
		this.servidor = servidor;
		this.criadoEm = criadoEm;
		this.volumeTotal = volumeTotal;
		this.mbcAdministraFichaFluidoses = mbcAdministraFichaFluidoses;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mbcFfdSq1")
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

	@Column(name = "OBSERVACAO", length = 60)
	@Length(max = 60)
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

	@Column(name = "VOLUME_TOTAL")
	public Integer getVolumeTotal() {
		return this.volumeTotal;
	}

	public void setVolumeTotal(Integer volumeTotal) {
		this.volumeTotal = volumeTotal;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mbcFichaFluidoAdministrados")
	public Set<MbcAdministraFichaFluido> getMbcAdministraFichaFluidoses() {
		return this.mbcAdministraFichaFluidoses;
	}

	public void setMbcAdministraFichaFluidoses(
			Set<MbcAdministraFichaFluido> mbcAdministraFichaFluidoses) {
		this.mbcAdministraFichaFluidoses = mbcAdministraFichaFluidoses;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FLA_SEQ")
	public MbcFluidoAdministrados getFluidoAdministrado() {
		return fluidoAdministrado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FIC_SEQ")
	public MbcFichaAnestesias getFichaAnestesia() {
		return fichaAnestesia;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO")})

	public RapServidores getServidor() {
		return servidor;
	}

	public void setFluidoAdministrado(MbcFluidoAdministrados fluidoAdministrado) {
		this.fluidoAdministrado = fluidoAdministrado;
	}

	public void setFichaAnestesia(MbcFichaAnestesias fichaAnestesia) {
		this.fichaAnestesia = fichaAnestesia;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}
	
	public enum Fields {
		SEQ("seq"),
		OBSERVACAO("observacao"),
		FLUIDO_ADMINISTRADO("fluidoAdministrado"),
		FICHA_ANESTESIA("fichaAnestesia"),
		SERVIDOR("servidor"),
		CRIADO_EM("criadoEm"),
		VOLUME_TOTAL("volumeTotal"),
		ADMINISTRA_FICHAS_FLUIDOS("mbcAdministraFichaFluidoses");;
		
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
		if (!(obj instanceof MbcFichaFluidoAdministrados)) {
			return false;
		}
		MbcFichaFluidoAdministrados other = (MbcFichaFluidoAdministrados) obj;
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