package org.riviti.org.EnterpriseTest.GWT.client.ui;

import com.google.gwt.core.client.GWT;
import com.google.gwt.editor.client.Editor;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.*;
import org.riviti.org.EnterpriseTest.GWT.client.OrchestraRegistrationDTO;


public class OrchestraRegistrationEditor extends Composite implements Editor<OrchestraRegistrationDTO> {
    interface OrchestraRegistrationEditorUiBinder extends UiBinder<Widget, OrchestraRegistrationEditor> {
    }

    private static final OrchestraRegistrationEditorUiBinder ourUiBinder = GWT.create(OrchestraRegistrationEditorUiBinder.class);

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

    public OrchestraRegistrationEditor() {
        Widget rootWidget = ourUiBinder.createAndBindUi(this);
        initWidget(rootWidget);
    }
}