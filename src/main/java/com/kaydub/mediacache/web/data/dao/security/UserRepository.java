
package com.kaydub.mediacache.web.data.dao.security;

import com.kaydub.mediacache.web.data.entities.security.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author Kevin W
 */
@Repository
@Transactional
public interface UserRepository extends CrudRepository<User, String> {

}
