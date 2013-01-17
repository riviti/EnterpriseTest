package org.riviti.EnterpriseTest.GWT.client;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.rpc.AsyncCallback;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.RootPanel;
import org.riviti.EnterpriseTest.GWT.client.ui.OrchestraRegistrationEditor;
import org.riviti.EnterpriseTest.GWT.client.ui.RegistrationPresenter;
import org.riviti.EnterpriseTest.GWT.client.ui.RegistrationPresenterImpl;

/**
 * Entry point classes define <code>onModuleLoad()</code>
 */
public class RegistrationModule implements EntryPoint {

    /**
     * This is the entry point method.
     */
    @Override
    public void onModuleLoad() {
        final Button button = new Button("Register");
        final OrchestraRegistrationEditor editor = new OrchestraRegistrationEditor();

        final OrchestraRegistrationDTO registration = new OrchestraRegistrationDTO();


        RootPanel.get("saveButton").add(button);

        RegistrationPresenter presenter = new RegistrationPresenterImpl(registration, editor);

        RootPanel.get("registrationEditor").add(editor);

        button.addClickHandler(new ClickHandler() {
            @Override
            public void onClick(ClickEvent event) {

                //driver.flush();
                GWTService.App.getInstance().saveRegistration(registration, new AsyncCallback<Void>() {
                    @Override
                    public void onFailure(Throwable caught) {
                    }

                    @Override
                    public void onSuccess(Void result) {
                    }
                });
            }
        });
    }
}
