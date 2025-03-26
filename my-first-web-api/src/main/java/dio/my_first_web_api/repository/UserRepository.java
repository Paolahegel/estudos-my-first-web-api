package dio.my_first_web_api.repository;

import dio.my_first_web_api.model.User;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    public void save(User usuario) {
        if(usuario.getId() == null) {
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        }else {
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        }
        System.out.println(usuario);
    }
    public void deleteById(Integer id) {
        System.out.printf("DELETE/id - Recebendo o id: %d para excluir um usuário%n", id);
        System.out.println(id);
    }
    public List<User> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<User> usuarios = new ArrayList<>();
        usuarios.add(new User("Joao", "senha"));
        usuarios.add(new User("Paulo", "senha"));
        return usuarios;
    }
    public User findById(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id: %d para localizar um usuário", id));
        return new User("Joao", "senha");
    }
    public User findByLogin(String login) {
        System.out.println(String.format("FIND/login - Recebendo o login: %s", login));
        return new User("Joao", "senha");
    }
}
