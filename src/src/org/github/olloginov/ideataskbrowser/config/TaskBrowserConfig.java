package org.github.olloginov.ideataskbrowser.config;

import com.intellij.util.xmlb.annotations.AbstractCollection;
import com.intellij.util.xmlb.annotations.Property;
import org.github.olloginov.ideataskbrowser.model.TaskSearch;

import java.util.ArrayList;
import java.util.List;

public class TaskBrowserConfig {
    @Property
    @AbstractCollection(elementTag = "search")
    public List<TaskSearch> searches = new ArrayList<TaskSearch>();
}
