package br.gov.mec.aghu.dominio;

import br.gov.mec.aghu.core.dominio.Dominio;

public enum DominioMomento implements Dominio {
	
	/**
	 * Nascimento
	 */
	N,

	/**
	 * Outros
	 */
	O;

	@Override
	public int getCodigo() {
		return this.ordinal();
	}

	@Override
	public String getDescricao() {
		switch (this) {
		case N:
			return "Nascimento";
		case O:
			return "Outros";
		default:
			return "";
		}
	}

}
