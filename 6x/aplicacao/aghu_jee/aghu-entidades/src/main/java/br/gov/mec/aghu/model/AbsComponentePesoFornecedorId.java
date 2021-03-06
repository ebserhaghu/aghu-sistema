package br.gov.mec.aghu.model;

// Generated 02/04/2012 10:29:10 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * AbsComponentePesoFornecsId generated by hbm2java
 */
@Embeddable
public class AbsComponentePesoFornecedorId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3161207627728897970L;
	private String csaCodigo;
	private Integer fboSeq;
	private Short seqp;

	public AbsComponentePesoFornecedorId() {
	}

	public AbsComponentePesoFornecedorId(String csaCodigo, Integer fboSeq, Short seqp) {
		this.csaCodigo = csaCodigo;
		this.fboSeq = fboSeq;
		this.seqp = seqp;
	}

	@Column(name = "CSA_CODIGO", nullable = false, length = 2)
	public String getCsaCodigo() {
		return this.csaCodigo;
	}

	public void setCsaCodigo(String csaCodigo) {
		this.csaCodigo = csaCodigo;
	}

	@Column(name = "FBO_SEQ", nullable = false)
	public Integer getFboSeq() {
		return this.fboSeq;
	}

	public void setFboSeq(Integer fboSeq) {
		this.fboSeq = fboSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}
	
	@Override
	public boolean equals(Object other) {
		if ((this == other)){
			return true;
		}
		if ((other == null)){
			return false;
		}
		if (!(other instanceof AbsComponentePesoFornecedorId)){
			return false;
		}
		AbsComponentePesoFornecedorId castOther = (AbsComponentePesoFornecedorId) other;

		return ((this.getCsaCodigo() == castOther.getCsaCodigo()) || (this
				.getCsaCodigo() != null && castOther.getCsaCodigo() != null && this
				.getCsaCodigo().equals(castOther.getCsaCodigo())))
				&& (this.getFboSeq() == castOther.getFboSeq())
				&& (this.getSeqp() == castOther.getSeqp());
	}
	
	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getCsaCodigo() == null ? 0 : this.getCsaCodigo().hashCode());
		result = 37 * result + this.getFboSeq();
		result = 37 * result + this.getSeqp();
		return result;
	}

}
