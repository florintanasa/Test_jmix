package com.company.test_jmix.view.product;

import com.company.test_jmix.entity.Product;
import io.jmix.flowui.view.*;
import com.vaadin.flow.router.Route;

@Route(value = "products", layout = DefaultMainViewParent.class)
@ViewController("ProductListView")
@ViewDescriptor("product-list-view.xml")
@LookupComponent("productsDataGrid")
public class ProductListView extends StandardListView<Product> {
}