package org.riviti.EnterpriseTest.GWT.client.ui;

import com.google.gwt.editor.client.Editor;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import org.riviti.EnterpriseTest.GWT.client.OrchestraRegistrationDTO;

public interface RegistrationView extends Editor<OrchestraRegistrationDTO> {
    void setShortName(String shortName);

    String getFullName();

    void setPresenter(RegistrationPresenter registrationPresenter);

    SimpleBeanEditorDriver<OrchestraRegistrationDTO, RegistrationView> createEditorDriver();
}
