package org.riviti.org.EnterpriseTest.GWT.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

import java.util.List;

public interface GWTServiceAsync {

    void getMessages(AsyncCallback<List<OrchestraRegistrationDTO>> async);

    void saveRegistration(OrchestraRegistrationDTO registration, AsyncCallback<Void> async);
}