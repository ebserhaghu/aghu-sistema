package br.gov.mec.aghu.model;

// Generated 31/10/2011 11:15:39 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CtbRelacionaNaturezasId generated by hbm2java
 */
@Embeddable
public class CtbRelacionaNaturezaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3380568466532841521L;
	private Integer ntdGndCodigo;
	private Byte ntdCodigo;

	public CtbRelacionaNaturezaId() {
	}

	public CtbRelacionaNaturezaId(Integer ntdGndCodigo, Byte ntdCodigo) {
		this.ntdGndCodigo = ntdGndCodigo;
		this.ntdCodigo = ntdCodigo;
	}

	@Column(name = "NTD_GND_CODIGO", nullable = false, precision = 6, scale = 0)
	public Integer getNtdGndCodigo() {
		return this.ntdGndCodigo;
	}

	public void setNtdGndCodigo(Integer ntdGndCodigo) {
		this.ntdGndCodigo = ntdGndCodigo;
	}

	@Column(name = "NTD_CODIGO", nullable = false, precision = 2, scale = 0)
	public Byte getNtdCodigo() {
		return this.ntdCodigo;
	}

	public void setNtdCodigo(Byte ntdCodigo) {
		this.ntdCodigo = ntdCodigo;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof CtbRelacionaNaturezaId)) {
			return false;
		}
		CtbRelacionaNaturezaId castOther = (CtbRelacionaNaturezaId) other;

		return (this.getNtdGndCodigo() == castOther.getNtdGndCodigo())
				&& (this.getNtdCodigo() == castOther.getNtdCodigo());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getNtdGndCodigo();
		result = 37 * result + this.getNtdCodigo();
		return result;
	}

}
