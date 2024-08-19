package one.digitalinnovation.gof.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import one.digitalinnovation.gof.model.Telefone;

/**
 * Client HTTP, criado via <b>OpenFeign</b>, para o consumo da API do
 * <b>APILayer</b>.
 * 
 * @see <a href="https://apilayer.com">APILayer</a>
 * 
 * @author Emanuel Lucas
 */
@FeignClient(name = "apilayer", url = "http://apilayer.net/api")
public interface TelefoneService {

    @GetMapping("/validate")
    Telefone obterTelefone(
        @RequestParam("access_key") String accessKey, 
        @RequestParam("number") String number);
}
