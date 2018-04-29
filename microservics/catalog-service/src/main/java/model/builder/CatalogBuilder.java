package model.builder;

import model.Catalog;

final public class CatalogBuilder  {
    private String name;
    private String description;
    private CatalogBuilder() {}

    public static CatalogBuilder newInstance() {
        return new CatalogBuilder();
    }

    public CatalogBuilder withName(String name) {
        this.name = name;
        return this;
    }
    public CatalogBuilder withDescription(String description) {
        this.description = description;
        return this;
    }

    public Catalog build() {
        Catalog catalog = new Catalog();
        catalog.setName(name);
        catalog.setDescription(description);
        return catalog;
    }
}
