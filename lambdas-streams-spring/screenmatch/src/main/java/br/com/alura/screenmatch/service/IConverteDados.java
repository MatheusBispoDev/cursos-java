package br.com.alura.screenmatch.service;

public interface IConverteDados {
    <T> T obterDados(String json, Class<T> classe);
    //<T> T = Não sei qual será o tipo de retorno, porém eu sei que haverá um retorno
}
