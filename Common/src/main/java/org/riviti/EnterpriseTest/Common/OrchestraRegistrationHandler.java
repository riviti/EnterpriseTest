package org.riviti.EnterpriseTest.Common;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface OrchestraRegistrationHandler {

    List<OrchestraRegistration> getRegistrations();

    void createRegistration(OrchestraRegistration registration);
}
