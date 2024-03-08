package br.jus.tjma.primeiroexemplovscode.model;

public class TbCaixa {

	private Integer idCaixa;
	private Integer nmCaixa;
	private String dsCaixa;
	private Boolean inSistema;

	public Integer getIdCaixa() {
		return idCaixa;
	}
	public void setIdCaixa(Integer idCaixa) {
		this.idCaixa = idCaixa;
	}
	public Integer getNmCaixa() {
		return nmCaixa;
	}
	public void setNmCaixa(Integer nmCaixa) {
		this.nmCaixa = nmCaixa;
	}
	public String getDsCaixa() {
		return dsCaixa;
	}
	public void setDsCaixa(String dsCaixa) {
		this.dsCaixa = dsCaixa;
	}
	public Boolean getInSistema() {
		return inSistema;
	}
	public void setInSistema(Boolean inSistema) {
		this.inSistema = inSistema;
	}
}
