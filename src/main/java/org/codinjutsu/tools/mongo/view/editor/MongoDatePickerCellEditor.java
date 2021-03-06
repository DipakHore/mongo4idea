/*
 * Copyright (c) 2013 David Boissier
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.codinjutsu.tools.mongo.view.editor;

import org.codinjutsu.tools.mongo.view.style.DarculaStyleAttributesProvider;
import org.jdesktop.swingx.JXMonthView;
import org.jdesktop.swingx.event.DateSelectionListener;
import org.jdesktop.swingx.table.DatePickerCellEditor;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.text.DateFormat;

public class MongoDatePickerCellEditor extends DatePickerCellEditor {

    private static Color backgroundColor = new JPanel().getBackground();
    private static Color foregroundColor = new JPanel().getForeground();
    private static Color selectionBackgroundColor = Color.LIGHT_GRAY;
    private static Color selectionForegroundColor = Color.BLACK;
    private static Color monthForegroundColor = DarculaStyleAttributesProvider.BLUE;
    private static Color dayOfTheWeekForegroundColor = DarculaStyleAttributesProvider.ORANGE;
    private static Color todayBackgroundColor = Color.WHITE;


    public MongoDatePickerCellEditor() {
        this.datePicker.getEditor().setEditable(false);
        applyUIStyle();
    }

    public void addActionListener(ActionListener actionListener) {
        datePicker.addActionListener(actionListener);
    }

    private void applyUIStyle() {
        JXMonthView monthView = this.datePicker.getMonthView();
        monthView.setMonthStringBackground(backgroundColor);
        monthView.setMonthStringForeground(monthForegroundColor);
        monthView.setSelectionBackground(selectionBackgroundColor);
        monthView.setSelectionForeground(selectionForegroundColor);
        monthView.setDaysOfTheWeekForeground(dayOfTheWeekForegroundColor);
        monthView.setBackground(backgroundColor);
        monthView.setForeground(foregroundColor);
        monthView.setTodayBackground(todayBackgroundColor);
    }
}
