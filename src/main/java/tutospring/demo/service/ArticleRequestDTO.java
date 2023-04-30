package tutospring.demo.service;

import java.util.Map;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Setter
@Getter
public class ArticleRequestDTO {
	private String titre;
	
	private String contenu;
	
	private Map<String, String> maptags;
}
