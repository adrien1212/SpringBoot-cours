package tutospring.demo.persistance;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.NonNull;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@RequiredArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "article")
public class ArticleJPAEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NonNull
	private String titre;
	
	@NonNull
	private String contenu;
	
	@NonNull
	private LocalDateTime createdAt;
	
	@NonNull
	private LocalDateTime lastUpdatedAd;
	
	@ManyToMany(cascade = CascadeType.ALL)
	@NonNull
	private List<TagJPAEntity> tags;
}
