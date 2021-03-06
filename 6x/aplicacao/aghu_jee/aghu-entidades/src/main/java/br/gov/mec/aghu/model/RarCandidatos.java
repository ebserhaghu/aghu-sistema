package br.gov.mec.aghu.model;

// Generated 25/07/2011 11:36:03 by Hibernate Tools 3.2.5.Beta

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
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioEstadoCivil;
import br.gov.mec.aghu.dominio.DominioGrupoSanguineo;
import br.gov.mec.aghu.dominio.DominioSexo;
import br.gov.mec.aghu.core.persistence.BaseEntitySeq;

/**
 * RarCandidatos generated by hbm2java
 */
@Entity
@SequenceGenerator(name="rarCndSq1", sequenceName="AGH.RAR_CND_SQ1", allocationSize = 1)
@Table(name = "RAR_CANDIDATOS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = "CPF"))
public class RarCandidatos extends BaseEntitySeq<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8214233726283822975L;
	private Integer seq;
	private RapPessoasFisicas pessoaFisica;
	private String nome;
	private String nomeUsual;
	private Date dtNascimento;
	private DominioSexo sexo;
	private DominioEstadoCivil estadoCivil;
	private String nroRg;
	private Date dtExpedicaoRg;
	private String orgaoExpedicaoRg;
	private String localExpedicaoRg;
	private Long cpf;
	private Long nroTitEleitor;
	private Short zonaTitEleitor;
	private Short secaoTitEleitor;
	private String nroCrm;
	private Date dtRegistro;
	private String cidadeNascimento;
	private AipUfs uf;
	private AipNacionalidades nacionalidade;
	private String nomeMae;
	private String nomePai;
	private String logradouro;
	private Integer nroLogradouro;
	private String complLogradouro;
	private String bairro;
	private Integer cep;
	private Integer cddCodigo;
	private String emailParticular;
	private Short dddFone;
	private Integer fone;
	private Short dddCelular;
	private Integer celular;
	private DominioGrupoSanguineo grupoSanguineo;
	private String fatorRh;
	private Integer iqlCodigo;
	private Date dtInicioGraduacao;
	private Date dtTerminoGraduacao;
	private Long nroInss;
	private Date criadoEm;
	private RapServidores servidor;
	private Date alteradoEm;
	private RapServidores servidorAlteracao;
	private Byte[] foto;
	private Integer version;

	public RarCandidatos() {
	}

	public RarCandidatos(Integer seq, String nome, DominioSexo sexo, DominioEstadoCivil estadoCivil,
			Date criadoEm, RapServidores servidor) {
		this.seq = seq;
		this.nome = nome;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}

	@SuppressWarnings({"PMD.ExcessiveParameterList"})
	public RarCandidatos(Integer seq, RapPessoasFisicas pessoaFisica, String nome,
			String nomeUsual, Date dtNascimento, DominioSexo sexo,
			DominioEstadoCivil estadoCivil, String nroRg, Date dtExpedicaoRg,
			String orgaoExpedicaoRg, String localExpedicaoRg, Long cpf,
			Long nroTitEleitor, Short zonaTitEleitor, Short secaoTitEleitor,
			String nroCrm, Date dtRegistro, String cidadeNascimento,
			AipUfs uf, AipNacionalidades nacionalidade, String nomeMae, String nomePai,
			String logradouro, Integer nroLogradouro, String complLogradouro,
			String bairro, Integer cep, Integer cddCodigo,
			String emailParticular, Short dddFone, Integer fone,
			Short dddCelular, Integer celular, DominioGrupoSanguineo grupoSanguineo,
			String fatorRh, Integer iqlCodigo, Date dtInicioGraduacao,
			Date dtTerminoGraduacao, Long nroInss, Date criadoEm,
			RapServidores servidor, Date alteradoEm,
			RapServidores servidorAlteracao,
			Byte[] foto) {
		this.seq = seq;
		this.pessoaFisica = pessoaFisica;
		this.nome = nome;
		this.nomeUsual = nomeUsual;
		this.dtNascimento = dtNascimento;
		this.sexo = sexo;
		this.estadoCivil = estadoCivil;
		this.nroRg = nroRg;
		this.dtExpedicaoRg = dtExpedicaoRg;
		this.orgaoExpedicaoRg = orgaoExpedicaoRg;
		this.localExpedicaoRg = localExpedicaoRg;
		this.cpf = cpf;
		this.nroTitEleitor = nroTitEleitor;
		this.zonaTitEleitor = zonaTitEleitor;
		this.secaoTitEleitor = secaoTitEleitor;
		this.nroCrm = nroCrm;
		this.dtRegistro = dtRegistro;
		this.cidadeNascimento = cidadeNascimento;
		this.uf = uf;
		this.nacionalidade = nacionalidade;
		this.nomeMae = nomeMae;
		this.nomePai = nomePai;
		this.logradouro = logradouro;
		this.nroLogradouro = nroLogradouro;
		this.complLogradouro = complLogradouro;
		this.bairro = bairro;
		this.cep = cep;
		this.cddCodigo = cddCodigo;
		this.emailParticular = emailParticular;
		this.dddFone = dddFone;
		this.fone = fone;
		this.dddCelular = dddCelular;
		this.celular = celular;
		this.grupoSanguineo = grupoSanguineo;
		this.fatorRh = fatorRh;
		this.iqlCodigo = iqlCodigo;
		this.dtInicioGraduacao = dtInicioGraduacao;
		this.dtTerminoGraduacao = dtTerminoGraduacao;
		this.nroInss = nroInss;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
		this.alteradoEm = alteradoEm;
		this.servidorAlteracao = servidorAlteracao;
		this.foto = foto;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "rarCndSq1")
	@Column(name = "SEQ", unique = true, nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
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
	@JoinColumn(name = "PES_CODIGO", nullable = false)
	public RapPessoasFisicas getPessoaFisica() {
		return pessoaFisica;
	}

	public void setPessoaFisica(RapPessoasFisicas rapPessoaFisica) {
		this.pessoaFisica = rapPessoaFisica;
	}

	@Column(name = "NOME", nullable = false, length = 50)
	@Length(max = 50)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "NOME_USUAL", length = 20)
	@Length(max = 20)
	public String getNomeUsual() {
		return this.nomeUsual;
	}

	public void setNomeUsual(String nomeUsual) {
		this.nomeUsual = nomeUsual;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_NASCIMENTO", length = 29)
	public Date getDtNascimento() {
		return this.dtNascimento;
	}

	public void setDtNascimento(Date dtNascimento) {
		this.dtNascimento = dtNascimento;
	}

	@Column(name = "SEXO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSexo getSexo() {
		return this.sexo;
	}

	public void setSexo(DominioSexo sexo) {
		this.sexo = sexo;
	}

	@Column(name = "ESTADO_CIVIL", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioEstadoCivil getEstadoCivil() {
		return this.estadoCivil;
	}

	public void setEstadoCivil(DominioEstadoCivil estadoCivil) {
		this.estadoCivil = estadoCivil;
	}

	@Column(name = "NRO_RG", length = 11)
	@Length(max = 11)
	public String getNroRg() {
		return this.nroRg;
	}

	public void setNroRg(String nroRg) {
		this.nroRg = nroRg;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_EXPEDICAO_RG", length = 29)
	public Date getDtExpedicaoRg() {
		return this.dtExpedicaoRg;
	}

	public void setDtExpedicaoRg(Date dtExpedicaoRg) {
		this.dtExpedicaoRg = dtExpedicaoRg;
	}

	@Column(name = "ORGAO_EXPEDICAO_RG", length = 25)
	@Length(max = 25)
	public String getOrgaoExpedicaoRg() {
		return this.orgaoExpedicaoRg;
	}

	public void setOrgaoExpedicaoRg(String orgaoExpedicaoRg) {
		this.orgaoExpedicaoRg = orgaoExpedicaoRg;
	}

	@Column(name = "LOCAL_EXPEDICAO_RG", length = 25)
	@Length(max = 25)
	public String getLocalExpedicaoRg() {
		return this.localExpedicaoRg;
	}

	public void setLocalExpedicaoRg(String localExpedicaoRg) {
		this.localExpedicaoRg = localExpedicaoRg;
	}

	@Column(name = "CPF", unique = true)
	public Long getCpf() {
		return this.cpf;
	}

	public void setCpf(Long cpf) {
		this.cpf = cpf;
	}

	@Column(name = "NRO_TIT_ELEITOR")
	public Long getNroTitEleitor() {
		return this.nroTitEleitor;
	}

	public void setNroTitEleitor(Long nroTitEleitor) {
		this.nroTitEleitor = nroTitEleitor;
	}

	@Column(name = "ZONA_TIT_ELEITOR")
	public Short getZonaTitEleitor() {
		return this.zonaTitEleitor;
	}

	public void setZonaTitEleitor(Short zonaTitEleitor) {
		this.zonaTitEleitor = zonaTitEleitor;
	}

	@Column(name = "SECAO_TIT_ELEITOR")
	public Short getSecaoTitEleitor() {
		return this.secaoTitEleitor;
	}

	public void setSecaoTitEleitor(Short secaoTitEleitor) {
		this.secaoTitEleitor = secaoTitEleitor;
	}

	@Column(name = "NRO_CRM", length = 9)
	@Length(max = 9)
	public String getNroCrm() {
		return this.nroCrm;
	}

	public void setNroCrm(String nroCrm) {
		this.nroCrm = nroCrm;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_REGISTRO", length = 29)
	public Date getDtRegistro() {
		return this.dtRegistro;
	}

	public void setDtRegistro(Date dtRegistro) {
		this.dtRegistro = dtRegistro;
	}

	@Column(name = "CIDADE_NASCIMENTO", length = 40)
	@Length(max = 40)
	public String getCidadeNascimento() {
		return this.cidadeNascimento;
	}

	public void setCidadeNascimento(String cidadeNascimento) {
		this.cidadeNascimento = cidadeNascimento;
	}


	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UF_SIGLA")
	public AipUfs getUf() {
		return this.uf;
	}

	public void setUf(AipUfs uf) {
		this.uf = uf;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NAC_CODIGO")
	public AipNacionalidades getNacionalidade() {
		return this.nacionalidade;
	}

	public void setNacionalidade(AipNacionalidades nacionalidade) {
		this.nacionalidade = nacionalidade;
	}

	@Column(name = "NOME_MAE", length = 40)
	@Length(max = 40)
	public String getNomeMae() {
		return this.nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	@Column(name = "NOME_PAI", length = 40)
	@Length(max = 40)
	public String getNomePai() {
		return this.nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	@Column(name = "LOGRADOURO", length = 60)
	@Length(max = 60)
	public String getLogradouro() {
		return this.logradouro;
	}

	public void setLogradouro(String logradouro) {
		this.logradouro = logradouro;
	}

	@Column(name = "NRO_LOGRADOURO")
	public Integer getNroLogradouro() {
		return this.nroLogradouro;
	}

	public void setNroLogradouro(Integer nroLogradouro) {
		this.nroLogradouro = nroLogradouro;
	}

	@Column(name = "COMPL_LOGRADOURO", length = 15)
	@Length(max = 15)
	public String getComplLogradouro() {
		return this.complLogradouro;
	}

	public void setComplLogradouro(String complLogradouro) {
		this.complLogradouro = complLogradouro;
	}

	@Column(name = "BAIRRO", length = 60)
	@Length(max = 60)
	public String getBairro() {
		return this.bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	@Column(name = "CEP")
	public Integer getCep() {
		return this.cep;
	}

	public void setCep(Integer cep) {
		this.cep = cep;
	}

	@Column(name = "CDD_CODIGO")
	public Integer getCddCodigo() {
		return this.cddCodigo;
	}

	public void setCddCodigo(Integer cddCodigo) {
		this.cddCodigo = cddCodigo;
	}

	@Column(name = "EMAIL_PARTICULAR", length = 40)
	@Length(max = 40)
	public String getEmailParticular() {
		return this.emailParticular;
	}

	public void setEmailParticular(String emailParticular) {
		this.emailParticular = emailParticular;
	}

	@Column(name = "DDD_FONE")
	public Short getDddFone() {
		return this.dddFone;
	}

	public void setDddFone(Short dddFone) {
		this.dddFone = dddFone;
	}

	@Column(name = "FONE")
	public Integer getFone() {
		return this.fone;
	}

	public void setFone(Integer fone) {
		this.fone = fone;
	}

	@Column(name = "DDD_CELULAR")
	public Short getDddCelular() {
		return this.dddCelular;
	}

	public void setDddCelular(Short dddCelular) {
		this.dddCelular = dddCelular;
	}

	@Column(name = "CELULAR")
	public Integer getCelular() {
		return this.celular;
	}

	public void setCelular(Integer celular) {
		this.celular = celular;
	}

	@Column(name = "GRUPO_SANGUINEO", length = 2)
	@Enumerated(EnumType.STRING)
	public DominioGrupoSanguineo getGrupoSanguineo() {
		return this.grupoSanguineo;
	}

	public void setGrupoSanguineo(DominioGrupoSanguineo grupoSanguineo) {
		this.grupoSanguineo = grupoSanguineo;
	}

	@Column(name = "FATOR_RH", length = 1)
	@Length(max = 1)
	public String getFatorRh() {
		return this.fatorRh;
	}

	public void setFatorRh(String fatorRh) {
		this.fatorRh = fatorRh;
	}

	@Column(name = "IQL_CODIGO")
	public Integer getIqlCodigo() {
		return this.iqlCodigo;
	}

	public void setIqlCodigo(Integer iqlCodigo) {
		this.iqlCodigo = iqlCodigo;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_INICIO_GRADUACAO", length = 29)
	public Date getDtInicioGraduacao() {
		return this.dtInicioGraduacao;
	}

	public void setDtInicioGraduacao(Date dtInicioGraduacao) {
		this.dtInicioGraduacao = dtInicioGraduacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_TERMINO_GRADUACAO", length = 29)
	public Date getDtTerminoGraduacao() {
		return this.dtTerminoGraduacao;
	}

	public void setDtTerminoGraduacao(Date dtTerminoGraduacao) {
		this.dtTerminoGraduacao = dtTerminoGraduacao;
	}

	@Column(name = "NRO_INSS")
	public Long getNroInss() {
		return this.nroInss;
	}

	public void setNroInss(Long nroInss) {
		this.nroInss = nroInss;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", nullable = false, length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
	public RapServidores getServidor() {
		return this.servidor;
	}
	
	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "ALTERADO_EM", length = 29)
	public Date getAlteradoEm() {
		return this.alteradoEm;
	}

	public void setAlteradoEm(Date alteradoEm) {
		this.alteradoEm = alteradoEm;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA_ALTERADO", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO_ALTERADO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidorAlteracao() {
		return this.servidorAlteracao;
	}
	
	public void setServidorAlteracao(RapServidores servidorAlteracao) {
		this.servidorAlteracao = servidorAlteracao;
	}

	@Column(name = "FOTO")
	public Byte[] getFoto() {
		return this.foto;
	}

	public void setFoto(Byte[] foto) {
		this.foto = foto;
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
		RarCandidatos other = (RarCandidatos) obj;
		if (seq == null) {
			if (other.seq != null) {
				return false;
			}
		} else if (!seq.equals(other.seq)) {
			return false;
		}
		return true;
	}
	
	public enum Fields {
		SEQ("seq"), NACIONALIDADE("nacionalidade"), SERVIDOR("servidor"), PESSOA_FISICA("pessoaFisica");

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
