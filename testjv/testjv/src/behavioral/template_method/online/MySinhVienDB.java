package behavioral.template_method.online;

public class MySinhVienDB extends ObjectDB<MySinhVien>{
    public MySinhVienDB(){}
    @Override
    public int getID(MySinhVien mySinhVien) {
        return mySinhVien.getMaSV();
    }

    @Override
    MySinhVien findID(int id) {
        return super.findID(id);
    }

    @Override
    public void add(MySinhVien mySinhVien) {
        super.add(mySinhVien);
    }

    @Override
    public void update(MySinhVien mySinhVien) {
        super.update(mySinhVien);
    }

    @Override
    public void deleteByID(int id) {
        super.deleteByID(id);
    }

    @Override
    public String toString() {
        return "MySinhVienDB{" +
                "list=" + list +
                '}';
    }
}
