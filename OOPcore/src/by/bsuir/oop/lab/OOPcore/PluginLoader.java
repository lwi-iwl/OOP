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
        Path pluginsDir = Paths.get("OOPcore/plugins");
        ModuleFinder pluginsFinder = ModuleFinder.of(pluginsDir);

        Set<ModuleReference> all = pluginsFinder
                .findAll();
        List<String> plugins = all
                .stream()
                .map(ModuleReference::descriptor)
                .map(ModuleDescriptor::name)
                .collect(Collectors.toList());

        Configuration pluginsConfiguration = ModuleLayer
                .boot()
                .configuration()
                .resolve(pluginsFinder, ModuleFinder.of(), plugins);

        ModuleLayer layer = ModuleLayer
                .boot()
                .defineModulesWithOneLoader(pluginsConfiguration, ClassLoader.getSystemClassLoader());
        return ShapeFactory.getServices(layer);

    }

    public List<Shape> getEveryShape() {
        Path pluginsDir = Paths.get("OOPcore/plugins");
        ModuleFinder pluginsFinder = ModuleFinder.of(pluginsDir);

        List<String> plugins = pluginsFinder
                .findAll()
                .stream()
                .map(ModuleReference::descriptor)
                .map(ModuleDescriptor::name)
                .collect(Collectors.toList());

        Configuration pluginsConfiguration = ModuleLayer
                .boot()
                .configuration()
                .resolve(pluginsFinder, ModuleFinder.of(), plugins);

        ModuleLayer layer = ModuleLayer
                .boot()
                .defineModulesWithOneLoader(pluginsConfiguration, ClassLoader.getSystemClassLoader());
        return Shape.getServices(layer);
    }
}