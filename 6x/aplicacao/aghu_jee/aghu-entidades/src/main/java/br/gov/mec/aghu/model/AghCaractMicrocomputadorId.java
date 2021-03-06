package br.gov.mec.aghu.model;

// Generated 01/07/2011 18:03:49 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioCaracteristicaMicrocomputador;
import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AghCaractMicrocomputadoresId generated by hbm2java
 */
@Embeddable
public class AghCaractMicrocomputadorId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8487714325593617213L;
	private String micNome;
	private DominioCaracteristicaMicrocomputador caracteristica;

	public AghCaractMicrocomputadorId() {
	}

	public AghCaractMicrocomputadorId(String micNome, DominioCaracteristicaMicrocomputador caracteristica) {
		this.micNome = micNome;
		this.caracteristica = caracteristica;
	}

	@Column(name = "MIC_NOME", nullable = false, length = 50)
	@Length(max = 50)
	public String getMicNome() {
		return this.micNome;
	}

	public void setMicNome(String micNome) {
		this.micNome = micNome;
	}

	@Column(name = "CARACTERISTICA", nullable = false, length = 30)
	@org.hibernate.annotations.Type(parameters = { @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioCaracteristicaMicrocomputador") }, type = "br.gov.mec.aghu.core.model.jpa.DominioStringUserType")
	public DominioCaracteristicaMicrocomputador getCaracteristica() {
		return this.caracteristica;
	}

	public void setCaracteristica(DominioCaracteristicaMicrocomputador caracteristica) {
		this.caracteristica = caracteristica;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof AghCaractMicrocomputadorId)) {
			return false;
		}
		AghCaractMicrocomputadorId castOther = (AghCaractMicrocomputadorId) other;

		return ((this.getMicNome() == castOther.getMicNome()) || (this
				.getMicNome() != null
				&& castOther.getMicNome() != null && this.getMicNome().equals(
				castOther.getMicNome())))
				&& ((this.getCaracteristica() == castOther.getCaracteristica()) || (this
						.getCaracteristica() != null
						&& castOther.getCaracteristica() != null && this
						.getCaracteristica().equals(
								castOther.getCaracteristica())));
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getMicNome() == null ? 0 : this.getMicNome().hashCode());
		result = 37
				* result
				+ (getCaracteristica() == null ? 0 : this.getCaracteristica()
						.hashCode());
		return result;
	}

}
