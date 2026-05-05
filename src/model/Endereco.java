package model;

public class Endereco {
  private String cep;
  private String logradouro;
  private String bairro;
  private String estado;
  private String uf;

  public Endereco(String cep, String logradouro, String estado, String bairro, String uf) {

  }

  public Endereco(EnderecoViaCep enderecoViaCep) {
    this.cep = enderecoViaCep.cep();
    this.logradouro = enderecoViaCep.logradouro();
    this.bairro = enderecoViaCep.bairro();
    this.estado = enderecoViaCep.estado();
    this.uf = enderecoViaCep.uf();
  }

  public String getCep() {
    return cep;
  }

  public String getLogradouro() {
    return logradouro;
  }

  public String getBairro() {
    return bairro;
  }

  public String getEstado() {
    return estado;
  }

  public String getUf() {
    return uf;
  }

  @Override
  public String toString() {
    return "CPE: " + cep + '\n' +
            "Rua: " + logradouro + '\n' +
            "Bairro: " + bairro + '\n' +
            "Estado: " + estado + '\n' +
            "UF: " + uf;
  }
}
