package org.riviti.EnterpriseTest.Common;

import javax.ejb.Remote;
import java.util.List;

@Remote
public interface OrchestraRegistrationHandler {

    List<OrchestraRegistration> getMessages();

    void createRegistration(OrchestraRegistration registration);
}
