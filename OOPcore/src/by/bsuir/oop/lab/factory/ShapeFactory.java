package by.bsuir.oop.lab.factory;

import by.bsuir.oop.lab.shapes.Shape;

import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public abstract class ShapeFactory {

    public abstract Shape getShape();

    public static List<ShapeFactory> getServices(ModuleLayer layer) {
        ServiceLoader<ShapeFactory> load = ServiceLoader
                .load(layer, ShapeFactory.class);
        return load
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }
}

