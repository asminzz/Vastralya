package vastralaya.clotheswear.entity;

import java.io.Serializable;

public class Cloth implements Serializable {
    private int id;
    private String title;
    private String description;
    private String imageName;
    private int size;

    public Cloth() {
    }

    public Cloth(int id, String title, String description, String imageName) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.imageName = imageName;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImageName() {
        return imageName;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }
}
