package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;


import org.hibernate.annotations.Parameter;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioLwsCodigoResposta;
import br.gov.mec.aghu.dominio.DominioLwsTipoComunicacao;
import br.gov.mec.aghu.dominio.DominioLwsTipoStatusTransacao;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * LwsComunicacao generated by hbm2java
 */
@Entity
@Table(name = "LWS_COMUNICACAO", schema = "AGH")
@SequenceGenerator(name = "lwsComIdComunicacaoSeq", sequenceName = "agh.lws_com_id_comunicacao_seq", allocationSize = 1)
public class LwsComunicacao extends BaseEntityId<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -7176770553744709977L;
	private Integer idComunicacao;
	private LwsComEventosComando lwsComEventosComando;
	private Short idOrigem;
	private Short idDestino;
	private DominioLwsTipoComunicacao tipoComunicacao;
	private Integer seqComunicacao;
	private DominioLwsCodigoResposta codResposta;
	private String observacao;
	private Date dataHora;
	private DominioLwsTipoStatusTransacao status;
	private Set<LwsComSolicitacaoExame> lwsComSolicitacaoExamees = new HashSet<LwsComSolicitacaoExame>(0);
	private Set<LwsComResultado> lwsComResultadoes = new HashSet<LwsComResultado>(0);
	private Set<LwsComPaciente> lwsComPacientees = new HashSet<LwsComPaciente>(0);
	private Set<LwsComEventosComando> lwsComEventosComandoes = new HashSet<LwsComEventosComando>(0);
	private Set<LwsComAmostra> lwsComAmostraes = new HashSet<LwsComAmostra>(0);

	public LwsComunicacao() {
	}

	public LwsComunicacao(Integer idComunicacao, Short idOrigem, Short idDestino, DominioLwsTipoComunicacao tipoComunicacao, Integer seqComunicacao, Date dataHora) {
		this.idComunicacao = idComunicacao;
		this.idOrigem = idOrigem;
		this.idDestino = idDestino;
		this.tipoComunicacao = tipoComunicacao;
		this.seqComunicacao = seqComunicacao;
		this.dataHora = dataHora;
	}

	public LwsComunicacao(Integer idComunicacao, LwsComEventosComando lwsComEventosComando, Short idOrigem, Short idDestino,
			DominioLwsTipoComunicacao tipoComunicacao, Integer seqComunicacao, DominioLwsCodigoResposta codResposta, String observacao, Date dataHora, DominioLwsTipoStatusTransacao status,
			Set<LwsComSolicitacaoExame> lwsComSolicitacaoExamees, Set<LwsComResultado> lwsComResultadoes,
			Set<LwsComPaciente> lwsComPacientees, Set<LwsComEventosComando> lwsComEventosComandoes,
			Set<LwsComAmostra> lwsComAmostraes) {
		this.idComunicacao = idComunicacao;
		this.lwsComEventosComando = lwsComEventosComando;
		this.idOrigem = idOrigem;
		this.idDestino = idDestino;
		this.tipoComunicacao = tipoComunicacao;
		this.seqComunicacao = seqComunicacao;
		this.codResposta = codResposta;
		this.observacao = observacao;
		this.dataHora = dataHora;
		this.status = status;
		this.lwsComSolicitacaoExamees = lwsComSolicitacaoExamees;
		this.lwsComResultadoes = lwsComResultadoes;
		this.lwsComPacientees = lwsComPacientees;
		this.lwsComEventosComandoes = lwsComEventosComandoes;
		this.lwsComAmostraes = lwsComAmostraes;
	}

	@Id
	@Column(name = "ID_COMUNICACAO", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "lwsComIdComunicacaoSeq")
	public Integer getIdComunicacao() {
		return this.idComunicacao;
	}

	public void setIdComunicacao(Integer idComunicacao) {
		this.idComunicacao = idComunicacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_EVENTO")
	public LwsComEventosComando getLwsComEventosComando() {
		return this.lwsComEventosComando;
	}

	public void setLwsComEventosComando(LwsComEventosComando lwsComEventosComando) {
		this.lwsComEventosComando = lwsComEventosComando;
	}

	@Column(name = "ID_ORIGEM", nullable = false)
	public Short getIdOrigem() {
		return this.idOrigem;
	}

	public void setIdOrigem(Short idOrigem) {
		this.idOrigem = idOrigem;
	}

	@Column(name = "ID_DESTINO", nullable = false)
	public Short getIdDestino() {
		return this.idDestino;
	}

	public void setIdDestino(Short idDestino) {
		this.idDestino = idDestino;
	}

	@Column(name = "TIPO_COMUNICACAO", nullable = false, length = 2)
	@org.hibernate.annotations.Type(parameters = { @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioLwsTipoComunicacao") }, type = "br.gov.mec.aghu.model.jpa.ParametroLaudoUserType")
	public DominioLwsTipoComunicacao getTipoComunicacao() {
		return tipoComunicacao;
	}
	
	public void setTipoComunicacao(DominioLwsTipoComunicacao tipoComunicacao) {
		this.tipoComunicacao = tipoComunicacao;
	}

	@Column(name = "SEQ_COMUNICACAO", nullable = false)
	public Integer getSeqComunicacao() {
		return this.seqComunicacao;
	}

	public void setSeqComunicacao(Integer seqComunicacao) {
		this.seqComunicacao = seqComunicacao;
	}

	@Column(name = "COD_RESPOSTA", length = 3)
	@Enumerated(EnumType.STRING)
	public DominioLwsCodigoResposta getCodResposta() {
		return codResposta;
	}
	
	public void setCodResposta(DominioLwsCodigoResposta codResposta) {
		this.codResposta = codResposta;
	}

	@Column(name = "OBSERVACAO", length = 1000)
	@Length(max = 1000)
	public String getObservacao() {
		return this.observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_HORA", nullable = false, length = 29)
	public Date getDataHora() {
		return this.dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	@Column(name = "STATUS", length = 1)
	@org.hibernate.annotations.Type(parameters = { @Parameter(name = "enumClassName", value = "br.gov.mec.aghu.dominio.DominioLwsTipoStatusTransacao") }, type = "br.gov.mec.aghu.model.jpa.ParametroLaudoUserType")
	public DominioLwsTipoStatusTransacao getStatus() {
		return status;
	}
	
	public void setStatus(DominioLwsTipoStatusTransacao status) {
		this.status = status;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lwsComunicacao")
	public Set<LwsComSolicitacaoExame> getLwsComSolicitacaoExamees() {
		return this.lwsComSolicitacaoExamees;
	}

	public void setLwsComSolicitacaoExamees(Set<LwsComSolicitacaoExame> lwsComSolicitacaoExamees) {
		this.lwsComSolicitacaoExamees = lwsComSolicitacaoExamees;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lwsComunicacao")
	public Set<LwsComResultado> getLwsComResultadoes() {
		return this.lwsComResultadoes;
	}

	public void setLwsComResultadoes(Set<LwsComResultado> lwsComResultadoes) {
		this.lwsComResultadoes = lwsComResultadoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lwsComunicacao")
	public Set<LwsComPaciente> getLwsComPacientees() {
		return this.lwsComPacientees;
	}

	public void setLwsComPacientees(Set<LwsComPaciente> lwsComPacientees) {
		this.lwsComPacientees = lwsComPacientees;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lwsComunicacao")
	public Set<LwsComEventosComando> getLwsComEventosComandoes() {
		return this.lwsComEventosComandoes;
	}

	public void setLwsComEventosComandoes(Set<LwsComEventosComando> lwsComEventosComandoes) {
		this.lwsComEventosComandoes = lwsComEventosComandoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lwsComunicacao")
	public Set<LwsComAmostra> getLwsComAmostraes() {
		return this.lwsComAmostraes;
	}

	public void setLwsComAmostraes(Set<LwsComAmostra> lwsComAmostraes) {
		this.lwsComAmostraes = lwsComAmostraes;
	}

	public enum Fields {

		ID_COMUNICACAO("idComunicacao"),
		LWS_COM_EVENTOS_COMANDOS("lwsComEventosComando"),
		ID_ORIGEM("idOrigem"),
		ID_DESTINO("idDestino"),
		TIPO_COMUNICACAO("tipoComunicacao"),
		SEQ_COMUNICACAO("seqComunicacao"),
		COD_RESPOSTA("codResposta"),
		OBSERVACAO("observacao"),
		DATA_HORA("dataHora"),
		STATUS("status"),
		LWS_COM_SOLICITACAO_EXAMEES("lwsComSolicitacaoExamees"),
		LWS_COM_RESULTADOES("lwsComResultadoes"),
		LWS_COM_PACIENTEES("lwsComPacientees"),
		LWS_COM_EVENTOS_COMANDOES("lwsComEventosComandoes"),
		LWS_COM_AMOSTRAES("lwsComAmostraes");

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
		result = prime * result + ((getIdComunicacao() == null) ? 0 : getIdComunicacao().hashCode());
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
		if (!(obj instanceof LwsComunicacao)) {
			return false;
		}
		LwsComunicacao other = (LwsComunicacao) obj;
		if (getIdComunicacao() == null) {
			if (other.getIdComunicacao() != null) {
				return false;
			}
		} else if (!getIdComunicacao().equals(other.getIdComunicacao())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####
 
 @Transient public Integer getId(){ return this.getIdComunicacao();} 
 public void setId(Integer id){ this.setIdComunicacao(id);}
}