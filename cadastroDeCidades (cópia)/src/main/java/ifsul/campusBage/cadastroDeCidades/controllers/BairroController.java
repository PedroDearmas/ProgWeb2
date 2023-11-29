package ifsul.campusBage.cadastroDeCidades.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import ifsul.campusBage.cadastroDeCidades.models.Bairro;
import ifsul.campusBage.cadastroDeCidades.models.Cidade;
import ifsul.campusBage.cadastroDeCidades.repositories.BairroRepository;

@Controller
public class BairroController {
	@Autowired // instancia e injeta neste atributo um objeto CidadeRepository
	BairroRepository bairroRepository;

	@GetMapping("/formBairro")
	public String exibirFormCadastrarBairro(Model model) {

		Bairro bairroAux = new Bairro();
		bairroAux.setNome("digite aqui");
		bairroAux.setPopulacao("");

		model.addAttribute("umBairro", bairroAux);

		return "form-cadastro-bairro.jsp";
	}

	@PostMapping("/cadastrarBairro")
	public String inserirBairroNoBD(Model model, Bairro bairro) {

		// se o método recebe uma classe model como argumento,
		// o framework Spring cria automaticamente um objeto cidade
		// com os dados recebidos do formulário de cadastro de cidade (se os campos e
		// atributos têm mesmo nome)

		// salva no banco de dados a cidade
		bairroRepository.save(bairro);

		model.addAttribute("mensagem", "Bairro cadastrado com sucesso");

		return "form-cadastro-bairro.jsp";
	}

	@GetMapping("/listarTodosBairros")
	public String buscarTodosBairros(Model model) {

		List<Bairro> listaDeBairros = (List<Bairro>) bairroRepository.findAll();

		model.addAttribute("listaBairro", listaDeBairros);

		return "lista-de-bairros.jsp";
	}

	@GetMapping("/excluirBairro")
	public String excluirBairro(Model model, @RequestParam("id")Long id) {
		
		bairroRepository.deleteById(id);

		Optional<Bairro> BairroOps = bairroRepository.findById(id);
		if(BairroOps.get() != null) {
			Bairro bairro = BairroOps.get();
			model.addAttribute("bairro", bairro);
		}else {
			model.addAttribute("mensagem","Bairro não encontrado");
		}
		
		return "confirmar-exclucao.jsp";
	}
	@GetMapping("/excluirBairroBD")
	public String excluirBairroBD(Model model, @RequestParam("id")Long id) {
		
		bairroRepository.deleteById(id);

		List<Bairro> listaDeBairros = (List<Bairro>) bairroRepository.findAll();

		model.addAttribute("listaBairro", listaDeBairros);
		model.addAttribute("mensagem", "Bairro excluido com sucesso");
		
		return "lista-de-bairros.jsp";
	}
}
