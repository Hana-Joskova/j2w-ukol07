package cz.czechitas.java2webapps.ukol7.repository;

import cz.czechitas.java2webapps.ukol7.entity.Post;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.Optional;

public interface PostRepository extends JpaRepository <Post, Integer> {
    Optional<Post> findBySlug(String slug);

    Page<Post> findByPublishedDateBeforeOrderByPublishedDesc(LocalDate now, Pageable pageable);
}
