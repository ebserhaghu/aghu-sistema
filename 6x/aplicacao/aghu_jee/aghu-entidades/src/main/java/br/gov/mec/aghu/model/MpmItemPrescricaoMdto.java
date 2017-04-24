package br.gov.mec.aghu.model;

// Generated 10/08/2010 17:33:16 by Hibernate Tools 3.3.0.GA

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

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
import javax.persistence.Table;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;

import br.gov.mec.aghu.core.persistence.BaseEntityId;
import br.gov.mec.aghu.core.utils.AghuNumberFormat;
import br.gov.mec.aghu.core.utils.StringUtil;
import br.gov.mec.aghu.dominio.DominioDuracaoCalculo;
import br.gov.mec.aghu.dominio.DominioTipoCalculoDose;
import br.gov.mec.aghu.dominio.DominioTipoUsoMdtoAntimicrobia;
import br.gov.mec.aghu.dominio.DominioUnidadeBaseParametroCalculo;
import br.gov.mec.aghu.model.interfaces.IItemPrescricaoMedica;

/**
 * MpmItemPrescricaoMdto generated by hbm2java
 */
@Entity
@Table(name = "MPM_ITEM_PRESCRICAO_MDTOS", schema = "AGH")

public class MpmItemPrescricaoMdto extends BaseEntityId<MpmItemPrescricaoMdtoId> implements java.io.Serializable,
		IItemPrescricaoMedica {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3187688395831279241L;

	public static final Object ADMINISTRAR_DOSE = " - Administrar ";
	
	// TODO Implementar coluna version quando utilizar essa entidade para
	// persistencia

	private MpmItemPrescricaoMdtoId id;
	private MpmPrescricaoMdto prescricaoMedicamento;
	private AfaMedicamento medicamento;
	private AfaFormaDosagem formaDosagem;
	private BigDecimal dose;
	private Boolean mdtoAguardaEntrega;
	private Short qtdeCalcSist24h;
	private DominioTipoUsoMdtoAntimicrobia usoMdtoAntimicrobia;
	private Double doseCalculada;
	private Double qtdeMgKg;
	private Double qtdeMgSuperfCorporal;
	private DominioTipoCalculoDose tipoCalculoDose;
	private String observacao;
	private Short duracaoTratAprovado;
	private Boolean origemJustificativa;
	private Double qtdeParamCalculo;
	private DominioUnidadeBaseParametroCalculo baseParamCalculo;
	private MpmUnidadeMedidaMedica unidadeMedidaMedica;
	private Integer duracaoParamCalculo;
	private DominioDuracaoCalculo unidDuracaoCalculo;
	private MpmParamCalculoPrescricao paramCalculoPrescricao; 
	private MpmJustificativaUsoMdto justificativaUsoMedicamento;
	private Set<MpmLaudo> laudos = new HashSet<MpmLaudo>(0);
	private MpmItemPrescParecerMdto itemPrescParecerMdto;
	private Integer ordem;
	
	//Transient
	private String descricaoMedicamentoPrescrito;
	
	private final static String LABEL_DILUIR = "Diluir";
	private final static String LABEL_ADMINISTRAR = "Administrar";
	
	
	public MpmItemPrescricaoMdto() {
	}

	public MpmItemPrescricaoMdto(MpmItemPrescricaoMdtoId id, Integer fdsSeq,
			BigDecimal dose, Boolean mdtoAguardaEntrega, Short qtdeCalcSist24h,
			Boolean origemJustificativa) {
		this.id = id;
		this.dose = dose;
		this.mdtoAguardaEntrega = mdtoAguardaEntrega;
		this.qtdeCalcSist24h = qtdeCalcSist24h;
		this.origemJustificativa = origemJustificativa;
	}

	public MpmItemPrescricaoMdto(MpmItemPrescricaoMdtoId id,
			AfaFormaDosagem fdsSeq, BigDecimal dose, Boolean mdtoAguardaEntrega,
			Short qtdeCalcSist24h,
			DominioTipoUsoMdtoAntimicrobia usoMdtoAntimicrobia,
			Double doseCalculada, Double qtdeMgKg, Double qtdeMgSuperfCorporal,
			DominioTipoCalculoDose tipoCalculoDose, String observacao,
			Short duracaoTratAprovado, Boolean origemJustificativa,
			Double qtdeParamCalculo, DominioUnidadeBaseParametroCalculo baseParamCalculo,
			MpmUnidadeMedidaMedica unidadeMedidaMedica, Integer duracaoParamCalculo,
			DominioDuracaoCalculo unidDuracaoCalculo, MpmParamCalculoPrescricao paramCalculoPrescricao,
			Set<MpmLaudo> laudos) {
		this.id = id;
		this.formaDosagem = fdsSeq;
		this.dose = dose;
		this.mdtoAguardaEntrega = mdtoAguardaEntrega;
		this.qtdeCalcSist24h = qtdeCalcSist24h;
		this.usoMdtoAntimicrobia = usoMdtoAntimicrobia;
		this.doseCalculada = doseCalculada;
		this.qtdeMgKg = qtdeMgKg;
		this.qtdeMgSuperfCorporal = qtdeMgSuperfCorporal;
		this.tipoCalculoDose = tipoCalculoDose;
		this.observacao = observacao;
		this.duracaoTratAprovado = duracaoTratAprovado;
		this.origemJustificativa = origemJustificativa;
		this.qtdeParamCalculo = qtdeParamCalculo;
		this.baseParamCalculo = baseParamCalculo;
		this.unidadeMedidaMedica = unidadeMedidaMedica;
		this.duracaoParamCalculo = duracaoParamCalculo;
		this.unidDuracaoCalculo = unidDuracaoCalculo;
		this.paramCalculoPrescricao = paramCalculoPrescricao;
		this.laudos = laudos;
	}

	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "pmdAtdSeq", column = @Column(name = "PMD_ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "pmdSeq", column = @Column(name = "PMD_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "medMatCodigo", column = @Column(name = "MED_MAT_CODIGO", nullable = false, precision = 6, scale = 0)),
			@AttributeOverride(name = "seqp", column = @Column(name = "SEQP", nullable = false, precision = 4, scale = 0)) })
	public MpmItemPrescricaoMdtoId getId() {
		return this.id;
	}

	public void setId(MpmItemPrescricaoMdtoId id) {
		this.id = id;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PMD_ATD_SEQ", referencedColumnName = "ATD_SEQ", insertable=false, updatable=false),
			@JoinColumn(name = "PMD_SEQ", referencedColumnName = "SEQ", insertable=false, updatable=false) })
	public MpmPrescricaoMdto getPrescricaoMedicamento() {
		return prescricaoMedicamento;
	}
	
	public void setPrescricaoMedicamento(MpmPrescricaoMdto prescricaoMedicamento) {
		this.prescricaoMedicamento = prescricaoMedicamento;
	}
	
	@ManyToOne
	@JoinColumn(name="FDS_SEQ", nullable = false)
	public AfaFormaDosagem getFormaDosagem() {
		return formaDosagem;
	}
	
	public void setFormaDosagem(AfaFormaDosagem formaDosagem) {
		this.formaDosagem = formaDosagem;
	}

	@Column(name = "DOSE", nullable = false, precision = 14, scale = 4)
	public BigDecimal getDose() {
		return this.dose;
	}

	public void setDose(BigDecimal dose) {
		this.dose = dose;
	}

	@Column(name = "IND_MDTO_AGUARDA_ENTREGA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getMdtoAguardaEntrega() {
		return this.mdtoAguardaEntrega;
	}

	public void setMdtoAguardaEntrega(Boolean mdtoAguardaEntrega) {
		this.mdtoAguardaEntrega = mdtoAguardaEntrega;
	}

	@Column(name = "QTDE_CALC_SIST_24H", nullable = false, precision = 4, scale = 0)
	public Short getQtdeCalcSist24h() {
		return this.qtdeCalcSist24h;
	}

	public void setQtdeCalcSist24h(Short qtdeCalcSist24h) {
		this.qtdeCalcSist24h = qtdeCalcSist24h;
	}

	@Column(name = "IND_USO_MDTO_ANTIMICROB", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoUsoMdtoAntimicrobia getUsoMdtoAntimicrobia() {
		return this.usoMdtoAntimicrobia;
	}

	public void setUsoMdtoAntimicrobia(
			DominioTipoUsoMdtoAntimicrobia usoMdtoAntimicrobia) {
		this.usoMdtoAntimicrobia = usoMdtoAntimicrobia;
	}

	@Column(name = "DOSE_CALCULADA", precision = 14, scale = 4)
	public Double getDoseCalculada() {
		return this.doseCalculada;
	}

	public void setDoseCalculada(Double doseCalculada) {
		this.doseCalculada = doseCalculada;
	}

	@Column(name = "QTDE_MG_KG", precision = 6)
	public Double getQtdeMgKg() {
		return this.qtdeMgKg;
	}

	public void setQtdeMgKg(Double qtdeMgKg) {
		this.qtdeMgKg = qtdeMgKg;
	}

	@Column(name = "QTDE_MG_SUPERF_CORPORAL", precision = 6)
	public Double getQtdeMgSuperfCorporal() {
		return this.qtdeMgSuperfCorporal;
	}

	public void setQtdeMgSuperfCorporal(Double qtdeMgSuperfCorporal) {
		this.qtdeMgSuperfCorporal = qtdeMgSuperfCorporal;
	}

	@Column(name = "TIPO_CALCULO_DOSE", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoCalculoDose getTipoCalculoDose() {
		return this.tipoCalculoDose;
	}

	public void setTipoCalculoDose(DominioTipoCalculoDose tipoCalculoDose) {
		this.tipoCalculoDose = tipoCalculoDose;
	}

	@Column(name = "OBSERVACAO", length = 120)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "DURACAO_TRAT_APROVADO", precision = 3, scale = 0)
	public Short getDuracaoTratAprovado() {
		return this.duracaoTratAprovado;
	}

	public void setDuracaoTratAprovado(Short duracaoTratAprovado) {
		this.duracaoTratAprovado = duracaoTratAprovado;
	}

	@Column(name = "IND_ORIGEM_JUSTIF", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getOrigemJustificativa() {
		return this.origemJustificativa;
	}

	public void setOrigemJustificativa(Boolean origemJustificativa) {
		this.origemJustificativa = origemJustificativa;
	}

	@Column(name = "QTDE_PARAM_CALCULO", precision = 8, scale = 3)
	public Double getQtdeParamCalculo() {
		return this.qtdeParamCalculo;
	}

	public void setQtdeParamCalculo(Double qtdeParamCalculo) {
		this.qtdeParamCalculo = qtdeParamCalculo;
	}

	@Column(name = "BASE_PARAM_CALCULO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioUnidadeBaseParametroCalculo getBaseParamCalculo() {
		return this.baseParamCalculo;
	}

	public void setBaseParamCalculo(DominioUnidadeBaseParametroCalculo baseParamCalculo) {
		this.baseParamCalculo = baseParamCalculo;
	}
	
	@ManyToOne
	@JoinColumn(name="MED_MAT_CODIGO", insertable=false, updatable=false)
	public AfaMedicamento getMedicamento() {
		return medicamento;
	}
	
	public void setMedicamento(AfaMedicamento medicamento) {
		this.medicamento = medicamento;
	}

	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="UMM_SEQ", referencedColumnName="SEQ")
	public MpmUnidadeMedidaMedica getUnidadeMedidaMedica() {
		return unidadeMedidaMedica;
	}

	public void setUnidadeMedidaMedica(MpmUnidadeMedidaMedica unidadeMedidaMedica) {
		this.unidadeMedidaMedica = unidadeMedidaMedica;
	}
	
	@Column(name = "DURACAO_PARAM_CALCULO", precision = 6, scale = 0)
	public Integer getDuracaoParamCalculo() {
		return this.duracaoParamCalculo;
	}

	public void setDuracaoParamCalculo(Integer duracaoParamCalculo) {
		this.duracaoParamCalculo = duracaoParamCalculo;
	}

	@Column(name = "UNID_DURACAO_CALCULO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioDuracaoCalculo getUnidDuracaoCalculo() {
		return this.unidDuracaoCalculo;
	}

	public void setUnidDuracaoCalculo(DominioDuracaoCalculo unidDuracaoCalculo) {
		this.unidDuracaoCalculo = unidDuracaoCalculo;
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PCA_ATD_SEQ", referencedColumnName = "ATD_SEQ"),
			@JoinColumn(name = "PCA_CRIADO_EM", referencedColumnName = "CRIADO_EM") })
	public MpmParamCalculoPrescricao getParamCalculoPrescricao() {
		return paramCalculoPrescricao;
	}

	public void setParamCalculoPrescricao(
			MpmParamCalculoPrescricao paramCalculoPrescricao) {
		this.paramCalculoPrescricao = paramCalculoPrescricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "itemPrescricaoMdtos")
	public Set<MpmLaudo> getLaudos() {
		return this.laudos;
	}

	public void setLaudos(Set<MpmLaudo> laudos) {
		this.laudos = laudos;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "JUM_SEQ", referencedColumnName = "SEQ")
	public MpmJustificativaUsoMdto getJustificativaUsoMedicamento() {
		return justificativaUsoMedicamento;
	}

	public void setJustificativaUsoMedicamento(
			MpmJustificativaUsoMdto justificativaUsoMedicamento) {
		this.justificativaUsoMedicamento = justificativaUsoMedicamento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
		@JoinColumn(name = "PMD_ATD_SEQ", referencedColumnName = "IME_PMD_ATD_SEQ", insertable = false, updatable = false),
		@JoinColumn(name = "PMD_SEQ", referencedColumnName = "IME_PMD_SEQ", insertable = false, updatable = false),
		@JoinColumn(name = "SEQP", referencedColumnName = "IME_SEQP", insertable = false, updatable = false),
		@JoinColumn(name = "MED_MAT_CODIGO", referencedColumnName = "IME_MED_MAT_CODIGO", insertable = false, updatable = false) })
	public MpmItemPrescParecerMdto getItemPrescParecerMdto() {
		return itemPrescParecerMdto;
	}

	public void setItemPrescParecerMdto(MpmItemPrescParecerMdto itemPrescParecerMdto) {
		this.itemPrescParecerMdto = itemPrescParecerMdto;
	}
	
	@Column(name = "ORDEM", nullable = false)
	public Integer getOrdem() {
		return this.ordem;
	}
	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}
	
	public enum Fields {
		ID("id"), PMD_ATD_SEQ("id.pmdAtdSeq"), PMD_SEQ("id.pmdSeq"), SEQP("id.seqp"), MED_MAT_CODIGO("id.medMatCodigo"),
		PRESCRICAO_MEDICAMENTO("prescricaoMedicamento"), MEDICAMENTO("medicamento"),
		MEDICAMENTO_CODIGO("medicamento.matCodigo"), JUSTIFICATIVA_USO("justificativaUsoMedicamento"),
		FDSSEQ("formaDosagem.seq"), FORMA_DOSAGEM("formaDosagem"), USO_MDTO_ANTIMAC("usoMdtoAntimicrobia"),DURACAO_TRAT_APRV("duracaoTratAprovado"),
		QTDEMGKG("qtdeMgKg"),QTDEMG_CORP("qtdeMgSuperfCorporal"),OBSERVACAO("observacao"),DOSE("dose"),
		ORIGEM_JUST("origemJustificativa"), UNIDADE_MEDIDA_MEDICAS("unidadeMedidaMedica"),
		JUS_SEQ("justificativaUsoMedicamento.seq"), ITEM_PRESC_PARECER_MDTO("itemPrescParecerMdto"),IND_ORIGEM_JUSTIF("origemJustificativa");

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
		MpmItemPrescricaoMdto other = (MpmItemPrescricaoMdto) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
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
		StringBuilder strBuilder = new StringBuilder();
		
		// Por regra do SQL this.getMedicamento() nao deveria ser nulo.
		strBuilder.append(this.getMedicamento().getDescricao());
		
		if (this.getMedicamento().getConcentracao() != null) {
			strBuilder.append(' ').append(this.getMedicamento().getConcentracaoFormatada());
		}
		if (this.getMedicamento().getMpmUnidadeMedidaMedicas() != null && StringUtils.isNotBlank(this.getMedicamento().getDescricaoUnidadeMedidaMedica())) {
			strBuilder.append(' ').append(this.getMedicamento().getDescricaoUnidadeMedidaMedica());
		}
		if (StringUtils.isNotBlank(this.getObservacao())) {
			strBuilder.append(" : ").append(this.getObservacao());
		}
		
		strBuilder.append(" - "+getLabelSolucao()+" ").append(this.getDoseFormatada()).append(' ');
		
		if (this.getFormaDosagem() != null && StringUtils.isNotBlank(this.getFormaDosagem().getDescricaoUnidadeMedidaMedica())) {
			strBuilder.append(this.getFormaDosagem().getDescricaoUnidadeMedidaMedica()).append(';');
		} else if(this.getMedicamento().getTipoApresentacaoMedicamento() != null){
			strBuilder.append(this.getMedicamento().getTipoApresentacaoMedicamento().getSigla()).append(';');
		}		
		
		return strBuilder.toString();
	}
	
	/**
	 * Define a String se é - solução: Diluir 
	 * 						- medicamento: Administrar
	 * @return
	 */
	@Transient
	private String getLabelSolucao() {
		if (this.getPrescricaoMedicamento() != null && this.getPrescricaoMedicamento().getIndSolucao() != null && this.getPrescricaoMedicamento().getIndSolucao()) {
			return LABEL_DILUIR;
		} else {
			return LABEL_ADMINISTRAR;
		}
	}
	
	/**
	 * Formata a dose conforme a anotacao Column do atributo.
	 * Formato: (14,4) #.###.###.###,####
	 * 
	 * @return
	 */
	@Transient
	public String getDoseFormatada() {
		String numFormated = null;
		if (this.getDose() != null) {
			numFormated = AghuNumberFormat.formatarValor(this.getDose(), this.getClass(), "dose");
		}
		return numFormated;
	}

	/**
	 * getMedicamento().getAfaTipoUsoMdtos().getIndAntimicrobiano()
	 * 
	 * rcorvalao
	 * 01/10/2010
	 * @return
	 */
	@Transient
	public Boolean getIndAntiMicrobiano() {
		return this.getMedicamento().getIndAntiMicrobiano();
	}

	@Transient
	public String getDescricaoMedicamentoPrescrito() {
		return descricaoMedicamentoPrescrito;
	}

	public void setDescricaoMedicamentoPrescrito(String descricaoMedicamentoPrescrito) {
		this.descricaoMedicamentoPrescrito = descricaoMedicamentoPrescrito;
	}
	
	@Transient
	public String getDescricaoMedicamentoPrescritoTrunc(Long size) {
		return StringUtil.trunc(descricaoMedicamentoPrescrito, true, size);
	}
}
