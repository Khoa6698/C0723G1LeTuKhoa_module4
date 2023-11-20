package com.example.bai_tap_1.repository;

import com.example.bai_tap_1.model.Product;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.ArrayList;
import java.util.List;

@Repository
@Transactional
public class ProductRepository implements IProductRepository {
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Product> findAll() {
        List<Product> list = new ArrayList<>();
        TypedQuery<Product> query = entityManager.createQuery("from Product ", Product.class);
        list = query.getResultList();
        return list;
    }

    @Override
    public void save(Product product) {
        entityManager.persist(product);
    }

    @Override
    public Product findById(int id) {
        Product product = entityManager.find(Product.class, id);
        return product;
    }

    @Override
    public void update(int id, Product product) {
        Product productEdit = findById(id);
        productEdit.setName(product.getName());
        productEdit.setPrice(product.getPrice());
        productEdit.setBrand(product.getBrand());
        entityManager.merge(productEdit);
    }

    @Override
    public void remove(int id) {
        Product product = findById(id);
        entityManager.remove(product);
    }


    @Override
    public List<Product> findByName(String name) {
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p where p.name like :name", Product.class);
        query.setParameter("name",name);
        return query.getResultList();
    }
}
