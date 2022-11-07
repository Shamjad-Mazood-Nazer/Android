package com.example.loginformques01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class CascadedCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cascaded_calculator);
    }
}

#############################################################################################################################################################

Gridlayout Calculator 

------------------------------------------------------------------- XML Code -------------------------------------------------------------------

<?xml version="1.0" encoding="utf-8"?>
<LinearLayout xmlns:android="http://schemas.android.com/apk/res/android"
    xmlns:app="http://schemas.android.com/apk/res-auto"
    xmlns:tools="http://schemas.android.com/tools"
    android:id="@+id/calculator_mainlay"
    android:layout_width="match_parent"
    android:layout_height="match_parent"
    android:orientation="vertical"
    android:padding="20dp"
    tools:context=".GridlayoutCalculatorActivity">

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="30dp"
        android:hint="Number 01"
        android:inputType="number" />

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:hint="Number 02"
        android:inputType="number" />

    <EditText
        android:layout_width="match_parent"
        android:layout_height="wrap_content"
        android:layout_marginTop="10dp"
        android:clickable="false"
        android:enabled="false"
        android:hint="Result"
        android:inputType="number" />

    <LinearLayout
        android:layout_width="match_parent"
        android:layout_height="match_parent"
        android:gravity="bottom"
        android:orientation="vertical">

        <GridLayout
            android:layout_width="match_parent"
            android:layout_height="wrap_content"
            android:layout_marginTop="10dp"
            android:columnCount="4"
            android:orientation="horizontal"
            android:rowCount="5">

            <Button
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="CE"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="C"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="%"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="/"
                android:textColor="@color/white" />

            <Button
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="7"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="8"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="9"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="x"
                android:textColor="@color/white" />

            <Button
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="4"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="5"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="6"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="-"
                android:textColor="@color/white" />

            <Button
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="1"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="2"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="3"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="+"
                android:textColor="@color/white" />

            <Button
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="+/-"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="0"
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="."
                android:textColor="@color/white" />

            <Button
                android:layout_marginStart="10dp"
                android:layout_marginTop="20dp"
                android:padding="13dp"
                android:text="="
                android:textColor="@color/white" />

        </GridLayout>

    </LinearLayout>


</LinearLayout>

------------------------------------------------------------------- Java Code -------------------------------------------------------------------

package com.example.loginformques01;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class GridlayoutCalculatorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gridlayout_calculator);
    }
}
