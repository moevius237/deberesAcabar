package org.example.service;

import org.example.Entity.Usuarios;
import org.example.Juegos;
import org.example.dao.JuegosDao;
import org.example.util.HibernateUtil;
import org.hibernate.Session;
import org.hibernate.query.Query;

import java.util.List;

public class JuegosService implements JuegosDao {
    @Override
    public List<Usuarios> juegosUsuarios(Long juegos) {
        String hqwl = "SELECT * From Usuarios Where juegos_id = ?1";
        try (Session session = HibernateUtil.getSession().openSession()){
            Query<Usuarios> query = session.createQuery(hqwl, Usuarios.class);
            query.setParameter(1,juegos);
            return query.getResultList();

        }
    }
}
