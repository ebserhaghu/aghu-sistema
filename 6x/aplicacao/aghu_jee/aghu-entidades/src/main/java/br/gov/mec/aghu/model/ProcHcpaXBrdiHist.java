package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * ProcHcpaXBrdiHist generated by hbm2java
 */
@Entity
@Immutable
@Table(name = "PROC_HCPA_X_BRDI", schema = "HIST")
public class ProcHcpaXBrdiHist extends BaseEntityId<ProcHcpaXBrdiHistId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2624310383109009965L;
	private ProcHcpaXBrdiHistId id;

	public ProcHcpaXBrdiHist() {
	}

	public ProcHcpaXBrdiHist(ProcHcpaXBrdiHistId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({ @AttributeOverride(name = "prhcCodHcpa", column = @Column(name = "PRHC_COD_HCPA")),
			@AttributeOverride(name = "brdiCod", column = @Column(name = "BRDI_COD")),
			@AttributeOverride(name = "indSit", column = @Column(name = "IND_SIT", length = 1)) })
	public ProcHcpaXBrdiHistId getId() {
		return this.id;
	}

	public void setId(ProcHcpaXBrdiHistId id) {
		this.id = id;
	}

	public enum Fields {

		ID("id");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}

	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
		return result;
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof ProcHcpaXBrdiHist)) {
			return false;
		}
		ProcHcpaXBrdiHist other = (ProcHcpaXBrdiHist) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}