package com.rating.application.Entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "theme_collection")
public class ThemeCollectionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_theme_collection")
    private Integer id;

    @Column(name = "theme_collection_Name")
    private String name;

    @OneToMany(mappedBy = "themeCollectionEntity", fetch = FetchType.EAGER)
    private Set<CollectionEntity> collectionEntities = new HashSet<CollectionEntity>();

    public ThemeCollectionEntity() {
    }

    public ThemeCollectionEntity(String name, Set<CollectionEntity> collectionEntities) {
        this.name = name;
        this.collectionEntities = collectionEntities;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<CollectionEntity> getCollectionEntities() {
        return collectionEntities;
    }

    public void setCollectionEntities(Set<CollectionEntity> collectionEntities) {
        this.collectionEntities = collectionEntities;
    }

}
