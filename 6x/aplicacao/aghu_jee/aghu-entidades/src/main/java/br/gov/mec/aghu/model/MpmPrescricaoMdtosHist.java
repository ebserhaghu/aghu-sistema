package br.gov.mec.aghu.model;

// Generated 11/07/2012 17:28:38 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

import org.apache.commons.lang3.StringUtils;
import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioIndPendenteItemPrescricao;
import br.gov.mec.aghu.dominio.DominioUnidadeHorasMinutos;
import br.gov.mec.aghu.prescricaomedica.util.PrescricaoMedicaTypes;
import br.gov.mec.aghu.core.persistence.BaseEntityId;
import br.gov.mec.aghu.core.utils.AghuNumberFormat;
import br.gov.mec.aghu.core.utils.TipoOperacaoEnum;

/**
 * MpmPrescricaoMdtosHist generated by hbm2java
 */
@Entity
@Immutable
@Table(name = "mpm_prescricao_mdtos", schema = "hist")
public class MpmPrescricaoMdtosHist extends BaseEntityId<MpmPrescricaoMdtosHistId> implements java.io.Serializable {

	private static final String _DILUIR_EM_ = " Diluir em ";

	/**
	 * 
	 */
	private static final long serialVersionUID = 1873484437821883057L;
	
	private static final String DEBRA_LINHA = " <br/> ";
	
	private MpmPrescricaoMdtosHistId id;
	private MpmPrescricaoMdtosHist prescricaoMdtoOrigem;
	private MpmTipoFrequenciaAprazamento tipoFreqAprazamento;
	private MpmPrescricaoMdtosHist prescricaoMdtoReprescritoOrigem;
	protected DominioIndPendenteItemPrescricao indPendente;
	private AfaTipoVelocAdministracoes tipoVelocAdministracao;
//	private RapServidores servidor;
	private AfaViaAdministracao viaAdministracao;
	private Date dthrInicio;
	private Boolean indSeNecessario;
	private Boolean indItemRecomendadoAlta;
	private Short frequencia;
	private Date horaInicioAdministracao;
	protected Date dthrFim;
	private String observacao;
	private BigDecimal gotejo;
	private Short qtdeHorasCorrer;
	private Short duracaoTratSolicitado;
	private Date dthrInicioTratamento;
	private Boolean indSolucao;
	private Boolean indItemRecTransferencia;
	private DominioUnidadeHorasMinutos unidHorasCorrer;
	private AfaMedicamento diluente;
	private BigDecimal volumeDiluenteMl;
	private Boolean indBombaInfusao;
	private Set<MpmPrescricaoMdtosHist> prescricoesMdtosReprescritosOrigem = new HashSet<MpmPrescricaoMdtosHist>(
			0);

	private List<MpmItemPrescricaoMdtosHist> itensPrescricaoMdtos = new ArrayList<MpmItemPrescricaoMdtosHist>(
			0);
	private Set<MpmPrescricaoMdtosHist> prescricoesMdtosOrigem = new HashSet<MpmPrescricaoMdtosHist>(
			0);

	private MpmPrescricaoMedicasHist prescricaoMedica;


	@Transient
	private Boolean indAntiMicrobiano;
	
	//Transient
	public TipoOperacaoEnum tipoOperacaoBanco;
	
	public MpmPrescricaoMdtosHist() {
	}


	@EmbeddedId
	@AttributeOverrides( {
			@AttributeOverride(name = "atdSeq", column = @Column(name = "ATD_SEQ", nullable = false, precision = 7, scale = 0)),
			@AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false, precision = 14, scale = 0)) })
	public MpmPrescricaoMdtosHistId getId() {
		return this.id;
	}

	public void setId(MpmPrescricaoMdtosHistId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PMD_ATD_SEQ", referencedColumnName = "ATD_SEQ"),
			@JoinColumn(name = "PMD_SEQ", referencedColumnName = "SEQ") })
	public MpmPrescricaoMdtosHist getPrescricaoMdtoOrigem() {
		return this.prescricaoMdtoOrigem;
	}

	public void setPrescricaoMdtoOrigem(
			MpmPrescricaoMdtosHist mpmPrescricaoMdtosByMpmPmdPmdFk1) {
		this.prescricaoMdtoOrigem = mpmPrescricaoMdtosByMpmPmdPmdFk1;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TFQ_SEQ", nullable = false)
	public MpmTipoFrequenciaAprazamento getTipoFreqAprazamento() {
		return this.tipoFreqAprazamento;
	}

	public void setTipoFreqAprazamento(
			MpmTipoFrequenciaAprazamento mpmTipoFreqAprazamentos) {
		this.tipoFreqAprazamento = mpmTipoFreqAprazamentos;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PMD_ATD_SEQ_REPRESC", referencedColumnName = "ATD_SEQ"),
			@JoinColumn(name = "PMD_SEQ_REPRESC", referencedColumnName = "SEQ") })
	public MpmPrescricaoMdtosHist getPrescricaoMdtoReprescritoOrigem() {
		return this.prescricaoMdtoReprescritoOrigem;
	}

	public void setPrescricaoMdtoReprescritoOrigem(
			MpmPrescricaoMdtosHist mpmPrescricaoMdtosByMpmPmdPmdFk2) {
		this.prescricaoMdtoReprescritoOrigem = mpmPrescricaoMdtosByMpmPmdPmdFk2;
	}

	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "TVA_SEQ", referencedColumnName = "SEQ", nullable = true)
	public AfaTipoVelocAdministracoes getTipoVelocAdministracao() {
		return this.tipoVelocAdministracao;
	}

	public void setTipoVelocAdministracao(AfaTipoVelocAdministracoes tvaSeq) {
		this.tipoVelocAdministracao = tvaSeq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "VAD_SIGLA", referencedColumnName = "SIGLA")
	public AfaViaAdministracao getViaAdministracao() {
		return this.viaAdministracao;
	}

	public void setViaAdministracao(AfaViaAdministracao vadSigla) {
		this.viaAdministracao = vadSigla;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_INICIO", nullable = false, length = 7)
	public Date getDthrInicio() {
		return this.dthrInicio;
	}

	public void setDthrInicio(Date dthrInicio) {
		this.dthrInicio = dthrInicio;
	}

	@Column(name = "IND_SE_NECESSARIO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndSeNecessario() {
		return this.indSeNecessario;
	}

	public void setIndSeNecessario(Boolean indSeNecessario) {
		this.indSeNecessario = indSeNecessario;
	}

	@Column(name = "IND_ITEM_RECOMENDADO_ALTA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndItemRecomendadoAlta() {
		return this.indItemRecomendadoAlta;
	}

	public void setIndItemRecomendadoAlta(Boolean indItemRecomendadoAlta) {
		this.indItemRecomendadoAlta = indItemRecomendadoAlta;
	}

	@Column(name = "FREQUENCIA", precision = 3, scale = 0)
	public Short getFrequencia() {
		return this.frequencia;
	}

	public void setFrequencia(Short frequencia) {
		this.frequencia = frequencia;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "HORA_INICIO_ADMINISTRACAO", length = 7)
	public Date getHoraInicioAdministracao() {
		return this.horaInicioAdministracao;
	}

	public void setHoraInicioAdministracao(Date horaInicioAdministracao) {
		this.horaInicioAdministracao = horaInicioAdministracao;
	}

	@Column(name = "OBSERVACAO", length = 240)
	@Length(max = 240)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "GOTEJO", precision = 5, scale = 2)
	public BigDecimal getGotejo() {
		return this.gotejo;
	}

	public void setGotejo(BigDecimal gotejo) {
		this.gotejo = gotejo;
	}

	@Column(name = "QTDE_HORAS_CORRER", precision = 2, scale = 0)
	public Short getQtdeHorasCorrer() {
		return this.qtdeHorasCorrer;
	}

	public void setQtdeHorasCorrer(Short qtdeHorasCorrer) {
		this.qtdeHorasCorrer = qtdeHorasCorrer;
	}

	@Column(name = "DURACAO_TRAT_SOLICITADO", precision = 3, scale = 0)
	public Short getDuracaoTratSolicitado() {
		return this.duracaoTratSolicitado;
	}

	public void setDuracaoTratSolicitado(Short duracaoTratSolicitado) {
		this.duracaoTratSolicitado = duracaoTratSolicitado;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_INICIO_TRATAMENTO", length = 7)
	public Date getDthrInicioTratamento() {
		return this.dthrInicioTratamento;
	}

	public void setDthrInicioTratamento(Date dthrInicioTratamento) {
		this.dthrInicioTratamento = dthrInicioTratamento;
	}

	@Column(name = "IND_SOLUCAO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndSolucao() {
		return this.indSolucao;
	}

	public void setIndSolucao(Boolean indSolucao) {
		this.indSolucao = indSolucao;
	}

	@Column(name = "IND_ITEM_REC_TRANSFERENCIA", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndItemRecTransferencia() {
		return this.indItemRecTransferencia;
	}

	public void setIndItemRecTransferencia(Boolean indItemRecTransferencia) {
		this.indItemRecTransferencia = indItemRecTransferencia;
	}

	@Column(name = "UNID_HORAS_CORRER", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioUnidadeHorasMinutos getUnidHorasCorrer() {
		return this.unidHorasCorrer;
	}

	public void setUnidHorasCorrer(DominioUnidadeHorasMinutos unidHorasCorrer) {
		this.unidHorasCorrer = unidHorasCorrer;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MED_MAT_CODIGO")
	public AfaMedicamento getDiluente() {
		return this.diluente;
	}

	public void setDiluente(AfaMedicamento medMatCodigo) {
		this.diluente = medMatCodigo;
	}

	@Column(name = "VOLUME_DILUENTE_ML", precision = 8, scale = 3)
	public BigDecimal getVolumeDiluenteMl() {
		return this.volumeDiluenteMl;
	}

	public void setVolumeDiluenteMl(BigDecimal volumeDiluenteMl) {
		this.volumeDiluenteMl = volumeDiluenteMl;
	}

	@Column(name = "IND_BOMBA_INFUSAO", nullable = false, length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndBombaInfusao() {
		return this.indBombaInfusao;
	}

	public void setIndBombaInfusao(Boolean indBombaInfusao) {
		this.indBombaInfusao = indBombaInfusao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prescricaoMdtoOrigem")
	public Set<MpmPrescricaoMdtosHist> getPrescricoesMdtosOrigem() {
		return this.prescricoesMdtosOrigem;
	}

	public void setPrescricoesMdtosOrigem(
			Set<MpmPrescricaoMdtosHist> mpmPrescricaoMdtosesForMpmPmdPmdFk2) {
		this.prescricoesMdtosOrigem = mpmPrescricaoMdtosesForMpmPmdPmdFk2;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prescricaoMedicamento")
	public List<MpmItemPrescricaoMdtosHist> getItensPrescricaoMdtos() {
		return this.itensPrescricaoMdtos;
	}

	public void setItensPrescricaoMdtos(
			List<MpmItemPrescricaoMdtosHist> mpmItemPrescricaoMdtoses) {
		this.itensPrescricaoMdtos = mpmItemPrescricaoMdtoses;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "prescricaoMdtoReprescritoOrigem")
	public Set<MpmPrescricaoMdtosHist> getPrescricoesMdtosReprescritosOrigem() {
		return this.prescricoesMdtosReprescritosOrigem;
	}

	public void setPrescricoesMdtosReprescritosOrigem(
			Set<MpmPrescricaoMdtosHist> mpmPrescricaoMdtosesForMpmPmdPmdFk1) {
		this.prescricoesMdtosReprescritosOrigem = mpmPrescricaoMdtosesForMpmPmdPmdFk1;
	}
	
	@Column(name = "IND_PENDENTE", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioIndPendenteItemPrescricao getIndPendente() {
		return indPendente;
	}

	public void setIndPendente(DominioIndPendenteItemPrescricao indPendente) {
		this.indPendente = indPendente;
	}
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_FIM", length = 7)
	public Date getDthrFim() {
		return this.dthrFim;
	}

	public void setDthrFim(Date dthrFim) {
		this.dthrFim = dthrFim;
	}
	
	public enum Fields {
		ID("id"), 
		ATD_SEQ("id.atdSeq"), SEQ("id.seq"), DTHR_INICIO("dthrInicio"), DTHR_FIM(
				"dthrFim"), DTHR_INICIO_TRATAMENTO("dthrInicioTratamento")
				,INDSOLUCAO("indSolucao")
				,PRESCRICAO_MDTO_REPRESCRITO_ORIGEM("prescricaoMdtoReprescritoOrigem")
				,PMD_ATD_SEQ_REPRESC("prescricaoMdtoReprescritoOrigem.id.atdSeq")
				,PMD_SEQ_REPRESC("prescricaoMdtoReprescritoOrigem.id.seq"),
				PENDENTE("indPendente"), DURACAO_TRAT_SOL(
				"duracaoTratSolicitado"), TIPO_VELC_ADM_SEQ(
				"tipoVelocAdministracao.seq"), INDPENDENTE("indPendente"), FREQUENCIA(
				"frequencia"), TIPO_FREQ_APZ_SEQ("tipoFreqAprazamento.seq"), 
				PRESCRICAOMDTOORIGEM_SEQ("prescricaoMdtoOrigem.id.seq"),
				PRESCRICAOMDTOORIGEM_ATDSEQ("prescricaoMdtoOrigem.id.atdSeq"),
				PRESCRICAO_MDTO_ORIGEM("prescricaoMdtoOrigem"), IND_ITEM_RECOMENDADO_ALTA("indItemRecomendadoAlta"),
				VIA_ADMINISTRACAO("viaAdministracao"),
				VIAADMINISTRACAO_SIGLA("viaAdministracao.sigla"), INDSENECESSARIO("indSeNecessario"), HORAINICIOADMINISTRACAO(
				"horaInicioAdministracao"), OBSERVACAO("observacao"), GOTEJO(
				"gotejo"), QTDEHORASCORRER("qtdeHorasCorrer"),
				IND_ANTI_MICROBIANO("indAntiMicrobiano"),
				ITENS_PRESCRICAO_MDTOS("itensPrescricaoMdtos"),
				PRESCRICAOMEDICA_ID("prescricaoMedica.id"),
				PME_SEQ("prescricaoMedica.id.seq"),
				PRESCRICAOMEDICA("prescricaoMedica")
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

	/**
	 * if c.ind_solucao = 'S' then v_tipo_item := 'S:'; else v_tipo_item :=
	 * 'M:'; end if;
	 */
	@Transient
	public PrescricaoMedicaTypes getTipo() {
		if (this.getIndSolucao()) {
			return PrescricaoMedicaTypes.SOLUCAO;
		} else {
			return PrescricaoMedicaTypes.MEDICAMENTO;
		}
	}

	private String getNumeroFormatado(Number value, String fieldName) {
		String numFormated = "";
		if (value != null) {
			numFormated = AghuNumberFormat.formatarValor(value,
					this.getClass(), fieldName);
		}
		return numFormated;
	}

	/**
	 * c.vad_sigla c.sint_tfq c.frequencia c.desc_tfq
	 * c.hora_inicio_administracao c.concentracao c.desc_umm_med
	 * c.volume_diluente_ml c.qtde_horas_correr c.unid_horas_correr c.gotejo
	 * c.desc_tva c.ind_bomba_infusao c.ind_se_necessario c.observacao
	 * c.dthr_inicio_tratamento
	 * 
	 * @see br.gov.mec.aghu.model.interfaces.PrescricaoMedicaDescricao#getDescricao()
	 */
	@SuppressWarnings({"PMD.NPathComplexity"})
	@Transient
	public String getDescricaoFormatada() {
		StringBuilder strBuilder = new StringBuilder("");
		boolean hasFilhos = false;

		for (MpmItemPrescricaoMdtosHist itemPrescricaoMedicamento : this
				.getItensPrescricaoMdtos()) {
			hasFilhos = true;
			strBuilder
					.append(itemPrescricaoMedicamento.getDescricaoFormatada());
			if (this.getIndSolucao()) {
				strBuilder.append(DEBRA_LINHA);
			}
		}
		// TODO revisar hardcode
		if (hasFilhos) {
			strBuilder.append(' ')
					.append(this.getViaAdministracao().getSigla()).append("; ");

			// Por regra do SQL this.getTipoFreqAprazamento() nao deveria ser
			// nulo.
			if (StringUtils.isNotBlank(this.getTipoFreqAprazamento()
					.getSintaxe())) {
				strBuilder.append(this.getTipoFreqAprazamento()
						.getSintaxeFormatada(this.getFrequencia()));
			} else {
				strBuilder.append(this.getTipoFreqAprazamento().getDescricao());
			}
			strBuilder.append("; ");

			if (this.getHoraInicioAdministracao() != null) {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
				strBuilder.append("I=").append(
						sdf.format(this.getHoraInicioAdministracao())).append(
						" h; ");
			}

			StringBuilder stbDiluente = new StringBuilder();
			if (this.getDiluente() != null) {
				stbDiluente.append(this.getDiluente().getDescricao());
				if (this.getDiluente().getConcentracao() != null) {
					stbDiluente.append(' ').append(
							this.getDiluente().getConcentracaoFormatada());
				}
				if (this.getDiluente().getMpmUnidadeMedidaMedicas() != null
						&& this.getDiluente().getMpmUnidadeMedidaMedicas()
								.getDescricao() != null) {
					stbDiluente.append(' ').append(
							this.getDiluente().getMpmUnidadeMedidaMedicas()
									.getDescricao());
				}
			}

			if (stbDiluente.length() > 0) {
				if (this.getVolumeDiluenteMl() != null) {
					strBuilder.append(_DILUIR_EM_).append(
							getNumeroFormatado(this.getVolumeDiluenteMl(),
									"volumeDiluenteMl")).append(" ml de ")
							.append(stbDiluente.toString()).append("; ");
				} else {
					strBuilder.append(_DILUIR_EM_).append(
							stbDiluente.toString()).append("; ");
				}
			} else {
				if (this.getVolumeDiluenteMl() != null) {
					strBuilder.append(_DILUIR_EM_).append(
							getNumeroFormatado(this.getVolumeDiluenteMl(),
									"volumeDiluenteMl")).append(" ml; ");
				}
			}

			if (this.getQtdeHorasCorrer() != null) {
				strBuilder.append("Correr em ").append(
						this.getQtdeHorasCorrer());
				if (this.getUnidHorasCorrer() == null
						|| DominioUnidadeHorasMinutos.H.equals(this
								.getUnidHorasCorrer())) {
					strBuilder.append(" horas; ");
				} else {
					strBuilder.append(" minutos; ");
				}
			}

			if (this.getGotejo() != null) {
				strBuilder.append("Velocidade de Infusão ").append(
						getNumeroFormatado(this.getGotejo(), "gotejo")).append(' ');
				if (this.getTipoVelocAdministracao() != null) {
					strBuilder.append(this.getTipoVelocAdministracao()
							.getDescricao());
				} else {
					// Tipo velocidade administracao pode ser nulo, no sistema
					// antigo nao era tratado.
					strBuilder
							.append("ERRO: tipo velocidade administracao nao informado");
				}
				strBuilder.append("; ");
			}

			if (this.getIndBombaInfusao()) {
				strBuilder.append("BI").append("; ");
			}

			if (this.getIndSeNecessario()) {
				strBuilder.append("Se Necessário; ");
			}

			if (StringUtils.isNotBlank(this.getObservacao())) {
				strBuilder.append(this.getObservacao()).append("; ");
			}

//			if (this.getIndAntiMicrobiano()
//					&& this.getDthrInicioTratamento() != null
//					&& this.getPrescricaoMedica() != null
//					&& this.getPrescricaoMedica().getDtReferencia() != null) {
//
//				Date dtPmeInicioVigencia = this.getPrescricaoMedica()
//						.getDtReferencia();
//				Date dtGeralRefInicioVigencia = null;// this.getDthrInicioTratamento();

//				if (this.getPrescricaoMedica().getAtendimento() != null) {
//					MpmPrescricaoMedica p = this.getPrescricaoMedica()
//							.getAtendimento()
//							.getPrescricaoMedicaInicioAtendimento(
//									this.getDthrInicioTratamento());
//					if (p != null) {
//						dtGeralRefInicioVigencia = p.getDtReferencia();
//					}
//				}

//				Integer tempoDuracao;
//				if (dtGeralRefInicioVigencia == null) {
//					tempoDuracao = 0;
//				} else {
//					tempoDuracao = DateUtil.diffInDaysInteger(
//							dtPmeInicioVigencia, dtGeralRefInicioVigencia);
//				}
//				if (tempoDuracao.compareTo(0) < 0) {
//					tempoDuracao = 0;
//				}
//				strBuilder.append(" Dia de Administração: ").append(
//						getTempoDuracao(dtPmeInicioVigencia, this.getDthrInicioTratamento())).append("; ");
//			}
//
		}// if hasFilhos

		return strBuilder.toString().trim();
	}

	/**
	 * Obtem a descrição a ser exibida no relatório. Refatorar posteriormente.
	 * 
	 * @return
	 */
//	@Transient
//	public String getDescricaoFormatadaRelatorio() {
//		StringBuilder strBuilder = new StringBuilder("");
//		boolean hasFilhos = false;
//
//		for (MpmItemPrescricaoMdto itemPrescricaoMedicamento : this
//				.getItensPrescricaoMdtos()) {
//			hasFilhos = true;
//			strBuilder
//					.append(itemPrescricaoMedicamento.getDescricaoFormatada());
//			if (this.getIndSolucao()) {
//				strBuilder.append(DEBRA_LINHA);
//			}
//		}
//		// TODO revisar hardcode
//		if (hasFilhos) {
//			strBuilder.append(' ')
//					.append(this.getViaAdministracao().getSigla()).append("; ");
//
//			// Por regra do SQL this.getTipoFreqAprazamento() nao deveria ser
//			// nulo.
//			if (StringUtils.isNotBlank(this.getTipoFreqAprazamento()
//					.getSintaxe())) {
//				strBuilder.append(this.getTipoFreqAprazamento()
//						.getSintaxeFormatada(this.getFrequencia()));
//			} else {
//				strBuilder.append(this.getTipoFreqAprazamento().getDescricao());
//			}
//			strBuilder.append("; ");
//
//			if (this.getHoraInicioAdministracao() != null) {
//				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
//				strBuilder.append("I=").append(
//						sdf.format(this.getHoraInicioAdministracao())).append(
//						" h; ");
//			}
//
//			StringBuilder stbDiluente = new StringBuilder();
//			if (this.getDiluente() != null) {
//				stbDiluente.append(this.getDiluente().getDescricao());
//				if (this.getDiluente().getConcentracao() != null) {
//					stbDiluente.append(' ').append(
//							this.getDiluente().getConcentracaoFormatada());
//				}
//				if (this.getDiluente().getMpmUnidadeMedidaMedicas() != null
//						&& this.getDiluente().getMpmUnidadeMedidaMedicas()
//								.getDescricao() != null) {
//					stbDiluente.append(' ').append(
//							this.getDiluente().getMpmUnidadeMedidaMedicas()
//									.getDescricao());
//				}
//			}
//
//			if (stbDiluente.length() > 0) {
//				if (this.getVolumeDiluenteMl() != null) {
//					strBuilder.append(" Diluir em ").append(
//							getNumeroFormatado(this.getVolumeDiluenteMl(),
//									"volumeDiluenteMl")).append(" ml de ")
//							.append(stbDiluente.toString()).append("; ");
//				} else {
//					strBuilder.append(" Diluir em ").append(
//							stbDiluente.toString()).append("; ");
//				}
//			} else {
//				if (this.getVolumeDiluenteMl() != null) {
//					strBuilder.append(" Diluir em ").append(
//							getNumeroFormatado(this.getVolumeDiluenteMl(),
//									"volumeDiluenteMl")).append(" ml; ");
//				}
//			}
//
//			if (this.getQtdeHorasCorrer() != null) {
//				strBuilder.append("Correr em ").append(
//						this.getQtdeHorasCorrer());
//				if (this.getUnidHorasCorrer() == null
//						|| DominioUnidadeHorasMinutos.H.equals(this
//								.getUnidHorasCorrer())) {
//					strBuilder.append(" horas; ");
//				} else {
//					strBuilder.append(" minutos; ");
//				}
//			}
//
//			if (this.getGotejo() != null) {
//				strBuilder.append("Velocidade de Infusão ").append(
//						getNumeroFormatado(this.getGotejo(), "gotejo")).append(
//						" ");
//				if (this.getTipoVelocAdministracao() != null) {
//					strBuilder.append(this.getTipoVelocAdministracao()
//							.getDescricao());
//				} else {
//					// Tipo velocidade administracao pode ser nulo, no sistema
//					// antigo nao era tratado.
//					strBuilder
//							.append("ERRO: tipo velocidade administracao nao informado");
//				}
//				strBuilder.append("; ");
//			}
//
//			if (this.getIndBombaInfusao()) {
//				strBuilder.append("BI").append("; ");
//			}
//
//			if (this.getIndSeNecessario()) {
//				strBuilder.append("Se Necessário; ");
//			}
//
//			if (StringUtils.isNotBlank(this.getObservacao())) {
//				strBuilder.append("<br/>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;obs.:&nbsp;" + this.getObservacao());
//						
//			}
//
//			if (this.getIndAntiMicrobiano()
//					&& this.getDthrInicioTratamento() != null
//					&& this.getPrescricaoMedica() != null
//					&& this.getPrescricaoMedica().getDtReferencia() != null) {
//
//				Date dtPmeInicioVigencia = this.getPrescricaoMedica()
//						.getDtReferencia();
////				Date dtGeralRefInicioVigencia = null;// this.getDthrInicioTratamento();
////
////				if (this.getPrescricaoMedica().getAtendimento() != null) {
////					MpmPrescricaoMedica p = this.getPrescricaoMedica()
////							.getAtendimento()
////							.getPrescricaoMedicaInicioAtendimento(
////									this.getDthrInicioTratamento());
////					if (p != null) {
////						dtGeralRefInicioVigencia = p.getDtReferencia();
////					}
////				}
//
////				Integer tempoDuracao;
////				if (dtGeralRefInicioVigencia == null) {
////					tempoDuracao = 0;
////				} else {
////					tempoDuracao = DateUtil.diffInDaysInteger(
////							dtPmeInicioVigencia, dtGeralRefInicioVigencia);
////				}
////				if (tempoDuracao.compareTo(0) < 0) {
////					tempoDuracao = 0;
////				}
//				strBuilder.append("<br/> Dia de Administração: ").append(
//						getTempoDuracao(dtPmeInicioVigencia, this.getDthrInicioTratamento())).append("; ");
//			}
//
//		}// if hasFilhos
//
//		return strBuilder.toString().trim();
//	}

	@SuppressWarnings({"PMD.NPathComplexity"})
	@Transient
	public String getDescricaoFormatadaSemObservacao(Boolean incluirDiaAdministracao) {
		StringBuilder strBuilder = new StringBuilder();
		boolean hasFilhos = false;

		for (MpmItemPrescricaoMdtosHist itemPrescricaoMedicamento : this
				.getItensPrescricaoMdtos()) {
			hasFilhos = true;
			strBuilder
					.append(itemPrescricaoMedicamento.getDescricaoFormatada());
			if (this.getIndSolucao()) {
				strBuilder.append(DEBRA_LINHA);
			}
		}
		// TODO revisar hardcode
		if (hasFilhos) {
			strBuilder.append(' ')
					.append(this.getViaAdministracao().getSigla()).append("; ");

			// Por regra do SQL this.getTipoFreqAprazamento() nao deveria ser
			// nulo.
			if (StringUtils.isNotBlank(this.getTipoFreqAprazamento()
					.getSintaxe())) {
				strBuilder.append(this.getTipoFreqAprazamento()
						.getSintaxeFormatada(this.getFrequencia()));
			} else {
				strBuilder.append(this.getTipoFreqAprazamento().getDescricao());
			}
			strBuilder.append("; ");

			if (this.getHoraInicioAdministracao() != null) {
				SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
				strBuilder.append("I=").append(
						sdf.format(this.getHoraInicioAdministracao())).append(
						" h; ");
			}

			StringBuilder stbDiluente = new StringBuilder();
			if (this.getDiluente() != null) {
				stbDiluente.append(this.getDiluente().getDescricao());
				if (this.getDiluente().getConcentracao() != null) {
					// TODO formatar a concentracao (14,4) #.###.###.###,####
					stbDiluente.append(' ').append(
							this.getDiluente().getConcentracao());
				}
				if (this.getDiluente().getMpmUnidadeMedidaMedicas() != null
						&& this.getDiluente().getMpmUnidadeMedidaMedicas()
								.getDescricao() != null) {
					stbDiluente.append(' ').append(
							this.getDiluente().getMpmUnidadeMedidaMedicas()
									.getDescricao());
				}
			}

			if (stbDiluente.length() > 0) {
				if (this.getVolumeDiluenteMl() != null) {
					strBuilder.append(_DILUIR_EM_).append(
							this.getVolumeDiluenteMl()).append(" ml de ")
							.append(stbDiluente.toString()).append("; ");
				} else {
					strBuilder.append(_DILUIR_EM_).append(
							stbDiluente.toString()).append("; ");
				}
			} else {
				if (this.getVolumeDiluenteMl() != null) {
					strBuilder.append(_DILUIR_EM_).append(
							this.getVolumeDiluenteMl()).append(" ml; ");
				}
			}

			if (this.getQtdeHorasCorrer() != null) {
				strBuilder.append("Correr em ").append(
						this.getQtdeHorasCorrer());
				if (this.getUnidHorasCorrer() == null
						|| DominioUnidadeHorasMinutos.H.equals(this
								.getUnidHorasCorrer())) {
					strBuilder.append(" horas; ");
				} else {
					strBuilder.append(" minutos; ");
				}
			}

			if (this.getGotejo() != null) {
				strBuilder.append("Gotejo ").append(this.getGotejo()).append(' ');
				if (this.getTipoVelocAdministracao() != null) {
					strBuilder.append(this.getTipoVelocAdministracao()
							.getDescricao());
				} else {
					// Tipo velocidade administracao pode ser nulo, no sistema
					// antigo nao era tratado.
					strBuilder
							.append("ERRO: tipo velocidade administracao nao informado");
				}
				strBuilder.append("; ");
			}

			if (Boolean.TRUE.equals(this.getIndBombaInfusao())) {
				strBuilder.append("BI").append("; ");
			}

			if (Boolean.TRUE.equals(this.getIndSeNecessario())) {
				strBuilder.append("Se Necessário; ");
			}


		}
		return strBuilder.toString();
	}



	/**
	 * rcorvalao 01/10/2010
	 * 
	 * @return
	 */
	@Transient
	public Boolean getIndAntiMicrobiano() {
		if (this.indAntiMicrobiano == null) {
			this.indAntiMicrobiano = Boolean.FALSE;
			List<MpmItemPrescricaoMdtosHist> itens = this.getItensPrescricaoMdtos();
			for (MpmItemPrescricaoMdtosHist itemPrescricaoMdtos : itens) {
				if (itemPrescricaoMdtos.getIndAntiMicrobiano()) {
					this.indAntiMicrobiano = Boolean.TRUE;
					break;
				}
			}
		}
		return this.indAntiMicrobiano;
	}


//	@Transient
//	public ItemPrescricaoMedica getAnterior() {
//		return this.getPrescricaoMdtoOrigem();
//	}
//
//
//	@Transient
//	public boolean possuiFilhos() {
//		//TODO: NÃO DEVERIA NUNCA SER NULO. VERIFICAR POR QUE ISTO OCORRE NOS MEDICAMENTOS
//		return (this.getPrescricoesMdtosOrigem() != null && this.getPrescricoesMdtosOrigem().size() > 0);
//	}
//	
	@Transient
	public String getVolumeDiluenteMlFormatado(){
		return this.getNumeroFormatado(this.getVolumeDiluenteMl(), "volumeDiluenteMl");
	}

	@Transient
	public String getGotejoFormatado(){
		return this.getNumeroFormatado(this.getGotejo(), "gotejo");
	}

	@Transient
	public TipoOperacaoEnum getTipoOperacaoBanco() {
		return tipoOperacaoBanco;
	}

	public void setTipoOperacaoBanco(TipoOperacaoEnum tipoOperacaoBanco) {
		this.tipoOperacaoBanco = tipoOperacaoBanco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "PME_ATD_SEQ", referencedColumnName = "ATD_SEQ"),
			@JoinColumn(name = "PME_SEQ", referencedColumnName = "SEQ") })
	public MpmPrescricaoMedicasHist getPrescricaoMedica() {
		return this.prescricaoMedica; 
	}

	public void setPrescricaoMedica(MpmPrescricaoMedicasHist mpmPrescricaoMedica) {
		this.prescricaoMedica = mpmPrescricaoMedica;
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
		if (!(obj instanceof MpmPrescricaoMdtosHist)) {
			return false;
		}
		MpmPrescricaoMdtosHist other = (MpmPrescricaoMdtosHist) obj;
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