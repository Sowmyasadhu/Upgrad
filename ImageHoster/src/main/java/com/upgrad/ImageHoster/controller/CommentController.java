package com.upgrad.ImageHoster.controller;

import javax.servlet.http.HttpSession;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.upgrad.ImageHoster.common.ImageManager;
import com.upgrad.ImageHoster.model.Comment;

public class CommentController {

	/**
	 * This controller method create a user
	 *
	 * @param username
	 *            the username for the created user
	 * @param password
	 *            the password for the created user
	 * @param session
	 *            HTTP session for us to store the created user
	 *
	 * @return redircts to the homepage view
	 * @throws Exception
	 */
	@RequestMapping(value = "/image/{title}/comments/create", method = RequestMethod.POST)
	public String Cmment(@RequestParam("comment") String comment2, HttpSession session, Model model) throws Exception {

		Comment comment1 = new Comment(comment2);
		ImageManager manager = new ImageManager();
		manager.saveComment(comment1);

		// We want to create an "currUser" attribute in the HTTP session, and store the
		// user
		// as the attribute's value to signify that the user has logged in

		return "images/image";
	}
}
