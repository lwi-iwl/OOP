package by.bsuir.oop.lab.shapes;

import java.awt.*;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;
import java.util.stream.Collectors;

public abstract class Shape implements Serializable {
    public abstract void draw(Graphics g);
    public abstract void setParams(ArrayList<Integer> params, int size, Color color, Color fill);

    public static List<Shape> getServices(ModuleLayer layer) {
        return ServiceLoader
                .load(layer, Shape.class)
                .stream()
                .map(ServiceLoader.Provider::get)
                .collect(Collectors.toList());
    }
}
