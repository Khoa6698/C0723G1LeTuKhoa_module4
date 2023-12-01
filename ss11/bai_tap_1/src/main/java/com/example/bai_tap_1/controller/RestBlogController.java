package com.example.bai_tap_1.controller;

import com.example.bai_tap_1.model.Blog;
import com.example.bai_tap_1.service.IBlogService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")
@RequestMapping("/api-blog")
public class RestBlogController {
    @Autowired
    private IBlogService blogService;

    @GetMapping("")
    public ResponseEntity<Page<Blog>> showList(@PageableDefault(size = 2) Pageable pageable) {
        Page<Blog> blogList = blogService.findAll(pageable);
        if(blogList.isEmpty()){
            return new ResponseEntity<>(HttpStatus.OK);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }
    @PostMapping("/search")
    public ResponseEntity<List<Blog>> search(@RequestParam(value = "name") String name){
        List<Blog> blogList = blogService.findBlogByName(name);
        if (name==null){
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(blogList,HttpStatus.OK);
    }
    @PostMapping("")
    public ResponseEntity<?> save(@RequestBody Blog blog){
        if(blog==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        blogService.create(blog);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable int id){
        Blog blog = blogService.findBlogById(id);
        if(blog==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        blogService.delete(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @PatchMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable int id){
        Blog blog1 = blogService.findBlogById(id);
        if(blog1==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        blogService.update(blog1);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Blog> detail(@PathVariable Integer id){
        Blog blog = blogService.findBlogById(id);
        if(blog==null){
            return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
