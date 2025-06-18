package com.ayed2;

/**
 * Vertex
 */
public class Vertex {
	private String name;
	private int n;

	public Vertex(String name, int n) {
		this.name = name;
		this.n = n;
	}

	public String getName() {
		return name;
	}

	public int getN() {
		return n;
	}

	// @Override
	// public boolean equals(Object obj) {
	// 	if (obj instanceof Vertex v)
	// 		return this.name.equals(v.getName());
	// 	return false;
	// }
}
