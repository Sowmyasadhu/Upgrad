package com.upgrad.ImageHoster.model;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	// These annotations auto-increments the id column for us whenever
	// a new Image object is stored into the database
	@Id
	@Column(columnDefinition = "serial")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column
	private String text;

	@Column
	private LocalDate commentDate;

	@Column
	private User userService;

	public Comment() {
	}

	public Comment(String title) {
		this.text = title;
		this.commentDate = LocalDate.now();
	}

	public int getId() {
		return this.id;
	}

	public String getTitle() {
		return text;
	}

	public void setTitle(String title) {
		this.text = title;
	}

	public String getUploadDate() {
		return commentDate.toString();
	}

	public void setUploadDate(LocalDate uploadDate) {
		this.commentDate = uploadDate;
	}

	public void setUser(User user) {
		this.userService = user;
	}

	public User getUser() {
		return this.userService;
	}

}
