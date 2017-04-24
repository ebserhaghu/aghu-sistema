package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AelCrtcCrdgBull generated by hbm2java
 */
@Entity
@Table(name = "AEL_CRTC_CRDG_BULL", schema = "AGH")
public class AelCrtcCrdgBull extends BaseEntityId<AelCrtcCrdgBullId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 969038108655983895L;
	private AelCrtcCrdgBullId id;

	public AelCrtcCrdgBull() {
	}

	public AelCrtcCrdgBull(AelCrtcCrdgBullId id) {
		this.id = id;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "codTipoExmeCrdl", column = @Column(name = "COD_TIPO_EXME_CRDL", nullable = false)),
			@AttributeOverride(name = "codGrpoCrtcCrdl", column = @Column(name = "COD_GRPO_CRTC_CRDL", nullable = false)),
			@AttributeOverride(name = "codCrtcCrdg", column = @Column(name = "COD_CRTC_CRDG", nullable = false)),
			@AttributeOverride(name = "descCrtcCrdg", column = @Column(name = "DESC_CRTC_CRDG", nullable = false, length = 60)),
			@AttributeOverride(name = "version", column = @Column(name = "VERSION", nullable = false)) })
	public AelCrtcCrdgBullId getId() {
		return this.id;
	}

	public void setId(AelCrtcCrdgBullId id) {
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

}