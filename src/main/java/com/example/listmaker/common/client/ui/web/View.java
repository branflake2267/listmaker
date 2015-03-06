package com.example.listmaker.common.client.ui.web;

import com.google.gwt.user.client.ui.HasText;
import com.google.gwt.user.client.ui.Image;
import com.google.gwt.user.client.ui.Widget;
import com.example.listmaker.common.client.presenter.Presenter;
import com.turbomanage.gwt.client.Display;

/**
 * Created by Gene on 6/10/2014.
 */
public interface View<P extends Presenter> extends Display {

//    void init();
//
//    void hide();
//
//    void show();

    Widget asWidget();

    void setPresenter(P presenter);
}
