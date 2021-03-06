package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RapHistServidorId generated by hbm2java
 */
@Embeddable
public class RapHistServidorId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4949049602063514903L;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Date dtFechamento;

	public RapHistServidorId() {
	}

	public RapHistServidorId(Integer serMatricula, Short serVinCodigo, Date dtFechamento) {
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.dtFechamento = dtFechamento;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "DT_FECHAMENTO", nullable = false, length = 29)
	public Date getDtFechamento() {
		return this.dtFechamento;
	}

	public void setDtFechamento(Date dtFechamento) {
		this.dtFechamento = dtFechamento;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getSerMatricula());
		umHashCodeBuilder.append(this.getSerVinCodigo());
		umHashCodeBuilder.append(this.getDtFechamento());
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
		if (!(obj instanceof RapHistServidorId)) {
			return false;
		}
		RapHistServidorId other = (RapHistServidorId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getSerMatricula(), other.getSerMatricula());
		umEqualsBuilder.append(this.getSerVinCodigo(), other.getSerVinCodigo());
		umEqualsBuilder.append(this.getDtFechamento(), other.getDtFechamento());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
