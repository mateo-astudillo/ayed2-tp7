package com.ayed2;

/**
 * App
 */
public class App {
	public static void main(String[] args) {
		Graph graph = new Graph();
		String a = "Alicante";
		String b = "Barcelona";
		String c = "Cartagena";
		String m = "Murcia";
		String r = "Reus";
		graph.addVertex(a);
		graph.addVertex(b);
		graph.addVertex(c);
		graph.addVertex(m);
		graph.addVertex(r);

		// Alicante
		graph.addArc(a, c, 5);
		graph.addArc(a, m, 5);

		// Barcelona
		graph.addArc(b, c, 3);
		graph.addArc(b, m, 3);
		graph.addArc(b, r, 6);

		// Cartagena
		graph.addArc(c, a, 3);

		// Murcia
		graph.addArc(m, b, 2);

		// Reus
		graph.addArc(r, b, 1);

		System.out.println(graph.toString());
	}
}
