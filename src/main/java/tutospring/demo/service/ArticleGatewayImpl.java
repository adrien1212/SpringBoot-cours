package tutospring.demo.service;

import java.time.LocalDateTime;
import java.util.List;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import tutospring.demo.domain.Article;
import tutospring.demo.persistance.ArticleJPAEntity;
import tutospring.demo.persistance.ArticleJPARepository;
import tutospring.demo.persistance.TagJPAEntity;


@Service
@Getter
@Setter
@AllArgsConstructor
public class ArticleGatewayImpl implements ArticleGatewayInterface {

	private ArticleJPARepository articleJPARepository;
	
	@Override
	public void sauvegarder(Article article) {
		articleJPARepository.save(domainToJpa(article));
	}
	
	private ArticleJPAEntity domainToJpa(Article article) {
		List<TagJPAEntity> tags = article.getTags().stream().map(tag -> new TagJPAEntity(tag.getNom(), tag.getCouleur())).toList();
		
		return new ArticleJPAEntity(article.getTitre(), article.getContenu(), LocalDateTime.now(), article.getUpdatedAt(), tags);
	}
	
	
}
