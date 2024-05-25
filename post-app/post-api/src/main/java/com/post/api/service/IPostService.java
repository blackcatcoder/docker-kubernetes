package com.post.api.service;

import com.post.api.entity.PostEntity;

import java.util.List;

public interface IPostService {
  PostEntity findPostById(Long id);

  List<PostEntity> findAllPost();

  PostEntity createPost(PostEntity post);

  void updatePost(Long id, PostEntity post);

  void deletePost(Long id);
}
