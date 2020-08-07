package com.jdjhaha.program.list.management;

public class ProgramVO {
	private int id;
	private String name;
	private String url;
	
	public ProgramVO(int id, String name, String url) {
		super();
		this.id = id;
		this.name = name;
		this.url = url;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("id:");
		sb.append(this.id);
		sb.append(", name:");
		sb.append(this.name);
		sb.append(", url:");
		sb.append(this.url);
		return sb.toString();
	}
}
