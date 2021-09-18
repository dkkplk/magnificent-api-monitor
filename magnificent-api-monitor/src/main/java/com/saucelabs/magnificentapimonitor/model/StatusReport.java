package com.saucelabs.magnificentapimonitor.model;

public class StatusReport {

	private int testFrequency;
	private int timeDuration;
	private int sucessCount;
	private int failureCount;
	private boolean isResponding;

	public StatusReport(int testFrequency, int timeDuration, int sucessCount, int failureCount, boolean isResponding) {
		super();
		this.testFrequency = testFrequency;
		this.timeDuration = timeDuration;
		this.sucessCount = sucessCount;
		this.failureCount = failureCount;
		this.isResponding = isResponding;
	}

	public int getTestFrequency() {
		return testFrequency;
	}

	public void setTestFrequency(int testFrequency) {
		this.testFrequency = testFrequency;
	}

	public int getTimeDuration() {
		return timeDuration;
	}

	public void setTimeDuration(int timeDuration) {
		this.timeDuration = timeDuration;
	}

	public int getSucessCount() {
		return sucessCount;
	}

	public void setSucessCount(int sucessCount) {
		this.sucessCount = sucessCount;
	}

	public int getFailureCount() {
		return failureCount;
	}

	public void setFailureCount(int failureCount) {
		this.failureCount = failureCount;
	}

	public boolean isResponding() {
		return isResponding;
	}

	public void setResponding(boolean isResponding) {
		this.isResponding = isResponding;
	}

	@Override
	public String toString() {
		return "StatusReport [testFrequency=" + testFrequency + ", timeDuration=" + timeDuration + ", sucessCount="
				+ sucessCount + ", failureCount=" + failureCount + ", isResponding=" + isResponding + "]";
	}

}
