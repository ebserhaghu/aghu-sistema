package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * MptPrescricaoPacienteJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="mptPteJnSeq", sequenceName="AGH.MPT_PTE_JN_SEQ", allocationSize = 1)
@Table(name = "MPT_PRESCRICAO_PACIENTES_JN", schema = "AGH")
@Immutable
public class MptPrescricaoPacienteJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = 2504393895655135702L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer atdSeq;
	private Integer seq;
	private Date dtPrevExecucao;
	private Short ciclo;
	private Short dia;
	private Date criadoEm;
	private Date alteradoEm;
	private String indSituacao;
	private Date dthrMovimento;
	private String complCiclo;
	private Date dthrInicioMvtoPendente;
	private Short citVpaPtaSeq;
	private Short citVpaSeqp;
	private Short citSeqp;
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer serMatriculaValida;
	private Short serVinCodigoValida;
	private Integer lote;
	private Date dthrValida;
	private String indReimpressao;
	private Date dtPrevAgenda;
	private Integer pteAtdSeq;
	private Integer pteSeq;
	private Short qtdeSessoes;
	private String observacao;
	private String indSessoesContinuas;
	private Integer phiSeq;
	private Integer conNumero;
	private String justificativa;
	private Short duracaoTratamento;

	public MptPrescricaoPacienteJn() {
	}

	public MptPrescricaoPacienteJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer atdSeq, Integer seq) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.atdSeq = atdSeq;
		this.seq = seq;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public MptPrescricaoPacienteJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer atdSeq, Integer seq,
			Date dtPrevExecucao, Short ciclo, Short dia, Date criadoEm, Date alteradoEm, String indSituacao, Date dthrMovimento,
			String complCiclo, Date dthrInicioMvtoPendente, Short citVpaPtaSeq, Short citVpaSeqp, Short citSeqp, Integer serMatricula,
			Short serVinCodigo, Integer serMatriculaValida, Short serVinCodigoValida, Integer lote, Date dthrValida,
			String indReimpressao, Date dtPrevAgenda, Integer pteAtdSeq, Integer pteSeq, Short qtdeSessoes, String observacao,
			String indSessoesContinuas, Integer phiSeq, Integer conNumero, String justificativa, Short duracaoTratamento) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.atdSeq = atdSeq;
		this.seq = seq;
		this.dtPrevExecucao = dtPrevExecucao;
		this.ciclo = ciclo;
		this.dia = dia;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.indSituacao = indSituacao;
		this.dthrMovimento = dthrMovimento;
		this.complCiclo = complCiclo;
		this.dthrInicioMvtoPendente = dthrInicioMvtoPendente;
		this.citVpaPtaSeq = citVpaPtaSeq;
		this.citVpaSeqp = citVpaSeqp;
		this.citSeqp = citSeqp;
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.serMatriculaValida = serMatriculaValida;
		this.serVinCodigoValida = serVinCodigoValida;
		this.lote = lote;
		this.dthrValida = dthrValida;
		this.indReimpressao = indReimpressao;
		this.dtPrevAgenda = dtPrevAgenda;
		this.pteAtdSeq = pteAtdSeq;
		this.pteSeq = pteSeq;
		this.qtdeSessoes = qtdeSessoes;
		this.observacao = observacao;
		this.indSessoesContinuas = indSessoesContinuas;
		this.phiSeq = phiSeq;
		this.conNumero = conNumero;
		this.justificativa = justificativa;
		this.duracaoTratamento = duracaoTratamento;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "mptPteJnSeq")
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	//@GeneratedValue(strategy = GenerationType.AUTO, generator = "")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}
	// ATUALIZADOR JOURNALS - ID
	
/* ATUALIZADOR JOURNALS - Get / Set	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Long getSeqJn() {
		return this.seqJn;
	}

	public void setSeqJn(Long seqJn) {
		this.seqJn = seqJn;
	}

	@Column(name = "JN_USER", nullable = false, length = 30)
	@Length(max = 30)
	public String getJnUser() {
		return this.jnUser;
	}

	public void setJnUser(String jnUser) {
		this.jnUser = jnUser;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "JN_DATE_TIME", nullable = false, length = 29)
	public Date getJnDateTime() {
		return this.jnDateTime;
	}

	public void setJnDateTime(Date jnDateTime) {
		this.jnDateTime = jnDateTime;
	}

	@Column(name = "JN_OPERATION", nullable = false, length = 3)
	@Length(max = 3)
	public String getJnOperation() {
		return this.jnOperation;
	}

	public void setJnOperation(String jnOperation) {
		this.jnOperation = jnOperation;
	}*/

	@Column(name = "ATD_SEQ", nullable = false)
	public Integer getAtdSeq() {
		return this.atdSeq;
	}

	public void setAtdSeq(Integer atdSeq) {
		this.atdSeq = atdSeq;
	}

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_PREV_EXECUCAO", length = 29)
	public Date getDtPrevExecucao() {
		return this.dtPrevExecucao;
	}

	public void setDtPrevExecucao(Date dtPrevExecucao) {
		this.dtPrevExecucao = dtPrevExecucao;
	}

	@Column(name = "CICLO")
	public Short getCiclo() {
		return this.ciclo;
	}

	public void setCiclo(Short ciclo) {
		this.ciclo = ciclo;
	}

	@Column(name = "DIA")
	public Short getDia() {
		return this.dia;
	}

	public void setDia(Short dia) {
		this.dia = dia;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
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

	@Column(name = "IND_SITUACAO", length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_MOVIMENTO", length = 29)
	public Date getDthrMovimento() {
		return this.dthrMovimento;
	}

	public void setDthrMovimento(Date dthrMovimento) {
		this.dthrMovimento = dthrMovimento;
	}

	@Column(name = "COMPL_CICLO", length = 60)
	@Length(max = 60)
	public String getComplCiclo() {
		return this.complCiclo;
	}

	public void setComplCiclo(String complCiclo) {
		this.complCiclo = complCiclo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_INICIO_MVTO_PENDENTE", length = 29)
	public Date getDthrInicioMvtoPendente() {
		return this.dthrInicioMvtoPendente;
	}

	public void setDthrInicioMvtoPendente(Date dthrInicioMvtoPendente) {
		this.dthrInicioMvtoPendente = dthrInicioMvtoPendente;
	}

	@Column(name = "CIT_VPA_PTA_SEQ")
	public Short getCitVpaPtaSeq() {
		return this.citVpaPtaSeq;
	}

	public void setCitVpaPtaSeq(Short citVpaPtaSeq) {
		this.citVpaPtaSeq = citVpaPtaSeq;
	}

	@Column(name = "CIT_VPA_SEQP")
	public Short getCitVpaSeqp() {
		return this.citVpaSeqp;
	}

	public void setCitVpaSeqp(Short citVpaSeqp) {
		this.citVpaSeqp = citVpaSeqp;
	}

	@Column(name = "CIT_SEQP")
	public Short getCitSeqp() {
		return this.citSeqp;
	}

	public void setCitSeqp(Short citSeqp) {
		this.citSeqp = citSeqp;
	}

	@Column(name = "SER_MATRICULA")
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO")
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "SER_MATRICULA_VALIDA")
	public Integer getSerMatriculaValida() {
		return this.serMatriculaValida;
	}

	public void setSerMatriculaValida(Integer serMatriculaValida) {
		this.serMatriculaValida = serMatriculaValida;
	}

	@Column(name = "SER_VIN_CODIGO_VALIDA")
	public Short getSerVinCodigoValida() {
		return this.serVinCodigoValida;
	}

	public void setSerVinCodigoValida(Short serVinCodigoValida) {
		this.serVinCodigoValida = serVinCodigoValida;
	}

	@Column(name = "LOTE")
	public Integer getLote() {
		return this.lote;
	}

	public void setLote(Integer lote) {
		this.lote = lote;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DTHR_VALIDA", length = 29)
	public Date getDthrValida() {
		return this.dthrValida;
	}

	public void setDthrValida(Date dthrValida) {
		this.dthrValida = dthrValida;
	}

	@Column(name = "IND_REIMPRESSAO", length = 1)
	@Length(max = 1)
	public String getIndReimpressao() {
		return this.indReimpressao;
	}

	public void setIndReimpressao(String indReimpressao) {
		this.indReimpressao = indReimpressao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_PREV_AGENDA", length = 29)
	public Date getDtPrevAgenda() {
		return this.dtPrevAgenda;
	}

	public void setDtPrevAgenda(Date dtPrevAgenda) {
		this.dtPrevAgenda = dtPrevAgenda;
	}

	@Column(name = "PTE_ATD_SEQ")
	public Integer getPteAtdSeq() {
		return this.pteAtdSeq;
	}

	public void setPteAtdSeq(Integer pteAtdSeq) {
		this.pteAtdSeq = pteAtdSeq;
	}

	@Column(name = "PTE_SEQ")
	public Integer getPteSeq() {
		return this.pteSeq;
	}

	public void setPteSeq(Integer pteSeq) {
		this.pteSeq = pteSeq;
	}

	@Column(name = "QTDE_SESSOES")
	public Short getQtdeSessoes() {
		return this.qtdeSessoes;
	}

	public void setQtdeSessoes(Short qtdeSessoes) {
		this.qtdeSessoes = qtdeSessoes;
	}

	@Column(name = "OBSERVACAO", length = 2000)
	@Length(max = 2000)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Column(name = "IND_SESSOES_CONTINUAS", length = 1)
	@Length(max = 1)
	public String getIndSessoesContinuas() {
		return this.indSessoesContinuas;
	}

	public void setIndSessoesContinuas(String indSessoesContinuas) {
		this.indSessoesContinuas = indSessoesContinuas;
	}

	@Column(name = "PHI_SEQ")
	public Integer getPhiSeq() {
		return this.phiSeq;
	}

	public void setPhiSeq(Integer phiSeq) {
		this.phiSeq = phiSeq;
	}

	@Column(name = "CON_NUMERO")
	public Integer getConNumero() {
		return this.conNumero;
	}

	public void setConNumero(Integer conNumero) {
		this.conNumero = conNumero;
	}

	@Column(name = "JUSTIFICATIVA", length = 2000)
	@Length(max = 2000)
	public String getJustificativa() {
		return this.justificativa;
	}

	public void setJustificativa(String justificativa) {
		this.justificativa = justificativa;
	}

	@Column(name = "DURACAO_TRATAMENTO")
	public Short getDuracaoTratamento() {
		return this.duracaoTratamento;
	}

	public void setDuracaoTratamento(Short duracaoTratamento) {
		this.duracaoTratamento = duracaoTratamento;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		ATD_SEQ("atdSeq"),
		SEQ("seq"),
		DT_PREV_EXECUCAO("dtPrevExecucao"),
		CICLO("ciclo"),
		DIA("dia"),
		CRIADO_EM("criadoEm"),
		ALTERADO_EM("alteradoEm"),
		IND_SITUACAO("indSituacao"),
		DTHR_MOVIMENTO("dthrMovimento"),
		COMPL_CICLO("complCiclo"),
		DTHR_INICIO_MVTO_PENDENTE("dthrInicioMvtoPendente"),
		CIT_VPA_PTA_SEQ("citVpaPtaSeq"),
		CIT_VPA_SEQP("citVpaSeqp"),
		CIT_SEQP("citSeqp"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		SER_MATRICULA_VALIDA("serMatriculaValida"),
		SER_VIN_CODIGO_VALIDA("serVinCodigoValida"),
		LOTE("lote"),
		DTHR_VALIDA("dthrValida"),
		IND_REIMPRESSAO("indReimpressao"),
		DT_PREV_AGENDA("dtPrevAgenda"),
		PTE_ATD_SEQ("pteAtdSeq"),
		PTE_SEQ("pteSeq"),
		QTDE_SESSOES("qtdeSessoes"),
		OBSERVACAO("observacao"),
		IND_SESSOES_CONTINUAS("indSessoesContinuas"),
		PHI_SEQ("phiSeq"),
		CON_NUMERO("conNumero"),
		JUSTIFICATIVA("justificativa"),
		DURACAO_TRATAMENTO("duracaoTratamento");

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
