package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioCategoriaProfissionalEquipePdt;
import br.gov.mec.aghu.dominio.DominioTipoAtuacao;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * PdtProfJn generated by hbm2java
 */
@Entity
@Table(name = "PDT_PROFS_JN", schema = "AGH")
@SequenceGenerator(name = "pdtDpfJnSeq", sequenceName = "AGH.PDT_DPF_JN_SEQ", allocationSize = 1)
@Immutable
public class PdtProfJn extends BaseJournal {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8910666310514404287L;
	
	/* ATUALIZADOR JOURNALS - PROPERTIES	
	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer ddtSeq;
	private Short seqp;
	private DominioTipoAtuacao tipoAtuacao;
	private String nome;
	private DominioCategoriaProfissionalEquipePdt categoria;
	private Date criadoEm;
	private Integer serMatriculaPrf;
	private Short serVinCodigoPrf;
	private Integer serMatricula;
	private Short serVinCodigo;

	public PdtProfJn() {
	}

	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "pdtDpfJnSeq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "DDT_SEQ", nullable = false)
	public Integer getDdtSeq() {
		return this.ddtSeq;
	}

	public void setDdtSeq(Integer ddtSeq) {
		this.ddtSeq = ddtSeq;
	}

	@Column(name = "SEQP", nullable = false)
	public Short getSeqp() {
		return this.seqp;
	}

	public void setSeqp(Short seqp) {
		this.seqp = seqp;
	}

	@Column(name = "TIPO_ATUACAO", nullable = false, length = 4)
	@Enumerated(EnumType.STRING)
	public DominioTipoAtuacao getTipoAtuacao() {
		return this.tipoAtuacao;
	}

	public void setTipoAtuacao(DominioTipoAtuacao tipoAtuacao) {
		this.tipoAtuacao = tipoAtuacao;
	}

	@Column(name = "NOME", length = 100)
	@Length(max = 100)
	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	@Column(name = "CATEGORIA", nullable = true, length = 4)
	@Enumerated(EnumType.STRING)
	public DominioCategoriaProfissionalEquipePdt getCategoria() {
		return categoria;
	}

	public void setCategoria(DominioCategoriaProfissionalEquipePdt categoria) {
		this.categoria = categoria;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "SER_MATRICULA_PRF")
	public Integer getSerMatriculaPrf() {
		return this.serMatriculaPrf;
	}

	public void setSerMatriculaPrf(Integer serMatriculaPrf) {
		this.serMatriculaPrf = serMatriculaPrf;
	}

	@Column(name = "SER_VIN_CODIGO_PRF")
	public Short getSerVinCodigoPrf() {
		return this.serVinCodigoPrf;
	}

	public void setSerVinCodigoPrf(Short serVinCodigoPrf) {
		this.serVinCodigoPrf = serVinCodigoPrf;
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

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	
	  	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		DDT_SEQ("ddtSeq"),
		SEQP("seqp"),
		TIPO_ATUACAO("tipoAtuacao"),
		NOME("nome"),
		CATEGORIA("categoria"),
		CRIADO_EM("criadoEm"),
		SER_MATRICULA_PRF("serMatriculaPrf"),
		SER_VIN_CODIGO_PRF("serVinCodigoPrf"),
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo");

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