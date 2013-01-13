package org.riviti.EnterpriseTest.Backend;

import org.riviti.EnterpriseTest.Common.OrchestraRegistration;
import org.riviti.EnterpriseTest.Common.OrchestraRegistrationHandler;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Stateless
public class OrchestraRegistrationHandlerBean implements OrchestraRegistrationHandler {

    private static final Logger logger = LoggerFactory.getLogger(OrchestraRegistrationHandlerBean.class);

    private EntityManager entityManager;

    @Override
    public List<OrchestraRegistration> getRegistrations() {
        TypedQuery<OrchestraRegistration> query = entityManager.createQuery("select m from OrchestraRegistration m", OrchestraRegistration.class);
        return query.getResultList();
    }

    @Override
    public void createRegistration(OrchestraRegistration registration) {
        logger.debug("Creating registration: {}", registration);
        entityManager.merge(registration);
    }

    @PersistenceContext(unitName = "PersistenceUnit")
    public void setEntityManager(EntityManager entityManager) {
        this.entityManager = entityManager;
    }
}
