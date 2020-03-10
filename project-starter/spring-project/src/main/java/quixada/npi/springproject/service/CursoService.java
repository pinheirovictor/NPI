package quixada.npi.springproject.service;


import org.springframework.stereotype.Service;
import quixada.npi.springproject.model.Curso;

import java.util.List;

@Service
public interface CursoService {
    Curso save(Curso curso);

    Curso findById(Integer id);

    Curso findByNome(String nome);

    List<Curso> findAll();

    void deleteById(Integer id);
}
