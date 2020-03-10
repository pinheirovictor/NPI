package quixada.npi.springproject.service;


import org.springframework.stereotype.Service;
import quixada.npi.springproject.model.Usuario;

import java.util.List;
@Service
public interface UsuarioService {

    Usuario save(Usuario usuario);

    Usuario findById(Integer id);

    Usuario findByEmail(String email);

    List<Usuario> findAll();

    void deleteById(Integer id);
}
