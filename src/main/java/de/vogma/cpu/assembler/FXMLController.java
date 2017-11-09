/*
 * The MIT License
 *
 * Copyright 2017 Your Organisation.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package de.vogma.cpu.assembler;

import de.vogma.cpu.assembler.model.InstructionSet;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class FXMLController implements Initializable {

    private Parser parser;

    @FXML
    private Label label;

    @FXML
    private TextArea hexEditor;

    @FXML
    private TextArea codeEditor;

    @FXML
    private void handleButtonAction(ActionEvent event) {
        System.out.println("You clicked me!");
        label.setText(InstructionSet.MOV.hex());

    }

    @FXML
    private void parsePressed(ActionEvent event) {
        String s = codeEditor.getText();
        hexEditor.setText(parser.parse(s));
        System.err.println("----Parse pressed-----");
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        init();
    }

    private void init() {
        parser = new Parser();
        codeEditor.setOnKeyPressed(new EventHandler<KeyEvent>() {
            @Override
            public void handle(KeyEvent event) {
                if (event.getCode() == KeyCode.ENTER && event.isControlDown()) {
                    System.err.println("----Parse Shourtcut Pressed-----");
                    String s = codeEditor.getText();
                    hexEditor.setText(parser.parse(s));
                    System.err.println(Integer.toString(16, 2));
                }
            }
        });
    }
}
