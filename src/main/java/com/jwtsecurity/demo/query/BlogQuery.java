package com.jwtsecurity.demo.query;

import com.jwtsecurity.demo.model.Blog;
import com.jwtsecurity.demo.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.coxautodev.graphql.tools.GraphQLQueryResolver;

import java.util.List;
import java.util.Optional;

@Component
public class BlogQuery implements GraphQLQueryResolver {

    @Autowired
    private BlogService blogService;

    public List<Blog> getBlogs(final int count){
        return this.blogService.getAllBlogs(count);
    }


    public Optional<Blog> getBlog(final int id){return this.blogService.getBlog(id);}

}