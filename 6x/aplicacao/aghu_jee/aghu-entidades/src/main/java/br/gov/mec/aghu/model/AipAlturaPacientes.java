package br.gov.mec.aghu.model;

// Generated 24/09/2009 17:21:40 by Hibernate Tools 3.2.5.Beta

import java.math.BigDecimal;

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
import javax.persistence.Version;


import br.gov.mec.aghu.dominio.DominioMomento;
import br.gov.mec.aghu.dominio.DominioTipoMedicaoPeso;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AipAlturaPacientes generated by hbm2java
 */

@Entity
@Table(name = "AIP_ALTURA_PACIENTES", schema = "AGH")
public class AipAlturaPacientes extends BaseEntityId<AipAlturaPacientesId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 7046290149352485345L;
	private AipAlturaPacientesId id;
	private RapServidores rapServidor;
	private AipPacientes aipPaciente;
	private BigDecimal altura;
	private DominioTipoMedicaoPeso realEstimado;
	private DominioMomento indMomento;
	private Integer conNumero;
	private Integer version;
	
	public AipAlturaPacientes() {
	}

	public AipAlturaPacientes(AipAlturaPacientesId id,
			RapServidores rapServidor, AipPacientes aipPaciente,
			BigDecimal altura) {
		this.id = id;
		this.rapServidor = rapServidor;
		this.aipPaciente = aipPaciente;
		this.altura = altura;
	}

	public AipAlturaPacientes(AipAlturaPacientesId id,
			RapServidores rapServidor, AipPacientes aipPaciente,
			BigDecimal altura, DominioTipoMedicaoPeso realEstimado, DominioMomento indMomento,
			Integer conNumero) {
		this.id = id;
		this.rapServidor = rapServidor;
		this.aipPaciente = aipPaciente;
		this.altura = altura;
		this.realEstimado = realEstimado;
		this.indMomento = indMomento;
		this.conNumero = conNumero;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "pacCodigo", column = @Column(name = "PAC_CODIGO", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "criadoEm", column = @Column(name = "CRIADO_EM", nullable = false, length = 7)) })
	public AipAlturaPacientesId getId() {
		return this.id;
	}

	public void setId(AipAlturaPacientesId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidor() {
		return this.rapServidor;
	}

	public void setRapServidor(RapServidores rapServidor) {
		this.rapServidor = rapServidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO", nullable = false, insertable = false, updatable = false)
	public AipPacientes getAipPaciente() {
		return this.aipPaciente;
	}

	public void setAipPaciente(AipPacientes aipPaciente) {
		this.aipPaciente = aipPaciente;
	}

	@Column(name = "ALTURA", nullable = false, precision = 5)
	public BigDecimal getAltura() {
		return this.altura;
	}

	public void setAltura(BigDecimal altura) {
		this.altura = altura;
	}

	@Column(name = "REAL_ESTIMADO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoMedicaoPeso getRealEstimado() {
		return this.realEstimado;
	}

	public void setRealEstimado(DominioTipoMedicaoPeso realEstimado) {
		this.realEstimado = realEstimado;
	}

	@Column(name = "IND_MOMENTO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioMomento getIndMomento() {
		return this.indMomento;
	}

	public void setIndMomento(DominioMomento indMomento) {
		this.indMomento = indMomento;
	}

	@Column(name = "CON_NUMERO", precision = 8, scale = 0)
	public Integer getConNumero() {
		return this.conNumero;
	}

	public void setConNumero(Integer conNumero) {
		this.conNumero = conNumero;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#hashCode()
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	/* (non-Javadoc)
	 * @see java.lang.Object#equals(java.lang.Object)
	 */
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
		AipAlturaPacientes other = (AipAlturaPacientes) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

	public enum Fields {
		COD_PACIENTE("id.pacCodigo"), CRIADO_EM("id.criadoEm"), MOMENTO("indMomento"),
		CON_NUMERO("conNumero"), ALTURA("altura"), PACIENTE("aipPaciente");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
}
