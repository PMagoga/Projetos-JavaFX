package org.example.demo;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import org.example.demo.entities.Person;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TesteController implements Initializable {

    @FXML
    private ComboBox<Person> comboBoxPerson;

    private ObservableList<Person> obslist;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<Person> list = new ArrayList<>();
        list.add(new Person(1, "Maria", "maria@gmail.com"));
        list.add(new Person(2, "Joana", "joana@gmail.com"));
        list.add(new Person(3, "Pedro", "pedro@gmail.com"));
        list.add(new Person(4, "Paulo", "paulo@gmail.com"));

        obslist = FXCollections.observableArrayList(list);
        comboBoxPerson.setItems(obslist);
    }
}
