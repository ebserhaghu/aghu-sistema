package br.gov.mec.aghu.model;

// Generated 10/11/2011 14:44:22 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;


import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.exception.BusinessExceptionCode;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * ScoAndamentoProcessoCompras generated by hbm2java
 */
@Entity
@Table(name = "SCO_ANDAMENTO_PROCESSO_COMPRAS", schema = "AGH")
@SequenceGenerator(name="scoApcSq1", sequenceName="AGH.SCO_APC_SQ1", allocationSize = 1)
public class ScoAndamentoProcessoCompra extends BaseEntitySeq<Integer> implements java.io.Serializable {
	private static final long serialVersionUID = 2102968834874451861L;
	private Integer seq;
	private Integer version;
	private RapServidores servidor;
	private ScoAutorizacaoForn autorizacaoForn;
	private ScoLicitacao licitacao;
	private ScoLocalizacaoProcesso localizacaoProcesso; 
	private Date dtEntrada;
	private Date dtSaida;
	private Date dtRecebido;
	private String observacao;

	private enum ScoSolicitacaoDeCompraExceptionCode implements BusinessExceptionCode {
		LICITACAO_E_AUTORIZACAO_FORN_INVALIDAS; 
	}

	public ScoAndamentoProcessoCompra() {
	}

	@Id
	@Column(name = "SEQ", unique = true, nullable = false, precision = 7, scale = 0)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "scoApcSq1")
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Version
	@Column(name = "VERSION", nullable = false, precision = 9, scale = 0)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="AFN_NUMERO", referencedColumnName = "NUMERO")
	public ScoAutorizacaoForn getAutorizacaoForn() {
		return autorizacaoForn;
	}

	public void setAutorizacaoForn(ScoAutorizacaoForn autorizacaoForn) {
		this.autorizacaoForn = autorizacaoForn;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="LCT_NUMERO", referencedColumnName = "NUMERO")
	public ScoLicitacao getLicitacao() {
		return licitacao;
	}

	public void setLicitacao(ScoLicitacao licitacao) {
		this.licitacao = licitacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name="LCP_CODIGO", referencedColumnName = "CODIGO")
	public ScoLocalizacaoProcesso getLocalizacaoProcesso() {
		return localizacaoProcesso;
	}

	public void setLocalizacaoProcesso(ScoLocalizacaoProcesso localizacaoProcesso) {
		this.localizacaoProcesso = localizacaoProcesso;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_ENTRADA", nullable = false, length = 7)
	public Date getDtEntrada() {
		return this.dtEntrada;
	}

	public void setDtEntrada(Date dtEntrada) {
		this.dtEntrada = dtEntrada;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_SAIDA", length = 7)
	public Date getDtSaida() {
		return this.dtSaida;
	}

	public void setDtSaida(Date dtSaida) {
		this.dtSaida = dtSaida;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_RECEBIDO", length = 7)
	public Date getDtRecebido() {
		return this.dtRecebido;
	}

	public void setDtRecebido(Date dtRecebido) {
		this.dtRecebido = dtRecebido;
	}

	@Column(name = "OBSERVACAO", length = 500)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
	/**
	 * Obtem dias de permanência.
	 * 
	 * @return Dias de permanência.
	 */
	@Transient
	public Short getDiasPerm() {
		Date dias = dtSaida == null ? new Date() : dtSaida;
		Long time = dias.getTime() - dtEntrada.getTime();
		Short diasPerm = (short) ((time / (1000 * 60 * 60 * 24) + 1));
		return diasPerm;
	}

	@PrePersist
	@PreUpdate
	protected void validacoes() {
    	/* QMS$ENFORCE_ARC_1 */
    	if(!(this.getLicitacao() != null && this.getAutorizacaoForn() == null) || (this.getLicitacao() == null && this.getAutorizacaoForn() != null)) {
			throw new BaseRuntimeException(
					ScoSolicitacaoDeCompraExceptionCode.LICITACAO_E_AUTORIZACAO_FORN_INVALIDAS);   		
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
		if (this == obj){
			return true;
		}
		if (obj == null){
			return false;
		}
		if (getClass() != obj.getClass()){
			return false;
		}
		ScoAndamentoProcessoCompra other = (ScoAndamentoProcessoCompra) obj;
		if (seq == null) {
			if (other.seq != null){
				return false;
			}
		} else if (!seq.equals(other.seq)){
			return false;
		}
		return true;
	}



	public enum Fields {
		SEQ("seq"),
		DATA_SAIDA("dtSaida"),
		DATA_ENTRADA("dtEntrada"),
		NUMERO_LICITACAO("licitacao.numero"),
		AUTORIZACAO_NUMERO("autorizacaoForn.numero"),
		CODIGO_LOCALIZACAO("localizacaoProcesso.codigo"),
		LICITACAO("licitacao"), 
		AUTORIZACAO("autorizacaoForn"),
		LOCALIZACAO("localizacaoProcesso"),
		SERVIDOR("servidor");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return fields;
		}
	}
}