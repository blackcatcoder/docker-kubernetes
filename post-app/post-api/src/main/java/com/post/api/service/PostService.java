package com.post.api.service;

import com.post.api.entity.PostEntity;
import com.post.api.repository.PostRepository;
import org.springframework.stereotype.Service;

import java.time.Instant;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class PostService implements IPostService {

  private final PostRepository postRepository;

  public PostService(PostRepository postRepository) {
    this.postRepository = postRepository;
  }

  @Override
  public PostEntity findPostById(Long id) {
    return postRepository.findById(id).orElse(null);
  }

  @Override
  public List<PostEntity> findAllPost() {
    return postRepository.findAll();
  }

  @Override
  public PostEntity createPost(PostEntity post) {
    post.setPublishDate(LocalDateTime.now());
    return postRepository.save(post);
  }

  @Override
  public void updatePost(Long id, PostEntity post) {
    Optional<PostEntity> postEntityOptional = postRepository.findById(id);
    if (postEntityOptional.isPresent()) {
      postRepository.save(post);
    }
  }

  @Override
  public void deletePost(Long id) {
    postRepository.deleteById(id);
  }
}
