/*
Copyright 2021 Ian Haas

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

    http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
 */

package com.mrcodeguy;

import javax.swing.*;
import java.awt.event.*;

public class PostUrlTextFieldActionEventListener implements ActionListener {
    public JTextField urlField;
    public JTextField headersField;

    public PostUrlTextFieldActionEventListener(JTextField url, JTextField headers) {
        urlField = url;
        headersField = headers;
    }

    public void actionPerformed(ActionEvent event) {
        PostURL post = new PostURL();

        System.out.println(post.post(urlField.getText(), headersField.getText()));
    }
}
