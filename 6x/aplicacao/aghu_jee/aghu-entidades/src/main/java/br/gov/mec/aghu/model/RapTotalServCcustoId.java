package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RapTotalServCcustoId generated by hbm2java
 */
@Embeddable
public class RapTotalServCcustoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2594907099457153899L;
	private Date data;
	private Integer cctCodigo;
	private Short vinCodigo;

	public RapTotalServCcustoId() {
	}

	public RapTotalServCcustoId(Date data, Integer cctCodigo, Short vinCodigo) {
		this.data = data;
		this.cctCodigo = cctCodigo;
		this.vinCodigo = vinCodigo;
	}

	@Column(name = "DATA", nullable = false, length = 29)
	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	@Column(name = "CCT_CODIGO", nullable = false)
	public Integer getCctCodigo() {
		return this.cctCodigo;
	}

	public void setCctCodigo(Integer cctCodigo) {
		this.cctCodigo = cctCodigo;
	}

	@Column(name = "VIN_CODIGO", nullable = false)
	public Short getVinCodigo() {
		return this.vinCodigo;
	}

	public void setVinCodigo(Short vinCodigo) {
		this.vinCodigo = vinCodigo;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getData());
		umHashCodeBuilder.append(this.getVinCodigo());
		umHashCodeBuilder.append(this.getCctCodigo());
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
		if (!(obj instanceof RapTotalServCcustoId)) {
			return false;
		}
		RapTotalServCcustoId other = (RapTotalServCcustoId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getData(), other.getData());
		umEqualsBuilder.append(this.getVinCodigo(), other.getVinCodigo());
		umEqualsBuilder.append(this.getCctCodigo(), other.getCctCodigo());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}