package com.example.simplemvp.data.source.local;

import com.example.simplemvp.data.Task;
import com.example.simplemvp.data.source.TaskDataSource;

public class TaskLocalDataSource implements TaskDataSource {
    @Override
    public void getTask(TaskCallBack callBack) {

        Task task = new Task("myTitle","myDetails");
        callBack.onTaskLoadedFromDb(task); // this task should be fetched from the db
    }
}
