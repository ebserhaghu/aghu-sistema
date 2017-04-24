package br.gov.mec.aghu.model;

// Generated 14/10/2011 17:24:00 by Hibernate Tools 3.4.0.CR1

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * SceItemBocId generated by hbm2java
 */
@Embeddable
public class SceItemBocId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6045620076053365320L;
	private Integer bocSeq;
	private Short nroItem;

	public SceItemBocId() {
	}

	public SceItemBocId(Integer bocSeq, Short nroItem) {
		this.bocSeq = bocSeq;
		this.nroItem = nroItem;
	}

	@Column(name = "BOC_SEQ", nullable = false, precision = 7, scale = 0)
	public Integer getBocSeq() {
		return this.bocSeq;
	}

	public void setBocSeq(Integer bocSeq) {
		this.bocSeq = bocSeq;
	}

	@Column(name = "NRO_ITEM", nullable = false, precision = 3, scale = 0)
	public Short getNroItem() {
		return this.nroItem;
	}

	public void setNroItem(Short nroItem) {
		this.nroItem = nroItem;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof SceItemBocId)) {
			return false;
		}
		SceItemBocId castOther = (SceItemBocId) other;

		return (this.getBocSeq() == castOther.getBocSeq())
				&& (this.getNroItem() == castOther.getNroItem());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getBocSeq();
		result = 37 * result + this.getNroItem();
		return result;
	}

}