package com.onetomany.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Story {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int storyId;

	@Column(name = "story_name")
	private String storyName;
	
	

	public Story(int storyId, String storyName) {
		super();
		this.storyId = storyId;
		this.storyName = storyName;
	}

	public int getStoryId() {
		return storyId;
	}

	public void setStoryId(int storyId) {
		this.storyId = storyId;
	}

	public String getStoryName() {
		return storyName;
	}

	public void setStoryName(String storyName) {
		this.storyName = storyName;
	}

	@Override
	public String toString() {
		return "Story [storyId=" + storyId + ", storyName=" + storyName + "]";
	}
	

}