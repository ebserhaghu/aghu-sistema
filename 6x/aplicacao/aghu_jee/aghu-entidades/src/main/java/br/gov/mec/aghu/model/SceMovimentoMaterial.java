package br.gov.mec.aghu.model;

// Generated 23/09/2011 13:49:10 by Hibernate Tools 3.4.0.CR1

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Calendar;
import java.util.Date;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinColumns;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;
import javax.persistence.Version;

import br.gov.mec.aghu.core.persistence.BaseEntityId;

/**
 * SceMovimentoMateriais generated by hbm2java
 */
@Entity
@Table(name = "SCE_MOVIMENTO_MATERIAIS", schema = "AGH")
public class SceMovimentoMaterial extends BaseEntityId<SceMovimentoMaterialId> implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2425867524365819719L;
	private SceMovimentoMaterialId id;
	private Integer version;
	private Date dtGeracao;
	private RapServidores servidor;
	private SceAlmoxarifado almoxarifado;
	private SceAlmoxarifado almoxarifadoComplemento;
	private FccCentroCustos centroCustoRequisita;
	private FccCentroCustos centroCusto;
	private ScoFornecedor fornecedor;
	private ScoMaterial material;
	private SceMotivoMovimento motivoMovimento; 
	private SceTipoMovimento tipoMovimentoDocumento;
	private SceTipoMovimento tipoMovimento;
	private ScoUnidadeMedida unidadeMedida;
	private Integer quantidade;
	private Boolean indEstorno;
	private Integer nroDocGeracao;
	private SceNotaRecebimento notaRecebimento;
	private Short itemDocGeracao;
	private Integer qtdeRequisitada;
	private Integer seq;
	private String historico;
	private Long qtdePosMovimento;
	private BigDecimal custoMedioPonderadoGer;
	private BigDecimal valor;
	private BigDecimal residuo;
	private Integer nroDocRefere;
	private Integer frnNumeroRefereDoc;

	private Date dtCompetencia;
	private Integer mesCompetencia;
	private Integer anoCompetencia;
	private String mesAno;
	private SceEntrSaidSemLicitacao sceEntrSaidSemLicitacao;
 
	@EmbeddedId
	@AttributeOverrides({
		@AttributeOverride(name = "seq", column = @Column(name = "SEQ", nullable = false, precision = 10, scale = 0)),
		@AttributeOverride(name = "dtCompetencia", column = @Column(name = "DT_COMPETENCIA", nullable = false, length = 7)) })
		public SceMovimentoMaterialId getId() {
		return this.id;
	}

	public void setId(SceMovimentoMaterialId id) {
		this.id = id;
	}

	@Version
	@Column(name = "VERSION", nullable = false, precision = 9, scale = 0)
	public Integer getVersion() {
		return this.version;
	}

	public void setVersion(Integer version) {
		this.version = version;
	}

	@Temporal(TemporalType.TIMESTAMP)
	@Column(name = "DT_GERACAO", nullable = false, length = 7)
	public Date getDtGeracao() {
		return this.dtGeracao;
	}

	public void setDtGeracao(Date dtGeracao) {
		this.dtGeracao = dtGeracao;
	}

	@Column(name = "QUANTIDADE", nullable = false, precision = 10, scale = 0)
	public Integer getQuantidade() {
		return this.quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	@Column(name = "IND_ESTORNO", length = 1)
	@org.hibernate.annotations.Type(type = "br.gov.mec.aghu.core.persistence.type.BooleanUserType")
	public Boolean getIndEstorno() {
		return this.indEstorno;
	}

	public void setIndEstorno(Boolean indEstorno) {
		this.indEstorno = indEstorno;
	}

	@Column(name = "NRO_DOC_GERACAO", precision = 7, scale = 0)
	public Integer getNroDocGeracao() {
		return this.nroDocGeracao;
	}

	public void setNroDocGeracao(Integer nroDocGeracao) {
		this.nroDocGeracao = nroDocGeracao;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "NRO_DOC_GERACAO", referencedColumnName = "SEQ", nullable = true, insertable=false, updatable=false)
	public SceNotaRecebimento getNotaRecebimento() {
		return notaRecebimento;
	}

	public void setNotaRecebimento(SceNotaRecebimento notaRecebimento) {
		this.notaRecebimento = notaRecebimento;
	}

	@Column(name = "ITEM_DOC_GERACAO", precision = 3, scale = 0)
	public Short getItemDocGeracao() {
		return this.itemDocGeracao;
	}

	public void setItemDocGeracao(Short itemDocGeracao) {
		this.itemDocGeracao = itemDocGeracao;
	}

	@Column(name = "QTDE_REQUISITADA", precision = 7, scale = 0)
	public Integer getQtdeRequisitada() {
		return this.qtdeRequisitada;
	}

	public void setQtdeRequisitada(Integer qtdeRequisitada) {
		this.qtdeRequisitada = qtdeRequisitada;
	}

	@Column(name = "HISTORICO", length = 240)
	public String getHistorico() {
		return this.historico;
	}

	public void setHistorico(String historico) {
		this.historico = historico;
	}

	@Column(name = "QTDE_POS_MOVIMENTO", precision = 10, scale = 0)
	public Long getQtdePosMovimento() {
		return this.qtdePosMovimento;
	}

	public void setQtdePosMovimento(Long qtdePosMovimento) {
		this.qtdePosMovimento = qtdePosMovimento;
	}

	@Column(name = "CUSTO_MEDIO_PONDERADO_GER", precision = 16, scale = 4)
	public BigDecimal getCustoMedioPonderadoGer() {
		return this.custoMedioPonderadoGer;
	}

	public void setCustoMedioPonderadoGer(BigDecimal custoMedioPonderadoGer) {
		this.custoMedioPonderadoGer = custoMedioPonderadoGer;
	}

	@Column(name = "VALOR", precision = 14)
	public BigDecimal getValor() {
		return this.valor;
	}

	public void setValor(BigDecimal valor) {
		this.valor = valor;
	}

	@Column(name = "SEQ", insertable=false, updatable=false)
	public Integer getSeq() {
		return this.seq;
	}

	public void setSeq(Integer seq) {
		this.seq = seq;
	}

	@Column(name = "RESIDUO", precision = 7)
	public BigDecimal getResiduo() {
		return this.residuo;
	}

	public void setResiduo(BigDecimal residuo) {
		this.residuo = this.truncateHalfEven(residuo, 2);
		
	}

	@Column(name = "NRO_DOC_REFERE", precision = 7, scale = 0)
	public Integer getNroDocRefere() {
		return this.nroDocRefere;
	}

	public void setNroDocRefere(Integer nroDocRefere) {
		this.nroDocRefere = nroDocRefere;
	}

	@Column(name = "FRN_NUMERO_REFERE_DOC", precision = 5, scale = 0)
	public Integer getFrnNumeroRefereDoc() {
		return this.frnNumeroRefereDoc;
	}

	public void setFrnNumeroRefereDoc(Integer frnNumeroRefereDoc) {
		this.frnNumeroRefereDoc = frnNumeroRefereDoc;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "SER_MATRICULA", referencedColumnName = "MATRICULA", nullable = false),
		@JoinColumn(name = "SER_VIN_CODIGO", referencedColumnName = "VIN_CODIGO", nullable = false) })
		public RapServidores getServidor() {
		return this.servidor;
	}

	public void setServidor(RapServidores servidor) {
		this.servidor = servidor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ALM_SEQ", referencedColumnName = "SEQ", nullable = false)
	public SceAlmoxarifado getAlmoxarifado() {
		return this.almoxarifado;
	}

	public void setAlmoxarifado(SceAlmoxarifado almoxarifado) {
		this.almoxarifado = almoxarifado;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "ALM_SEQ_COMPLEMENTO", referencedColumnName = "SEQ")
	public SceAlmoxarifado getAlmoxarifadoComplemento() {
		return this.almoxarifadoComplemento;
	}

	public void setAlmoxarifadoComplemento(SceAlmoxarifado almoxarifadoComplemento) {
		this.almoxarifadoComplemento = almoxarifadoComplemento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO_REQUISITA", referencedColumnName = "CODIGO")
	public FccCentroCustos getCentroCustoRequisita() {
		return this.centroCustoRequisita;
	}

	public void setCentroCustoRequisita(FccCentroCustos centroCustoRequisita) {
		this.centroCustoRequisita = centroCustoRequisita;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "CCT_CODIGO", referencedColumnName = "CODIGO")
	public FccCentroCustos getCentroCusto() {
		return this.centroCusto;
	}

	public void setCentroCusto(FccCentroCustos centroCusto) {
		this.centroCusto = centroCusto;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "FRN_NUMERO", referencedColumnName = "NUMERO")
	public ScoFornecedor getFornecedor() {
		return this.fornecedor;
	}

	public void setFornecedor(ScoFornecedor fornecedor) {
		this.fornecedor = fornecedor;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAT_CODIGO", referencedColumnName = "CODIGO", nullable = false)
	public ScoMaterial getMaterial() {
		return this.material;
	}

	public void setMaterial(ScoMaterial material) {
		this.material = material;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "MTV_TMV_SEQ", referencedColumnName = "TMV_SEQ"),
		@JoinColumn(name = "MTV_TMV_COMPLEMENTO", referencedColumnName = "TMV_COMPLEMENTO"),
		@JoinColumn(name = "MTV_NUMERO", referencedColumnName = "NUMERO") })
		public SceMotivoMovimento getMotivoMovimento() {
		return this.motivoMovimento;
	}

	public void setMotivoMovimento(SceMotivoMovimento motivoMovimento) {
		this.motivoMovimento = motivoMovimento;
	}

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "TMV_SEQ_DOCUMENTO", referencedColumnName = "SEQ"),
		@JoinColumn(name = "TMV_COMPLEMENTO_DOCUMENTO", referencedColumnName = "COMPLEMENTO")})
		public SceTipoMovimento getTipoMovimentoDocumento() {
		return this.tipoMovimentoDocumento;
	}

	public void setTipoMovimentoDocumento(SceTipoMovimento tipoMovimentoDocumento) {
		this.tipoMovimentoDocumento = tipoMovimentoDocumento;
	}	

	@ManyToOne(fetch = FetchType.LAZY)  
	@JoinColumns({ @JoinColumn(name = "TMV_SEQ", referencedColumnName = "SEQ", nullable = false, updatable=false), 
		@JoinColumn(name = "TMV_COMPLEMENTO", referencedColumnName = "COMPLEMENTO", nullable = false, updatable=false)})
		public SceTipoMovimento getTipoMovimento() {
		return this.tipoMovimento;
	}

	public void setTipoMovimento(SceTipoMovimento tipoMovimento) {
		this.tipoMovimento = tipoMovimento;
	}	

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "UMD_CODIGO", referencedColumnName = "CODIGO", nullable = false)
	public ScoUnidadeMedida getUnidadeMedida() {
		return this.unidadeMedida;
	}

	public void setUnidadeMedida(ScoUnidadeMedida unidadeMedida) {
		this.unidadeMedida = unidadeMedida;
	}

	@Transient
	public Integer getMesCompetencia() {
		if(getDtCompetencia()!=null){
			Calendar data = Calendar.getInstance();
			data.setTime(getDtCompetencia());
			this.mesCompetencia = data.get(Calendar.MONTH)+1;
		}
		return this.mesCompetencia;
	}

	public void setMesCompetencia(Integer mesCompetencia) {
		this.mesCompetencia = mesCompetencia;
	}

	@Transient
	public Integer getAnoCompetencia() {
		if(getDtCompetencia()!=null){
			Calendar data = Calendar.getInstance();
			data.setTime(getDtCompetencia());
			this.anoCompetencia = data.get(Calendar.YEAR);
		}
		return this.anoCompetencia;
	}

	public void setAnoCompetencia(Integer anoCompetencia) {
		this.anoCompetencia = anoCompetencia;
	}

	@Transient
	public String getMesAno(){
		mesAno = getMesCompetencia().toString() + "/" + getAnoCompetencia().toString();
		return mesAno;
	}

	public void setMesAno(String mesAno){
		this.mesAno = mesAno;
	}

	@Transient
	public Date getDtCompetencia(){
		return dtCompetencia;
	}

	public void setDtCompetencia(Date dtCompetencia){
		this.dtCompetencia = dtCompetencia;
	}
	
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumns({ @JoinColumn(name = "NRO_DOC_GERACAO", referencedColumnName = "SEQ", nullable = false, insertable = false, updatable = false),
		@JoinColumn(name = "TMV_SEQ", referencedColumnName = "TMV_SEQ", nullable = false, insertable = false, updatable = false) })
	public SceEntrSaidSemLicitacao getSceEntrSaidSemLicitacao() {
		return this.sceEntrSaidSemLicitacao;
	}

	public void setSceEntrSaidSemLicitacao(SceEntrSaidSemLicitacao sceEntrSaidSemLicitacao) {
		this.sceEntrSaidSemLicitacao = sceEntrSaidSemLicitacao;
	}
	

	/**
	 * Método Utilizado para truncar valores. 
	 * Exemplo de utilização: Classe SceEstoqueGeral, para cálculos do módulo de estoque.
	 * @param valor - valor para ser truncado
	 * @param casas - quantidade de casas decimais 
	 * @return
	 */
	@Transient
	public BigDecimal truncate(BigDecimal valor, int casas){

		if(valor!=null){

			int index = valor.toString().lastIndexOf(".");

			if(index != -1){
				String subStringValor = valor.toString().substring(index).replace(".", "");

				if(subStringValor.length() > casas){

					valor = valor.setScale(casas, RoundingMode.DOWN);
				}

			}

		}
		return valor ;

	}
	
	/**
	 * Método Utilizado para truncar valores. 
	 * Exemplo de utilização: Classe SceEstoqueGeral, para cálculos do módulo de estoque.
	 * @param valor - valor para ser truncado
	 * @param casas - quantidade de casas decimais 
	 * @return
	 */
	@Transient
	public Double truncate(Double valor, int casas){

		if(valor!=null){

			int index = valor.toString().lastIndexOf(".");

			if(index != -1){
				String subStringValor = valor.toString().substring(index).replace(".", "");

				if(subStringValor.length() > casas){

					valor = new BigDecimal(valor).setScale(casas, RoundingMode.DOWN).doubleValue();
				}

			}

		}
		
		return valor ;

	}
	
	/**
	 * Método Utilizado para truncar valores. 
	 * Exemplo de utilização: Classe SceEstoqueGeral, para cálculos do módulo de estoque.
	 * @param valor - valor para ser truncado
	 * @param casas - quantidade de casas decimais 
	 * @return
	 */
	@Transient
	public Double truncateHalfEven(Double valor, int casas){

		if(valor!=null){

			int index = valor.toString().lastIndexOf(".");

			if(index != -1){
				String subStringValor = valor.toString().substring(index).replace(".", "");

				if(subStringValor.length() > casas){

					valor = new BigDecimal(valor).setScale(casas, RoundingMode.HALF_EVEN).doubleValue();
					
				}

			}

		}
		return valor ;

	}
	
	/**
	 * Método Utilizado para truncar valores. 
	 * Exemplo de utilização: Classe SceEstoqueGeral, para cálculos do módulo de estoque.
	 * @param valor - valor para ser truncado
	 * @param casas - quantidade de casas decimais 
	 * @return
	 */
	public Double truncateFloor(Double valor, int casas){

		if(valor!=null){

			int index = valor.toString().lastIndexOf(".");

			if(index != -1){
				String subStringValor = valor.toString().substring(index).replace(".", "");

				if(subStringValor.length() > casas){

					valor = new BigDecimal(valor).setScale(casas, RoundingMode.FLOOR).doubleValue();
					
				}

			}

		}
		return valor ;

	}
	
	/**
	 * Método Utilizado para truncar valores. 
	 * Exemplo de utilização: Classe SceEstoqueGeral, para cálculos do módulo de estoque.
	 * @param valor - valor para ser truncado
	 * @param casas - quantidade de casas decimais 
	 * @return
	 */
	public  BigDecimal truncateHalfEven(BigDecimal valor, int casas){
		
		if (valor != null){
			
			Double valorToDouble = truncateHalfEven(valor.doubleValue(), casas);
			
			return new BigDecimal(valorToDouble.toString());

		}

		return valor;

	}
	
	/**
	 * Método Utilizado para truncar valores. 
	 * Exemplo de utilização: Classe SceEstoqueGeral, para cálculos do módulo de estoque.
	 * @param valor - valor para ser truncado
	 * @param casas - quantidade de casas decimais 
	 * @return
	 */
	public  BigDecimal truncateFloor(BigDecimal valor, int casas){
		
		if(valor != null){
			
			Double valorToDouble = truncateFloor(valor.doubleValue(), casas);
			
			return new BigDecimal(valorToDouble.toString());
		}

		return valor;

	}



	public enum Fields {
		SEQ("id.seq"),
		TIPO_MOVIMENTO("tipoMovimento"),
		TIPO_MOVIMENTO_SEQ("tipoMovimento.id.seq"),
		TIPO_MOVIMENTO_COMPL("tipoMovimento.id.complemento"),
		TIPO_MOVIMENTO_DOCUMENTO("tipoMovimentoDocumento"),
		TIPO_MOVIMENTO_SEQ_DOCUMENTO("tipoMovimentoDocumento.id.seq"),
		TIPO_MOVIMENTO_COMPLEMENTO_DOCUMENTO("tipoMovimentoDocumento.id.complemento"),
		NRO_DOC_GERACAO("nroDocGeracao"),
		IND_ESTORNO("indEstorno"),
		QUANTIDADE("quantidade"),
		MATERIAL("material"),
		CENTRO_CUSTO("centroCusto"),
		DATA_GERACAO("dtGeracao"),
		VALOR("valor"),
		CUSTO_MEDIO_PONDERADOR_GER("custoMedioPonderadoGer"),
		DATA_COMPETENCIA("id.dtCompetencia"),
		DATA_COMPETENCIA_NATIVO("DT_COMPETENCIA"),
		ALMOXARIFADO("almoxarifado"),
		MOTIVO_MOVIMENTO("motivoMovimento"),
		MOTIVO_MOVIMENTO_SEQ("motivoMovimento.id.tmvSeq"),
		MOTIVO_MOVIMENTO_COMPLEMENTO("motivoMovimento.id.tmvComplemento"),
		MOTIVO_MOVIMENTO_NUMERO("motivoMovimento.id.numero"),
		MES_COMPETENCIA("mesCompetencia"),
		ANO_COMPETENCIA("anoCompetencia"),
		DT_COMPETENCIA("dtCompetencia"),
		MATERIAL_CODIGO("material.codigo"),
		ALMOXARIFADO_SEQ("almoxarifado.seq"),
		CENTRO_CUSTO_CODIGO("centroCusto.codigo"),
		CENTRO_CUSTO_REQUISITA("centroCustoRequisita"),
		CENTRO_CUSTO_REQUISITA_CODIGO("centroCustoRequisita.codigo"),
		FORNECEDOR("fornecedor"),
		FORNECEDOR_NUMERO("fornecedor.numero"),
		SERVIDOR("servidor"),
		ALMOXARIFADO_SEQ_COMPL("almoxarifadoComplemento.seq"),
		ALMOXARIFADO_COMPLEMENTO("almoxarifadoComplemento"),
		UNIDADE_MEDIDA("unidadeMedida.codigo"),
		UNIDADE_MEDIDA_CODIGO("unidadeMedida.codigo"),
		NOTA_RECEBIMENTO("notaRecebimento"),
		ESL("sceEntrSaidSemLicitacao");

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
		result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
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
		if (!(obj instanceof SceMovimentoMaterial)) {
			return false;
		}
		SceMovimentoMaterial other = (SceMovimentoMaterial) obj;
		if (getId() == null) {
			if (other.getId() != null) {
				return false;
			}
		} else if (!getId().equals(other.getId())) {
			return false;
		}
		return true;
	}
	// ##### GeradorEqualsHashCodeMain #####

}