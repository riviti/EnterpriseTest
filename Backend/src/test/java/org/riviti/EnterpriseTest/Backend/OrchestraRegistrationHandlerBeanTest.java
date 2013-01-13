package org.riviti.EnterpriseTest.Backend;

import org.riviti.EnterpriseTest.Common.OrchestraRegistration;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import java.util.Collections;
import java.util.List;

import static org.mockito.Mockito.*;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class OrchestraRegistrationHandlerBeanTest {

    private OrchestraRegistrationHandlerBean beanUnderTest;

    private EntityManager mockedEntityManager;

    @BeforeMethod
    public void setUp() throws Exception {
        beanUnderTest = new OrchestraRegistrationHandlerBean();
        mockedEntityManager = mock(EntityManager.class);
        beanUnderTest.setEntityManager(mockedEntityManager);
    }

    @Test
    public void savesRegistration() {

        OrchestraRegistration registration = new OrchestraRegistration();
        beanUnderTest.createRegistration(registration);

        verify(mockedEntityManager).merge(registration);
        verifyNoMoreInteractions(mockedEntityManager);
    }

    @Test
    public void returnsAllRegistrations() {
        final OrchestraRegistration expected = new OrchestraRegistration();

        TypedQuery<OrchestraRegistration> mockQuery = getQueryThatReturnsList(Collections.singletonList(expected));
        when(mockedEntityManager.createQuery(anyString(), eq(OrchestraRegistration.class))).thenReturn(mockQuery);

        List<OrchestraRegistration> actualRegistrations = beanUnderTest.getRegistrations();

        assertNotNull(actualRegistrations, "OrchestraRegistrationHandlerBean.getRegistrations returned null.");
        assertEquals(actualRegistrations.size(), 1, "Wrong number of registrations");

        OrchestraRegistration actual = actualRegistrations.get(0);
        assertEquals(actual, expected, "Wrong registration returned");
    }

    private <TResult> TypedQuery<TResult> getQueryThatReturnsList(List<TResult> list) {
        // Only raw types can be mocked, but we don't want to use raw types everywhere
        @SuppressWarnings("unchecked")
        TypedQuery<TResult> mockQuery = mock(TypedQuery.class);
        when(mockQuery.getResultList()).thenReturn(list);
        return mockQuery;
    }
}
