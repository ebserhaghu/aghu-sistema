package br.gov.mec.aghu.model;

// Generated 10/08/2010 17:33:16 by Hibernate Tools 3.3.0.GA

import java.math.BigDecimal;
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
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import br.gov.mec.aghu.dominio.DominioIndOrigemItemContaHospitalar;
import br.gov.mec.aghu.dominio.DominioItemConsultoriaSumarios;
import br.gov.mec.aghu.dominio.DominioLocalCobranca;
import br.gov.mec.aghu.dominio.DominioSituacaoItenConta;
import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * FatItensContaHospitalar generated by hbm2java
 */

@Entity
@Table(name = "FAT_ITENS_CONTA_HOSPITALAR", schema = "AGH")
@org.hibernate.annotations.Cache(usage=org.hibernate.annotations.CacheConcurrencyStrategy.TRANSACTIONAL)
public class FatItemContaHospitalar extends BaseEntityId<FatItemContaHospitalarId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3838444856435872458L;
	private FatItemContaHospitalarId id;
	private MptProcedimentoInternacao procedimentoInternacao;
	private RapServidores servidoresAlterado;
	private SceItemRmps itemRmps;
	private FatProcedHospInternos procedimentoHospitalarInterno;
	private RapServidores servidorAnest;
	private AghUnidadesFuncionais unidadesFuncional;
	private RapServidores servidor;
	private FatProcedAmbRealizado procedimentoAmbRealizado;
	private MpmPrescricaoNpt prescricaoNpt;
	private FcpAgenciaBanco agenciaBanco;
	private FatContasHospitalares contaHospitalar;
	private RapServidores servidorCriado;
	private MptPrescricaoPaciente prescricaoPaciente;
	private MpmPrescricaoProcedimento prescricaoProcedimento;
	private MbcProcEspPorCirurgias procEspPorCirurgias;
	private DominioItemConsultoriaSumarios ichType;
	private Date criadoEm;
	private String criadoPor;
	private String alteradoPor;
	private Date alteradoEm;
	private BigDecimal valor;
	private Integer numRecibo;
	private String numConta;
	private String numCheque;
	private String serieCheque;
	private String nome;
	private Long cpf;
	private DominioSituacaoItenConta indSituacao;
	private Integer iseSoeSeq;
	private Short iseSeqp;
	private Short quantidade;
	private BigDecimal ichValor;
	private Short quantidadeRealizada;
	private DominioIndOrigemItemContaHospitalar indOrigem;
	private DominioLocalCobranca localCobranca;
	private Date dthrRealizado;
	private String indModoCobranca;
	private Integer mopMatCodigo;
	private Integer mopCrgSeq;
	private Integer ipsIrrRmrSeq;
	private Integer ipsIrrEalSeq;
	private Integer cmoMcoSeq;
	private Integer cmoEcoBolNumero;
	private Short cmoEcoBolBsaCodigo;
	private Date cmoEcoBolData;
	private String cmoEcoCsaCodigo;
	private Short cmoSequencia;
	private Short cmoEcoSeqp;
	private Integer paoSeq;
	private MbcCirurgias cirurgia;
	private boolean manterNotaFiscal;
	private Integer version;
	private AelItemSolicitacaoExames itemSolicitacaoExame;
	private SceRmrPaciente sceRmrPaciente;

	private enum ItensContaHospitalarExceptionCode implements BusinessExceptionCode {
		ITEMCONSULTORIA_RECIBO_INVALIDO
	}

	public FatItemContaHospitalar() {
	}

	public FatItemContaHospitalar(final FatItemContaHospitalarId id,
			final FatProcedHospInternos fatProcedHospInternos,
			final FatContasHospitalares fatContasHospitalares, final DominioItemConsultoriaSumarios ichType,
			final Date criadoEm, final String criadoPor, final DominioSituacaoItenConta indSituacao,
			final DominioIndOrigemItemContaHospitalar indOrigem, final DominioLocalCobranca localCobranca) {
		this.id = id;
		this.procedimentoHospitalarInterno = fatProcedHospInternos;
		this.contaHospitalar = fatContasHospitalares;
		this.ichType = ichType;
		this.criadoEm = criadoEm;
		this.criadoPor = criadoPor;
		this.indSituacao = indSituacao;
		this.indOrigem = indOrigem;
		this.localCobranca = localCobranca;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public FatItemContaHospitalar(final FatItemContaHospitalarId id,
			final MptProcedimentoInternacao mptProcedimentosInternacao,
			final RapServidores rapServidoresByFatIchSerAlteradoFk1,
			final SceItemRmps sceItemRmps,
			final FatProcedHospInternos fatProcedHospInternos,
			final RapServidores rapServidoresByFatIchSerAnestFk1,
			final AghUnidadesFuncionais aghUnidadesFuncionais,
			final RapServidores rapServidoresByFatIchSerFk1,
			final FatProcedAmbRealizado fatProcedAmbRealizado,
			final MpmPrescricaoNpt mpmPrescricaoNpts,
			final FcpAgenciaBanco agenciaBanco,
			final FatContasHospitalares fatContasHospitalares,
			final RapServidores rapServidoresByFatIchSerCriadoFk1,
			final MptPrescricaoPaciente mptPrescricaoPacientes,
			final MpmPrescricaoProcedimento mpmPrescricaoProcedimentos,
			final MbcProcEspPorCirurgias mbcProcEspPorCirurgias, final DominioItemConsultoriaSumarios ichType,
			final Date criadoEm, final String criadoPor, final String alteradoPor,
			final Date alteradoEm, final BigDecimal valor, final Integer numRecibo,
			final String numConta, final String numCheque, final String serieCheque, final String nome,
			final Long cpf, final DominioSituacaoItenConta indSituacao, final Integer iseSoeSeq, final Short iseSeqp,
			final Short quantidade, final BigDecimal ichValor, final Short quantidadeRealizada,
			final DominioIndOrigemItemContaHospitalar indOrigem, final DominioLocalCobranca localCobranca, final Date dthrRealizado,
			final String indModoCobranca, final Integer mopMatCodigo, final Integer mopCrgSeq,
			final Integer ipsIrrRmrSeq, final Integer ipsIrrEalSeq, final Integer cmoMcoSeq,
			final Integer cmoEcoBolNumero, final Short cmoEcoBolBsaCodigo,
			final Date cmoEcoBolData, final String cmoEcoCsaCodigo, final Short cmoSequencia,
			final Short cmoEcoSeqp, final Integer paoSeq) {
		this.id = id;
		this.procedimentoInternacao = mptProcedimentosInternacao;
		this.servidoresAlterado = rapServidoresByFatIchSerAlteradoFk1;
		this.itemRmps = sceItemRmps;
		this.procedimentoHospitalarInterno = fatProcedHospInternos;
		this.servidorAnest = rapServidoresByFatIchSerAnestFk1;
		this.unidadesFuncional = aghUnidadesFuncionais;
		this.servidor = rapServidoresByFatIchSerFk1;
		this.procedimentoAmbRealizado = fatProcedAmbRealizado;
		this.prescricaoNpt = mpmPrescricaoNpts;
		this.agenciaBanco = agenciaBanco;
		this.contaHospitalar = fatContasHospitalares;
		this.servidorCriado = rapServidoresByFatIchSerCriadoFk1;
		this.prescricaoPaciente = mptPrescricaoPacientes;
		this.prescricaoProcedimento = mpmPrescricaoProcedimentos;
		this.procEspPorCirurgias = mbcProcEspPorCirurgias;
		this.ichType = ichType;
		this.criadoEm = criadoEm;
		this.criadoPor = criadoPor;
		this.alteradoPor = alteradoPor;
		this.alteradoEm = alteradoEm;
		this.valor = valor;
		this.numRecibo = numRecibo;
		this.numConta = numConta;
		this.numCheque = numCheque;
		this.serieCheque = serieCheque;
		this.nome = nome;
		this.cpf = cpf;
		this.indSituacao = indSituacao;
		this.iseSoeSeq = iseSoeSeq;
		this.iseSeqp = iseSeqp;
		this.quantidade = quantidade;
		this.ichValor = ichValor;
		this.quantidadeRealizada = quantidadeRealizada;
		this.indOrigem = indOrigem;
		this.localCobranca = localCobranca;
		this.dthrRealizado = dthrRealizado;
		this.indModoCobranca = indModoCobranca;
		this.mopMatCodigo = mopMatCodigo;
		this.mopCrgSeq = mopCrgSeq;
		this.ipsIrrRmrSeq = ipsIrrRmrSeq;
		this.ipsIrrEalSeq = ipsIrrEalSeq;
		this.cmoMcoSeq = cmoMcoSeq;
		this.cmoEcoBolNumero = cmoEcoBolNumero;
		this.cmoEcoBolBsaCodigo = cmoEcoBolBsaCodigo;
		this.cmoEcoBolData = cmoEcoBolData;
		this.cmoEcoCsaCodigo = cmoEcoCsaCodigo;
		this.cmoSequencia = cmoSequencia;
		this.cmoEcoSeqp = cmoEcoSeqp;
		this.paoSeq = paoSeq;
	}

	@EmbeddedId
	@AttributeOverrides({
			@AttributeOverride(name = "cthSeq", column = @Column(name = "CTH_SEQ", nullable = false, precision = 8, scale = 0)),
			@AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false, precision = 4, scale = 0)) })
	public FatItemContaHospitalarId getId() {
		return this.id;
	}

	public void setId(final FatItemContaHospitalarId id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "PIF_ATD_SEQ", referencedColumnName = "ATD_SEQ"),
			@JoinColumn(name = "PIF_SEQ", referencedColumnName = "SEQ") })
	public MptProcedimentoInternacao getProcedimentoInternacao() {
		return procedimentoInternacao;
	}

	public void setProcedimentoInternacao(
			final MptProcedimentoInternacao procedimentoInternacao) {
		this.procedimentoInternacao = procedimentoInternacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidoresAlterado() {
		return servidoresAlterado;
	}

	public void setServidoresAlterado(final RapServidores servidoresAlterado) {
		this.servidoresAlterado = servidoresAlterado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "IPS_RMP_SEQ", referencedColumnName = "RMP_SEQ"),
			@JoinColumn(name = "IPS_NUMERO", referencedColumnName = "NUMERO") })
	public SceItemRmps getItemRmps() {
		return itemRmps;
	}

	public void setItemRmps(final SceItemRmps itemRmps) {
		this.itemRmps = itemRmps;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PHI_SEQ", nullable = false)
	public FatProcedHospInternos getProcedimentoHospitalarInterno() {
		return procedimentoHospitalarInterno;
	}

	public void setProcedimentoHospitalarInterno(
			final FatProcedHospInternos procedimentoHospitalarInterno) {
		this.procedimentoHospitalarInterno = procedimentoHospitalarInterno;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_ANEST", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ANEST", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAnest() {
		return servidorAnest;
	}

	public void setServidorAnest(final RapServidores servidorAnest) {
		this.servidorAnest = servidorAnest;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ")
	public AghUnidadesFuncionais getUnidadesFuncional() {
		return unidadesFuncional;
	}

	public void setUnidadesFuncional(final AghUnidadesFuncionais unidadesFuncional) {
		this.unidadesFuncional = unidadesFuncional;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_RESP", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_RESP", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(final RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PMR_SEQ")
	public FatProcedAmbRealizado getProcedimentoAmbRealizado() {
		return procedimentoAmbRealizado;
	}

	public void setProcedimentoAmbRealizado(
			final FatProcedAmbRealizado procedimentoAmbRealizado) {
		this.procedimentoAmbRealizado = procedimentoAmbRealizado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "PNP_ATD_SEQ", referencedColumnName = "ATD_SEQ"),
			@JoinColumn(name = "PNP_SEQ", referencedColumnName = "SEQ") })
	public MpmPrescricaoNpt getPrescricaoNpt() {
		return prescricaoNpt;
	}

	public void setPrescricaoNpt(final MpmPrescricaoNpt prescricaoNpt) {
		this.prescricaoNpt = prescricaoNpt;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "AGB_BCO_CODIGO", referencedColumnName = "BCO_CODIGO"),
			@JoinColumn(name = "AGB_CODIGO", referencedColumnName = "CODIGO") })
	public FcpAgenciaBanco getAgenciaBanco() {
		return this.agenciaBanco;
	}

	public void setAgenciaBanco(final FcpAgenciaBanco agenciaBanco) {
		this.agenciaBanco = agenciaBanco;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CTH_SEQ", nullable = false, insertable = false, updatable = false)
	public FatContasHospitalares getContaHospitalar() {
		return contaHospitalar;
	}

	public void setContaHospitalar(final FatContasHospitalares contaHospitalar) {
		this.contaHospitalar = contaHospitalar;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA_CRIADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_CRIADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorCriado() {
		return servidorCriado;
	}

	public void setServidorCriado(final RapServidores servidorCriado) {
		this.servidorCriado = servidorCriado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "PTE_ATD_SEQ", referencedColumnName = "ATD_SEQ"),
			@JoinColumn(name = "PTE_SEQ", referencedColumnName = "SEQ") })
	public MptPrescricaoPaciente getPrescricaoPaciente() {
		return prescricaoPaciente;
	}

	public void setPrescricaoPaciente(final MptPrescricaoPaciente prescricaoPaciente) {
		this.prescricaoPaciente = prescricaoPaciente;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "PPR_ATD_SEQ", referencedColumnName = "ATD_SEQ"),
			@JoinColumn(name = "PPR_SEQ", referencedColumnName = "SEQ") })
	public MpmPrescricaoProcedimento getPrescricaoProcedimento() {
		return prescricaoProcedimento;
	}

	public void setPrescricaoProcedimento(
			final MpmPrescricaoProcedimento prescricaoProcedimento) {
		this.prescricaoProcedimento = prescricaoProcedimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "PPC_CRG_SEQ", referencedColumnName = "CRG_SEQ"),
			@JoinColumn(name = "PPC_EPR_PCI_SEQ", referencedColumnName = "EPR_PCI_SEQ"),
			@JoinColumn(name = "PPC_EPR_ESP_SEQ", referencedColumnName = "EPR_ESP_SEQ"),
			@JoinColumn(name = "PPC_IND_RESP_PROC", referencedColumnName = "IND_RESP_PROC") })
	public MbcProcEspPorCirurgias getProcEspPorCirurgias() {
		return procEspPorCirurgias;
	}

	public void setProcEspPorCirurgias(final MbcProcEspPorCirurgias procEspPorCirurgias) {
		this.procEspPorCirurgias = procEspPorCirurgias;
	}

	@Column(name = "ICH_TYPE", nullable = false, length = 10)
	@Enumerated(EnumType.STRING)
	public DominioItemConsultoriaSumarios getIchType() {
		return this.ichType;
	}

	public void setIchType(final DominioItemConsultoriaSumarios ichType) {
		this.ichType = ichType;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(final Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "CRIADO_POR", nullable = false, length = 30)
	public String getCriadoPor() {
		return this.criadoPor;
	}

	public void setCriadoPor(final String criadoPor) {
		this.criadoPor = criadoPor;
	}

	@Column(name = "ALTERADO_POR", length = 30)
	public String getAlteradoPor() {
		return this.alteradoPor;
	}

	public void setAlteradoPor(final String alteradoPor) {
		this.alteradoPor = alteradoPor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(final Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "VALOR", precision = 8)
	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(final BigDecimal valor) {
		this.valor = valor;
	}

	@Column(name = "NUM_RECIBO", precision = 6, scale = 0)
	public Integer getNumRecibo() {
		return this.numRecibo;
	}

	public void setNumRecibo(final Integer numRecibo) {
		this.numRecibo = numRecibo;
	}

	@Column(name = "NUM_CONTA", length = 10)
	public String getNumConta() {
		return this.numConta;
	}

	public void setNumConta(final String numConta) {
		this.numConta = numConta;
	}

	@Column(name = "NUM_CHEQUE", length = 10)
	public String getNumCheque() {
		return this.numCheque;
	}

	public void setNumCheque(final String numCheque) {
		this.numCheque = numCheque;
	}

	@Column(name = "SERIE_CHEQUE", length = 5)
	public String getSerieCheque() {
		return this.serieCheque;
	}

	public void setSerieCheque(final String serieCheque) {
		this.serieCheque = serieCheque;
	}

	@Column(name = "NOME", length = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(final String nome) {
		this.nome = nome;
	}

	@Column(name = "CPF", precision = 11, scale = 0)
	public Long getCpf() {
		return this.cpf;
	}

	public void setCpf(final Long cpf) {
		this.cpf = cpf;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoItenConta getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(final DominioSituacaoItenConta indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "ISE_SOE_SEQ", precision = 8, scale = 0)
	public Integer getIseSoeSeq() {
		return this.iseSoeSeq;
	}

	public void setIseSoeSeq(final Integer iseSoeSeq) {
		this.iseSoeSeq = iseSoeSeq;
	}

	@Column(name = "ISE_SEQP", precision = 3, scale = 0)
	public Short getIseSeqp() {
		return this.iseSeqp;
	}

	public void setIseSeqp(final Short iseSeqp) {
		this.iseSeqp = iseSeqp;
	}

	@JoinColumns( {
		@JoinColumn(name = "ISE_SEQP", referencedColumnName = "SEQP", insertable=false, updatable=false),
		@JoinColumn(name = "ISE_SOE_SEQ", referencedColumnName = "SOE_SEQ", insertable=false, updatable=false) })
	@ManyToOne(fetch = FetchType.LAZY)
	public AelItemSolicitacaoExames getItemSolicitacaoExame() {
		return this.itemSolicitacaoExame;
	}

	public void setItemSolicitacaoExame(
			AelItemSolicitacaoExames itemSolicitacaoExame) {
		this.itemSolicitacaoExame = itemSolicitacaoExame;
	}

	@Column(name = "QUANTIDADE", precision = 4, scale = 0)
	public Short getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(final Short quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name = "ICH_VALOR", precision = 15)
	public BigDecimal getIchValor() {
		return this.ichValor;
	}

	public void setIchValor(final BigDecimal ichValor) {
		this.ichValor = ichValor;
	}

	@Column(name = "QUANTIDADE_REALIZADA", precision = 4, scale = 0)
	public Short getQuantidadeRealizada() {
		return this.quantidadeRealizada;
	}

	public void setQuantidadeRealizada(final Short quantidadeRealizada) {
		this.quantidadeRealizada = quantidadeRealizada;
	}

	@Column(name = "IND_ORIGEM", nullable = false, length = 3)
	@Enumerated(EnumType.STRING)
	public DominioIndOrigemItemContaHospitalar getIndOrigem() {
		return this.indOrigem;
	}

	public void setIndOrigem(final DominioIndOrigemItemContaHospitalar indOrigem) {
		this.indOrigem = indOrigem;
	}

	@Column(name = "LOCAL_COBRANCA", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioLocalCobranca getLocalCobranca() {
		return this.localCobranca;
	}

	public void setLocalCobranca(final DominioLocalCobranca localCobranca) {
		this.localCobranca = localCobranca;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_REALIZADO", length = 7)
	public Date getDthrRealizado() {
		return this.dthrRealizado;
	}

	public void setDthrRealizado(final Date dthrRealizado) {
		this.dthrRealizado = dthrRealizado;
	}

	@Column(name = "IND_MODO_COBRANCA", length = 1)
	public String getIndModoCobranca() {
		return this.indModoCobranca;
	}

	public void setIndModoCobranca(final String indModoCobranca) {
		this.indModoCobranca = indModoCobranca;
	}

	@Column(name = "MOP_MAT_CODIGO", precision = 6, scale = 0)
	public Integer getMopMatCodigo() {
		return this.mopMatCodigo;
	}

	public void setMopMatCodigo(final Integer mopMatCodigo) {
		this.mopMatCodigo = mopMatCodigo;
	}

	@Column(name = "MOP_CRG_SEQ", precision = 8, scale = 0)
	public Integer getMopCrgSeq() {
		return this.mopCrgSeq;
	}

	public void setMopCrgSeq(final Integer mopCrgSeq) {
		this.mopCrgSeq = mopCrgSeq;
	}

	@Column(name = "IPS_IRR_RMR_SEQ", precision = 7, scale = 0)
	public Integer getIpsIrrRmrSeq() {
		return this.ipsIrrRmrSeq;
	}

	public void setIpsIrrRmrSeq(final Integer ipsIrrRmrSeq) {
		this.ipsIrrRmrSeq = ipsIrrRmrSeq;
	}

	@Column(name = "IPS_IRR_EAL_SEQ", precision = 7, scale = 0)
	public Integer getIpsIrrEalSeq() {
		return this.ipsIrrEalSeq;
	}

	public void setIpsIrrEalSeq(final Integer ipsIrrEalSeq) {
		this.ipsIrrEalSeq = ipsIrrEalSeq;
	}

	@Column(name = "CMO_MCO_SEQ", precision = 6, scale = 0)
	public Integer getCmoMcoSeq() {
		return this.cmoMcoSeq;
	}

	public void setCmoMcoSeq(final Integer cmoMcoSeq) {
		this.cmoMcoSeq = cmoMcoSeq;
	}

	@Column(name = "CMO_ECO_BOL_NUMERO", precision = 7, scale = 0)
	public Integer getCmoEcoBolNumero() {
		return this.cmoEcoBolNumero;
	}

	public void setCmoEcoBolNumero(final Integer cmoEcoBolNumero) {
		this.cmoEcoBolNumero = cmoEcoBolNumero;
	}

	@Column(name = "CMO_ECO_BOL_BSA_CODIGO", precision = 3, scale = 0)
	public Short getCmoEcoBolBsaCodigo() {
		return this.cmoEcoBolBsaCodigo;
	}

	public void setCmoEcoBolBsaCodigo(final Short cmoEcoBolBsaCodigo) {
		this.cmoEcoBolBsaCodigo = cmoEcoBolBsaCodigo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CMO_ECO_BOL_DATA", length = 7)
	public Date getCmoEcoBolData() {
		return this.cmoEcoBolData;
	}

	public void setCmoEcoBolData(final Date cmoEcoBolData) {
		this.cmoEcoBolData = cmoEcoBolData;
	}

	@Column(name = "CMO_ECO_CSA_CODIGO", length = 2)
	public String getCmoEcoCsaCodigo() {
		return this.cmoEcoCsaCodigo;
	}

	public void setCmoEcoCsaCodigo(final String cmoEcoCsaCodigo) {
		this.cmoEcoCsaCodigo = cmoEcoCsaCodigo;
	}

	@Column(name = "CMO_SEQUENCIA", precision = 3, scale = 0)
	public Short getCmoSequencia() {
		return this.cmoSequencia;
	}

	public void setCmoSequencia(final Short cmoSequencia) {
		this.cmoSequencia = cmoSequencia;
	}

	@Column(name = "CMO_ECO_SEQP", precision = 3, scale = 0)
	public Short getCmoEcoSeqp() {
		return this.cmoEcoSeqp;
	}

	public void setCmoEcoSeqp(final Short cmoEcoSeqp) {
		this.cmoEcoSeqp = cmoEcoSeqp;
	}

	@Column(name = "PAO_SEQ", precision = 8, scale = 0)
	public Integer getPaoSeq() {
		return this.paoSeq;
	}

	public void setPaoSeq(final Integer paoSeq) {
		this.paoSeq = paoSeq;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name ="PPC_CRG_SEQ", referencedColumnName="SEQ", updatable = false, insertable = false)	
	public MbcCirurgias getCirurgia() {
		return this.cirurgia;
	}
	
	public void setCirurgia(final MbcCirurgias cirurgia) {
		this.cirurgia = cirurgia;
	}
	
	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validarItem() {
		if (!((DominioItemConsultoriaSumarios.ACH.equals(this.getIchType()) && getNumRecibo() != null) || (DominioItemConsultoriaSumarios.ICH.equals(this.getIchType()) && getNumRecibo() == null))) {
			throw new BaseRuntimeException(ItensContaHospitalarExceptionCode.ITEMCONSULTORIA_RECIBO_INVALIDO);
		}
	}

	public void setManterNotaFiscal(final boolean manterNotaFiscal) {
		this.manterNotaFiscal = manterNotaFiscal;
	}

	@Transient
	public boolean isManterNotaFiscal() {
		return manterNotaFiscal;
	}

	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(final Integer version) {
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
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof FatItemContaHospitalar)) {
			return false;
		}
		final FatItemContaHospitalar other = (FatItemContaHospitalar) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
		@JoinColumn(name = "IPS_RMP_SEQ", referencedColumnName = "SEQ", nullable = false, insertable = false, updatable = false) })
	public SceRmrPaciente getSceRmrPaciente() {
		return this.sceRmrPaciente;
	}

	public void setSceRmrPaciente(final SceRmrPaciente sceRmrPaciente) {
		this.sceRmrPaciente = sceRmrPaciente;
	}
	
	public enum Fields {
		SEQ("id.seq"),
		CTH_SEQ("id.cthSeq"),
		IND_SITUACAO("indSituacao"),
		PROCEDIMENTO_HOSPITALAR_INTERNO("procedimentoHospitalarInterno"),
		PROCEDIMENTO_INTERNACAO("procedimentoInternacao"),
		IND_ORIGEM("indOrigem"),
		DTHR_REALIZADO("dthrRealizado"),
		CONTA_HOSPITALAR("contaHospitalar"),		
		PHI_SEQ("procedimentoHospitalarInterno.seq"),
		QUANTIDADE("quantidade"),
		QUANTIDADE_REALIZADA("quantidadeRealizada"),
		CIRURGIA("cirurgia"),
		PPC_CRG_SEQ("cirurgia.seq"),
		PROCEDIMENTO_AMB_REALIZADO("procedimentoAmbRealizado"),
		UNIDADE_FUNCIONAL("unidadesFuncional"),
		SERVIDOR("servidor"),
		UNF_SEQ("unidadesFuncional.seq"),
		CRIADO_POR("criadoPor"),
		SER_VIN_CODIGO_RESP("servidor.id.vinCodigo"),
		SER_MATRICULA_RESP("servidor.id.matricula"),
		ISE_SOE_SEQ("iseSoeSeq"),
		ISE_SEQP("iseSeqp"),
		ITEM_RMPS("itemRmps"),
		IPS_RMP_SEQ("itemRmps.id.rmpSeq"),
		IPS_NUMERO("itemRmps.id.numero"),
		IPS_IRR_EAL_SEQ("ipsIrrEalSeq"),
		PNP_ATD_SEQ("prescricaoNpt.id.atdSeq"),
		PNP_SEQ("prescricaoNpt.id.seq"),
		PPR_ATD_SEQ("prescricaoProcedimento.id.atdSeq"),
		PPR_SEQ("prescricaoProcedimento.id.seq"),
		ITEM_SOLICITACAO_EXAME("itemSolicitacaoExame"),
		PROC_ESP_POR_CIRURGIAS("procEspPorCirurgias"),
		SERVIDOR_ANEST ("servidorAnest"),
		SER_MATRICULA_CRIADO("servidorCriado.id.vinCodigo"),
		SER_VIN_CODIGO_CRIADO("servidorCriado.id.matricula"),
		SER_MATRICULA_ALTERADO("servidoresAlterado.id.matricula"),
		SER_VIN_CODIGO_ALTERADO("servidoresAlterado.id.vinCodigo"),
		ALTERADO_EM("alteradoEm"),
		ALTERADO_POR("alteradoPor"),
		SCE_RMR_PACIENTE("sceRmrPaciente")
		;
		
		private String fields;

		private Fields(final String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
		
	}

}