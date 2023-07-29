package ss4_inheritance;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    /*
    Chương trình quản lý nhân viên của một công ty
        + Nhân viên quản lý:
            - Mã (QLYYY, với Y là một số => phải tự động tăng)
            - Họ tên
            - Ngày sinh
            - Địa chỉ
            - Lương cơ bản
            - Hệ số lương
        + Nhân viên sản xuất:
            - Mã (SXYYY, với Y là một số => phải tự động tăng)
            - Họ tên
            - Ngày sinh
            - Địa chỉ
            - Số sản phẩm


    -- CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN --
        1. Thêm mới
            1. Nhân viên quản lý
            2. Nhân viên sản xuất
            3. Trở về menu chính
        2. Cập nhật
        3. Xem danh sách
            1. Nhân viên quản lý
            2. Nhân viên sản xuất
            3. Tất cả nhân viên
            4. Trở về menu chính
        4. Sắp xếp theo lương
            1. Nhân viên quản lý
                1. Tăng dần
                2. Giảm dần
            2. Nhân viên sản xuất
                1. Tăng dần
                2. Giảm dần
            3. Tất cả nhân viên
                1. Tăng dần
                2. Giảm dần
            4. Trở về menu chính
        5. Thoát
     */

    static Scanner scanner = new Scanner(System.in);

    //    static ArrayList<ManagementEmployee> managementEmployees = new ArrayList<>();
//    static ArrayList<ProductionEmployee> productionEmployees = new ArrayList<>();
    static ArrayList<Employee> employees = new ArrayList<>();


    public static void main(String[] args) {
        int choose;
        while (true) {
            do {
                System.out.println("CHƯƠNG TRÌNH QUẢN LÝ NHÂN VIÊN");
                System.out.println("1. Thêm mới");
                System.out.println("2. Cập nhật");
                System.out.println("3. Xem danh sách");
                System.out.println("4. Sắp xếp theo lương");
                System.out.println("5. Thoát");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        menuAddNew();
                        break;
                    case 2:
                        menuUpdate();
                        break;
                    case 3:
                        menuShowList();
                        break;
                    case 4:
                        menuSort();
                        break;
                    case 5:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại");
                }
            } while (choose < 1 || choose > 5);
        }
    }

    private static void menuAddNew() {
        int choose;
        while (true) {
            do {
                System.out.println("THÊM MỚI NHÂN VIÊN");
                System.out.println("1. Nhân viên quản lý");
                System.out.println("2. Nhân viên sản xuất");
                System.out.println("3. Trở về menu chính");


                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        ManagementEmployee managementEmployee = new ManagementEmployee();
                        managementEmployee.input();
                        managementEmployee.setId(getIdManagement());
                        employees.add(managementEmployee);
                        System.out.println("Thêm mới thành công");
                        break;
                    case 2:
                        // Code logic tại đây
                        break;
                    case 3:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại");
                }
            } while (choose < 1 || choose > 3);
        }
    }

    private static ArrayList<ManagementEmployee> getManagementEmployees() {
        ArrayList<ManagementEmployee> managementEmployees = new ArrayList<>();
        for(int i = 0; i < employees.size(); i++) {
            if(employees.get(i) instanceof ManagementEmployee) {
                managementEmployees.add((ManagementEmployee) employees.get(i));
            }
        }

        return managementEmployees;
    }

    private static String getIdManagement() {
        ArrayList<ManagementEmployee> managementEmployees = getManagementEmployees();
        // max id => id + 1
        if (managementEmployees.size() == 0) {
            return "QL001";
        }

        int max = Integer.parseInt(managementEmployees.get(0).getId().substring(2));

        for (int i = 0; i < managementEmployees.size(); i++) {
            int id = Integer.parseInt(managementEmployees.get(i).getId().substring(2));
            if (max < id) {
                max = id;
            }
        }

        return String.format("QL%3d", max + 1).replace(" ", "0");
    }

    private static void menuUpdate() {
        System.out.print("Nhập vào mã muốn cập nhật: ");
        String id = scanner.nextLine();

        if (id.startsWith("QL")) {
            boolean isExistEmployee = false;
            for (int i = 0; i < employees.size(); i++) {
                if (employees.get(i).getId().equals(id) && employees.get(i) instanceof ManagementEmployee) {
                    isExistEmployee = true;
                    employees.get(i).input();
                    System.out.println("Cập nhật thành công!");
                    break;
                }
            }

            if (!isExistEmployee) {
                System.out.println("Không tìm thấy mã muốn cập nhật!");
            }
        } else if (id.startsWith("SX")) {

        } else {
            System.out.println("Mã không hợp lệ!");
        }
    }

    private static void menuShowList() {
        int choose;
        while (true) {
            do {
                System.out.println("DANH SÁCH NHÂN VIÊN");
                System.out.println("1. Nhân viên quản lý");
                System.out.println("2. Nhân viên sản xuất");
                System.out.println("3. Tất cả nhân viên");
                System.out.println("4. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        System.out.println("==== Thông tin nhân viên quản lý ==== ");
                        int count = 1;
                        for (int i = 0; i < employees.size(); i++) {
                            if(employees.get(i) instanceof ManagementEmployee) {
                                System.out.println("Thông tin nhân viên thứ " + count++);
                                employees.get(i).output();
                            }
                        }
                        break;
                    case 2:
                        // Code logic tại đây
                        break;
                    case 3:
                        System.out.println("==== Thông tin tất cả nhân viên ==== ");
                        for (int i = 0; i < employees.size(); i++) {
                                System.out.println("Thông tin nhân viên thứ " + (i + 1));
                                employees.get(i).output();
                        }
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }

            } while (choose < 0 || choose > 4);
        }
    }

    private static void menuSort() {
        int choose;
        while (true) {
            do {
                System.out.println("SẮP XẾP NHÂN VIÊN THEO LƯƠNG");
                System.out.println("1. Nhân viên quản lý");
                System.out.println("2. Nhân viên sản xuất");
                System.out.println("3. Tất cả nhân viên");
                System.out.println("4. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        menuSortManagementEmployee();
                        break;
                    case 2:
                        menuSortProductionEmployee();
                        break;
                    case 3:
                        menuSortAllEmployee();
                        break;
                    case 4:
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }

            } while (choose < 0 || choose > 4);
        }
    }

    private static void menuSortManagementEmployee() {
        int choose;
        while (true) {
            do {
                System.out.println("SẮP XẾP NHÂN VIÊN QUẢN LÝ");
                System.out.println("1. Tăng dần");
                System.out.println("2. Giảm dần");
                System.out.println("3. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        // Code logic tại đây
                        break;
                    case 2:
                        // Code logic tại đây
                        break;
                    case 3:
                        // Code logic tại đây
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }

            } while (choose < 0 || choose > 3);
        }
    }

    private static void menuSortProductionEmployee() {
        int choose;
        while (true) {
            do {
                System.out.println("SẮP XẾP NHÂN VIÊN SẢN XUẤT");
                System.out.println("1. Tăng dần");
                System.out.println("2. Giảm dần");
                System.out.println("3. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        // Code logic tại đây
                        break;
                    case 2:
                        // Code logic tại đây
                        break;
                    case 3:
                        // Code logic tại đây
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }

            } while (choose < 0 || choose > 3);
        }
    }

    private static void menuSortAllEmployee() {
        int choose;
        while (true) {
            do {
                System.out.println("SẮP XẾP TẤT CẢ NHÂN VIÊN");
                System.out.println("1. Tăng dần");
                System.out.println("2. Giảm dần");
                System.out.println("3. Trở về menu chính");

                System.out.print("Mời bạn lựa chọn: ");
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {
                    case 1:
                        // Code logic tại đây
                        break;
                    case 2:
                        // Code logic tại đây
                        break;
                    case 3:
                        // Code logic tại đây
                        return;
                    default:
                        System.out.println("Lựa chọn không hợp lệ, xin chọn lại!");
                }

            } while (choose < 0 || choose > 3);
        }
    }
}
