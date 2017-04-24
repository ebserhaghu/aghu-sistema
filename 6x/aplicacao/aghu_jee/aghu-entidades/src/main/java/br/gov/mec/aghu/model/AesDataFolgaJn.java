package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AesDataFolgaJn generated by hbm2java
 */
@Entity
@Table(name = "AES_DATAS_FOLGA_JN", schema = "AGH")
@Immutable
public class AesDataFolgaJn extends BaseJournal {

/**
	 * 
	 */
	private static final long serialVersionUID = 6510418641854932445L;
	/* ATUALIZADOR JOURNALS - PROPERTIES	private Long seqJn;
	private String jnUser;
	private Date jnDateTime;
	private String jnOperation;*/
	private Integer serMatricula;
	private Short serVinCodigo;
	private Integer seq;
	private Date dtFolga;
	private Float fatorFolga;
	private Integer sfpSeq;
	private Integer dfoSerMatricula;
	private Short dfoSerVinCodigo;
	private Integer dfoSeq;
	private Date dtGeracao;

	public AesDataFolgaJn() {
	}

	public AesDataFolgaJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer serMatricula, Short serVinCodigo,
			Integer seq) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.seq = seq;
	}

	public AesDataFolgaJn(Long seqJn, String jnUser, Date jnDateTime, String jnOperation, Integer serMatricula, Short serVinCodigo,
			Integer seq, Date dtFolga, Float fatorFolga, Integer sfpSeq, Integer dfoSerMatricula, Short dfoSerVinCodigo, Integer dfoSeq,
			Date dtGeracao) {
	/* ATUALIZADOR JOURNALS - contrutor	this.seqJn = seqJn;
		this.jnUser = jnUser;
		this.jnDateTime = jnDateTime;
		this.jnOperation = jnOperation;*/
		this.serMatricula = serMatricula;
		this.serVinCodigo = serVinCodigo;
		this.seq = seq;
		this.dtFolga = dtFolga;
		this.fatorFolga = fatorFolga;
		this.sfpSeq = sfpSeq;
		this.dfoSerMatricula = dfoSerMatricula;
		this.dfoSerVinCodigo = dfoSerVinCodigo;
		this.dfoSeq = dfoSeq;
		this.dtGeracao = dtGeracao;
	}

	// ATUALIZADOR JOURNALS - ID
	@Id
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

	@Column(name = "SER_MATRICULA", nullable = false)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", nullable = false)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_FOLGA", length = 29)
	public Date getDtFolga() {
		return this.dtFolga;
	}

	public void setDtFolga(Date dtFolga) {
		this.dtFolga = dtFolga;
	}

	@Column(name = "FATOR_FOLGA", precision = 8, scale = 8)
	public Float getFatorFolga() {
		return this.fatorFolga;
	}

	public void setFatorFolga(Float fatorFolga) {
		this.fatorFolga = fatorFolga;
	}

	@Column(name = "SFP_SEQ")
	public Integer getSfpSeq() {
		return this.sfpSeq;
	}

	public void setSfpSeq(Integer sfpSeq) {
		this.sfpSeq = sfpSeq;
	}

	@Column(name = "DFO_SER_MATRICULA")
	public Integer getDfoSerMatricula() {
		return this.dfoSerMatricula;
	}

	public void setDfoSerMatricula(Integer dfoSerMatricula) {
		this.dfoSerMatricula = dfoSerMatricula;
	}

	@Column(name = "DFO_SER_VIN_CODIGO")
	public Short getDfoSerVinCodigo() {
		return this.dfoSerVinCodigo;
	}

	public void setDfoSerVinCodigo(Short dfoSerVinCodigo) {
		this.dfoSerVinCodigo = dfoSerVinCodigo;
	}

	@Column(name = "DFO_SEQ")
	public Integer getDfoSeq() {
		return this.dfoSeq;
	}

	public void setDfoSeq(Integer dfoSeq) {
		this.dfoSeq = dfoSeq;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_GERACAO", length = 29)
	public Date getDtGeracao() {
		return this.dtGeracao;
	}

	public void setDtGeracao(Date dtGeracao) {
		this.dtGeracao = dtGeracao;
	}

	public enum Fields {

	/* ATUALIZADOR JOURNALS - Fields	SEQ_JN("seqJn"),
		JN_USER("jnUser"),
		JN_DATE_TIME("jnDateTime"),
		JN_OPERATION("jnOperation"),*/
		SER_MATRICULA("serMatricula"),
		SER_VIN_CODIGO("serVinCodigo"),
		SEQ("seq"),
		DT_FOLGA("dtFolga"),
		FATOR_FOLGA("fatorFolga"),
		SFP_SEQ("sfpSeq"),
		DFO_SER_MATRICULA("dfoSerMatricula"),
		DFO_SER_VIN_CODIGO("dfoSerVinCodigo"),
		DFO_SEQ("dfoSeq"),
		DT_GERACAO("dtGeracao");

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