package tutospring.demo.persistance;

import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleJPARepository extends JpaRepository<ArticleJPAEntity, Integer>{

}
