package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * RapFonemaPessoaFisicaId generated by hbm2java
 */
@Embeddable
public class RapFonemaPessoaFisicaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4393576466139081196L;
	private String fonFonema;
	private Integer pesCodigo;

	public RapFonemaPessoaFisicaId() {
	}

	public RapFonemaPessoaFisicaId(String fonFonema, Integer pesCodigo) {
		this.fonFonema = fonFonema;
		this.pesCodigo = pesCodigo;
	}

	@Column(name = "FON_FONEMA", nullable = false, length = 6)
	@Length(max = 6)
	public String getFonFonema() {
		return this.fonFonema;
	}

	public void setFonFonema(String fonFonema) {
		this.fonFonema = fonFonema;
	}

	@Column(name = "PES_CODIGO", nullable = false)
	public Integer getPesCodigo() {
		return this.pesCodigo;
	}

	public void setPesCodigo(Integer pesCodigo) {
		this.pesCodigo = pesCodigo;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getFonFonema());
		umHashCodeBuilder.append(this.getPesCodigo());
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
		if (!(obj instanceof RapFonemaPessoaFisicaId)) {
			return false;
		}
		RapFonemaPessoaFisicaId other = (RapFonemaPessoaFisicaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getFonFonema(), other.getFonFonema());
		umEqualsBuilder.append(this.getPesCodigo(), other.getPesCodigo());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
