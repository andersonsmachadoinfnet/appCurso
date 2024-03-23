package br.anderson.infnet.andersonmachado.clients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import br.anderson.infnet.andersonmachado.clients.domain.RandomUserMeResult;

@FeignClient(url = "https://randomuser.me/api/", name = "randomUserMe")
public interface IRandomUserMe {
	@GetMapping
	RandomUserMeResult obterPessoa();
}
