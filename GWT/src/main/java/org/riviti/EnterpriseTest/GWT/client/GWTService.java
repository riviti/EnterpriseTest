package org.riviti.EnterpriseTest.GWT.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

import java.util.List;

@RemoteServiceRelativePath("GWTService")
public interface GWTService extends RemoteService {

    List<OrchestraRegistrationDTO> getRegistrations();

    void saveRegistration(OrchestraRegistrationDTO registration);

    /**
     * Utility/Convenience class.
     * Use GWTService.App.getInstance() to access static instance of GWTServiceAsync
     */
    final class App {
        private static final GWTServiceAsync ourInstance = GWT.create(GWTService.class);

        public static synchronized GWTServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
