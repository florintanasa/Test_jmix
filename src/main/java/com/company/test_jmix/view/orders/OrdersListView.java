package com.company.test_jmix.view.orders;
import com.company.test_jmix.entity.Orders;
import com.company.test_jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value="orderss", layout=MainView.class)
@ViewController(id = "Orders.list")
@ViewDescriptor(path = "orders-list-view.xml")
@LookupComponent("orderssDataGrid")
@DialogMode(width = "64em")
public class OrdersListView extends StandardListView<Orders> {}