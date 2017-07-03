package br.com.mfelipesp.angularws.models;

import java.io.Serializable;

public class Foto implements Serializable {
	
	private int id;
	private String titulo;
	private String url;
	
	public Foto() {
	}
	
	public Foto(int id, String titulo, String url) {
		this.id = id;
		this.titulo = titulo;
		this.url = url;
	}

	public int getId() {
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	@Override
	public String toString() {
		return "Foto [id=" + id + ", titulo=" + titulo + ", url=" + url + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + id;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Foto other = (Foto) obj;
		if (id != other.id)
			return false;
		return true;
	}
	
	

}
