package com.example.listmaker.app.client.ui.mobile;

import com.example.listmaker.common.client.ui.web.ViewImpl;
import com.example.listmaker.common.domain.Contact;
import com.google.gwt.core.client.GWT;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Widget;
import com.sencha.gxt.widget.core.client.form.TextField;

/**
 * Created by david on 3/10/15.
 */
public class ContactDetailViewImpl extends ViewImpl<ContactDetailView.Delegate> implements ContactDetailView {

    interface ContactDetailViewImplUiBinder extends UiBinder<Widget, ContactDetailViewImpl> {}
    private static ContactDetailViewImplUiBinder ourUiBinder = GWT.create(ContactDetailViewImplUiBinder.class);

    public ContactDetailViewImpl() {
        initWidget(ourUiBinder.createAndBindUi(this));
    }

    @UiField
    public TextField firstName;
    @UiField
    public TextField lastName;
    @UiField
    public TextField email;

    @Override
    public Contact getContact() {
        return null;
    }

    @Override
    public void setContact(Contact contact) {

    }
}