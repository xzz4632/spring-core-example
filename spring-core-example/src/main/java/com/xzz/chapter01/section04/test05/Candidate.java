package com.xzz.chapter01.section04.test05;

public class Candidate {

	private Job job;

	public Job getJob() {
		return job;
	}

	public void setJob(Job job) {
		this.job = job;
	}

	@Override
	public String toString() {
		return "Candidate [job=" + job + "]";
	}

}
