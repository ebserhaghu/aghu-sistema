package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

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

import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AelNomenclaturaGenericJn generated by hbm2java
 */
@Entity
@SequenceGenerator(name="aelLugJnSeq", sequenceName="AGH.AEL_LUG_JN_SEQ", allocationSize = 1)
@Table(name = "AEL_NOMENCLATURA_GENERICS_JN", schema = "AGH")
@Immutable
public class AelNomenclaturaGenericJn extends BaseJournal {

	private static final long serialVersionUID = 8320032932184630405L;
	
	private Integer seq;
	private String descricao;
	private DominioSituacao indSituacao;
	private Date criadoEm;
	private RapServidores servidor;


	public AelNomenclaturaGenericJn() {
	}

	public AelNomenclaturaGenericJn(Integer seq, String descricao,
			DominioSituacao indSituacao, Date criadoEm, RapServidores servidor) {
		super();
		this.seq = seq;
		this.descricao = descricao;
		this.indSituacao = indSituacao;
		this.criadoEm = criadoEm;
		this.servidor = servidor;
	}


	@Override
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "aelLugJnSeq")
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "SEQ", nullable = false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "DESCRICAO", length = 150)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "CRIADO_EM", length = 29)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable=false),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable=false) })
	public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	public enum Fields {

		SEQ("seq"),
		DESCRICAO("descricao"),
		IND_SITUACAO("indSituacao"),
		CRIADO_EM("criadoEm"),
		SERVIDOR("servidor");

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