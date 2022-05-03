package com.debu.ms.app2;

public class app1Response {
	private String type;
	private String port;
	public app1Response() {
		super();
		// TODO Auto-generated constructor stub
	}
	public app1Response(String type, String port) {
		super();
		this.type = type;
		this.port = port;
	}
	
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPort() {
		return port;
	}
	public void setPort(String port) {
		this.port = port;
	}
	@Override
	public String toString() {
		return "app1Response [type=" + type + ", port=" + port + "]";
	}

	
	
}
