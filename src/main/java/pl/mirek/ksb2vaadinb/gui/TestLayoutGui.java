package pl.mirek.ksb2vaadinb.gui;

import com.vaadin.flow.component.applayout.AppLayout;
import com.vaadin.flow.component.applayout.DrawerToggle;
import com.vaadin.flow.component.html.Image;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.tabs.Tab;
import com.vaadin.flow.component.tabs.Tabs;
import com.vaadin.flow.router.Route;

@Route("test")
public class TestLayoutGui extends VerticalLayout {

    public TestLayoutGui() {

        AppLayout appLayout = new AppLayout();
        appLayout.setPrimarySection(AppLayout.Section.DRAWER);
        Image img = new Image("https://i.imgur.com/GPpnszs.png", "Vaadin Logo");
        img.setHeight("44px");
        appLayout.addToNavbar(new DrawerToggle(), img);
        Tab home = new Tab("Home");
        Tab about = new Tab("O mnie");
        Tab galery = new Tab("Galeria");

        Tabs tabs = new Tabs(home, about, galery);
        tabs.setOrientation(Tabs.Orientation.VERTICAL);
        appLayout.addToDrawer(tabs);
        add(appLayout);
    }
}
