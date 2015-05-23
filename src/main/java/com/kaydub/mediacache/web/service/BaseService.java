
package com.kaydub.mediacache.web.service;


import java.util.List;

/**
 *
 * @author Kevin W
 */
public interface BaseService<E, K> {
    
    public E getByID(K id);
    
    public List<E> getAll();

}
