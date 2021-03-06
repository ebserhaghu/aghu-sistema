package br.gov.mec.aghu.model;

// Generated 15/03/2011 13:46:58 by Hibernate Tools 3.2.5.Beta

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Version;


import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatConvFxEtariasItens generated by hbm2java
 */
@Entity
@Table(name = "FAT_CONV_FX_ETARIAS_ITENS", schema = "AGH")
@org.hibernate.annotations.Cache(usage=org.hibernate.annotations.CacheConcurrencyStrategy.TRANSACTIONAL)
public class FatConvFxEtariaItem extends BaseEntityId<FatConvFxEtariaItemId> implements java.io.Serializable {
	private static final long serialVersionUID = 6033638730445903362L;
	
	private FatConvFxEtariaItemId id;
	private FatConvFaixaEtaria fatConvFaixaEtaria;
	private Integer version;

	public FatConvFxEtariaItem() {
	}

	public FatConvFxEtariaItem(FatConvFxEtariaItemId id,
			FatConvFaixaEtaria fatConvFaixaEtaria) {
		this.id = id;
		this.fatConvFaixaEtaria = fatConvFaixaEtaria;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "cfeSeqp", column = @Column(name = "CFE_SEQP", nullable = false, precision = 2, scale = 0)),
			@AttributeOverride(name = "cfeCnvCodigo", column = @Column(name = "CFE_CNV_CODIGO", nullable = false, precision = 3, scale = 0)),
			@AttributeOverride(name = "iphPhoSeq", column = @Column(name = "IPH_PHO_SEQ", nullable = false, precision = 4, scale = 0)),
			@AttributeOverride(name = "iphSeq", column = @Column(name = "IPH_SEQ", nullable = false, precision = 8, scale = 0)) })
	public FatConvFxEtariaItemId getId() {
		return this.id;
	}

	public void setId(FatConvFxEtariaItemId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "CFE_CNV_CODIGO", referencedColumnName = "CNV_CODIGO", nullable = false, insertable = false, updatable = false),
			@JoinColumn(name = "CFE_SEQP", referencedColumnName = "SEQP", nullable = false, insertable = false, updatable = false) })
	public FatConvFaixaEtaria getFatConvFaixaEtaria() {
		return this.fatConvFaixaEtaria;
	}

	public void setFatConvFaixaEtaria(FatConvFaixaEtaria fatConvFaixaEtaria) {
		this.fatConvFaixaEtaria = fatConvFaixaEtaria;
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
		FatConvFxEtariaItem other = (FatConvFxEtariaItem) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}



	public enum Fields {

		CFE_SEQP("id.cfeSeqp"),
		CFE_CNV_CODIGO("id.cfeCnvCodigo"),
		IPH_PHO_SEQ("id.iphPhoSeq"),
		IPH_SEQ("id.iphSeq"),
		FAT_CONV_FAIXA_ETARIA("fatConvFaixaEtaria"),
		;

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
