package com.highill.practice.spring.boot.response;

public class NameInfoResponse {
	
	private long requestId;
	
	private String name;
	
	private String info;
	
	private String message;

	public long getRequestId() {
		return requestId;
	}

	public void setRequestId(long requestId) {
		this.requestId = requestId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getInfo() {
		return info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
    public String toString() {
	    return "NameInfoResponse [requestId=" + requestId + ", name=" + name + ", info=" + info + ", message=" + message + "]";
    }
	
	

}
