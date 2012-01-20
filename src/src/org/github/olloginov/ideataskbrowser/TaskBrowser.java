package org.github.olloginov.ideataskbrowser;

import com.intellij.openapi.project.Project;
import com.intellij.tasks.Task;
import org.github.olloginov.ideataskbrowser.model.TaskSearchList;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

import javax.swing.*;

public abstract class TaskBrowser {
    public static final String COMPONENT_NAME = "Task Browser";

    @Nullable
    public static TaskBrowser getInstance(Project project) {
        return project == null ? null : project.getComponent(TaskBrowser.class);
    }

    public abstract void importChanges();

    @Nullable
    public abstract Task getSelectedTask();

    @NotNull
    public abstract Project getProject();

    @NotNull
    public abstract JComponent getPanel();

    @NotNull
    public abstract TaskSearchList getSearchList();
}
