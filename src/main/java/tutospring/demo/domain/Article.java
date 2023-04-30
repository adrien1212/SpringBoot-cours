package tutospring.demo.domain;

import java.time.LocalDateTime;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
public class Article {

	private String titre;
	
	private String contenu;
	
	private LocalDateTime updatedAt;
	
	private List<Tag> tags;
	
}
