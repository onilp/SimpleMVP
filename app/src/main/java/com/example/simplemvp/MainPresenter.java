package com.example.simplemvp;

import com.example.simplemvp.data.Task;
import com.example.simplemvp.data.source.TaskDataSource;
import com.example.simplemvp.data.source.local.TaskLocalDataSource;

public class MainPresenter implements MainContract.Presenter, TaskDataSource.TaskCallBack {

MainContract.View view;
    TaskDataSource taskDataSource;

    public MainPresenter(MainActivity mainActivity) {
        taskDataSource = new TaskLocalDataSource();
        view = mainActivity;
    }

    @Override
    public void buttonClicked(String name) {
        taskDataSource.getTask(this);

    }

    @Override
    public void onTaskLoadedFromDb(Task task) {
        view.showToast(task.getDetail());
    }
}