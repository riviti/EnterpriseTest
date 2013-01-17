package org.riviti.EnterpriseTest.GWT.client.ui;

import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import org.riviti.EnterpriseTest.GWT.client.OrchestraRegistrationDTO;

public class RegistrationPresenterImpl implements RegistrationPresenter {
    private final OrchestraRegistrationDTO registration;
    private final RegistrationView editor;
    private final SimpleBeanEditorDriver<OrchestraRegistrationDTO, RegistrationView> driver;

    public RegistrationPresenterImpl(OrchestraRegistrationDTO registration, RegistrationView editor) {
        this.registration = registration;
        this.editor = editor;
        this.driver = editor.createEditorDriver();
    }

    @Override
    public void fullNameChanged(ChangeEvent event) {
        editor.setShortName(editor.getFullName());
    }

    @Override
    public void shortNameChanged(ChangeEvent event) {
    }

    @Override
    public void valueChanged() {
    }

    @Override
    public void shortNameUsageAllowedChanged(ClickEvent event) {
    }

    @Override
    public void go() {
        editor.setPresenter(this);
        driver.initialize(editor);
        driver.edit(registration);
    }
}
