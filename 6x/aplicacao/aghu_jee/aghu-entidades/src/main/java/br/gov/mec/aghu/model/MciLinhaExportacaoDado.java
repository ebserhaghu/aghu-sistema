package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
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

import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * MciLinhaExportacaoDado generated by hbm2java
 */
@Entity
@Table(name = "MCI_LINHA_EXPORTACAO_DADOS", schema = "AGH")
public class MciLinhaExportacaoDado extends BaseEntitySeq<Short> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 9156710829382008782L;
	private Short seq;
	private Integer version;
	private MciNomeArquivoExportacao mciNomeArquivoExportacao;
	private RapServidores rapServidores;
	private MciLinhaExportacaoDado mciLinhaExportacaoDado;
	private MciExportacaoDado mciExportacaoDado;
	private Short ordem;
	private Date criadoEm;
	private String indSituacao;
	private String descricao;
	private Set<MciLinhaExportacaoDado> mciLinhaExportacaoDadoes = new HashSet<MciLinhaExportacaoDado>(0);
	private Set<MciReportLinhaExportacao> mciReportLinhaExportacaoes = new HashSet<MciReportLinhaExportacao>(0);

	public MciLinhaExportacaoDado() {
	}

	public MciLinhaExportacaoDado(Short seq, MciNomeArquivoExportacao mciNomeArquivoExportacao, RapServidores rapServidores,
			MciExportacaoDado mciExportacaoDado, Short ordem, Date criadoEm, String indSituacao, String descricao) {
		this.seq = seq;
		this.mciNomeArquivoExportacao = mciNomeArquivoExportacao;
		this.rapServidores = rapServidores;
		this.mciExportacaoDado = mciExportacaoDado;
		this.ordem = ordem;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.descricao = descricao;
	}

	public MciLinhaExportacaoDado(Short seq, MciNomeArquivoExportacao mciNomeArquivoExportacao, RapServidores rapServidores,
			MciLinhaExportacaoDado mciLinhaExportacaoDado, MciExportacaoDado mciExportacaoDado, Short ordem, Date criadoEm,
			String indSituacao, String descricao, Set<MciLinhaExportacaoDado> mciLinhaExportacaoDadoes,
			Set<MciReportLinhaExportacao> mciReportLinhaExportacaoes) {
		this.seq = seq;
		this.mciNomeArquivoExportacao = mciNomeArquivoExportacao;
		this.rapServidores = rapServidores;
		this.mciLinhaExportacaoDado = mciLinhaExportacaoDado;
		this.mciExportacaoDado = mciExportacaoDado;
		this.ordem = ordem;
		this.criadoEm = criadoEm;
		this.indSituacao = indSituacao;
		this.descricao = descricao;
		this.mciLinhaExportacaoDadoes = mciLinhaExportacaoDadoes;
		this.mciReportLinhaExportacaoes = mciReportLinhaExportacaoes;
	}

	@Id
	@Column(name = "SEQ", unique = true, nullable = false)
	public Short getSeq() {
		return this.seq;
	}

	public void setSeq(Short seq) {
		this.seq = seq;
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
	@JoinColumn(name = "NAE_SEQ", nullable = false)
	public MciNomeArquivoExportacao getMciNomeArquivoExportacao() {
		return this.mciNomeArquivoExportacao;
	}

	public void setMciNomeArquivoExportacao(MciNomeArquivoExportacao mciNomeArquivoExportacao) {
		this.mciNomeArquivoExportacao = mciNomeArquivoExportacao;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getRapServidores() {
		return this.rapServidores;
	}

	public void setRapServidores(RapServidores rapServidores) {
		this.rapServidores = rapServidores;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "LED_SEQ")
	public MciLinhaExportacaoDado getMciLinhaExportacaoDado() {
		return this.mciLinhaExportacaoDado;
	}

	public void setMciLinhaExportacaoDado(MciLinhaExportacaoDado mciLinhaExportacaoDado) {
		this.mciLinhaExportacaoDado = mciLinhaExportacaoDado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "EDA_SEQ", nullable = false)
	public MciExportacaoDado getMciExportacaoDado() {
		return this.mciExportacaoDado;
	}

	public void setMciExportacaoDado(MciExportacaoDado mciExportacaoDado) {
		this.mciExportacaoDado = mciExportacaoDado;
	}

	@Column(name = "ORDEM", nullable = false)
	public Short getOrdem() {
		return this.ordem;
	}

	public void setOrdem(Short ordem) {
		this.ordem = ordem;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Length(max = 1)
	public String getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(String indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 60)
	@Length(max = 60)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciLinhaExportacaoDado")
	public Set<MciLinhaExportacaoDado> getMciLinhaExportacaoDadoes() {
		return this.mciLinhaExportacaoDadoes;
	}

	public void setMciLinhaExportacaoDadoes(Set<MciLinhaExportacaoDado> mciLinhaExportacaoDadoes) {
		this.mciLinhaExportacaoDadoes = mciLinhaExportacaoDadoes;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "mciLinhaExportacaoDado")
	public Set<MciReportLinhaExportacao> getMciReportLinhaExportacaoes() {
		return this.mciReportLinhaExportacaoes;
	}

	public void setMciReportLinhaExportacaoes(Set<MciReportLinhaExportacao> mciReportLinhaExportacaoes) {
		this.mciReportLinhaExportacaoes = mciReportLinhaExportacaoes;
	}

	public enum Fields {

		SEQ("seq"),
		VERSION("version"),
		MCI_NOME_ARQUIVO_EXPORTACOES("mciNomeArquivoExportacao"),
		RAP_SERVIDORES("rapServidores"),
		MCI_LINHA_EXPORTACAO_DADOS("mciLinhaExportacaoDado"),
		MCI_EXPORTACAO_DADOS("mciExportacaoDado"),
		ORDEM("ordem"),
		CRIADO_EM("criadoEm"),
		IND_SITUACAO("indSituacao"),
		DESCRICAO("descricao"),
		MCI_LINHA_EXPORTACAO_DADOES("mciLinhaExportacaoDadoes"),
		MCI_REPORT_LINHA_EXPORTACAOES("mciReportLinhaExportacaoes");

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
		result = prime * result + ((getSeq() == null) ? 0 : getSeq().hashCode());
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
		if (!(obj instanceof MciLinhaExportacaoDado)) {
			return false;
		}
		MciLinhaExportacaoDado other = (MciLinhaExportacaoDado) obj;
		if (getSeq() == null) {
			if (other.getSeq() != null) {
				return false;
			}
		} else if (!getSeq().equals(other.getSeq())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}