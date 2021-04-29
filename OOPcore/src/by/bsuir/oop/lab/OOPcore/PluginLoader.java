package by.bsuir.oop.lab.OOPcore;

import by.bsuir.oop.lab.factory.ShapeFactory;
import by.bsuir.oop.lab.shapes.Shape;

import java.lang.module.Configuration;
import java.lang.module.ModuleDescriptor;
import java.lang.module.ModuleFinder;
import java.lang.module.ModuleReference;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class PluginLoader {

    public List<ShapeFactory> getEveryFactory() {

        ModuleLayer layer = ModuleLayer
                .boot();
        return ShapeFactory.getServices(layer);

    }

    public List<Shape> getEveryShape() {

        ModuleLayer layer = ModuleLayer
                .boot();
        return Shape.getServices(layer);
    }
}