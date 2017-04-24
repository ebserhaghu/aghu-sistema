package br.gov.mec.aghu.model;

// Generated 18/01/2012 17:12:57 by Hibernate Tools 3.3.0.GA

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AghDatasIg generated by hbm2java
 */
@Entity
@Table(name = "AGH_DATAS_IG", schema = "AGH")
public class AghDatasIg extends BaseEntityId<AghDatasIgId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3523291430415146394L;
	
	private AghDatasIgId id;
	private Integer version;

	public AghDatasIg() {
	}

	public AghDatasIg(AghDatasIgId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "dataInicial", column = @Column(name = "DT_INICIAL", nullable = false, length = 29)),
			@AttributeOverride(name = "dataFinal", column = @Column(name = "DT_FINAL", nullable = false, length = 29)) })
	public AghDatasIgId getId() {
		return this.id;
	}

	public void setId(AghDatasIgId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((version == null) ? 0 : version.hashCode());
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
		if (getClass() != obj.getClass()) {
			return false;
		}
		AghDatasIg other = (AghDatasIg) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		if (version == null) {
			if (other.version != null) {
				return false;
			}
		} else if (!version.equals(other.version)) {
			return false;
		}
		return true;
	}
	
	public enum Fields {
		
		DT_INICIAL("id.dataInicial"), DT_FINAL("id.dataFinal");
		
		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
		
	}
	
	

}