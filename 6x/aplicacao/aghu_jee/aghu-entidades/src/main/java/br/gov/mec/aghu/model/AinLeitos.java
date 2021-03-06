package br.gov.mec.aghu.model;

// Generated 15/12/2009 15:33:32 by Hibernate Tools 3.2.5.Beta

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
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
import javax.persistence.PrePersist;
import javax.persistence.PreUpdate;
import javax.persistence.Table;
import javax.persistence.Transient;
import javax.persistence.UniqueConstraint;
import javax.persistence.Version;

import org.hibernate.annotations.Cascade;
import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.core.exception.BaseRuntimeException;
import br.gov.mec.aghu.core.persistence.BaseEntity;
import br.gov.mec.aghu.dominio.DominioSituacao;

/**
 * AinLeitos generated by hbm2java
 */
@Entity
@Table(name = "AIN_LEITOS", schema = "AGH", uniqueConstraints = @UniqueConstraint(columnNames = {
		"QRT_NUMERO", "LEITO" }))

public class AinLeitos implements BaseEntity {

	/**
	 * 
	 */
	private static final long serialVersionUID = -3298641567695201667L;
	/**
	 * 
	 */
	private String leitoID;
	/**
	 * 
	 */
	private AinQuartos quarto;
	/**
	 * 
	 */
	private String leito;
	/**
	 * 
	 */
	private Boolean indConsClinUnidade;
	/**
	 * 
	 */
	private Boolean indBloqLeitoLimpeza;
	/**
	 * 
	 */
	private AinTiposMovimentoLeito tipoMovimentoLeito;
	/**
	 * 
	 */
	private AghUnidadesFuncionais unidadeFuncional;
	/**
	 * 
	 */
	private DominioSituacao indSituacao;
	/**
	 * 
	 */
	private AghEspecialidades especialidade;
	/**
	 * 
	 */
	private AinInternacao internacao;
	/**
	 * 
	 */
	private Boolean indPertenceRefl;
	/**
	 * 
	 */
	private Boolean indConsEsp;

	/**
	 * 
	 */
	private RapServidores servidor;

	/**
	 * 
	 */
	private Boolean indAcompanhamentoCcih;

	/**
	 * 
	 */
	private List<AinCaracteristicaLeito> caracteristicasDoLeito = new ArrayList<AinCaracteristicaLeito>();

	/**
	 * 
	 */
	private Set<AghAtendimentos> atendimentos;
	
	private Integer version;


	/**
	 * 
	 */
	private Collection<AinExtratoLeitos> extratosLeito = new ArrayList<AinExtratoLeitos>();

	public AinLeitos() {
	}
	
	public AinLeitos(String leitoID) {
		super();
		this.leitoID = leitoID;
	}

	public AinLeitos(String ltoId, AinQuartos ainQuarto, String leito,
			Boolean indConsClinUnidade,
			Boolean indBloqLeitoLimpeza,
			AinTiposMovimentoLeito tipoMovimentoLeito, AghUnidadesFuncionais unfSeq,
			DominioSituacao indSituacao, Boolean indPertenceRefl,
			Boolean indConsEsp) {
		this.leitoID = ltoId;
		this.quarto = ainQuarto;
		this.leito = leito;
		this.indConsClinUnidade = indConsClinUnidade;
		this.indBloqLeitoLimpeza = indBloqLeitoLimpeza;
		this.tipoMovimentoLeito = tipoMovimentoLeito;
		this.unidadeFuncional = unfSeq;
		this.indSituacao = indSituacao;
		this.indPertenceRefl = indPertenceRefl;
		this.indConsEsp = indConsEsp;
	}

	public AinLeitos(String ltoId, AinQuartos ainQuarto, String leito,
			Boolean indConsClinUnidade,
			Boolean indBloqLeitoLimpeza,
			AinTiposMovimentoLeito tipoMovimentoLeito, AghUnidadesFuncionais unfSeq,
			DominioSituacao indSituacao, AghEspecialidades espSeq,
			AinInternacao intSeq, Boolean indPertenceRefl,
			Boolean indConsEsp, RapServidores servidor,
			Boolean indAcompanhamentoCcih) {
		this.leitoID = ltoId;
		this.quarto = ainQuarto;
		this.leito = leito;
		this.indConsClinUnidade = indConsClinUnidade;
		this.indBloqLeitoLimpeza = indBloqLeitoLimpeza;
		this.tipoMovimentoLeito = tipoMovimentoLeito;
		this.unidadeFuncional = unfSeq;
		this.indSituacao = indSituacao;
		this.especialidade = espSeq;
		this.internacao = intSeq;
		this.indPertenceRefl = indPertenceRefl;
		this.indConsEsp = indConsEsp;
		this.servidor = servidor;
		this.indAcompanhamentoCcih = indAcompanhamentoCcih;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "QRT_NUMERO", nullable = false)
	public AinQuartos getQuarto() {
		return this.quarto;
	}

	public void setQuarto(AinQuartos ainQuarto) {
		this.quarto = ainQuarto;
	}

	@Column(name = "LEITO", nullable = false, length = 4)
	@Length(max = 4)
	public String getLeito() {
		return this.leito;
	}

	public void setLeito(String leito) {
		this.leito = leito;
	}

	@Column(name = "IND_CONS_CLIN_UNIDADE", nullable = false, length=1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndConsClinUnidade() {
		return this.indConsClinUnidade;
	}

	public void setIndConsClinUnidade(Boolean indConsClinUnidade) {
		this.indConsClinUnidade = indConsClinUnidade;
	}

	/**
	 * Campo sintético criado para mapear diretamente este dominio booleano em
	 * um componente selectOneCheckBox
	 * 
	 * @author jvaranda
	 * @return
	 */
	@Transient
	public boolean isConsClinUnidade() {
		if (getIndConsClinUnidade() != null) {
			return getIndConsClinUnidade() == true;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setConsClinUnidade(boolean valor) {
		setIndConsClinUnidade(valor);
	}

    @Column(name = "IND_BLOQ_LEITO_LIMPEZA", nullable = false)
    @org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndBloqLeitoLimpeza() {
		return this.indBloqLeitoLimpeza;
	}

	public void setIndBloqLeitoLimpeza(Boolean indBloqLeitoLimpeza) {
		this.indBloqLeitoLimpeza = indBloqLeitoLimpeza;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length=1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getIndSituacao() {
		return this.indSituacao;
	}

	public void setIndSituacao(DominioSituacao indSituacao) {
		this.indSituacao = indSituacao;
	}

	/**
	 * Campo sintético criado para mapear diretamente este dominio booleano em
	 * um componente selectOneCheckBox
	 * 
	 * @author jvaranda
	 * @return
	 */
	@Transient
	public boolean isSituacao() {
		if (getIndSituacao() != null) {
			return getIndSituacao() == DominioSituacao.A;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setSituacao(boolean valor) {
		setIndSituacao(DominioSituacao.getInstance(valor));
	}

	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "INT_SEQ")
	public AinInternacao getInternacao() {
		return this.internacao;
	}

	public void setInternacao(AinInternacao intSeq) {
		this.internacao = intSeq;
	}

	@Column(name = "IND_PERTENCE_REFL", nullable = false, length=1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndPertenceRefl() {
		return this.indPertenceRefl;
	}

	public void setIndPertenceRefl(Boolean indPertenceRefl) {
		this.indPertenceRefl = indPertenceRefl;
	}

	/**
	 * Campo sintético criado para mapear diretamente este dominio booleano em
	 * um componente selectOneCheckBox
	 * 
	 * @author jvaranda
	 * @return
	 */
	@Transient
	public boolean isPertenceRefl() {
		if (getIndPertenceRefl() != null) {
			return getIndPertenceRefl() == Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setPertenceRefl(boolean valor) {
		setIndPertenceRefl(valor);
	}

	
	@Column(name = "IND_CONS_ESP", nullable = false, length=1)
	 @org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndConsEsp() {
		return this.indConsEsp;
	}

	public void setIndConsEsp(Boolean indConsEsp) {
		this.indConsEsp = indConsEsp;
	}

	/**
	 * Campo sintético criado para mapear diretamente este dominio booleano em
	 * um componente selectOneCheckBox
	 * 
	 * @author jvaranda
	 * @return
	 */
	@Transient
	public boolean isConsEsp() {
		if (getIndConsEsp() != null) {
			return getIndConsEsp() == Boolean.TRUE;
		} else {
			return Boolean.FALSE;
		}
	}

	public void setConsEsp(boolean valor) {
		setIndConsEsp(valor);
	}

    @Column(name = "IND_ACOMPANHAMENTO_CCIH")
    @org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndAcompanhamentoCcih() {
		return this.indAcompanhamentoCcih;
	}

	public void setIndAcompanhamentoCcih(Boolean indAcompanhamentoCcih) {
		this.indAcompanhamentoCcih = indAcompanhamentoCcih;
	}

	public enum Fields {
		LTO_ID("leitoID"), 
		UNIDADE_FUNCIONAL("unidadeFuncional"), 
		QUARTO("quarto"), 
		QRT_NUMERO("quarto.numero"), 
		TIPO_MOVIMENTO_LEITO("tipoMovimentoLeito"), 
		CARACTERISTICAS("caracteristicasDoLeito"),
		EXTRATOS("extratosLeito"),
		SITUACAO("indSituacao"),
		INTERNACAO("internacao"), 
		INT_SEQ("internacao.seq"),
		IND_PERTENCE_REFL("indPertenceRefl"), 
		UNIDADE_FUNCIONAL_SEQ("unidadeFuncional.seq") ,
		ESPECIALIDADE("especialidade"),
		CLINICA("quarto.clinica"),
		ACOMODACAO("quarto.acomodacao"),
		ALA("quarto.ala"),

		IND_CONS_CLIN_UNIDADE("indConsClinUnidade"),
		IND_CONS_ESP("indConsEsp"),
		IND_BLOQ_LEITO_LIMPEZA("indBloqLeitoLimpeza"),

		LEITO("leito");

		private String fields;

		private Fields(String fields) {
			this.fields = fields;
		}

		@Override
		public String toString() {
			return this.fields;
		}
	}

	/**
	 * @return the leitoID
	 */

	@Id
	@Column(name = "LTO_ID", nullable = false, length = 14)
	@Length(max = 14)
	public String getLeitoID() {
		return this.leitoID;
	}

	/**
	 * @param leitoID
	 *            the leitoID to set
	 */
	public void setLeitoID(String leitoID) {
		this.leitoID = leitoID;
	}

	/**
	 * @return the tipomovimentoLeito
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "TML_CODIGO", nullable = false)
	public AinTiposMovimentoLeito getTipoMovimentoLeito() {
		return this.tipoMovimentoLeito;
	}

	/**
	 * @param tipomovimentoLeito
	 *            the tipomovimentoLeito to set
	 */
	public void setTipoMovimentoLeito(AinTiposMovimentoLeito tipomovimentoLeito) {
		this.tipoMovimentoLeito = tipomovimentoLeito;
	}

	/**
	 * @return the unidadeFuncional
	 */
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "UNF_SEQ", nullable = false)
	@Cascade({
		org.hibernate.annotations.CascadeType.REFRESH
	})
	public AghUnidadesFuncionais getUnidadeFuncional() {
		return this.unidadeFuncional;
	}

	/**
	 * @param unidadeFuncional
	 *            the unidadeFuncional to set
	 */
	public void setUnidadeFuncional(AghUnidadesFuncionais unidadeFuncional) {
		this.unidadeFuncional = unidadeFuncional;
	}

	/**
	 * @return the especialidade
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ESP_SEQ")
	public AghEspecialidades getEspecialidade() {
		return this.especialidade;
	}

	/**
	 * @param especialidade
	 *            the especialidade to set
	 */
	public void setEspecialidade(AghEspecialidades especialidade) {
		this.especialidade = especialidade;
	}

	/**
	 * @return the servidor
	 */
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns( {
			@JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA"),
			@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO") })
	public RapServidores getServidor() {
		return this.servidor;
	}

	/**
	 * @param servidor
	 *            the servidor to set
	 */
	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@PrePersist
	@PreUpdate
	@SuppressWarnings("unused")
	private void validarLeito() {

		if (this.indConsEsp == true && this.especialidade == null) {
			throw new BaseRuntimeException();
		}
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((leitoID == null) ? 0 : leitoID.hashCode());
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
		if (!(obj instanceof AinLeitos)) {
			return false;
		}
		AinLeitos other = (AinLeitos) obj;
		if (leitoID == null) {
			if (other.getLeitoID() != null){
				if(this.leito == null) {
					if (other.getLeito() != null){
						return false;
					}				
				} else if (!this.leito.equals(other.getLeito())) {
					return false;
				}
			}
			else if(this.leito == null) {
				if (other.getLeito() != null){
					return false;
				}				
			} else if (!this.leito.equals(other.getLeito())) {
				return false;
			}
		} else if (!leitoID.equals(other.getLeitoID())) {
			return false;
		}
		return true;
	}	
	/**
	 * @return the caracteristicasDoLeito
	 */
	@OneToMany(mappedBy = "leito", fetch = FetchType.LAZY, orphanRemoval=true)
	@Cascade( 	{	org.hibernate.annotations.CascadeType.ALL })
	public List<AinCaracteristicaLeito> getCaracteristicasDoLeito() {
		return this.caracteristicasDoLeito;
	}

	/**
	 * @param caracteristicasDoLeito
	 *            the caracteristicasDoLeito to set
	 */
	public void setCaracteristicasDoLeito(
			List<AinCaracteristicaLeito> caracteristicasDoLeito) {
		this.caracteristicasDoLeito = caracteristicasDoLeito;
	}

	/**
	 * @return the extratosLeito
	 */
	@OneToMany(mappedBy = "leito", fetch = FetchType.LAZY)
	public Collection<AinExtratoLeitos> getExtratosLeito() {
		return this.extratosLeito;
	}

	/**
	 * @param extratosLeito
	 *            the extratosLeito to set
	 */
	public void setExtratosLeito(Collection<AinExtratoLeitos> extratosLeito) {
		this.extratosLeito = extratosLeito;
	}
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "leito")
	public Set<AghAtendimentos> getAtendimentos() {
		return this.atendimentos;
	}

	public void setAtendimentos(Set<AghAtendimentos> atendimentos) {
		this.atendimentos = atendimentos;
	}
	
	@Version
	@Column(name = "VERSION", nullable = false)
	public Integer getVersion() {
		return this.version;
	}
	
	public void setVersion(Integer version) {
		this.version = version;
	}

}
