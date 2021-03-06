package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * ScoContratoSiafiId generated by hbm2java
 */
@Embeddable
public class ScoContratoSiafiId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5068411757728875966L;
	private String tipo;
	private Integer afnNumero;
	private String nroDocumentoSiafi;

	public ScoContratoSiafiId() {
	}

	public ScoContratoSiafiId(String tipo, Integer afnNumero, String nroDocumentoSiafi) {
		this.tipo = tipo;
		this.afnNumero = afnNumero;
		this.nroDocumentoSiafi = nroDocumentoSiafi;
	}

	@Column(name = "TIPO", nullable = false, length = 1)
	@Length(max = 1)
	public String getTipo() {
		return this.tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	@Column(name = "AFN_NUMERO", nullable = false)
	public Integer getAfnNumero() {
		return this.afnNumero;
	}

	public void setAfnNumero(Integer afnNumero) {
		this.afnNumero = afnNumero;
	}

	@Column(name = "NRO_DOCUMENTO_SIAFI", nullable = false, length = 12)
	@Length(max = 12)
	public String getNroDocumentoSiafi() {
		return this.nroDocumentoSiafi;
	}

	public void setNroDocumentoSiafi(String nroDocumentoSiafi) {
		this.nroDocumentoSiafi = nroDocumentoSiafi;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getAfnNumero());
		umHashCodeBuilder.append(this.getTipo());
		umHashCodeBuilder.append(this.getNroDocumentoSiafi());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ScoContratoSiafiId)) {
			return false;
		}
		ScoContratoSiafiId other = (ScoContratoSiafiId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getAfnNumero(), other.getAfnNumero());
		umEqualsBuilder.append(this.getTipo(), other.getTipo());
		umEqualsBuilder.append(this.getNroDocumentoSiafi(), other.getNroDocumentoSiafi());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
