package quixada.npi.springproject.model;


import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Collection;

@Entity
public class Curso implements UserDetails {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idcurso;

    @NotEmpty
    private String nome;

    @NotEmpty
    private Integer cargaHoraria;

    @NotEmpty
    private String turno;

    @NotEmpty
    private String sigla;


    public Curso(){

    }

    public Curso(Integer idcurso, String nome, Integer cargaHoraria, String turno, String sigla){
        this.idcurso = idcurso;
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.turno = turno;
        this.sigla = sigla;
    }

    public Curso(String nome, Integer cargaHoraria, String turno, String sigla){
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.turno = turno;
        this.sigla = sigla;
    }


    public Integer getIdcurso() {
        return idcurso;
    }

    public void setIdcurso(Integer idcurso) {
        this.idcurso = idcurso;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public String getSigla() {
        return sigla;
    }

    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return null;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public String getUsername() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
