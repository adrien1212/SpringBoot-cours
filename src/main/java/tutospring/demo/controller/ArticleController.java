package tutospring.demo.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.AllArgsConstructor;
import tutospring.demo.service.ArticleRequestDTO;
import tutospring.demo.service.ArticleServiceInterface;

@RestController
@RequestMapping("/article")
@AllArgsConstructor
public class ArticleController {
	private ArticleServiceInterface articleServiceInterface;
	
	@PostMapping("/create")
	public void create(@RequestBody ArticleRequestDTO articleRequestDTO) {
		articleServiceInterface.creer(articleRequestDTO);
	}
}
