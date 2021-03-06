package br.gov.mec.aghu.model;

// Generated 11/06/2010 10:31:39 by Hibernate Tools 3.2.5.Beta

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * MciEtiologiaInfeccoes generated by hbm2java
 */
@Entity
@Table(name = "MCI_ETIOLOGIA_INFECCOES", schema = "AGH")

public class MciEtiologiaInfeccao extends BaseEntityCodigo<String> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8660862129036542920L;
	private String codigo;
	private RapServidores servidor;
	private AghUnidadesFuncionais unidadeFuncional;
	private RapServidores servidorMovimentado;
	private DominioSituacao situacao;
	private Date criadoEm;
	private Date alteradoEm;
	private String textoNotificacao;
	private String descricao;
	private Integer version;
	private Set<MciMvtoInfeccaoTopografias> movimentoInfeccaoTopografias = new HashSet<MciMvtoInfeccaoTopografias>(
			0);
	
	public MciEtiologiaInfeccao() {
	}

	public MciEtiologiaInfeccao(String codigo,
			RapServidores servidor, DominioSituacao situacao,
			Date criadoEm, String textoNotificacao, String descricao, Integer version) {
		this.codigo = codigo;
		this.servidor = servidor;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.textoNotificacao = textoNotificacao;
		this.descricao = descricao;
		this.version = version;
	}

	public MciEtiologiaInfeccao(String codigo,
			RapServidores servidor,
			AghUnidadesFuncionais unidadeFuncional,
			RapServidores servidorMovimentado, DominioSituacao situacao,
			Date criadoEm, Date alteradoEm, String textoNotificacao,
			Set<MciMvtoInfeccaoTopografias> movimentoInfeccaoTopografias) {
		this.codigo = codigo;
		this.servidor = servidor;
		this.unidadeFuncional = unidadeFuncional;
		this.servidorMovimentado = servidorMovimentado;
		this.situacao = situacao;
		this.criadoEm = criadoEm;
		this.alteradoEm = alteradoEm;
		this.textoNotificacao = textoNotificacao;
		this.movimentoInfeccaoTopografias = movimentoInfeccaoTopografias;
	}

	@Id
	@Column(name = "TIPO", nullable = false, length = 2)
	public String getCodigo() {
		return this.codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(
			RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UNF_SEQ")
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return this.unidadeFuncional;
	}

	public void setUnidadeFuncional(
			AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_MOVIMENTADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_MOVIMENTADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorMovimentado() {
		return this.servidorMovimentado;
	}

	public void setServidorMovimentado(
			RapServidores servidorMovimentado) {
		this.servidorMovimentado = servidorMovimentado;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 7)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}

	@Column(name = "TEXTO_NOTIFICACAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getTextoNotificacao() {
		return this.textoNotificacao;
	}

	public void setTextoNotificacao(String textoNotificacao) {
		this.textoNotificacao = textoNotificacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "etiologiaInfeccao")
	public Set<MciMvtoInfeccaoTopografias> getMovimentoInfeccaoTopografias() {
		return this.movimentoInfeccaoTopografias;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Version
	@Column(name = "VERSION", nullable = false, length = 9)
	public Integer getVersion() {
		return version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	public void setMovimentoInfeccaoTopografias(
			Set<MciMvtoInfeccaoTopografias> movimentoInfeccaoTopografias) {
		this.movimentoInfeccaoTopografias = movimentoInfeccaoTopografias;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
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
		MciEtiologiaInfeccao other = (MciEtiologiaInfeccao) obj;
		if (codigo == null) {
			if (other.codigo != null) {
				return false;
			}
		} else if (!codigo.equals(other.codigo)) {
			return false;
		}
		return true;
	}
	
	
	public enum Fields {
		CODIGO("codigo"),
		DESCRICAO("descricao"),
		TEXTO_NOTIFICACAO("textoNotificacao"),
		SITUACAO("situacao"),
		UNF_SEQ("unidadeFuncional.seq");

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
