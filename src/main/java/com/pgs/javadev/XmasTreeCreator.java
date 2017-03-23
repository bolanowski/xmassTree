package com.pgs.javadev;


import com.pgs.javadev.builder.TreeBuilder;
import com.pgs.javadev.builder.TreeBuilderFactory;
import com.pgs.javadev.common.IOHandler;
import com.pgs.javadev.model.Configuration;
import com.pgs.javadev.ui.MainView;

import java.util.ArrayList;
import java.util.List;

public class XmasTreeCreator {

    public void createXmasTree() {
        IOHandler ioHandler = new IOHandler();
        Configuration conf = getXmasTreeConfiguration(ioHandler);
        printXmasTree(ioHandler, conf);
    }

    private Configuration getXmasTreeConfiguration(final IOHandler ioHandler) {
        MainView view = new MainView(ioHandler);
        return view.getConfiguration();
    }

    private void printXmasTree(final IOHandler ioHandler, final Configuration conf) {
        TreeBuilder treeBuilder = TreeBuilderFactory.getTreeBuilder(conf.getDirection());
        String xmasTree = treeBuilder.build(conf.getLeaf(), conf.getHeight());
        ioHandler.println(xmasTree);
    }

}


