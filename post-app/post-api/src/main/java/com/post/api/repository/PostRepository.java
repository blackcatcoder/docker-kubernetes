package com.post.api.repository;

import com.post.api.entity.PostEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.data.repository.CrudRepository;

@Repository
public interface PostRepository extends JpaRepository<PostEntity, Long> {}
