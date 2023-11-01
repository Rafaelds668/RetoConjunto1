package com.example.retoconjunto1;

import com.example.retoconjunto1.model.Producto;
import javafx.fxml.FXML;
import javafx.scene.control.TableColumn;

public class ControllerVP {
    @FXML
    private TableColumn<Producto, Integer> tableID;
    @FXML
    private TableColumn<Producto, String> tableProduct;
    @FXML
    private TableColumn<Producto, Integer> tablePrice;
    @FXML
    private TableColumn<Producto, Integer> tableAvialable;
}
