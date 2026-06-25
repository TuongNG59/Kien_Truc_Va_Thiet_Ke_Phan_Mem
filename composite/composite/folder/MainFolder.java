package structural.composite.folder;

public class MainFolder {
    public static void main(String[] args) {
        AbstractFile data = new Folder("D:","20/06/2025");
        AbstractFile tl = new Folder("TaiLieu","20/06/2025");
        AbstractFile dp = new Folder("Design Pattern","20/06/2025");
        AbstractFile jv = new Folder("Lap Trinh Java","20/06/2025");
        AbstractFile android = new Folder("LapTrinhThietBiDiDong","20/06/2025");
        AbstractFile create = new File("CreationalPattern.pptx","20/06/2025");
        AbstractFile struct = new File("StructuralPattern.pptx","20/06/2025");
        AbstractFile java = new File("LapTrinhJavaCoBan.docx","20/06/2025");
        AbstractFile javanc = new File("LapTrinhJavaNangCao.pdf","20/06/2025");
        AbstractFile NNC = new File("NgonNguLapTrinhC.pdf","20/06/2025");
        AbstractFile androidcb = new File("CoBan.pptx","20/06/2025");
        AbstractFile androidnc = new File("NangCao.pptx","20/06/2025");
        data.addItem(tl);
        tl.addItem(dp);
        tl.addItem(jv);
        tl.addItem(NNC);
        tl.addItem(android);
        dp.addItem(create);
        dp.addItem(struct);
        jv.addItem(java);
        jv.addItem(javanc);
        android.addItem(androidcb);
        android.addItem(androidnc);
        System.out.println(data.getTreeFolder(""));
        System.out.println(android.getPath());
        System.out.println(jv.getTreeFolder(""));
    }
}
