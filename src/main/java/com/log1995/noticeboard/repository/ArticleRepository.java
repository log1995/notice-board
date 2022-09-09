package com.log1995.noticeboard.repository;

import com.log1995.noticeboard.domain.Article;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ArticleRepository extends JpaRepository<Article, Long> {
}