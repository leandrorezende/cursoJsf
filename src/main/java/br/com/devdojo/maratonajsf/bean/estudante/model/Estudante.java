package br.com.devdojo.maratonajsf.bean.estudante.model;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import static java.util.Arrays.asList;

import javax.inject.Named;

import br.com.devdojo.maratonajsf.bean.estudante.model.enums.Turno;

@Named
public class Estudante implements Serializable{
	private Integer id;
	private String nome = "Willian";
	private String sobrenome = "Suane";
	private double nota1 = 20;
	private double nota2;
	private double nota3 = 10;
	private Turno turno = Turno.MATUTINO;
	private String email;
	private transient boolean editing;

	public Estudante() {
		super();
	}
	
	public Estudante(String nome, String sobrenome, double nota1) {
		super();
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nota1 = nota1;
	}
	
	public Estudante(Integer id, String nome, String sobrenome, double nota1) {
		super();
		this.id = id;
		this.nome = nome;
		this.sobrenome = sobrenome;
		this.nota1 = nota1;
	}
	
	public static List<Estudante> estudanteList(){
		return new ArrayList<>(asList(new Estudante(1,"Ikki","Fenix",10),
				new Estudante(2,"Shiryu","Dragao",10),
				new Estudante(3,"Seiya","Pegaus",10))) ;
	}

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
	public double getNota3() {
		return nota3;
	}
	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}
	public Turno getTurno() {
		return turno;
	}
	public void setTurno(Turno turno) {
		this.turno = turno;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public boolean isEditing() {
		return editing;
	}
	
	public void setEditing(boolean editing) {
		this.editing = editing;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((email == null) ? 0 : email.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((nome == null) ? 0 : nome.hashCode());
		long temp;
		temp = Double.doubleToLongBits(nota1);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota2);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		temp = Double.doubleToLongBits(nota3);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((sobrenome == null) ? 0 : sobrenome.hashCode());
		result = prime * result + ((turno == null) ? 0 : turno.hashCode());
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
		Estudante other = (Estudante) obj;
		if (email == null) {
			if (other.email != null)
				return false;
		} else if (!email.equals(other.email))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (nome == null) {
			if (other.nome != null)
				return false;
		} else if (!nome.equals(other.nome))
			return false;
		if (Double.doubleToLongBits(nota1) != Double.doubleToLongBits(other.nota1))
			return false;
		if (Double.doubleToLongBits(nota2) != Double.doubleToLongBits(other.nota2))
			return false;
		if (Double.doubleToLongBits(nota3) != Double.doubleToLongBits(other.nota3))
			return false;
		if (sobrenome == null) {
			if (other.sobrenome != null)
				return false;
		} else if (!sobrenome.equals(other.sobrenome))
			return false;
		if (turno != other.turno)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Estudante [nome=" + nome + ", sobrenome=" + sobrenome + ", turno=" + turno + ", email=" + email + "]";
	}
}
