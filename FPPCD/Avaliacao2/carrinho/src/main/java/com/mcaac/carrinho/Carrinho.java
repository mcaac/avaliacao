package com.mcaac.carrinho;

public class Carrinho {

	public String email;
    public String cep;
    public Double valor;
    public String skus;

		public String getSkus() {
			return skus;
		}
	
		public void setSkus(String skus) {
			this.skus = skus;
		}
	
		public String getEmail() {
			return email;
		}
	
		public void setEmail(String email) {
			this.email = email;
		}
	
		public String getCep() {
			return cep;
		}
	
		public void setCep(String cep) {
			this.cep = cep;
		}
	
		public Double getValor() {
			return valor;
		}
	
		public void setValor(Double valor) {
			this.valor = valor;
		}

	}
