package structural.composite.folder;

public abstract class AbstractFile {
    String name, dateCreated, path;

    public AbstractFile(String name, String dateCreated) {
        this.name = name;
        this.dateCreated = dateCreated;
        this.path = name;
    }
    public abstract String getTreeFolder(String preStr);

    public String getPath() {
        return path;
    }
    public abstract void addItem(AbstractFile item);
    public abstract void removeItem(AbstractFile item);
}
