package tutospring.demo.service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Map.Entry;

import org.springframework.stereotype.Service;

import lombok.AllArgsConstructor;
import tutospring.demo.domain.Article;
import tutospring.demo.domain.Tag;
import tutospring.demo.persistance.ArticleJPARepository;

@Service
@AllArgsConstructor
public class ArticleService implements ArticleServiceInterface {

	private ArticleGatewayInterface articleGatewayInterface;
	
	@Override
	public void creer(ArticleRequestDTO articleRequestDTO) {
		Article article = dtoToDomain(articleRequestDTO);
		articleGatewayInterface.sauvegarder(article);
	}

	private Article dtoToDomain(ArticleRequestDTO articleRequestDTO) {
		List<Tag> tags = new ArrayList();
		
		for (Entry<String, String> entry : articleRequestDTO.getMaptags().entrySet()) {
			String key = entry.getKey();
			String val = entry.getValue();
			
			tags.add(new Tag(key, val));
		}
		
		return new Article(articleRequestDTO.getTitre(), articleRequestDTO.getContenu(), LocalDateTime.now(), tags);
	}
}
