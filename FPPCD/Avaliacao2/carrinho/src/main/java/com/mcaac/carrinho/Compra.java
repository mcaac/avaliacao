package com.mcaac.carrinho;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class Compra {
    static  String urlEstoque="http://localhost:8080/";
	static String urlCobranca="http://localhost:8081/";
	static String urlExpedicao="http://localhost:8082/";

    static RestTemplate restTemplate = new RestTemplate();


    public static void finalizarCompra(Carrinho carrinho) {

        final ResponseEntity<String> responseEstoque = restTemplate.postForEntity(urlEstoque, carrinho, String.class);
        System.out.println("Response Estoque" + responseEstoque);
        /*if (responseEstoque.getStatusCode() == HttpStatus.OK) {
            System.out.println("Request Estoque Successful");
        } else {
            System.out.println("Request Estoque Failed");
        }*/
        final ResponseEntity<String> responseCobranca = restTemplate.postForEntity(urlCobranca, carrinho, String.class);
        System.out.println("Response Cobranca" + responseCobranca);

        /* if (responseCobranca.getStatusCode() == HttpStatus.OK) {
            System.out.println("Request Cobranca Successful");
        } else {
            System.out.println("Request Cobranca Failed");
        }*/
        final ResponseEntity<String> responseExpedicao = restTemplate.postForEntity(urlExpedicao, carrinho, String.class);
        System.out.println("Response Expedicao" + responseExpedicao);

        /*if (responseExpedicao.getStatusCode() == HttpStatus.OK) {
            System.out.println("Request Expedicao Successful");
        } else {
            System.out.println("Request Expedicao Failed");
        }*/

    }

    public static void main(String[] args) {

        Carrinho carrinho = new Carrinho();

        carrinho.setCep("52032-240");
        carrinho.setEmail("mcaac@cesar.school");
        carrinho.setSkus("78935522");
        carrinho.setValor(8999.99);

        finalizarCompra(carrinho);
    }

}