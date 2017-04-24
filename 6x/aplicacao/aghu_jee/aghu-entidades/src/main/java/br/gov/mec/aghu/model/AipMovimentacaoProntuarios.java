	package br.gov.mec.aghu.model;

// Generated 08/02/2010 17:25:25 by Hibernate Tools 3.2.5.Beta

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;




import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacaoMovimentoProntuario;
import br.gov.mec.aghu.dominio.DominioTipoEnvioProntuario;
import br.gov.mec.aghu.dominio.DominioTipoSolicitacaoProntuario;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * AipMovimentacaoProntuarios generated by hbm2java
 */
@Entity
@Table(name = "AIP_MOVIMENTACAO_PRONTUARIOS", schema = "AGH")
@SequenceGenerator(name = "aipMvpSq1", sequenceName = "AGH.AIP_MVP_SQ1", allocationSize = 1)
public class AipMovimentacaoProntuarios extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * serialVersionUID.
	 */
	private static final long serialVersionUID = 4091139438248339462L;

	/**
	 * Chave primária na base de dados.
	 */
	private Integer seq;

	/**
	 * Observações.
	 */
	private String observacoes;
	/**
	 * Volumes.
	 */
	private Short volumes;
	/**
	 * Tipo de Envio.
	 */
	private DominioTipoEnvioProntuario tipoEnvio;
	/**
	 * Situação
	 */
	private DominioSituacaoMovimentoProntuario situacao;
	/**
	 * Data de movimento.
	 */
	private Date dataMovimento;
	/**
	 * Data de retirada.
	 */
	private Date dataRetirada;
	/**
	 * Data de devolução.
	 */
	private Date dataDevolucao;
	/**
	 * Servidor.
	 */
	private RapServidores servidor;
	/**
	 * Servidor retirado.
	 */
	private RapServidores servidorRetirado;
	/**
	 * Solicitante
	 */
	private AipSolicitantesProntuario solicitante;
	/**
	 * solicitação
	 */
	private AipSolicitacaoProntuarios solicitacao;
	/**
	 * Local.
	 */
	private String local;
	/** Origem do Prontuário.
	 */
	private AghSamis samisOrigem;
	/**
	 * Local para o qual o prontuário foi movimentado.
	 */
	private String localAtual;
	/**
	/**
	 * Momento de criação.
	 */
	private Date criadoEm;
	/**
	 * Data localização.
	 */
	private Date dataCadastroOrigemProntuario;

	/**
	 * paciente.
	 */
	private AipPacientes paciente;
	/**
	 * Tipo de Envio.
	 */
	private DominioTipoSolicitacaoProntuario indTipoSolicitacao;

	/**
	 * Unidade Funcional Solicitante.
	 */
	private AghUnidadesFuncionais unidadeSolicitante;

	/**
	 * version - atributo para controle de concorrência
	 */
	private Integer version;

	public AipMovimentacaoProntuarios() {
	}

	public AipMovimentacaoProntuarios(Integer seq,
			DominioTipoEnvioProntuario tipoEnvio,
			DominioSituacaoMovimentoProntuario situacao, Date dataMovimento,
			Integer pacCodigo, RapServidores servidor,
			AipSolicitantesProntuario solicitante) {
		this.seq = seq;
		this.tipoEnvio = tipoEnvio;
		this.situacao = situacao;
		this.dataMovimento = dataMovimento;
		this.servidor = servidor;
		this.solicitante = solicitante;
	}

	public AipMovimentacaoProntuarios(Integer seq, String observacoes,
			Short volumes, DominioTipoEnvioProntuario tipoEnvio,
			DominioSituacaoMovimentoProntuario situacao, Date dataMovimento,
			Date dataRetirada, Date dataDevolucao, Integer pacCodigo,
			RapServidores servidor, RapServidores servidorRetirado,
			AipSolicitantesProntuario solicitante,
			AipSolicitacaoProntuarios solicitacao, String local, Date criadoEm,
			Date dataCadastroOrigemProntuario, String localAtual) {
		this.seq = seq;
		this.observacoes = observacoes;
		this.volumes = volumes;
		this.tipoEnvio = tipoEnvio;
		this.situacao = situacao;
		this.dataMovimento = dataMovimento;
		this.dataRetirada = dataRetirada;
		this.dataDevolucao = dataDevolucao;
		this.servidor = servidor;
		this.servidorRetirado = servidorRetirado;
		this.solicitante = solicitante;
		this.setSolicitacao(solicitacao);
		this.local = local;
		this.criadoEm = criadoEm;
		this.dataCadastroOrigemProntuario = dataCadastroOrigemProntuario;
		this.localAtual = localAtual;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aipMvpSq1")
	@Column(name = "SEQ", nullable = false, precision = 8, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "PAC_CODIGO", referencedColumnName = "CODIGO")
	public AipPacientes getPaciente() {
		return this.paciente;
	}

	public void setPaciente(AipPacientes paciente) {
		this.paciente = paciente;
	}

	@Column(name = "OBSERVACOES", length = 200)
	@Length(max = 200)
	public String getObservacoes() {
		return this.observacoes;
	}

	public void setObservacoes(String observacoes) {
		this.observacoes = observacoes;
	}

	@Column(name = "VOLUMES", precision = 3, scale = 0)
	public Short getVolumes() {
		return this.volumes;
	}

	public void setVolumes(Short volumes) {
		this.volumes = volumes;
	}

	@Column(name = "TIPO_ENVIO", nullable = false, length=1)
	@Enumerated(EnumType.STRING)
	public DominioTipoEnvioProntuario getTipoEnvio() {
		return this.tipoEnvio;
	}

	public void setTipoEnvio(DominioTipoEnvioProntuario tipoEnvio) {
		this.tipoEnvio = tipoEnvio;
	}

	@Column(name = "SITUACAO", nullable = false, length=1)
	@Enumerated(EnumType.STRING)
	public DominioSituacaoMovimentoProntuario getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacaoMovimentoProntuario situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_MOVIMENTO", nullable = false)
	public Date getDataMovimento() {
		return this.dataMovimento;
	}

	public void setDataMovimento(Date dataMovimento) {
		this.dataMovimento = dataMovimento;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_RETIRADA")
	public Date getDataRetirada() {
		return this.dataRetirada;
	}

	public void setDataRetirada(Date dataRetirada) {
		this.dataRetirada = dataRetirada;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_DEVOLUCAO")
	public Date getDataDevolucao() {
		return this.dataDevolucao;
	}

	public void setDataDevolucao(Date dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	@Column(name = "LOCAL", length = 50)
	@Length(max = 50)
	public String getLocal() {
		return this.local;
	}

	public void setLocal(String local) {
		this.local = local;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM")
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_CADASTRO_ORIGEM", nullable = true, length = 7)
	public Date getDataCadastroOrigemProntuario() {
		return this.dataCadastroOrigemProntuario;
	}

	public void setDataCadastroOrigemProntuario(Date dataCadastroOrigemProntuario) {
		this.dataCadastroOrigemProntuario = dataCadastroOrigemProntuario;
	}

	/**
	 * @param servidor
	 *            the servidor to set
	 */
	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	/**
	 * @return the servidor
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return servidor;
	}

	/**
	 * @param servidorRetirado
	 *            the servidorRetirado to set
	 */
	public void setServidorRetirado(RapServidores servidorRetirado) {
		this.servidorRetirado = servidorRetirado;
	}

	/**
	 * @return the servidorRetirado
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_RETIRADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_RETIRADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorRetirado() {
		return servidorRetirado;
	}

	/**
	 * @param solicitante
	 *            the solicitante to set
	 */
	public void setSolicitante(AipSolicitantesProntuario solicitante) {
		this.solicitante = solicitante;
	}

	/**
	 * @return the solicitante
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SOP_SEQ", nullable = false)
	public AipSolicitantesProntuario getSolicitante() {
		return solicitante;
	}

	/**
	 * @param solicitacao
	 *            the solicitacao to set
	 */
	public void setSolicitacao(AipSolicitacaoProntuarios solicitacao) {
		this.solicitacao = solicitacao;
	}

	/**
	 * @return the solicitacao
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SLP_CODIGO")
	public AipSolicitacaoProntuarios getSolicitacao() {
		return solicitacao;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "SAMIS_SEQ", referencedColumnName = "SEQ", nullable = true)
	public AghSamis getSamisOrigem() {
		return samisOrigem;
	}

	public void setSamisOrigem(AghSamis samisOrigem) {
		this.samisOrigem = samisOrigem;
	}
	
	@Column(name = "LOCAL_ATUAL", nullable = true, length = 60)
	@Length(max = 60, message = "Local atual pode ter no mÃ¡ximo 60 caracteres.")
	public String getLocalAtual() {
		return localAtual;
	}

	public void setLocalAtual(String localAtual) {
		this.localAtual = localAtual;
	}

	@Column(name = "IND_TIPO_SOLICITACAO", nullable = false, length=1)
	@Enumerated(EnumType.STRING)
	public DominioTipoSolicitacaoProntuario getIndTipoSolicitacao() {
		return indTipoSolicitacao;
	}

	public void setIndTipoSolicitacao(
			DominioTipoSolicitacaoProntuario indTipoSolicitacao) {
		this.indTipoSolicitacao = indTipoSolicitacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SOLICITANTE_SEQ")
	public AghUnidadesFuncionais getUnidadeSolicitante() {
		return unidadeSolicitante;
	}

	public void setUnidadeSolicitante(AghUnidadesFuncionais unidadeSolicitante) {
		this.unidadeSolicitante = unidadeSolicitante;
	}



	public enum Fields {
		SEQ("seq"),
		
		TIPO_ENVIO("tipoEnvio"),
		
		PAC_CODIGO("paciente.codigo"),

		PAC_PRONTUARIO("paciente.prontuario"),
		
		SERVIDOR_MATRICULA("servidor.id.matricula"),
		
		SERVIDOR_VINCULO("servidor.id.vinCodigo"),
		
		SERVIDOR_RETIRADO_MATRICULA("servidorRetirado.id.matricula"),
		
		SERVIDOR_RETIRADO_VINCULO("servidorRetirado.id.vinCodigo"),
		
		PAC_NOME("paciente.nome"),
		
		PAC_LEITO_ID("paciente.leito.leitoID"),

		SLP_CODIGO("solicitacao.codigo"),

		SLC_SEQ("solicitante.seq"),
		
		SOLICITANTE("solicitante"),

		DATA_MOVIMENTO("dataMovimento"),
		
		DATA_RETIRADA("dataRetirada"),
		
		DATA_DEVOLUCAO("dataDevolucao"),
		
		DT_CADASTRO_ORIGEM_PRONTUARIO("dataCadastroOrigemProntuario"),
		
		VOLUMES("volumes"),
		
		PACIENTE("paciente"), 
		
		SAMIS("samisOrigem"),
		
		SOLICITACAO("solicitacao"), 
		
		LOCAL("local"),
		
		LOCAL_ATUAL("localAtual"),
		
		OBSERVACOES("observacoes"), 
		
		SITUACAO("situacao");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((seq == null) ? 0 : seq.hashCode());
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
		AipMovimentacaoProntuarios other = (AipMovimentacaoProntuarios) obj;
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}
}