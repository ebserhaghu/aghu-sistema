package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;

import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.dominio.DominioTipoCalculoNpt;
import br.gov.mec.aghu.dominio.DominioTipoCaloria;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * AfaParamComponenteNpt generated by hbm2java
 */
@Entity
@Table(name = "AFA_PARAM_COMPONENTE_NPTS", schema = "AGH")
public class AfaParamComponenteNpt extends BaseEntityId<AfaParamComponenteNptId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4260298822220220841L;
	
	private AfaParamComponenteNptId id;
	private Integer version;
	private Date criadoEm;
	private Date alteradoEm;
	private DominioSituacao indSituacao;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer ummSeq;
	private Double fatorConversaoMl;
	private Double fatorConvUnidNitrogenio;
	private Double fatorConvUnidCalorias;
	private DominioTipoCaloria tipoCaloria;
	private Double fatorConvMlFosforo;
	private Double fatorConvMlMosm;
	private String indCalculaVolume;
	private DominioTipoCalculoNpt tipoParamCalculo;
	private Double volumeMaximoMl;
	private Integer serMatriculaAlteradoPor;
	private Short serVinCodigoAlteradoPor;
	private AfaComponenteNpt afaComponenteNpt;
	
	// FIXME Implementar este relacionamento
//	private Set<MpmItemPrescricaoNpt> mpmItemPrescricaoNptes = new HashSet<MpmItemPrescricaoNpt>(0);

	public AfaParamComponenteNpt() {
	}

	public AfaParamComponenteNpt(AfaParamComponenteNptId id, Date criadoEm, Integer serMatricula,
			Short serVinCodigo, Integer ummSeq, Double fatorConversaoMl) {
		this.id = id;
		this.criadoEm = criadoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.ummSeq = ummSeq;
		this.fatorConversaoMl = fatorConversaoMl;
	}

	public AfaParamComponenteNpt(AfaParamComponenteNptId id, Date criadoEm, Date alteradoEm,  Integer serMatricula,
			Short serVinCodigo, Integer ummSeq, Double fatorConversaoMl, Double fatorConvUnidNitrogenio, Double fatorConvUnidCalorias,
			Double fatorConvMlFosforo, Double fatorConvMlMosm, String indCalculaVolume, String tipoParamCalculo,
			Double volumeMaximoMl, Integer serMatriculaAlteradoPor, Short serVinCodigoAlteradoPor
//			, Set<MpmItemPrescricaoNpt> mpmItemPrescricaoNptes
			) {
		this.id = id;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.ummSeq = ummSeq;
		this.fatorConversaoMl = fatorConversaoMl;
		this.fatorConvUnidNitrogenio = fatorConvUnidNitrogenio;
		this.fatorConvUnidCalorias = fatorConvUnidCalorias;
		this.fatorConvMlFosforo = fatorConvMlFosforo;
		this.fatorConvMlMosm = fatorConvMlMosm;
		this.indCalculaVolume = indCalculaVolume;
		this.volumeMaximoMl = volumeMaximoMl;
		this.serMatriculaAlteradoPor = serMatriculaAlteradoPor;
		this.serVinCodigoAlteradoPor = serVinCodigoAlteradoPor;
//		this.mpmItemPrescricaoNptes = mpmItemPrescricaoNptes;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cnpMedMatCodigo", column = @Column(name = "CNP_MED_MAT_CODIGO", nullable = false)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false)) })
	public AfaParamComponenteNptId getId() {
		return this.id;
	}

	public void setId(AfaParamComponenteNptId id) {
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

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "UMM_SEQ", nullable = false)
	public Integer getUmmSeq() {
		return this.ummSeq;
	}

	public void setUmmSeq(Integer ummSeq) {
		this.ummSeq = ummSeq;
	}

	@Column(name = "FATOR_CONVERSAO_ML", nullable = false, precision = 17, scale = 17)
	public Double getFatorConversaoMl() {
		return this.fatorConversaoMl;
	}

	public void setFatorConversaoMl(Double fatorConversaoMl) {
		this.fatorConversaoMl = fatorConversaoMl;
	}

	@Column(name = "FATOR_CONV_UNID_NITROGENIO", precision = 17, scale = 17)
	public Double getFatorConvUnidNitrogenio() {
		return this.fatorConvUnidNitrogenio;
	}

	public void setFatorConvUnidNitrogenio(Double fatorConvUnidNitrogenio) {
		this.fatorConvUnidNitrogenio = fatorConvUnidNitrogenio;
	}

	@Column(name = "FATOR_CONV_UNID_CALORIAS", precision = 17, scale = 17)
	public Double getFatorConvUnidCalorias() {
		return this.fatorConvUnidCalorias;
	}

	public void setFatorConvUnidCalorias(Double fatorConvUnidCalorias) {
		this.fatorConvUnidCalorias = fatorConvUnidCalorias;
	}

	@Column(name = "TIPO_CALORIA", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoCaloria getTipoCaloria() {
		return this.tipoCaloria;
	}

	public void setTipoCaloria(DominioTipoCaloria tipoCaloria) {
		this.tipoCaloria = tipoCaloria;
	}

	@Column(name = "FATOR_CONV_ML_FOSFORO", precision = 17, scale = 17)
	public Double getFatorConvMlFosforo() {
		return this.fatorConvMlFosforo;
	}

	public void setFatorConvMlFosforo(Double fatorConvMlFosforo) {
		this.fatorConvMlFosforo = fatorConvMlFosforo;
	}

	@Column(name = "FATOR_CONV_ML_MOSM", precision = 17, scale = 17)
	public Double getFatorConvMlMosm() {
		return this.fatorConvMlMosm;
	}

	public void setFatorConvMlMosm(Double fatorConvMlMosm) {
		this.fatorConvMlMosm = fatorConvMlMosm;
	}

	@Column(name = "IND_CALCULA_VOLUME", length = 1)
	@Length(max = 1)
	public String getIndCalculaVolume() {
		return this.indCalculaVolume;
	}

	public void setIndCalculaVolume(String indCalculaVolume) {
		this.indCalculaVolume = indCalculaVolume;
	}

	@Column(name = "TIPO_PARAM_CALCULO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoCalculoNpt getTipoParamCalculo() {
		return this.tipoParamCalculo;
	}

	public void setTipoParamCalculo(DominioTipoCalculoNpt tipoParamCalculo) {
		this.tipoParamCalculo = tipoParamCalculo;
	}

	@Column(name = "VOLUME_MAXIMO_ML", precision = 17, scale = 17)
	public Double getVolumeMaximoMl() {
		return this.volumeMaximoMl;
	}

	public void setVolumeMaximoMl(Double volumeMaximoMl) {
		this.volumeMaximoMl = volumeMaximoMl;
	}

	@Column(name = "SER_MATRICULA_ALTERADO_POR")
	public Integer getSerMatriculaAlteradoPor() {
		return this.serMatriculaAlteradoPor;
	}

	public void setSerMatriculaAlteradoPor(Integer serMatriculaAlteradoPor) {
		this.serMatriculaAlteradoPor = serMatriculaAlteradoPor;
	}

	@Column(name = "SER_VIN_CODIGO_ALTERADO_POR")
	public Short getSerVinCodigoAlteradoPor() {
		return this.serVinCodigoAlteradoPor;
	}

	public void setSerVinCodigoAlteradoPor(Short serVinCodigoAlteradoPor) {
		this.serVinCodigoAlteradoPor = serVinCodigoAlteradoPor;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="CNP_MED_MAT_CODIGO", insertable=false, updatable=false)
	public AfaComponenteNpt getAfaComponenteNpt() {
		return afaComponenteNpt;
	}

	public void setAfaComponenteNpt(AfaComponenteNpt afaComponenteNpt) {
		this.afaComponenteNpt = afaComponenteNpt;
	}

//	@OneToMany(fetch = FetchType.LAZY, mappedBy = "afaParamComponenteNpt")
//	public Set<MpmItemPrescricaoNpt> getMpmItemPrescricaoNptes() {
//		return this.mpmItemPrescricaoNptes;
//	}
//
//	public void setMpmItemPrescricaoNptes(Set<MpmItemPrescricaoNpt> mpmItemPrescricaoNptes) {
//		this.mpmItemPrescricaoNptes = mpmItemPrescricaoNptes;
//	}

	public enum Fields {

		ID("id"),
		CNP_MED_MAT_CODIGO("id.cnpMedMatCodigo"),
		SEQP("id.seqp"),
		VERSION("version"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		IND_SITUACAO("indSituacao"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		UMM_SEQ("ummSeq"),
		FATOR_CONVERSAO_ML("fatorConversaoMl"),
		FATOR_CONV_UNID_NITROGENIO("fatorConvUnidNitrogenio"),
		FATOR_CONV_UNID_CALORIAS("fatorConvUnidCalorias"),
		TIPO_CALORIA("tipoCaloria"),
		FATOR_CONV_ML_FOSFORO("fatorConvMlFosforo"),
		FATOR_CONV_ML_MOSM("fatorConvMlMosm"),
		IND_CALCULA_VOLUME("indCalculaVolume"),
		TIPO_PARAM_CALCULO("tipoParamCalculo"),
		VOLUME_MAXIMO_ML("volumeMaximoMl"),
		SER_MATRICULA_ALTERADO_POR("serMatriculaAlteradoPor"),
		SER_VIN_CODIGO_ALTERADO_POR("serVinCodigoAlteradoPor"),
		COMPONENTE_NPT("afaComponenteNpt")
//		MPM_ITEM_PRESCRICAO_NPTES("mpmItemPrescricaoNptes")
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
		if (!(obj instanceof AfaParamComponenteNpt)) {
			return false;
		}
		AfaParamComponenteNpt other = (AfaParamComponenteNpt) obj;
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
