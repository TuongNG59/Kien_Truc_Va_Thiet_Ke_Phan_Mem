package structural.composite.folder;

public class File extends AbstractFile{
    public File(String name, String dateCreated) {
        super(name, dateCreated);
    }

    @Override
    public String getPath() {
        return super.getPath();
    }

    @Override
    public String getTreeFolder(String preStr) {
        return preStr + name;
    }

    @Override
    public void addItem(AbstractFile item) {

    }

    @Override
    public void removeItem(AbstractFile item) {

    }
}
