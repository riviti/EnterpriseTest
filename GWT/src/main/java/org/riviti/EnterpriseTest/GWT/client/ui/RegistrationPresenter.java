package org.riviti.EnterpriseTest.GWT.client.ui;

import com.google.gwt.event.dom.client.ChangeEvent;
import com.google.gwt.event.dom.client.ClickEvent;

public interface RegistrationPresenter {
    void fullNameChanged(ChangeEvent event);

    void shortNameChanged(ChangeEvent event);

    void valueChanged();

    void shortNameUsageAllowedChanged(ClickEvent event);

    void go();
}
