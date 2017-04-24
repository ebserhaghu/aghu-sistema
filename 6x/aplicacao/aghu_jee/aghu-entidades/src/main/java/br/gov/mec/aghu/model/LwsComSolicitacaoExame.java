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


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioLwsSituacaoAmostra;
import br.gov.mec.aghu.dominio.DominioLwsTipoLiberacao;
import br.gov.mec.aghu.dominio.DominioTipoColeta;
import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * LwsComSolicitacaoExame generated by hbm2java
 */
@Entity
@Table(name = "LWS_COM_SOLICITACAO_EXAMES", schema = "AGH")
@SequenceGenerator(name = "lwsComSolExamesIdSeq", sequenceName = "agh.lws_com_sol_exames_id_seq", allocationSize = 1)
public class LwsComSolicitacaoExame extends BaseEntityId<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8392896120166131309L;
	private Integer id;
	private LwsComunicacao lwsComunicacao;
	private LwsComAmostra lwsComAmostra;
	private String exameLis;
	private Integer repeticao;
	private DominioLwsSituacaoAmostra situacao;
	private DominioTipoColeta prioridade;
	private Integer ordem;
	private Integer diluicao;
	private Date dataHoraLiberacao;
	private DominioLwsTipoLiberacao tipoLiberacao;
	private Date dataHoraSolicitacao;
	private Date dataHoraCarga;
	private String profissionalLiberacao;
	private String profissionalSolicitante;
	private Integer celulasContadas;
	private Boolean listaContagem;
	private String loteControle;
	private String comentarios;
	private String rack;
	private String posicao;
	private Boolean autoValidado;
	private String dadosAdicionais;
	private String equipamentoLis;
	private Integer versaoLis;
	private String setorLis;
	private String solicitacao;
	private Set<LwsComResultado> lwsComResultadoes = new HashSet<LwsComResultado>(0);

	public LwsComSolicitacaoExame() {
	}

	public LwsComSolicitacaoExame(Integer id, LwsComunicacao lwsComunicacao, LwsComAmostra lwsComAmostra, String exameLis) {
		this.id = id;
		this.lwsComunicacao = lwsComunicacao;
		this.lwsComAmostra = lwsComAmostra;
		this.exameLis = exameLis;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public LwsComSolicitacaoExame(Integer id, LwsComunicacao lwsComunicacao, LwsComAmostra lwsComAmostra, String exameLis,
			Integer repeticao, DominioLwsSituacaoAmostra situacao, DominioTipoColeta prioridade, Integer ordem, Integer diluicao, Date dataHoraLiberacao,
			DominioLwsTipoLiberacao tipoLiberacao, Date dataHoraSolicitacao, Date dataHoraCarga, String profissionalLiberacao,
			String profissionalSolicitante, Integer celulasContadas, Boolean listaContagem, String loteControle, String comentarios,
			String rack, String posicao, Boolean autoValidado, String dadosAdicionais, String equipamentoLis, Integer versaoLis,
			String setorLis, String solicitacao, Set<LwsComResultado> lwsComResultadoes) {
		this.id = id;
		this.lwsComunicacao = lwsComunicacao;
		this.lwsComAmostra = lwsComAmostra;
		this.exameLis = exameLis;
		this.repeticao = repeticao;
		this.situacao = situacao;
		this.prioridade = prioridade;
		this.ordem = ordem;
		this.diluicao = diluicao;
		this.dataHoraLiberacao = dataHoraLiberacao;
		this.tipoLiberacao = tipoLiberacao;
		this.dataHoraSolicitacao = dataHoraSolicitacao;
		this.dataHoraCarga = dataHoraCarga;
		this.profissionalLiberacao = profissionalLiberacao;
		this.profissionalSolicitante = profissionalSolicitante;
		this.celulasContadas = celulasContadas;
		this.listaContagem = listaContagem;
		this.loteControle = loteControle;
		this.comentarios = comentarios;
		this.rack = rack;
		this.posicao = posicao;
		this.autoValidado = autoValidado;
		this.dadosAdicionais = dadosAdicionais;
		this.equipamentoLis = equipamentoLis;
		this.versaoLis = versaoLis;
		this.setorLis = setorLis;
		this.solicitacao = solicitacao;
		this.lwsComResultadoes = lwsComResultadoes;
	}

	@Id
	@Column(name = "ID", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "lwsComSolExamesIdSeq")
	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_COMUNICACAO", nullable = false)
	public LwsComunicacao getLwsComunicacao() {
		return this.lwsComunicacao;
	}

	public void setLwsComunicacao(LwsComunicacao lwsComunicacao) {
		this.lwsComunicacao = lwsComunicacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ID_AMOSTRA", nullable = false)
	public LwsComAmostra getLwsComAmostra() {
		return this.lwsComAmostra;
	}

	public void setLwsComAmostra(LwsComAmostra lwsComAmostra) {
		this.lwsComAmostra = lwsComAmostra;
	}

	@Column(name = "EXAME_LIS", nullable = false, length = 20)
	@Length(max = 20)
	public String getExameLis() {
		return this.exameLis;
	}

	public void setExameLis(String exameLis) {
		this.exameLis = exameLis;
	}

	@Column(name = "REPETICAO")
	public Integer getRepeticao() {
		return this.repeticao;
	}

	public void setRepeticao(Integer repeticao) {
		this.repeticao = repeticao;
	}

	@Column(name = "SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioLwsSituacaoAmostra getSituacao() {
		return situacao;
	}
	
	public void setSituacao(DominioLwsSituacaoAmostra situacao) {
		this.situacao = situacao;
	}

	@Column(name = "PRIORIDADE", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioTipoColeta getPrioridade() {
		return prioridade;
	}
	
	public void setPrioridade(DominioTipoColeta prioridade) {
		this.prioridade = prioridade;
	}

	@Column(name = "ORDEM")
	public Integer getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Integer ordem) {
		this.ordem = ordem;
	}

	@Column(name = "DILUICAO")
	public Integer getDiluicao() {
		return this.diluicao;
	}

	public void setDiluicao(Integer diluicao) {
		this.diluicao = diluicao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_HORA_LIBERACAO", length = 29)
	public Date getDataHoraLiberacao() {
		return this.dataHoraLiberacao;
	}

	public void setDataHoraLiberacao(Date dataHoraLiberacao) {
		this.dataHoraLiberacao = dataHoraLiberacao;
	}

	@Column(name = "TIPO_LIBERACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioLwsTipoLiberacao getTipoLiberacao() {
		return tipoLiberacao;
	}
	
	public void setTipoLiberacao(DominioLwsTipoLiberacao tipoLiberacao) {
		this.tipoLiberacao = tipoLiberacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_HORA_SOLICITACAO", length = 29)
	public Date getDataHoraSolicitacao() {
		return this.dataHoraSolicitacao;
	}

	public void setDataHoraSolicitacao(Date dataHoraSolicitacao) {
		this.dataHoraSolicitacao = dataHoraSolicitacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DATA_HORA_CARGA", length = 29)
	public Date getDataHoraCarga() {
		return this.dataHoraCarga;
	}

	public void setDataHoraCarga(Date dataHoraCarga) {
		this.dataHoraCarga = dataHoraCarga;
	}

	@Column(name = "PROFISSIONAL_LIBERACAO", length = 20)
	@Length(max = 20)
	public String getProfissionalLiberacao() {
		return this.profissionalLiberacao;
	}

	public void setProfissionalLiberacao(String profissionalLiberacao) {
		this.profissionalLiberacao = profissionalLiberacao;
	}

	@Column(name = "PROFISSIONAL_SOLICITANTE", length = 20)
	@Length(max = 20)
	public String getProfissionalSolicitante() {
		return this.profissionalSolicitante;
	}

	public void setProfissionalSolicitante(String profissionalSolicitante) {
		this.profissionalSolicitante = profissionalSolicitante;
	}

	@Column(name = "CELULAS_CONTADAS")
	public Integer getCelulasContadas() {
		return this.celulasContadas;
	}

	public void setCelulasContadas(Integer celulasContadas) {
		this.celulasContadas = celulasContadas;
	}

	@Column(name = "IND_LISTA_CONTAGEM", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getListaContagem() {
		return listaContagem;
	}
	
	public void setListaContagem(Boolean listaContagem) {
		this.listaContagem = listaContagem;
	}

	@Column(name = "LOTE_CONTROLE", length = 20)
	@Length(max = 20)
	public String getLoteControle() {
		return this.loteControle;
	}

	public void setLoteControle(String loteControle) {
		this.loteControle = loteControle;
	}

	@Column(name = "COMENTARIOS", length = 250)
	@Length(max = 250)
	public String getComentarios() {
		return this.comentarios;
	}

	public void setComentarios(String comentarios) {
		this.comentarios = comentarios;
	}

	@Column(name = "RACK", length = 20)
	@Length(max = 20)
	public String getRack() {
		return this.rack;
	}

	public void setRack(String rack) {
		this.rack = rack;
	}

	@Column(name = "POSICAO", length = 2)
	@Length(max = 2)
	public String getPosicao() {
		return this.posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	@Column(name = "AUTO_VALIDADO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getAutoValidado() {
		return autoValidado;
	}
	
	public void setAutoValidado(Boolean autoValidado) {
		this.autoValidado = autoValidado;
	}

	@Column(name = "DADOS_ADICIONAIS", length = 512)
	@Length(max = 512)
	public String getDadosAdicionais() {
		return this.dadosAdicionais;
	}

	public void setDadosAdicionais(String dadosAdicionais) {
		this.dadosAdicionais = dadosAdicionais;
	}

	@Column(name = "EQUIPAMENTO_LIS", length = 20)
	@Length(max = 20)
	public String getEquipamentoLis() {
		return this.equipamentoLis;
	}

	public void setEquipamentoLis(String equipamentoLis) {
		this.equipamentoLis = equipamentoLis;
	}

	@Column(name = "VERSAO_LIS")
	public Integer getVersaoLis() {
		return this.versaoLis;
	}

	public void setVersaoLis(Integer versaoLis) {
		this.versaoLis = versaoLis;
	}

	@Column(name = "SETOR_LIS", length = 20)
	@Length(max = 20)
	public String getSetorLis() {
		return this.setorLis;
	}

	public void setSetorLis(String setorLis) {
		this.setorLis = setorLis;
	}

	@Column(name = "SOLICITACAO", length = 20)
	@Length(max = 20)
	public String getSolicitacao() {
		return this.solicitacao;
	}

	public void setSolicitacao(String solicitacao) {
		this.solicitacao = solicitacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "lwsComSolicitacaoExame")
	public Set<LwsComResultado> getLwsComResultadoes() {
		return this.lwsComResultadoes;
	}

	public void setLwsComResultadoes(Set<LwsComResultado> lwsComResultadoes) {
		this.lwsComResultadoes = lwsComResultadoes;
	}

	public enum Fields {

		ID("id"),
		LWS_COMUNICACAO("lwsComunicacao"),
		LWS_COM_AMOSTRAS("lwsComAmostra"),
		EXAME_LIS("exameLis"),
		REPETICAO("repeticao"),
		SITUACAO("situacao"),
		PRIORIDADE("prioridade"),
		ORDEM("ordem"),
		DILUICAO("diluicao"),
		DATA_HORA_LIBERACAO("dataHoraLiberacao"),
		TIPO_LIBERACAO("tipoLiberacao"),
		DATA_HORA_SOLICITACAO("dataHoraSolicitacao"),
		DATA_HORA_CARGA("dataHoraCarga"),
		PROFISSIONAL_LIBERACAO("profissionalLiberacao"),
		PROFISSIONAL_SOLICITANTE("profissionalSolicitante"),
		CELULAS_CONTADAS("celulasContadas"),
		IND_LISTA_CONTAGEM("listaContagem"),
		LOTE_CONTROLE("loteControle"),
		COMENTARIOS("comentarios"),
		RACK("rack"),
		POSICAO("posicao"),
		AUTO_VALIDADO("autoValidado"),
		DADOS_ADICIONAIS("dadosAdicionais"),
		EQUIPAMENTO_LIS("equipamentoLis"),
		VERSAO_LIS("versaoLis"),
		SETOR_LIS("setorLis"),
		SOLICITACAO("solicitacao"),
		LWS_COM_RESULTADOES("lwsComResultadoes");

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
		if (!(obj instanceof LwsComSolicitacaoExame)) {
			return false;
		}
		LwsComSolicitacaoExame other = (LwsComSolicitacaoExame) obj;
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