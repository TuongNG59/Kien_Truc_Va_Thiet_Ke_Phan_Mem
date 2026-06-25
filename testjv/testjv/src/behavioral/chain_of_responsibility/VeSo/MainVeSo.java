package behavioral.chain_of_responsibility.VeSo;

import java.util.List;

public class MainVeSo {
    public static void main(String[] args) {
        XoSo giaiDacBiet = new GiaiThuong(
                "Giải Đặc Biệt",
                List.of("754612", "654321")
        );

        XoSo giaiNhat = new GiaiThuong(
                "Giải Nhất",
                List.of("54612", "54321")
        );

        XoSo giaiKhuyenKhich = new GiaiThapNhat(
                "Giải Khuyến Khích",
                List.of("4612", "4321")
        );

        giaiDacBiet
                .thietLapKeTiep(giaiNhat)
                .thietLapKeTiep(giaiKhuyenKhich);

        String veSo = "754612";
        System.out.println("Vé: " + veSo);
        System.out.println(giaiDacBiet.doVeSo(veSo));

        veSo = "214612";
        System.out.println("\nVé: " + veSo);
        System.out.println(giaiDacBiet.doVeSo(veSo));

        veSo = "000000";
        System.out.println("\nVé: " + veSo);
        System.out.println(giaiDacBiet.doVeSo(veSo));
    }
}
