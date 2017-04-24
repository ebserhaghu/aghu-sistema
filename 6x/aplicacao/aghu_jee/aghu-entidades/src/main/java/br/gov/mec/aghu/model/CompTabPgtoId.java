package br.gov.mec.aghu.model;

// Generated 05/05/2010 10:54:57 by Hibernate Tools 3.2.5.Beta

import javax.persistence.Column;
import javax.persistence.Embeddable;

import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * CompTabPgtoId generated by hbm2java
 */
@Embeddable
public class CompTabPgtoId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = 850535247733244991L;
	private Short tptabCod;
	private Short nro;

	public CompTabPgtoId() {
	}

	public CompTabPgtoId(Short tptabCod, Short nro) {
		this.tptabCod = tptabCod;
		this.nro = nro;
	}

	@Column(name = "TPTAB_COD", nullable = false, precision = 3, scale = 0)
	public Short getTptabCod() {
		return this.tptabCod;
	}

	public void setTptabCod(Short tptabCod) {
		this.tptabCod = tptabCod;
	}

	@Column(name = "NRO", nullable = false, precision = 3, scale = 0)
	public Short getNro() {
		return this.nro;
	}

	public void setNro(Short nro) {
		this.nro = nro;
	}

	@Override
	public boolean equals(Object other) {
		if ((this == other)) {
			return true;
		}
		if ((other == null)) {
			return false;
		}
		if (!(other instanceof CompTabPgtoId)) {
			return false;
		}
		CompTabPgtoId castOther = (CompTabPgtoId) other;

		return (this.getTptabCod() == castOther.getTptabCod())
				&& (this.getNro() == castOther.getNro());
	}

	@Override
	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getTptabCod();
		result = 37 * result + this.getNro();
		return result;
	}

}