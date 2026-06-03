package com.company.test_jmix.view.orders;

import com.company.test_jmix.entity.Orders;
import com.company.test_jmix.view.main.MainView;
import com.vaadin.flow.router.Route;
import io.jmix.flowui.view.*;

@Route(value="orderss/:id", layout=MainView.class)
@ViewController(id = "Orders.detail")
@ViewDescriptor(path = "orders-detail-view.xml")
@EditedEntityContainer("ordersDc")
public class OrdersDetailView extends StandardDetailView<Orders> {}