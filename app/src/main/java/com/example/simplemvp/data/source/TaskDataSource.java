package com.example.simplemvp.data.source;

import com.example.simplemvp.data.Task;

public interface TaskDataSource {

    interface TaskCallBack{
        void onTaskLoadedFromDb(Task task);
    }

    void getTask(TaskCallBack callBack);
}
