package fr.usmb.m1isc.compilation.tp;

public class Noeud {
	private String expr;
	private Object gauche = null;
	private Object droite = null;
	
	
	public Noeud(String expr) {
		this.expr = expr;
	}
	
	public Noeud(String expr, Object g, Object d) {
		this(expr);
		this.gauche = g;
		this.droite = d;
	}
	
	public void setGauche(Object gauche) {
		this.gauche = gauche;
	}
	
	public void setDroite(Object droite) {
		this.droite = droite;
	}
	
	public String toString() {
		if (gauche == null && droite == null) {
			return expr;
		} else {
			return "(" + expr + (gauche != null ? " " + gauche.toString() : "") + (droite != null ? " " + droite.toString() : "") + ")";
		}
	}
}
