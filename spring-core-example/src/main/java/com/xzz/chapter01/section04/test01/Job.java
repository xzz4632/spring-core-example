package com.xzz.chapter01.section04.test01;

public class Job {

	private String jobName;

	public String getJobName() {
		return jobName;
	}

	public void setJobName(String jobName) {
		this.jobName = jobName;
	}

	@Override
	public String toString() {
		return "Job [jobName=" + jobName + "]";
	}

}
