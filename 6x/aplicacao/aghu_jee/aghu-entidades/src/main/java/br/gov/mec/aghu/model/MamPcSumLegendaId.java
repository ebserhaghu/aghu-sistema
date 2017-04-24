package br.gov.mec.aghu.model;

// Generated 09/04/2012 16:32:53 by Hibernate Tools 3.4.0.CR1

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;


import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.hibernate.annotations.Type;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSumarioExame;
import br.gov.mec.aghu.core.persistence.EntityCompositeId;

/**
 * MamPcSumLegendaId generated by hbm2java
 */
@Embeddable
public class MamPcSumLegendaId implements EntityCompositeId {

	/**
	 * 
	 */
	private static final long serialVersionUID = -4420310979307638646L;
	private Integer prontuario;
	private Boolean recemNascido;
	private DominioSumarioExame pertenceSumario;
	private Date dthrEvento;
	private Integer numeroLegenda;
	private String descricao;
	private Integer grupoLegenda;
	private Integer pacCodigo;
	private Short serVinCodigoConsultado;
	private Integer serMatriculaConsultado;
	private String ltoLtoId;
	private Date dthrFim;
	private Integer ppePleSeq;
	private Integer ppeSeqp;
	private Date pirDthrCriacao;
	private Integer pirAtdSeq;
	private Integer version;

	public MamPcSumLegendaId() {
	}

	public MamPcSumLegendaId(DominioSumarioExame pertenceSumario, Date dthrEvento, Integer numeroLegenda, String descricao, Integer grupoLegenda,
			Integer pacCodigo, Integer version) {
		this.pertenceSumario = pertenceSumario;
		this.dthrEvento = dthrEvento;
		this.numeroLegenda = numeroLegenda;
		this.descricao = descricao;
		this.grupoLegenda = grupoLegenda;
		this.pacCodigo = pacCodigo;
		this.version = version;
	}

	public MamPcSumLegendaId(Integer prontuario, Boolean recemNascido, DominioSumarioExame pertenceSumario, Date dthrEvento, Integer numeroLegenda,
			String descricao, Integer grupoLegenda, Integer pacCodigo, Short serVinCodigoConsultado, Integer serMatriculaConsultado,
			String ltoLtoId, Date dthrFim, Integer ppePleSeq, Integer ppeSeqp, Date pirDthrCriacao, Integer pirAtdSeq, Integer version) {
		this.prontuario = prontuario;
		this.recemNascido = recemNascido;
		this.pertenceSumario = pertenceSumario;
		this.dthrEvento = dthrEvento;
		this.numeroLegenda = numeroLegenda;
		this.descricao = descricao;
		this.grupoLegenda = grupoLegenda;
		this.pacCodigo = pacCodigo;
		this.serVinCodigoConsultado = serVinCodigoConsultado;
		this.serMatriculaConsultado = serMatriculaConsultado;
		this.ltoLtoId = ltoLtoId;
		this.dthrFim = dthrFim;
		this.ppePleSeq = ppePleSeq;
		this.ppeSeqp = ppeSeqp;
		this.pirDthrCriacao = pirDthrCriacao;
		this.pirAtdSeq = pirAtdSeq;
		this.version = version;
	}

	@Column(name = "PRONTUARIO")
	public Integer getProntuario() {
		return this.prontuario;
	}

	public void setProntuario(Integer prontuario) {
		this.prontuario = prontuario;
	}

	@Column(name = "RECEM_NASCIDO", nullable = false, length = 1)
	@Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getRecemNascido() {
		return this.recemNascido;
	}

	public void setRecemNascido(Boolean recemNascido) {
		this.recemNascido = recemNascido;
	}

	@Column(name = "PERTENCE_SUMARIO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSumarioExame getPertenceSumario() {
		return this.pertenceSumario;
	}

	public void setPertenceSumario(DominioSumarioExame pertenceSumario) {
		this.pertenceSumario = pertenceSumario;
	}

	@Column(name = "DTHR_EVENTO", nullable = false, length = 29)
	public Date getDthrEvento() {
		return this.dthrEvento;
	}

	public void setDthrEvento(Date dthrEvento) {
		this.dthrEvento = dthrEvento;
	}

	@Column(name = "NUMERO_LEGENDA", nullable = false)
	public Integer getNumeroLegenda() {
		return this.numeroLegenda;
	}

	public void setNumeroLegenda(Integer numeroLegenda) {
		this.numeroLegenda = numeroLegenda;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 120)
	@Length(max = 120)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "GRUPO_LEGENDA", nullable = false)
	public Integer getGrupoLegenda() {
		return this.grupoLegenda;
	}

	public void setGrupoLegenda(Integer grupoLegenda) {
		this.grupoLegenda = grupoLegenda;
	}

	@Column(name = "PAC_CODIGO", nullable = false)
	public Integer getPacCodigo() {
		return this.pacCodigo;
	}

	public void setPacCodigo(Integer pacCodigo) {
		this.pacCodigo = pacCodigo;
	}

	@Column(name = "SER_VIN_CODIGO_CONSULTADO")
	public Short getSerVinCodigoConsultado() {
		return this.serVinCodigoConsultado;
	}

	public void setSerVinCodigoConsultado(Short serVinCodigoConsultado) {
		this.serVinCodigoConsultado = serVinCodigoConsultado;
	}

	@Column(name = "SER_MATRICULA_CONSULTADO")
	public Integer getSerMatriculaConsultado() {
		return this.serMatriculaConsultado;
	}

	public void setSerMatriculaConsultado(Integer serMatriculaConsultado) {
		this.serMatriculaConsultado = serMatriculaConsultado;
	}

	@Column(name = "LTO_LTO_ID", length = 5)
	@Length(max = 5)
	public String getLtoLtoId() {
		return this.ltoLtoId;
	}

	public void setLtoLtoId(String ltoLtoId) {
		this.ltoLtoId = ltoLtoId;
	}

	@Column(name = "DTHR_FIM", length = 29)
	public Date getDthrFim() {
		return this.dthrFim;
	}

	public void setDthrFim(Date dthrFim) {
		this.dthrFim = dthrFim;
	}

	@Column(name = "PPE_PLE_SEQ")
	public Integer getPpePleSeq() {
		return this.ppePleSeq;
	}

	public void setPpePleSeq(Integer ppePleSeq) {
		this.ppePleSeq = ppePleSeq;
	}

	@Column(name = "PPE_SEQP")
	public Integer getPpeSeqp() {
		return this.ppeSeqp;
	}

	public void setPpeSeqp(Integer ppeSeqp) {
		this.ppeSeqp = ppeSeqp;
	}

	@Column(name = "PIR_DTHR_CRIACAO", length = 29)
	public Date getPirDthrCriacao() {
		return this.pirDthrCriacao;
	}

	public void setPirDthrCriacao(Date pirDthrCriacao) {
		this.pirDthrCriacao = pirDthrCriacao;
	}

	@Column(name = "PIR_ATD_SEQ")
	public Integer getPirAtdSeq() {
		return this.pirAtdSeq;
	}

	public void setPirAtdSeq(Integer pirAtdSeq) {
		this.pirAtdSeq = pirAtdSeq;
	}

	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}


	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		HashCodeBuilder umHashCodeBuilder = new HashCodeBuilder();
		umHashCodeBuilder.append(this.getProntuario());
		umHashCodeBuilder.append(this.getVersion());
		umHashCodeBuilder.append(this.getPacCodigo());
		umHashCodeBuilder.append(this.getDescricao());
		umHashCodeBuilder.append(this.getDthrFim());
		umHashCodeBuilder.append(this.getRecemNascido());
		umHashCodeBuilder.append(this.getPertenceSumario());
		umHashCodeBuilder.append(this.getDthrEvento());
		umHashCodeBuilder.append(this.getSerVinCodigoConsultado());
		umHashCodeBuilder.append(this.getSerMatriculaConsultado());
		umHashCodeBuilder.append(this.getLtoLtoId());
		umHashCodeBuilder.append(this.getPpePleSeq());
		umHashCodeBuilder.append(this.getPpeSeqp());
		umHashCodeBuilder.append(this.getPirDthrCriacao());
		umHashCodeBuilder.append(this.getPirAtdSeq());
		umHashCodeBuilder.append(this.getNumeroLegenda());
		umHashCodeBuilder.append(this.getGrupoLegenda());
		return umHashCodeBuilder.toHashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (!(obj instanceof MamPcSumLegendaId)) {
			return false;
		}
		MamPcSumLegendaId other = (MamPcSumLegendaId) obj;
		EqualsBuilder umEqualsBuilder = new EqualsBuilder();
		umEqualsBuilder.append(this.getProntuario(), other.getProntuario());
		umEqualsBuilder.append(this.getVersion(), other.getVersion());
		umEqualsBuilder.append(this.getPacCodigo(), other.getPacCodigo());
		umEqualsBuilder.append(this.getDescricao(), other.getDescricao());
		umEqualsBuilder.append(this.getDthrFim(), other.getDthrFim());
		umEqualsBuilder.append(this.getRecemNascido(), other.getRecemNascido());
		umEqualsBuilder.append(this.getPertenceSumario(), other.getPertenceSumario());
		umEqualsBuilder.append(this.getDthrEvento(), other.getDthrEvento());
		umEqualsBuilder.append(this.getSerVinCodigoConsultado(), other.getSerVinCodigoConsultado());
		umEqualsBuilder.append(this.getSerMatriculaConsultado(), other.getSerMatriculaConsultado());
		umEqualsBuilder.append(this.getLtoLtoId(), other.getLtoLtoId());
		umEqualsBuilder.append(this.getPpePleSeq(), other.getPpePleSeq());
		umEqualsBuilder.append(this.getPpeSeqp(), other.getPpeSeqp());
		umEqualsBuilder.append(this.getPirDthrCriacao(), other.getPirDthrCriacao());
		umEqualsBuilder.append(this.getPirAtdSeq(), other.getPirAtdSeq());
		umEqualsBuilder.append(this.getNumeroLegenda(), other.getNumeroLegenda());
		umEqualsBuilder.append(this.getGrupoLegenda(), other.getGrupoLegenda());
		return umEqualsBuilder.isEquals();
	}
	// ##### GeradorEqualsHashCodeMain #####
	
}