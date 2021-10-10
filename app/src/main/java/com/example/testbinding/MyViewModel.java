package com.example.testbinding;

import android.view.View;
import android.widget.Button;
import android.widget.QuickContactBadge;

import androidx.databinding.Bindable;
import androidx.databinding.Observable;
import androidx.databinding.ObservableBoolean;
import androidx.databinding.ObservableField;
import androidx.databinding.ObservableInt;
import androidx.lifecycle.ViewModel;

import static android.view.View.GONE;
import static android.view.View.VISIBLE;

public class MyViewModel extends ViewModel
{
    //Переменная к которой будет привязано свойство видимости кнопки
    //boolean visible = true;

    public ObservableBoolean visible = new ObservableBoolean();


    //Метод который будет привязан к кнопке, то есть выполняется по нажатию
    public void Button_OnClick()
    {
        if(this.visible.get())
        {
            this.visible.set(false);
        }
        else
        {
            this.visible.set(true);
        }
    }
    public Button.OnClickListener butOnClickList = new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Button_OnClick();
            /*if(v.getId() == R.id.myButton)
            {

            }*/
        }
    };

    public MyViewModel()
    {
        this.visible.set(true);
    }

}
