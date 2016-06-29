package hello.repositories;

import hello.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by yeonju on 2016-06-29.
 */
public interface UserRepository extends CrudRepository<User, String> {

}
