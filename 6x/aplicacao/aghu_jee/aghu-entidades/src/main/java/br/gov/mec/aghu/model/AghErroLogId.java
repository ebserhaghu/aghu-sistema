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
 * AghErroLogId generated by hbm2java
 */
@Embeddable
public class AghErroLogId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8871742754062282440L;
	private String objOrigLog;
	private Integer objLineCall;
	private Date criadoEm;
	private String instance;
	private String erro;
	private Integer version;

	public AghErroLogId() {
	}

	public AghErroLogId(Integer version) {
		this.version = version;
	}

	public AghErroLogId(String objOrigLog, Integer objLineCall, Date criadoEm, String instance, String erro, Integer version) {
		this.objOrigLog = objOrigLog;
		this.objLineCall = objLineCall;
		this.criadoEm = criadoEm;
		this.instance = instance;
		this.erro = erro;
		this.version = version;
	}

	@Column(name = "OBJ_ORIG_LOG", length = 30)
	@Length(max = 30)
	public String getObjOrigLog() {
		return this.objOrigLog;
	}

	public void setObjOrigLog(String objOrigLog) {
		this.objOrigLog = objOrigLog;
	}

	@Column(name = "OBJ_LINE_CALL")
	public Integer getObjLineCall() {
		return this.objLineCall;
	}

	public void setObjLineCall(Integer objLineCall) {
		this.objLineCall = objLineCall;
	}

	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "INSTANCE", length = 20)
	@Length(max = 20)
	public String getInstance() {
		return this.instance;
	}

	public void setInstance(String instance) {
		this.instance = instance;
	}

	@Column(name = "ERRO", length = 4000)
	@Length(max = 4000)
	public String getErro() {
		return this.erro;
	}

	public void setErro(String erro) {
		this.erro = erro;
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
		umHashCodeBuilder.append(this.getInstance());
		umHashCodeBuilder.append(this.getCriadoEm());
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getErro());
		umHashCodeBuilder.append(this.getObjOrigLog());
		umHashCodeBuilder.append(this.getObjLineCall());
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
		if (!(obj instanceof AghErroLogId)) {
			return false;
		}
		AghErroLogId other = (AghErroLogId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getInstance(), other.getInstance());
		umEqualsBuilder.append(this.getCriadoEm(), other.getCriadoEm());
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getErro(), other.getErro());
		umEqualsBuilder.append(this.getObjOrigLog(), other.getObjOrigLog());
		umEqualsBuilder.append(this.getObjLineCall(), other.getObjLineCall());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}