package br.com.gerenciamentoprojetos.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Size;

import org.springframework.lang.NonNull;

@Entity(name="usuario")
public class Usuario {
  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;
  
  @NonNull
	@Size(max=50)
  private String nome;
  
  @NonNull
	@Size(max=50)
  private String email;
  
  @NonNull
	@Size(max=14)
  private String cpf;

  @NonNull
  private String senha;

  @NonNull
  public Long getId() {
      return id;
  }

  public void setId(@NonNull Long id) {
      this.id = id;
  }

  @NonNull
  public String getNome() {
      return nome;
  }

  public void setNome(@NonNull String nome) {
      this.nome = nome;
  }

  @NonNull
  public String getEmail() {
      return email;
  }

  public void setEmail(@NonNull String email) {
      this.email = email;
  }

  @NonNull
  public String getCpf() {
      return cpf;
  }

  public void setCpf(@NonNull String cpf) {
      this.cpf = cpf;
  }

  @NonNull
  public String getSenha() {
      return senha;
  }

  public void setSenha(@NonNull String senha) {
      this.senha = senha;
  }
}
