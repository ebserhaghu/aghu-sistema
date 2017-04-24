package br.gov.mec.aghu.model;

// Generated 10/08/2010 17:33:16 by Hibernate Tools 3.3.0.GA

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AssociationOverride;
import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.Parameter;

import br.gov.mec.aghu.dominio.DominioIndPendenteItemPrescricao;
import br.gov.mec.aghu.dominio.DominioTipoLipidio;
import br.gov.mec.aghu.dominio.DominioTipoVolume;
import br.gov.mec.aghu.core.commons.CoreUtil;
import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;

/**
 * MpmPrescricaoNpt generated by hbm2java
 * 
 * Registra a nutriÃ§Ã£o parenteral na prescriÃ§Ã£o mÃ©dica.
 */
@Entity
@Table(name = "MPM_PRESCRICAO_NPTS", schema = "AGH")

@AssociationOverride(name = "servidorMovimentado", joinColumns = {
		@JoinColumn(name = "SER_MATRICULA_MOVIMENTADA"),
		@JoinColumn(name = "SER_VIN_CODIGO_MOVIMENTADA") })
public class MpmPrescricaoNpt extends ItemPrescricaoMedica<MpmPrescricaoNptId> {

	private static final long serialVersionUID = 9175296076266849781L;
	private MpmPrescricaoNptId id;
	private RapServidores servidor;
	private MpmPrescricaoNpt prescricaoNpts;
	private AfaFormulaNptPadrao afaFormulaNptPadrao;
	
	private MpmProcedEspecialDiversos procedEspecialDiversos;
	private Date dthrInicio;
	private Boolean segueGotejoPadrao;
	private String justificativa;
	private String observacao;
	private Short volumeMlKgDia;
	private Short jnpSeq;
	private Double paramVolumeMl;
	private DominioTipoVolume tipoParamVolume;
	private Double volumeCalculado;
	private Double volumeDesejado;
	private Short tempoHInfusaoSolucao;
	private Short tempoHInfusaoLipidios;
	private Double caloriasDia;
	private Double caloriasKgDia;
	private Double relCalNProtNitrogenio;
	private Double percCalAminoacidos;
	private Double percCalLipidios;
	private Double percCalGlicose;
	private Double glicoseRelGlicLipid;
	private Double lipidiosRelGlicLipid;
	private Double relacaoCalcioFosforo;
	private Double concGlicSemLipidios;
	private Double concGlicComLipidios;
	private Double taxaInfusaoLipidios;
	private Double osmolaridadeSemLipidios;
	private Double osmolaridadeComLipidios;
	private Integer pcaAtdSeq;
	private Date pcaCriadoEm;
	private DominioTipoLipidio paramTipoLipidio;
	private Short duracaoTratSolicitado;
	private Boolean bombaInfusao;
	private AghAtendimentos atendimento;
	private Integer ordem;
	private Set<FatItemContaHospitalar> itensContasHospitalares = new HashSet<FatItemContaHospitalar>(
			0);
	private Set<MpmComposicaoPrescricaoNpt> composicoesPrescricaoNpt = new HashSet<MpmComposicaoPrescricaoNpt>(
			0);
	private Set<MpmLaudo> laudos = new HashSet<MpmLaudo>(0);
	private Set<MpmPrescricaoNpt> prescricoesNpts = new HashSet<MpmPrescricaoNpt>(
			0);
	private Integer version;
	
	private MpmPrescricaoNpt mpmPrescricaoNptAnterior;
	
//	private pnp_atd_seq_prcr_ant

	public MpmPrescricaoNpt() {
	}

	public MpmPrescricaoNpt(MpmPrescricaoNptId id, RapServidores servidor,
			MpmProcedEspecialDiversos procedEspecialDiversos, Date dthrInicio,
			Boolean segueGotejoPadrao,
			DominioIndPendenteItemPrescricao pendente, Date criadoEm,
			String justificativa, Boolean bombaInfusao) {
		this.id = id;
		this.servidor = servidor;
		this.procedEspecialDiversos = procedEspecialDiversos;
		this.dthrInicio = dthrInicio;
		this.segueGotejoPadrao = segueGotejoPadrao;
		this.indPendente = pendente;
		this.criadoEm = criadoEm;
		this.justificativa = justificativa;
		this.bombaInfusao = bombaInfusao;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public MpmPrescricaoNpt(MpmPrescricaoNptId id,
			RapServidores servidorMovimentoValido, RapServidores servidor,
			MpmPrescricaoNpt prescricaoNpts, RapServidores servidorMovimentado,
			RapServidores servidorValido, AfaFormulaNptPadrao fnpSeq,
			MpmProcedEspecialDiversos procedEspecialDiversos, Date dthrInicio,
			Boolean segueGotejoPadrao,
			DominioIndPendenteItemPrescricao pendente, Date criadoEm,
			String justificativa, Date dthrFim, String observacao,
			Short volumeMlKgDia, Date alteradoEm, Short jnpSeq,
			Double paramVolumeMl, DominioTipoVolume tipoParamVolume,
			Double volumeCalculado, Double volumeDesejado,
			Short tempoHInfusaoSolucao, Short tempoHInfusaoLipidios,
			Double caloriasDia, Double caloriasKgDia,
			Double relCalNProtNitrogenio, Double percCalAminoacidos,
			Double percCalLipidios, Double percCalGlicose,
			Double glicoseRelGlicLipid, Double lipidiosRelGlicLipid,
			Double relacaoCalcioFosforo, Double concGlicSemLipidios,
			Double concGlicComLipidios, Double taxaInfusaoLipidios,
			Double osmolaridadeSemLipidios, Double osmolaridadeComLipidios,
			Integer pcaAtdSeq, Date pcaCriadoEm, DominioTipoLipidio paramTipoLipidio,
			Short duracaoTratSolicitado, Boolean bombaInfusao,
			Set<FatItemContaHospitalar> itensContasHospitalares,
			Set<MpmLaudo> laudos, Set<MpmPrescricaoNpt> prescricoesNpts) {
		this.id = id;
		this.servidorValidaMovimentacao = servidorMovimentoValido;
		this.servidor = servidor;
		this.prescricaoNpts = prescricaoNpts;
		this.servidorMovimentado = servidorMovimentado;
		this.servidorValidacao = servidorValido;
		this.afaFormulaNptPadrao = fnpSeq;
		this.procedEspecialDiversos = procedEspecialDiversos;
		this.dthrInicio = dthrInicio;
		this.segueGotejoPadrao = segueGotejoPadrao;
		this.indPendente = pendente;
		this.criadoEm = criadoEm;
		this.justificativa = justificativa;
		this.dthrFim = dthrFim;
		this.observacao = observacao;
		this.volumeMlKgDia = volumeMlKgDia;
		this.alteradoEm = alteradoEm;
		this.jnpSeq = jnpSeq;
		this.paramVolumeMl = paramVolumeMl;
		this.tipoParamVolume = tipoParamVolume;
		this.volumeCalculado = volumeCalculado;
		this.volumeDesejado = volumeDesejado;
		this.tempoHInfusaoSolucao = tempoHInfusaoSolucao;
		this.tempoHInfusaoLipidios = tempoHInfusaoLipidios;
		this.caloriasDia = caloriasDia;
		this.caloriasKgDia = caloriasKgDia;
		this.relCalNProtNitrogenio = relCalNProtNitrogenio;
		this.percCalAminoacidos = percCalAminoacidos;
		this.percCalLipidios = percCalLipidios;
		this.percCalGlicose = percCalGlicose;
		this.glicoseRelGlicLipid = glicoseRelGlicLipid;
		this.lipidiosRelGlicLipid = lipidiosRelGlicLipid;
		this.relacaoCalcioFosforo = relacaoCalcioFosforo;
		this.concGlicSemLipidios = concGlicSemLipidios;
		this.concGlicComLipidios = concGlicComLipidios;
		this.taxaInfusaoLipidios = taxaInfusaoLipidios;
		this.osmolaridadeSemLipidios = osmolaridadeSemLipidios;
		this.osmolaridadeComLipidios = osmolaridadeComLipidios;
		this.pcaAtdSeq = pcaAtdSeq;
		this.pcaCriadoEm = pcaCriadoEm;
		this.paramTipoLipidio = paramTipoLipidio;
		this.duracaoTratSolicitado = duracaoTratSolicitado;
		this.bombaInfusao = bombaInfusao;
		this.itensContasHospitalares = itensContasHospitalares;
		this.laudos = laudos;
		this.prescricoesNpts = prescricoesNpts;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "atdSeq", column = @Column(name = "ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false, precision = 8, scale = 0)) })
	public MpmPrescricaoNptId getId() {
		return this.id;
	}

	public void setId(MpmPrescricaoNptId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PNP_ATD_SEQ", referencedColumnName = "ATD_SEQ"),
			@JoinColumn(name = "PNP_SEQ", referencedColumnName = "SEQ") })
	public MpmPrescricaoNpt getPrescricaoNpts() {
		return this.prescricaoNpts;
	}

	public void setPrescricaoNpts(MpmPrescricaoNpt prescricaoNpts) {
		this.prescricaoNpts = prescricaoNpts;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FNP_SEQ")
	public AfaFormulaNptPadrao getAfaFormulaNptPadrao() {
		return this.afaFormulaNptPadrao;
	}

	public void setAfaFormulaNptPadrao(AfaFormulaNptPadrao afaFormulaNptPadrao) {
		this.afaFormulaNptPadrao = afaFormulaNptPadrao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PED_SEQ", nullable = true)	
	public MpmProcedEspecialDiversos getProcedEspecialDiversos() {
		return procedEspecialDiversos;
	}

	public void setProcedEspecialDiversos(
			MpmProcedEspecialDiversos procedEspecialDiversos) {
		this.procedEspecialDiversos = procedEspecialDiversos;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_INICIO", nullable = false, length = 7)
	public Date getDthrInicio() {
		return this.dthrInicio;
	}

	public void setDthrInicio(Date dthrInicio) {
		this.dthrInicio = dthrInicio;
	}

	@Column(name = "IND_SEGUE_GOTEJO_PADRAO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getSegueGotejoPadrao() {
		return this.segueGotejoPadrao;
	}

	public void setSegueGotejoPadrao(Boolean segueGotejoPadrao) {
		this.segueGotejoPadrao = segueGotejoPadrao;
	}

	@Column(name = "JUSTIFICATIVA", nullable = false, length = 240)
	public String getJustificativa() {
		return this.justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	@Column(name = "OBSERVACAO", length = 500)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "VOLUME_ML_KG_DIA", precision = 4, scale = 0)
	public Short getVolumeMlKgDia() {
		return this.volumeMlKgDia;
	}

	public void setVolumeMlKgDia(Short volumeMlKgDia) {
		this.volumeMlKgDia = volumeMlKgDia;
	}

	@Column(name = "JNP_SEQ", precision = 3, scale = 0)
	public Short getJnpSeq() {
		return this.jnpSeq;
	}

	public void setJnpSeq(Short jnpSeq) {
		this.jnpSeq = jnpSeq;
	}

	@Column(name = "PARAM_VOLUME_ML", precision = 10, scale = 4)
	public Double getParamVolumeMl() {
		return this.paramVolumeMl;
	}

	public void setParamVolumeMl(Double paramVolumeMl) {
		this.paramVolumeMl = paramVolumeMl;
	}

	@Column(name = "TIPO_PARAM_VOLUME", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoVolume getTipoParamVolume() {
		return this.tipoParamVolume;
	}

	public void setTipoParamVolume(DominioTipoVolume tipoParamVolume) {
		this.tipoParamVolume = tipoParamVolume;
	}

	@Column(name = "VOLUME_CALCULADO", precision = 10, scale = 4)
	public Double getVolumeCalculado() {
		return this.volumeCalculado;
	}

	public void setVolumeCalculado(Double volumeCalculado) {
		this.volumeCalculado = volumeCalculado;
	}

	@Column(name = "VOLUME_DESEJADO", precision = 10, scale = 4)
	public Double getVolumeDesejado() {
		return this.volumeDesejado;
	}

	public void setVolumeDesejado(Double volumeDesejado) {
		this.volumeDesejado = volumeDesejado;
	}

	@Column(name = "TEMPO_H_INFUSAO_SOLUCAO", precision = 3, scale = 0)
	public Short getTempoHInfusaoSolucao() {
		return this.tempoHInfusaoSolucao;
	}

	public void setTempoHInfusaoSolucao(Short tempoHInfusaoSolucao) {
		this.tempoHInfusaoSolucao = tempoHInfusaoSolucao;
	}

	@Column(name = "TEMPO_H_INFUSAO_LIPIDIOS", precision = 3, scale = 0)
	public Short getTempoHInfusaoLipidios() {
		return this.tempoHInfusaoLipidios;
	}

	public void setTempoHInfusaoLipidios(Short tempoHInfusaoLipidios) {
		this.tempoHInfusaoLipidios = tempoHInfusaoLipidios;
	}

	@Column(name = "CALORIAS_DIA", precision = 8)
	public Double getCaloriasDia() {
		return this.caloriasDia;
	}

	public void setCaloriasDia(Double caloriasDia) {
		this.caloriasDia = caloriasDia;
	}

	@Column(name = "CALORIAS_KG_DIA", precision = 8)
	public Double getCaloriasKgDia() {
		return this.caloriasKgDia;
	}

	public void setCaloriasKgDia(Double caloriasKgDia) {
		this.caloriasKgDia = caloriasKgDia;
	}

	@Column(name = "REL_CAL_N_PROT_NITROGENIO", precision = 8)
	public Double getRelCalNProtNitrogenio() {
		return this.relCalNProtNitrogenio;
	}

	public void setRelCalNProtNitrogenio(Double relCalNProtNitrogenio) {
		this.relCalNProtNitrogenio = relCalNProtNitrogenio;
	}

	@Column(name = "PERC_CAL_AMINOACIDOS", precision = 5)
	public Double getPercCalAminoacidos() {
		return this.percCalAminoacidos;
	}

	public void setPercCalAminoacidos(Double percCalAminoacidos) {
		this.percCalAminoacidos = percCalAminoacidos;
	}

	@Column(name = "PERC_CAL_LIPIDIOS", precision = 5)
	public Double getPercCalLipidios() {
		return this.percCalLipidios;
	}

	public void setPercCalLipidios(Double percCalLipidios) {
		this.percCalLipidios = percCalLipidios;
	}

	@Column(name = "PERC_CAL_GLICOSE", precision = 5)
	public Double getPercCalGlicose() {
		return this.percCalGlicose;
	}

	public void setPercCalGlicose(Double percCalGlicose) {
		this.percCalGlicose = percCalGlicose;
	}

	@Column(name = "GLICOSE_REL_GLIC_LIPID", precision = 5)
	public Double getGlicoseRelGlicLipid() {
		return this.glicoseRelGlicLipid;
	}

	public void setGlicoseRelGlicLipid(Double glicoseRelGlicLipid) {
		this.glicoseRelGlicLipid = glicoseRelGlicLipid;
	}

	@Column(name = "LIPIDIOS_REL_GLIC_LIPID", precision = 5)
	public Double getLipidiosRelGlicLipid() {
		return this.lipidiosRelGlicLipid;
	}

	public void setLipidiosRelGlicLipid(Double lipidiosRelGlicLipid) {
		this.lipidiosRelGlicLipid = lipidiosRelGlicLipid;
	}

	@Column(name = "RELACAO_CALCIO_FOSFORO", precision = 8)
	public Double getRelacaoCalcioFosforo() {
		return this.relacaoCalcioFosforo;
	}

	public void setRelacaoCalcioFosforo(Double relacaoCalcioFosforo) {
		this.relacaoCalcioFosforo = relacaoCalcioFosforo;
	}

	@Column(name = "CONC_GLIC_SEM_LIPIDIOS", precision = 5)
	public Double getConcGlicSemLipidios() {
		return this.concGlicSemLipidios;
	}

	public void setConcGlicSemLipidios(Double concGlicSemLipidios) {
		this.concGlicSemLipidios = concGlicSemLipidios;
	}

	@Column(name = "CONC_GLIC_COM_LIPIDIOS", precision = 5)
	public Double getConcGlicComLipidios() {
		return this.concGlicComLipidios;
	}

	public void setConcGlicComLipidios(Double concGlicComLipidios) {
		this.concGlicComLipidios = concGlicComLipidios;
	}

	@Column(name = "TAXA_INFUSAO_LIPIDIOS", precision = 5)
	public Double getTaxaInfusaoLipidios() {
		return this.taxaInfusaoLipidios;
	}

	public void setTaxaInfusaoLipidios(Double taxaInfusaoLipidios) {
		this.taxaInfusaoLipidios = taxaInfusaoLipidios;
	}

	@Column(name = "OSMOLARIDADE_SEM_LIPIDIOS", precision = 8)
	public Double getOsmolaridadeSemLipidios() {
		return this.osmolaridadeSemLipidios;
	}

	public void setOsmolaridadeSemLipidios(Double osmolaridadeSemLipidios) {
		this.osmolaridadeSemLipidios = osmolaridadeSemLipidios;
	}

	@Column(name = "OSMOLARIDADE_COM_LIPIDIOS", precision = 8)
	public Double getOsmolaridadeComLipidios() {
		return this.osmolaridadeComLipidios;
	}

	public void setOsmolaridadeComLipidios(Double osmolaridadeComLipidios) {
		this.osmolaridadeComLipidios = osmolaridadeComLipidios;
	}

	@Column(name = "PCA_ATD_SEQ", precision = 7, scale = 0)
	public Integer getPcaAtdSeq() {
		return this.pcaAtdSeq;
	}

	public void setPcaAtdSeq(Integer pcaAtdSeq) {
		this.pcaAtdSeq = pcaAtdSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "PCA_CRIADO_EM", length = 7)
	public Date getPcaCriadoEm() {
		return this.pcaCriadoEm;
	}

	public void setPcaCriadoEm(Date pcaCriadoEm) {
		this.pcaCriadoEm = pcaCriadoEm;
	}

	@Column(name = "PARAM_TIPO_LIPIDIO", length = 2)
	@org.hibernate.annotations.Type(parameters = { @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioTipoLipidio") }, type = "br.gov.mec.aghu.core.model.jpa.DominioStringUserType")	
	public DominioTipoLipidio getParamTipoLipidio() {
		return this.paramTipoLipidio;
	}

	public void setParamTipoLipidio(DominioTipoLipidio paramTipoLipidio) {
		this.paramTipoLipidio = paramTipoLipidio;
	}

	@Column(name = "DURACAO_TRAT_SOLICITADO", precision = 3, scale = 0)
	public Short getDuracaoTratSolicitado() {
		return this.duracaoTratSolicitado;
	}

	public void setDuracaoTratSolicitado(Short duracaoTratSolicitado) {
		this.duracaoTratSolicitado = duracaoTratSolicitado;
	}

	@Column(name = "IND_BOMBA_INFUSAO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getBombaInfusao() {
		return this.bombaInfusao;
	}

	public void setBombaInfusao(Boolean bombaInfusao) {
		this.bombaInfusao = bombaInfusao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prescricaoNpt")
	public Set<FatItemContaHospitalar> getItensContasHospitalares() {
		return this.itensContasHospitalares;
	}

	public void setItensContasHospitalares(
			Set<FatItemContaHospitalar> itensContasHospitalares) {
		this.itensContasHospitalares = itensContasHospitalares;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mpmPrescricaoNpts")
	@Cascade( { org.hibernate.annotations.CascadeType.DELETE })
	public Set<MpmComposicaoPrescricaoNpt> getComposicoesPrescricaoNpt() {
		return composicoesPrescricaoNpt;
	}

	public void setComposicoesPrescricaoNpt(
			Set<MpmComposicaoPrescricaoNpt> composicoesPrescricaoNpt) {
		this.composicoesPrescricaoNpt = composicoesPrescricaoNpt;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prescricaoNpts")
	public Set<MpmLaudo> getLaudos() {
		return this.laudos;
	}

	public void setLaudos(Set<MpmLaudo> laudos) {
		this.laudos = laudos;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prescricaoNpts")
	public Set<MpmPrescricaoNpt> getPrescricoesNpts() {
		return this.prescricoesNpts;
	}

	public void setPrescricoesNpts(Set<MpmPrescricaoNpt> prescricoesNpts) {
		this.prescricoesNpts = prescricoesNpts;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;

		result = prime * result
				+ (this.getId() == null ? 0 : this.getId().hashCode());

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

		MpmPrescricaoNpt other = (MpmPrescricaoNpt) obj;

		return this.getId() != null && this.getId().equals(other.getId());
	}

	private enum PrescricaoNptsExceptionCode implements BusinessExceptionCode {
		MPM_PNP_CK3, MPM_PNP_CK5
	}

	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validarConstraints() {

		// dthr_fim is null or dthr_fim >= dthr_inicio
		if (!(this.dthrFim == null || CoreUtil.isMaiorOuIgualDatas(
				this.dthrFim, this.dthrInicio))) {
			throw new BaseRuntimeException(
					PrescricaoNptsExceptionCode.MPM_PNP_CK3);
		}

		// PARAM_TIPO_LIPIDIO in (10, 20)
//		if (!("10".equals(this.paramTipoLipidio) || !"20"
//				.equals(this.paramTipoLipidio))) {
//			throw new BaseRuntimeException(
//					PrescricaoNptsExceptionCode.MPM_PNP_CK5);
//		}
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @seebr.gov.mec.aghu.model.interfaces.PrescricaoMedicaDescricao#
	 * getDescricaoFormatada()
	 */
	@Override
	@Transient
	public String getDescricaoFormatada() {
		// TODO Auto-generated method stub
		return null;
	}

	public enum Fields {
		ID("id"), ID_ATD_SEQ("id.atdSeq"), ID_SEQ("id.seq"), DTHR_INICIO("dthrInicio"), DTHR_FIM("dthrFim"), CRIADO_EM(
				"criadoEm"), PME("prescricaoMedica"), PME_ID("prescricaoMedica.id"), PME_ATD_SEQ("prescricaoMedica.id.atdSeq"), 
				IND_PENDENTE("indPendente"), PED_SEQ("procedEspecialDiversos.seq"),
				PED_DESCRICAO("procedEspecialDiversos.descricao"), PME_SEQ("prescricaoMedica.id.seq"), 
				ALTERADO_EM("alteradoEm"), PRESCRICAO_NPTS("prescricaoNpts"), SERVIDOR_VALIDACAO("servidorValidacao"),
				PRESCRICAO_NPTS_SEQ("prescricaoNpts.id.seq"), PRESCRICAO_NPTS_ATD_SEQ("prescricaoNpts.id.atdSeq"),
				SERVIDOR_VALIDACAO_MATRICULA("servidorValidacao.id.matricula"), SERVIDOR_VIN_CODIGO("servidor.id.vinCodigo"),
				SERVIDOR_MATRICULA("servidor.id.matricula"), AFA_FORMULA_NPT_PADRAO("afaFormulaNptPadrao"), SEQ_AFA_FORMULA_NPTP_ADRAO("afaFormulaNptPadrao.seq"),
				SERVIDOR_MOVIMENTADO_MATRICULA("servidorMovimentado.id.matricula"),
				SERVIDOR_MOVIMENTADO_CODIGO("servidorMovimentado.id.vinCodigo"),
				SEGUE_GOTEJO_PADRAO("segueGotejoPadrao"), JUSTIFICATIVA("justificativa"),
				OBSERVACAO("observacao"), VOLUME_MLKG_DIA("volumeMlKgDia"),
				SERVIDOR_VALIDA_MOVIMENTACAO_CODIGO("servidorValidaMovimentacao.id.vinCodigo"),
				SERVIDOR_VALIDA_MOVIMENTACAO_MATRICULA("servidorValidaMovimentacao.id.matricula"),
				SERVIDOR_VALIDACAO_CODIGO("servidorValidacao.id.vinCodigo"), JNP_SEQ("jnpSeq"),
				PARAM_VOLUME_ML("paramVolumeMl"), TIPO_PARAM_VOLUME("tipoParamVolume"), VOLUME_CALCULADO("volumeCalculado"), 
				VOLUME_DESEJADO("volumeDesejado"), TEMPO_H_INFUSAO_SOLUCAO("tempoHInfusaoSolucao"), TEMPO_H_INFUSAO_LIPIDIOS("tempoHInfusaoLipidios"), 
				CALORIAS_DIA("caloriasDia"), CALORIAS_KG_DIA("caloriasKgDia"), REL_CAL_N_PROT_NITROGENIO("relCalNProtNitrogenio"),
				PERC_CAL_AMINOACIDOS("percCalAminoacidos"), PERC_CAL_LIPIDIOS("percCalLipidios"),PERC_CAL_GLICOSE("percCalGlicose"),
				GLICOSE_REL_GLIC_LIPID("glicoseRelGlicLipid"), LIPIDIOS_REL_GLIC_LIPID("lipidiosRelGlicLipid"),	RELACAO_CALCIO_FOSFORO("relacaoCalcioFosforo"),
				CONC_GLIC_SEM_LIPIDIOS("concGlicSemLipidios"), CONC_GLIC_COM_LIPIDIOS("concGlicComLipidios"), TAXA_INFUSAO_LIPIDIOS("taxaInfusaoLipidios"),
				OSMOLARIDADE_SEM_LIPIDIOS("osmolaridadeSemLipidios"), OSMOLARIDADE_COM_LIPIDIOS("osmolaridadeComLipidios"), PCA_ATD_SEQ("pcaAtdSeq"),
				PCA_CRIADO_EM("pcaCriadoEm"), PARAM_TIPO_LIPIDIO("paramTipoLipidio"), DURACAO_TRAT_SOLICITADO("duracaoTratSolicitado"),
				IND_BOMBA_INFUSAO("bombaInfusao"), DTHR_VALIDA("dthrValida"), DTHR_VALIDA_MVTO("dthrValidaMovimentacao"), PNP_ATD_SEQ_PRCR_ANT("mpmPrescricaoNptAnterior.id.atdSeq"),
				PNP_SEQ_PRCR_ANT("mpmPrescricaoNptAnterior.id.seq"), SERVIDOR_VALIDACAO_ID("servidorValidacao.id"), ATENDIMENTO("atendimento"),COMPOSICOES_PRESCRICAO_NPT("composicoesPrescricaoNpt");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}
	
	@Override
	@Transient
	public ItemPrescricaoMedica getAnterior() {
		return this.getPrescricaoNpts();
	}

	@Override
	public boolean possuiFilhos() {
		return getPrescricoesNpts().size() > 0;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PNP_ATD_SEQ_PRCR_ANT", referencedColumnName = "ATD_SEQ"),
			@JoinColumn(name = "PNP_SEQ_PRCR_ANT", referencedColumnName = "SEQ") })
	public MpmPrescricaoNpt getMpmPrescricaoNptAnterior() {
		return mpmPrescricaoNptAnterior;
	}

	public void setMpmPrescricaoNptAnterior(MpmPrescricaoNpt mpmPrescricaoNptAnterior) {
		this.mpmPrescricaoNptAnterior = mpmPrescricaoNptAnterior;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ATD_SEQ", nullable = true, insertable = false, updatable = false)	
	public AghAtendimentos getAtendimento() {
		return atendimento;
	}

	public void setAtendimento(AghAtendimentos atendimento) {
		this.atendimento = atendimento;
	}
	
	@Column(name = "ORDEM", nullable = false)
	public Integer getOrdem() {
		return this.ordem;
	}
	
	public void setOrdem(Integer ordemRelatorio) {
		this.ordem = ordemRelatorio;
	}
}