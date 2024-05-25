package com.post.api.controller;

import com.post.api.entity.PostEntity;
import com.post.api.service.IPostService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("post")
public class IndexController {

  private final IPostService postService;

  public IndexController(IPostService postService) {
    this.postService = postService;
  }

  @GetMapping("index")
  public String index() {
    return "index";
  }

  @GetMapping("/{id}")
  public PostEntity getPost(@PathVariable Long id) {
    return postService.findPostById(id);
  }

  @GetMapping("allPost")
  public List<PostEntity> getAllPost() {
    return postService.findAllPost();
  }

  @PostMapping
  public void createPost(@RequestBody PostEntity post) {
    postService.createPost(post);
  }

  @DeleteMapping("/{id}")
  public void deletePost(@PathVariable Long id) {
    postService.deletePost(id);
  }

  @PutMapping
  public void updatePost(@RequestBody PostEntity post) {
    postService.updatePost(post.getId(), post);
  }
}
