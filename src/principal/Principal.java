package principal;

import com.google.gson.Gson;
import model.Endereco;
import model.EnderecoViaCep;
import service.ConsomeAPI;

import java.io.IOException;

public class Principal {
  public Endereco buscarEndereco(String cep) throws IOException, InterruptedException {
    String url = "https://viacep.com.br/ws/" + cep + "/json/";
    String enderecoAPI = new ConsomeAPI().obtemDados(url);

    Gson gson = new Gson();

    EnderecoViaCep enderecoViaCep = gson.fromJson(enderecoAPI, EnderecoViaCep.class);

    return new Endereco(enderecoViaCep);
  }

}
