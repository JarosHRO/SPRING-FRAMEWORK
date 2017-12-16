/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repository;

/**
 *
 * @author Jairo
 */
public interface Repository<T,ID> {
    
    void save(T entity);
    T findById(ID id);
    
}
