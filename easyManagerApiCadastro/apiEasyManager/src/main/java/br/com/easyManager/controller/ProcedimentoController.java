package br.com.easyManager.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.easyManager.model.Procedimento;
import br.com.easyManager.repository.ProcedimentoRepository;

@RestController
@RequestMapping(value="/cadastro")
public class ProcedimentoController {
	@Autowired
	ProcedimentoRepository procedimentoRepository;
	
	@PostMapping("/novoProcedimento")
	public Procedimento cadastroProcedimento(@RequestBody Procedimento procedimento) {
		return procedimentoRepository.save(procedimento);
	}
	
}
