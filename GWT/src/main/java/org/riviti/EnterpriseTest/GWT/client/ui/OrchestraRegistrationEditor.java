package org.riviti.EnterpriseTest.GWT.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.SimpleBeanEditorDriver;
import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.uibinder.client.UiHandler;
import com.google.gwt.user.client.ui.*;
import org.riviti.EnterpriseTest.GWT.client.OrchestraRegistrationDTO;


public class OrchestraRegistrationEditor extends Composite implements RegistrationView {
    private static final Binder binder = GWT.create(Binder.class);
    @UiField
    TextBox fullName;
    @UiField
    TextBox shortName;
    @UiField
    CheckBox shortNameUsageAllowed;
    @UiField
    IntegerBox sofVisitationCount;
    @UiField
    TextBox lookingForwardToDescription;
    @UiField
    TextBox favouriteMusicDescription;
    @UiField
    TextBox bestOrchestraMemory;
    @UiField
    TextBox concertRitualDescription;
    @UiField
    TextBox threeDescriptiveWords;

    private RegistrationPresenter presenter;

    public OrchestraRegistrationEditor() {
        Widget rootWidget = binder.createAndBindUi(this);
        initWidget(rootWidget);
    }

    @Override
    public SimpleBeanEditorDriver<OrchestraRegistrationDTO, RegistrationView> createEditorDriver() {
        return GWT.create(Driver.class);
    }

    @UiHandler("fullName")
    void fullNameChanged(ChangeEvent event) {
        presenter.fullNameChanged(event);
        presenter.valueChanged();
    }

    @UiHandler("shortName")
    void shortNameChanged(ChangeEvent event) {
        presenter.shortNameChanged(event);
        presenter.valueChanged();
    }

    @UiHandler("shortNameUsageAllowed")
    void shortNameUsageAllowedChanged(ClickEvent event) {
        presenter.shortNameUsageAllowedChanged(event);
        presenter.valueChanged();
    }

    public void setPresenter(RegistrationPresenter presenter) {
        this.presenter = presenter;
    }

    public String getFullName() {
        return fullName.getText();
    }

    public void setShortName(String shortName) {
        this.shortName.setText(shortName);
    }

    interface Driver extends SimpleBeanEditorDriver<OrchestraRegistrationDTO, OrchestraRegistrationEditor> {
    }

    interface Binder extends UiBinder<Widget, OrchestraRegistrationEditor> {
    }
}