package br.gov.mec.aghu.view;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Immutable;

import br.gov.mec.aghu.core.persistence.BaseEntity;
import br.gov.mec.aghu.model.RapServidores;

/**
 * VListaCirurgias generated by hbm2java
 */
@Entity
@Table(name = "V_MPM_LISTA_PAC_INTERNADOS", schema = "AGH")
@Immutable
public class VMpmListaPacInternados implements BaseEntity {

    private static final long serialVersionUID = -652711289609470162L;
    private Integer atdSeq;
    private String local;
    private String nome;
    private String nomeSocial;
    private Integer pacCodigo;
    private String prontuario;
    private Date dataNascimento;
    private String nomeResponsavel;
    private Date dataInicioAtendimento;
    private Date dataFimAtendimento;

    private String statusPrescricao;
    private String statusSumarioAlta;
    private String statusPendenciaDocumento;
    private String statusCertificacaoDigital;
    private String statusExamesNaoVistos;
    private String statusPacientePesquisa;
    private String statusEvolucao;

    private String labelAlta;
    private String labelObito;
    private String disableButtonAltaObito;
    private String disableButtonPrescrever;
    private String possuiPlanoAltas;
    private String indGmr;

    private RapServidores servidor;

    @Id
    @Column(name = "ATD_SEQ", precision = 8, scale = 0)
    public Integer getAtdSeq() {
	return atdSeq;
    }

    public void setAtdSeq(Integer atdSeq) {
	this.atdSeq = atdSeq;
    }

    @Column(name = "LOCAL")
    public String getLocal() {
	return local;
    }

    public void setLocal(String local) {
	this.local = local;
    }

    @Column(name = "NOME")
    public String getNome() {
	return nome;
    }

    public void setNome(String nome) {
	this.nome = nome;
    }

    @Column(name = "PAC_CODIGO")
    public Integer getPacCodigo() {
	return pacCodigo;
    }

    public void setPacCodigo(Integer pacCodigo) {
	this.pacCodigo = pacCodigo;
    }

    @Column(name = "PRONTUARIO")
    public String getProntuario() {
	return prontuario;
    }

    public void setProntuario(String prontuario) {
	this.prontuario = prontuario;
    }

    @Column(name = "DATA_NASCIMENTO")
    public Date getDataNascimento() {
	return dataNascimento;
    }

    public void setDataNascimento(Date dataNascimento) {
	this.dataNascimento = dataNascimento;
    }

    @Column(name = "NOME_RESPONSAVEL")
    public String getNomeResponsavel() {
	return nomeResponsavel;
    }

    public void setNomeResponsavel(String nomeResponsavel) {
	this.nomeResponsavel = nomeResponsavel;
    }

    @Column(name = "DATA_INICIO_ATENDIMENTO")
    public Date getDataInicioAtendimento() {
	return dataInicioAtendimento;
    }

    public void setDataInicioAtendimento(Date dataInicioAtendimento) {
	this.dataInicioAtendimento = dataInicioAtendimento;
    }

    @Column(name = "DATA_FIM_ATENDIMENTO")
    public Date getDataFimAtendimento() {
	return dataFimAtendimento;
    }

    public void setDataFimAtendimento(Date dataFimAtendimento) {
	this.dataFimAtendimento = dataFimAtendimento;
    }

    @Column(name = "STATUS_PRESCRICAO")
    public String getStatusPrescricao() {
	return statusPrescricao;
    }

    public void setStatusPrescricao(String statusPrescricao) {
	this.statusPrescricao = statusPrescricao;
    }

    @Column(name = "STATUS_SUMARIO_ALTA")
    public String getStatusSumarioAlta() {
	return statusSumarioAlta;
    }

    public void setStatusSumarioAlta(String statusSumarioAlta) {
	this.statusSumarioAlta = statusSumarioAlta;
    }

    @Column(name = "STATUS_PENDENCIA_DOCUMENTO")
    public String getStatusPendenciaDocumento() {
	return statusPendenciaDocumento;
    }

    public void setStatusPendenciaDocumento(String statusPendenciaDocumento) {
	this.statusPendenciaDocumento = statusPendenciaDocumento;
    }

    @Column(name = "STATUS_CERTIFICACAO_DIGITAL")
    public String getStatusCertificacaoDigital() {
	return statusCertificacaoDigital;
    }

    public void setStatusCertificacaoDigital(String statusCertificacaoDigital) {
	this.statusCertificacaoDigital = statusCertificacaoDigital;
    }

    @Column(name = "STATUS_EXAMES_NAO_VISTOS")
    public String getStatusExamesNaoVistos() {
	return statusExamesNaoVistos;
    }

    public void setStatusExamesNaoVistos(String statusExamesNaoVistos) {
	this.statusExamesNaoVistos = statusExamesNaoVistos;
    }

    @Column(name = "STATUS_PACIENTE_PESQUISA")
    public String getStatusPacientePesquisa() {
	return statusPacientePesquisa;
    }

    public void setStatusPacientePesquisa(String statusPacientePesquisa) {
	this.statusPacientePesquisa = statusPacientePesquisa;
    }

    @Column(name = "STATUS_EVOLUCAO")
    public String getStatusEvolucao() {
	return statusEvolucao;
    }

    public void setStatusEvolucao(String statusEvolucao) {
	this.statusEvolucao = statusEvolucao;
    }

    @Column(name = "LABEL_ALTA")
    public String getLabelAlta() {
	return labelAlta;
    }

    public void setLabelAlta(String labelAlta) {
	this.labelAlta = labelAlta;
    }

    @Column(name = "LABEL_OBITO")
    public String getLabelObito() {
	return labelObito;
    }

    public void setLabelObito(String labelObito) {
	this.labelObito = labelObito;
    }

    @Column(name = "DISABLE_BUTTON_ALTA_OBITO")
    public String getDisableButtonAltaObito() {
	return disableButtonAltaObito;
    }

    public void setDisableButtonAltaObito(String disableButtonAltaObito) {
	this.disableButtonAltaObito = disableButtonAltaObito;
    }

    @Column(name = "DISABLE_BUTTON_PRESCREVER")
    public String getDisableButtonPrescrever() {
	return disableButtonPrescrever;
    }

    public void setDisableButtonPrescrever(String disableButtonPrescrever) {
	this.disableButtonPrescrever = disableButtonPrescrever;
    }

    @Column(name = "POSSUI_PLANO_ALTAS")
    public String getPossuiPlanoAltas() {
	return possuiPlanoAltas;
    }

    public void setPossuiPlanoAltas(String possuiPlanoAltas) {
	this.possuiPlanoAltas = possuiPlanoAltas;
    }

    @Column(name = "IND_GMR")
    public String getIndGmr() {
	return indGmr;
    }

    public void setIndGmr(String indGmr) {
	this.indGmr = indGmr;
    }

    @JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
	    @JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    public RapServidores getServidor() {
    	return servidor;
    }
    
    @Column(name = "NOME_SOCIAL")
	public String getNomeSocial() {
		return nomeSocial;
	}

	public void setNomeSocial(String nomeSocial) {
		this.nomeSocial = nomeSocial;
	}

    
    public void setServidor(RapServidores servidor) {
        this.servidor = servidor;
    }

    public enum Fields {
		SEQ("atdSeq"),
	
		PRONTUARIO("prontuario"),
	
		SERVIDOR("servidor"), SERVIDOR_MATRICULA("servidor.id.matricula"), SERVIDOR_VIN_CODIGO("servidor.id.vinCodigo");
	
		private String fields;
	
		private Fields(String fields) {
		    this.fields = fields;
		}
	
		@Override
		public String toString() {
		    return fields;
		}
    }

    @Override
    public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((atdSeq == null) ? 0 : atdSeq.hashCode());
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
		VMpmListaPacInternados other = (VMpmListaPacInternados) obj;
		if (atdSeq == null) {
		    if (other.atdSeq != null) {
			return false;
		    }
		} else if (!atdSeq.equals(other.atdSeq)) {
		    return false;
		}
		return true;
    }


}