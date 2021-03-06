package br.gov.mec.aghu.model;

// Generated 17/10/2011 14:21:24 by Hibernate Tools 3.4.0.CR1

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.persistence.Version;


import org.hibernate.validator.constraints.Length;

import br.gov.mec.aghu.dominio.DominioSituacao;
import br.gov.mec.aghu.core.persistence.BaseEntityCodigo;

/**
 * EpeCaractDefinidoras generated by hbm2java
 */
@Entity
@SequenceGenerator(name="epeCdeSq1", sequenceName="AGH.EPE_CDE_SQ1", allocationSize = 1)
@Table(name = "EPE_CARACT_DEFINIDORAS", schema = "AGH")
public class EpeCaractDefinidora extends BaseEntityCodigo<Integer> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -8639107252020908925L;
	private Integer codigo;
	private Integer version;
	private String descricao;
	private DominioSituacao situacao;
	private Set<EpeSinCaractDefinidora> sinCaractDefinidorasForCdeCodigo = new HashSet<EpeSinCaractDefinidora>(
			0);
	private Set<EpeSinCaractDefinidora> sinCaractDefinidorasForCdeCodigoPossui = new HashSet<EpeSinCaractDefinidora>(
			0);
	private Set<EpeCaractDefDiagnostico> caractDefDiagnosticos = new HashSet<EpeCaractDefDiagnostico>(
			0);

	public EpeCaractDefinidora() {
	}

	public EpeCaractDefinidora(Integer codigo, String descricao, DominioSituacao situacao) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.situacao = situacao;
	}

	public EpeCaractDefinidora(
			Integer codigo,
			String descricao,
			DominioSituacao situacao,
			Set<EpeSinCaractDefinidora> sinCaractDefinidorasForCdeCodigo,
			Set<EpeSinCaractDefinidora> sinCaractDefinidorasForCdeCodigoPossui,
			Set<EpeCaractDefDiagnostico> caractDefDiagnosticos) {
		this.codigo = codigo;
		this.descricao = descricao;
		this.situacao = situacao;
		this.sinCaractDefinidorasForCdeCodigo = sinCaractDefinidorasForCdeCodigo;
		this.sinCaractDefinidorasForCdeCodigoPossui = sinCaractDefinidorasForCdeCodigoPossui;
		this.caractDefDiagnosticos = caractDefDiagnosticos;
	}

	@Id
	@Column(name = "CODIGO", unique = true, nullable = false, precision = 6, scale = 0)
	@GeneratedValue(strategy = GenerationType.AUTO, generator = "epeCdeSq1")
	public Integer getCodigo() {
		return this.codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	@Version
	@Column(name = "VERSION", nullable = false, precision = 9, scale = 0)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Column(name = "DESCRICAO", nullable = false, length = 200)
	@Length(max = 200)
	public String getDescricao() {
		return this.descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	@Column(name = "IND_SITUACAO", nullable = false, length = 1)
	@Enumerated(EnumType.STRING)
	public DominioSituacao getSituacao() {
		return this.situacao;
	}

	public void setSituacao(DominioSituacao situacao) {
		this.situacao = situacao;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caractDefinidoraByCdeCodigo")
	public Set<EpeSinCaractDefinidora> getSinCaractDefinidorasForCdeCodigo() {
		return this.sinCaractDefinidorasForCdeCodigo;
	}

	public void setSinCaractDefinidorasForCdeCodigo(
			Set<EpeSinCaractDefinidora> sinCaractDefinidorasForCdeCodigo) {
		this.sinCaractDefinidorasForCdeCodigo = sinCaractDefinidorasForCdeCodigo;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caractDefinidoraByCdeCodigoPossui")
	public Set<EpeSinCaractDefinidora> getSinCaractDefinidorasForCdeCodigoPossui() {
		return this.sinCaractDefinidorasForCdeCodigoPossui;
	}

	public void setSinCaractDefinidorasForCdeCodigoPossui(
			Set<EpeSinCaractDefinidora> sinCaractDefinidorasForCdeCodigoPossui) {
		this.sinCaractDefinidorasForCdeCodigoPossui = sinCaractDefinidorasForCdeCodigoPossui;
	}

	@OneToMany(fetch = FetchType.LAZY, mappedBy = "caractDefinidora")
	public Set<EpeCaractDefDiagnostico> getCaractDefDiagnosticos() {
		return this.caractDefDiagnosticos;
	}

	public void setCaractDefDiagnosticos(
			Set<EpeCaractDefDiagnostico> caractDefDiagnosticos) {
		this.caractDefDiagnosticos = caractDefDiagnosticos;
	}
	
	public enum Fields {
		CODIGO("codigo"), DESCRICAO("descricao"), SITUACAO("situacao");

		private String field;

		private Fields(String field) {
			this.field = field;
		}

		@Override
		public String toString() {
			return this.field;
		}
	}



	// ##### GeradorEqualsHashCodeMain #####
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((getCodigo() == null) ? 0 : getCodigo().hashCode());
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
		if (!(obj instanceof EpeCaractDefinidora)) {
			return false;
		}
		EpeCaractDefinidora other = (EpeCaractDefinidora) obj;
		if (getCodigo() == null) {
			if (other.getCodigo() != null) {
				return false;
			}
		} else if (!getCodigo().equals(other.getCodigo())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}
