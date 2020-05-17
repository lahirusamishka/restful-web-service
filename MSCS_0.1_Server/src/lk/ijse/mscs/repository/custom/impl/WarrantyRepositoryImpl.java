/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lk.ijse.mscs.repository.custom.impl;

import java.util.List;
import lk.ijse.mscs.entity.Warranty;
import lk.ijse.mscs.repository.custom.WarrantyRepository;
import org.hibernate.Session;

/**
 *
 * @author samishka
 */
public class WarrantyRepositoryImpl implements WarrantyRepository {

    private Session session;

    @Override
    public void setSession(Session session) {
        this.session = session;
    }

    @Override
    public boolean save(Warranty t) throws Exception {
        return (session.save(t) != null);
    }

    @Override
    public boolean delete(Warranty t) throws Exception {
        session.delete(t);
        return true;
    }

    @Override
    public boolean update(Warranty t) throws Exception {
        session.update(t);
        return true;
    }

    @Override
    public Warranty findById(String id) throws Exception {
        return session.get(Warranty.class, id);
    }

    @Override
    public List<Warranty> findAll() throws Exception {
        return session.createQuery("From Warranty").list();
    }

}
