package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AghTabelaDaLimpezaId generated by hbm2java
 */
@Embeddable
public class AghTabelaDaLimpezaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4891560975902084113L;
	private String nomeTab;
	private String sisLimpeza;
	private Date criadoEm;
	private Character indAvisado;
	private Integer version;

	public AghTabelaDaLimpezaId() {
	}

	public AghTabelaDaLimpezaId(Integer version) {
		this.version = version;
	}

	public AghTabelaDaLimpezaId(String nomeTab, String sisLimpeza, Date criadoEm, Character indAvisado, Integer version) {
		this.nomeTab = nomeTab;
		this.sisLimpeza = sisLimpeza;
		this.criadoEm = criadoEm;
		this.indAvisado = indAvisado;
		this.version = version;
	}

	@Column(name = "NOME_TAB", length = 30)
	@Length(max = 30)
	public String getNomeTab() {
		return this.nomeTab;
	}

	public void setNomeTab(String nomeTab) {
		this.nomeTab = nomeTab;
	}

	@Column(name = "SIS_LIMPEZA", length = 3)
	@Length(max = 3)
	public String getSisLimpeza() {
		return this.sisLimpeza;
	}

	public void setSisLimpeza(String sisLimpeza) {
		this.sisLimpeza = sisLimpeza;
	}

	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_AVISADO", length = 1)
	public Character getIndAvisado() {
		return this.indAvisado;
	}

	public void setIndAvisado(Character indAvisado) {
		this.indAvisado = indAvisado;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getCriadoEm());
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getNomeTab());
		umHashCodeBuilder.append(this.getSisLimpeza());
		umHashCodeBuilder.append(this.getIndAvisado());
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
		if (!(obj instanceof AghTabelaDaLimpezaId)) {
			return false;
		}
		AghTabelaDaLimpezaId other = (AghTabelaDaLimpezaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getCriadoEm(), other.getCriadoEm());
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getNomeTab(), other.getNomeTab());
		umEqualsBuilder.append(this.getSisLimpeza(), other.getSisLimpeza());
		umEqualsBuilder.append(this.getIndAvisado(), other.getIndAvisado());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}
