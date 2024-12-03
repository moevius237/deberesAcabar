package org.example.service;

import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.example.Entity.Usuarios;
import org.example.dao.JuegosDao;
import org.example.dao.UsuarioDao;
import org.example.util.HibernateUtil;
import org.hibernate.Hibernate;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;

import java.util.List;

public class UsuarioService implements UsuarioDao {


    @Override
    public void tiempoJuegoUsuarios(long idMesa) {
        try (Session session = HibernateUtil.getSession().openSession()){
        }
    }

    @Override
    public List<Usuarios> saldoUsuario() {
        try (Session session = HibernateUtil.getSession().openSession()){
            try {
                CriteriaBuilder builder  = session.getCriteriaBuilder();
                CriteriaQuery<Usuarios> usuariosCriteriaQuery = builder.createQuery(Usuarios.class);
                Root<Usuarios> usuariosRoot = usuariosCriteriaQuery.from(Usuarios.class);
                usuariosCriteriaQuery.select(usuariosRoot.get("saldo"))
                        .groupBy(builder.gt(usuariosRoot.get("saldo"),1000));
                return session.createQuery(usuariosCriteriaQuery).getResultList();
            }catch (HibernateException e){
                e.getStackTrace();
            }
        }
        return null;
    }

    @Override
    public void plusUsuario(Usuarios usuarios) {
        try (Session session = HibernateUtil.getSession().openSession()){
            Transaction tr = null;
            try {
                session.beginTransaction();
                session.persist(usuarios);
                tr.commit();
            }catch (HibernateException e){
                e.getStackTrace();
                tr.rollback();
            }
        }
    }
}
