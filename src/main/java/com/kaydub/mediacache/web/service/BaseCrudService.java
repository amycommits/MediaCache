
package com.kaydub.mediacache.web.service;

/**
 *
 * @author Kevin W
 */
public interface BaseCrudService<E,K> extends BaseService<E,K> {

    public void updateEntity(E entity);
    
    public void deleteEntity(E entity);
    
    public void deleteByID(K id);
    
    
}
