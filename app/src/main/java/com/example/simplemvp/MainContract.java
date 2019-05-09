package com.example.simplemvp;

public interface MainContract {

    interface View{
        void showToast(String name);
    }

    interface Presenter{
        void buttonClicked(String name);
    }
}

