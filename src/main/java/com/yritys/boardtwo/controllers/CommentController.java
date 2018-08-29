/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.yritys.boardtwo.controllers;

import com.yritys.boardtwo.jpa.Comment;
import com.yritys.boardtwo.jpa.CommentRepository;
import java.util.List;
import java.util.Objects;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Tommi
 */
@RestController
@RequestMapping("comment")
public class CommentController {

    @Autowired
    private CommentRepository commentrepository;

    @RequestMapping(method = RequestMethod.GET)
    public List<Comment> getComments() {
        return commentrepository.findAll();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    public Comment getComment(@PathVariable Long id) {
        return commentrepository.findById(id).get();
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    public void deleteComment(@PathVariable Long id) {
        commentrepository.deleteById(id);
    }

    @RequestMapping(method = RequestMethod.POST)
    public Comment postComment(@RequestBody Comment comment) {
        if (comment.getUsername().isEmpty() || comment.getUsername().equals("")) {
            comment.setUsername("Anonymous internet user");
            return commentrepository.saveAndFlush(comment);
        }
        return commentrepository.saveAndFlush(comment);
    }

}
