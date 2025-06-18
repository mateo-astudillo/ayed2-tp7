package com.ayed2;

import java.util.ArrayList;

/**
 * Graph
 */
public class Graph {
	public static int maxVertices = 20;
	private int numberOfVertices;
	private ArrayList<Vertex> vertices;
	private int[][] adjacenciaMatrix;

	public Graph() {
		this.numberOfVertices = 0;
		this.vertices = new ArrayList<>();
		this.adjacenciaMatrix = new int[maxVertices][maxVertices];

		for (int r = 0; r < maxVertices; r++) {
			for (int c = 0; c < maxVertices; c++)
				this.adjacenciaMatrix[r][c] = 0;
		}
	}

	public void addVertex(String name) {
		if (vertexExists(name))
			return;
		this.vertices.add(new Vertex(name, this.numberOfVertices));
		this.numberOfVertices += 1;
	}

	public void addArc(String from, String to, int value) {
		if (!vertexExists(from) || !vertexExists(to))
			return;

		Vertex f = getVertex(from);
		Vertex t = getVertex(to);

		this.adjacenciaMatrix[f.getN()][t.getN()] = value;
	}

	private boolean vertexExists(String name) {
		for (Vertex v : this.vertices) {
			if (v.getName().equals(name))
				return true;
		}
		return false;
	}

	private Vertex getVertex(String name) {
		for (Vertex v : this.vertices) {
			if (v.getName().equals(name))
				return v;
		}
		return null;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (Vertex v : vertices)
			sb.append(v.getName().substring(0, 2) + " ");
		sb.append("\n");
		for (int r = 0; r < numberOfVertices; r++) {
			for (int c = 0; c < numberOfVertices; c++)
				sb.append(adjacenciaMatrix[r][c] + "  ");
			sb.append(this.vertices.get(r).getName() + "\n");
		}
		return sb.toString();
	}
}
