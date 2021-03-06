package br.gov.mec.aghu.model;

// Generated 08/02/2010 17:25:25 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AbsEstoqueComponentesId generated by hbm2java
 */
@Embeddable
public class AbsEstoqueComponentesId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5342090889518947654L;
	private Integer bolNumero;
	private Short bolBsaCodigo;
	private Date bolData;
	private String csaCodigo;
	private Short seqp;

	public AbsEstoqueComponentesId() {
	}

	public AbsEstoqueComponentesId(Integer bolNumero, Short bolBsaCodigo,
			Date bolData, String csaCodigo, Short seqp) {
		this.bolNumero = bolNumero;
		this.bolBsaCodigo = bolBsaCodigo;
		this.bolData = bolData;
		this.csaCodigo = csaCodigo;
		this.seqp = seqp;
	}

	@Column(name = "BOL_NUMERO", nullable = false, precision = 7, scale = 0)
	public Integer getBolNumero() {
		return this.bolNumero;
	}

	public void setBolNumero(Integer bolNumero) {
		this.bolNumero = bolNumero;
	}

	@Column(name = "BOL_BSA_CODIGO", nullable = false, precision = 3, scale = 0)
	public Short getBolBsaCodigo() {
		return this.bolBsaCodigo;
	}

	public void setBolBsaCodigo(Short bolBsaCodigo) {
		this.bolBsaCodigo = bolBsaCodigo;
	}

	@Column(name = "BOL_DATA", nullable = false, length = 7)
	public Date getBolData() {
		return this.bolData;
	}

	public void setBolData(Date bolData) {
		this.bolData = bolData;
	}

	@Column(name = "CSA_CODIGO", nullable = false, length = 2)
	@Length(max = 2)
	public String getCsaCodigo() {
		return this.csaCodigo;
	}

	public void setCsaCodigo(String csaCodigo) {
		this.csaCodigo = csaCodigo;
	}

	@Column(name = "SEQP", nullable = false, precision = 3, scale = 0)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}
	

	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCsaCodigo());
		umHashCodeBuilder.append(this.getSeqp());
		umHashCodeBuilder.append(this.getBolNumero());
		umHashCodeBuilder.append(this.getBolBsaCodigo());
		umHashCodeBuilder.append(this.getBolData());
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
		if (!(obj instanceof AbsEstoqueComponentesId)) {
			return false;
		}
		AbsEstoqueComponentesId other = (AbsEstoqueComponentesId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCsaCodigo(), other.getCsaCodigo());
		umEqualsBuilder.append(this.getSeqp(), other.getSeqp());
		umEqualsBuilder.append(this.getBolNumero(), other.getBolNumero());
		umEqualsBuilder.append(this.getBolBsaCodigo(), other.getBolBsaCodigo());
		umEqualsBuilder.append(this.getBolData(), other.getBolData());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
