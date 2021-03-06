package br.gov.mec.aghu.model;

// Generated 06/01/2011 16:03:45 by Hibernate Tools 3.4.0.Beta1

import java.math.BigDecimal;
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
import javax.persistence.Transient;


import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.model.BaseJournal;

/**
 * AfaFormaDosagemJn generated by hbm2java
 * 
 * @author Gustavo
 */
@Entity
@Table(name = "AFA_FORMA_DOSAGENS_JN", schema = "AGH")
@SequenceGenerator(name = "afaFdsJnSeq", sequenceName = "AGH.AFA_FDS_JN_SEQ", allocationSize = 1)

@Immutable
public class AfaFormaDosagemJn extends BaseJournal implements
		java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 853817330308878006L;
	private Integer seq;
	private Integer medMatCodigo;
	private Integer ummSeq;
	private Integer serMatricula;
	private Short serVinCodigo;
	private BigDecimal fatorConversaoUp;
	private Boolean indUsualPrescricao;
	private Boolean indUsualNpt;
	private Date criadoEm;
	private DominioSituacao indSituacao;
	
	//Transient
	private String nomeResponsavel;
	private String unidadeMedidaMedicasDescricao;

	
	@Id
	@Column(name = "SEQ_JN", unique = true, nullable = false)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "afaFdsJnSeq")
	@Override
	public Integer getSeqJn() {
		return super.getSeqJn();
	}

	@Column(name = "SEQ", nullable = false, precision = 6, scale = 0)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = Integer.valueOf(seq);
	}

	@Column(name = "MED_MAT_CODIGO", precision = 6, scale = 0)
	public Integer getMedMatCodigo() {
		return this.medMatCodigo;
	}

	public void setMedMatCodigo(Integer medMatCodigo) {
		this.medMatCodigo = medMatCodigo;
	}

	@Column(name = "UMM_SEQ", precision = 5, scale = 0)
	public Integer getUmmSeq() {
		return this.ummSeq;
	}

	public void setUmmSeq(Integer ummSeq) {
		this.ummSeq = ummSeq;
	}

	@Column(name = "SER_MATRICULA", precision = 7, scale = 0)
	public Integer getSerMatricula() {
		return this.serMatricula;
	}

	public void setSerMatricula(Integer serMatricula) {
		this.serMatricula = serMatricula;
	}

	@Column(name = "SER_VIN_CODIGO", precision = 3, scale = 0)
	public Short getSerVinCodigo() {
		return this.serVinCodigo;
	}

	public void setSerVinCodigo(Short serVinCodigo) {
		this.serVinCodigo = serVinCodigo;
	}

	@Column(name = "FATOR_CONVERSAO_UP", precision = 14, scale = 4)
	public BigDecimal getFatorConversaoUp() {
		return this.fatorConversaoUp;
	}

	public void setFatorConversaoUp(BigDecimal fatorConversaoUp) {
		this.fatorConversaoUp = fatorConversaoUp;
	}

	@Column(name = "IND_USUAL_PRESCRICAO", nullable = false)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndUsualPrescricao() {
		return this.indUsualPrescricao;
	}

	public void setIndUsualPrescricao(Boolean indUsualPrescricao) {
		this.indUsualPrescricao = indUsualPrescricao;
	}

	@Column(name = "IND_USUAL_NPT", nullable = false)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndUsualNpt() {
		return this.indUsualNpt;
	}

	public void setIndUsualNpt(Boolean indUsualNpt) {
		this.indUsualNpt = indUsualNpt;
	}

	@Column(name = "CRIADO_EM", length = 7)
	public Date getCriadoEm() {
		return this.criadoEm;
	}

	public void setCriadoEm(Date criadoEm) {
		this.criadoEm = criadoEm;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}
	
	public enum Fields {

		MED_MAT_CODIGO("medMatCodigo");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}
	
	@Override
	public boolean equals(Object other) {

		boolean result = (other != null)
				&& (other instanceof AfaFormaDosagemJn)
				&& (this.hashCode() == other.hashCode());
		AfaFormaDosagemJn castOther = null;

		if (result) {
			if (this != other) {
				castOther = (AfaFormaDosagemJn) other;
				result = ((this.getNomeUsuario() == castOther.getNomeUsuario()) || (this
						.getNomeUsuario() != null
						&& castOther.getNomeUsuario() != null && this
						.getNomeUsuario().equals(castOther.getNomeUsuario())))
						&& ((this.getDataAlteracao() == castOther
								.getDataAlteracao()) || (this
								.getDataAlteracao() != null
								&& castOther.getDataAlteracao() != null && this
								.getDataAlteracao().equals(
										castOther.getDataAlteracao())))
						&& ((this.getOperacao() == castOther.getOperacao()) || (this
								.getOperacao() != null
								&& castOther.getOperacao() != null && this
								.getOperacao().equals(castOther.getOperacao())))
						&& (this.getSeq() == castOther.getSeq())
						&& ((this.getMedMatCodigo() == castOther
								.getMedMatCodigo()) || (this.getMedMatCodigo() != null
								&& castOther.getMedMatCodigo() != null && this
								.getMedMatCodigo().equals(
										castOther.getMedMatCodigo())))
						&& ((this.getUmmSeq() == castOther.getUmmSeq()) || (this
								.getUmmSeq() != null
								&& castOther.getUmmSeq() != null && this
								.getUmmSeq().equals(castOther.getUmmSeq())))
						&& ((this.getSerMatricula() == castOther
								.getSerMatricula()) || (this.getSerMatricula() != null
								&& castOther.getSerMatricula() != null && this
								.getSerMatricula().equals(
										castOther.getSerMatricula())))
						&& ((this.getSerVinCodigo() == castOther
								.getSerVinCodigo()) || (this.getSerVinCodigo() != null
								&& castOther.getSerVinCodigo() != null && this
								.getSerVinCodigo().equals(
										castOther.getSerVinCodigo())))
						&& ((this.getFatorConversaoUp() == castOther
								.getFatorConversaoUp()) || (this
								.getFatorConversaoUp() != null
								&& castOther.getFatorConversaoUp() != null && this
								.getFatorConversaoUp().equals(
										castOther.getFatorConversaoUp())))
						&& ((this.getIndUsualPrescricao() == castOther
								.getIndUsualPrescricao()) || (this
								.getIndUsualPrescricao() != null
								&& castOther.getIndUsualPrescricao() != null && this
								.getIndUsualPrescricao().equals(
										castOther.getIndUsualPrescricao())))
						&& ((this.getIndUsualNpt() == castOther
								.getIndUsualNpt()) || (this.getIndUsualNpt() != null
								&& castOther.getIndUsualNpt() != null && this
								.getIndUsualNpt().equals(
										castOther.getIndUsualNpt())))
						&& ((this.getCriadoEm() == castOther.getCriadoEm()) || (this
								.getCriadoEm() != null
								&& castOther.getCriadoEm() != null && this
								.getCriadoEm().equals(castOther.getCriadoEm())))
						&& ((this.getIndSituacao() == castOther
								.getIndSituacao()) || (this.getIndSituacao() != null
								&& castOther.getIndSituacao() != null && this
								.getIndSituacao().equals(
										castOther.getIndSituacao())));
			} else {
				result = true;
			}
		}

		return result;
	}

	@Override
	public int hashCode() {

		return (this.getSeqJn() != null ? this.getSeqJn().hashCode() : super
				.hashCode());
	}

	@Transient
	public String getNomeResponsavel() {
		return nomeResponsavel;
	}

	public void setNomeResponsavel(String nomeResponsavel) {
		this.nomeResponsavel = nomeResponsavel;
	}
	
	@Transient
	public String getUnidadeMedidaMedicasDescricao() {
		return unidadeMedidaMedicasDescricao;
	}

	public void setUnidadeMedidaMedicasDescricao(String unidadeMedidaMedicasDescricao) {
		this.unidadeMedidaMedicasDescricao = unidadeMedidaMedicasDescricao;
	}
}