package br.gov.mec.aghu.model;

// Generated 24/04/2012 11:31:21 by Hibernate Tools 3.4.0.CR1

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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AelLaminaAps generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelLuzSq1", sequenceName="AGH.AEL_LUZ_SQ1", allocationSize = 1)
@Table(name = "AEL_LAMINA_APS")
public class AelLaminaAps extends BaseEntitySeq<Long> implements java.io.Serializable {

	private static final long serialVersionUID = -5104759631996780644L;
	
	private Long seq;
	private Date dthrLamina;
	private String cesto;
	private String numeroCapsula;
	private String numeroFragmentos;
	private String coloracao;
	private String descricao;
	private Date criadoEm;
	private AelExameAp aelExameAp;
	private RapServidores servidor;
	private AelCestoPatologia cestoPatologia;
	private String observacao;
	private AelMaterialAp aelMaterialAp;
	private AelTextoPadraoColoracs aelTextoPadraoColoracs;
	private Boolean indRecorte;

	
	public AelLaminaAps() {}

	public AelLaminaAps(Long seq, Date dthrLamina, String cesto,
			String numeroCapsula, String numeroFragmentos, String coloracao,
			String descricao, Date criadoEm, AelExameAp aelExameAp,
			RapServidores servidor, AelCestoPatologia cestoPatologia) {
		super();
		this.seq = seq;
		this.dthrLamina = dthrLamina;
		this.cesto = cesto;
		this.numeroCapsula = numeroCapsula;
		this.numeroFragmentos = numeroFragmentos;
		this.coloracao = coloracao;
		this.descricao = descricao;
		this.criadoEm = criadoEm;
		this.aelExameAp = aelExameAp;
		this.servidor = servidor;
		this.cestoPatologia = cestoPatologia;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelLuzSq1")
	@Column(name = "SEQ", unique = true, nullable = false, precision = 14, scale = 0)
	public Long getSeq() {
		return this.seq;
	}

	public void setSeq(Long seq) {
		this.seq = seq;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "DTHR_LAMINA", nullable = false, length = 7)
	public Date getDthrLamina() {
		return this.dthrLamina;
	}

	public void setDthrLamina(Date dthrLamina) {
		this.dthrLamina = dthrLamina;
	}

	@Column(name = "CESTO", nullable = false, length = 20)
	@Length(max = 20)
	public String getCesto() {
		return this.cesto;
	}

	public void setCesto(String cesto) {
		this.cesto = cesto;
	}

	@Column(name = "NUMERO_CAPSULA", nullable = false, length = 20)
	@Length(max = 20)
	public String getNumeroCapsula() {
		return this.numeroCapsula;
	}

	public void setNumeroCapsula(String numeroCapsula) {
		this.numeroCapsula = numeroCapsula;
	}

	@Column(name = "NUMERO_FRAGMENTOS", nullable = false, length = 500)
	@Length(max = 500)
	public String getNumeroFragmentos() {
		return this.numeroFragmentos;
	}

	public void setNumeroFragmentos(String numeroFragmentos) {
		this.numeroFragmentos = numeroFragmentos;
	}

	@Column(name = "COLORACAO", length = 500)
	@Length(max = 500)
	public String getColoracao() {
		return this.coloracao;
	}

	public void setColoracao(String coloracao) {
		this.coloracao = coloracao;
	}

	@Column(name = "DESCRICAO", length = 2000)
	@Length(max = 2000)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LUX_SEQ", nullable = false)
	public AelExameAp getAelExameAp() {
		return this.aelExameAp;
	}

	public void setAelExameAp(AelExameAp aelExameAp) {
		this.aelExameAp = aelExameAp;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable=false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable=false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CST_SEQ", nullable = false)
	public AelCestoPatologia getCestoPatologia() {
		return cestoPatologia;
	}

	public void setCestoPatologia(AelCestoPatologia cestoPatologia) {
		this.cestoPatologia = cestoPatologia;
	}

	@Column(name = "OBSERVACAO", length = 60)
	@Length(max = 60)
	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	public void setAelMaterialAp(AelMaterialAp aelMaterialAp) {
		this.aelMaterialAp = aelMaterialAp;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LUR_SEQ")
	public AelMaterialAp getAelMaterialAp() {
		return aelMaterialAp;
	}

	public void setAelTextoPadraoColoracs(AelTextoPadraoColoracs aelTextoPadraoColoracs) {
		this.aelTextoPadraoColoracs = aelTextoPadraoColoracs;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LU1_SEQ")
	public AelTextoPadraoColoracs getAelTextoPadraoColoracs() {
		return aelTextoPadraoColoracs;
	}
	
	public void setIndRecorte(Boolean indRecorte) {
		this.indRecorte = indRecorte;
	}

	@Column(name = "IND_RECORTE", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndRecorte() {
		return indRecorte;
	}

	public enum Fields {
		SEQ("seq"),
		DTHR_LAMINA("dthrLamina"),
		CESTO("cesto"),
		CESTO_PATOLOGIA("cestoPatologia"),
		NUMERO_CAPSULA("numeroCapsula"),
		NUMERO_FRAGMENTOS("numeroFragmentos"),
		COLORACAO("coloracao"),
		DESCRICAO("descricao"),
		CRIADO_EM("criadoEm"),
		AEL_EXAME_APS("aelExameAp"),
		SERVIDOR("servidor"),
		OBSERVACAO("observacao"),
		LUX_SEQ("aelExameAp.seq"),
		CST_SEQ("cestoPatologia.seq"),
		MATERIAL("aelMaterialAp"),
		TEXTO_PADRAO_COLORACAO("aelTextoPadraoColoracs")
		;

		private String fields;

		private Fields(final String fields) {
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
		if (!(obj instanceof AelLaminaAps)) {
			return false;
		}
		AelLaminaAps other = (AelLaminaAps) obj;
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