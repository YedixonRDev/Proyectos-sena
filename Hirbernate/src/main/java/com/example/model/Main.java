package com.example.model;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {
        // Configurar la sesión de Hibernate
        SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        // Obtener una sesión de Hibernate
        try (Session session = sessionFactory.openSession()) {
            // Operaciones de Hibernate, por ejemplo, guardar un producto
            session.beginTransaction();

            Producto producto = new Producto();
            producto.setNombre("Ejemplo Producto");
            producto.setPrecio(19.99);

            session.save(producto);

            session.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Cerrar la sesión de Hibernate
            sessionFactory.close();
        }
    }
}

