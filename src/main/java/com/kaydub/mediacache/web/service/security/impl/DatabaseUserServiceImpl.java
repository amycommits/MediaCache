
package com.kaydub.mediacache.web.service.security.impl;

import com.kaydub.mediacache.web.beans.security.UserBean;
import com.kaydub.mediacache.web.data.dao.security.UserRepository;
import com.kaydub.mediacache.web.data.entities.security.User;
import com.kaydub.mediacache.web.service.security.UserService;
import java.util.List;
import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author Kevin W.
 */
public class DatabaseUserServiceImpl implements UserService {
    
    @Autowired
    UserRepository repo;
    
    @Autowired
    DozerBeanMapper mapper;


    @Override
    public void updateEntity(UserBean entity) {
        User newentity = new User();
        mapper.map(entity, newentity);
        repo.save(newentity);
    }

    @Override
    public void deleteEntity(UserBean entity) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void deleteByID(String id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public UserBean getByID(String id) {
        UserBean newentity = new UserBean();
        mapper.map(repo.findOne(id), newentity);
        return newentity;
    }

    @Override
    public List<UserBean> getAll() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
