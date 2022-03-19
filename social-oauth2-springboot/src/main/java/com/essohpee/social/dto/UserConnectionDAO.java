package com.essohpee.social.dto;

import com.essohpee.social.entity.AppUserConnection;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;
import javax.persistence.Query;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserConnectionDAO {

    @Autowired
    private EntityManager entityManager;

    public AppUserConnection findUserConnectionByUserProviderId(String userProviderId) {
        try {
            String sql = "Select e from " + AppUserConnection.class.getName() + " e " //
                    + " Where e.userProviderId = :userProviderId ";

            Query query = entityManager.createQuery(sql, AppUserConnection.class);
            query.setParameter("userProviderId", userProviderId);

            @SuppressWarnings("unchecked")
            List<AppUserConnection> list = query.getResultList();

            return list.isEmpty() ? null : list.get(0);
        } catch (NoResultException e) {
            return null;
        }
    }
}
