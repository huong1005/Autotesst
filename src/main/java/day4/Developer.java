package day4;

public class Developer {

	public static void main(String[] args) {
		Employee dev1 = new Employee();
		dev1.setId(1);
		dev1.setName("Nguyễn Thị Hương");
		System.out.println("Mã nv:" + dev1.getId() + "Tên nv:" + dev1.getName() + "Lương:" + dev1.getSalary());
		
		Employee dev2 = new Employee();
		dev1.setId(2);
		dev1.setName("Nguyễn Thị A ");
		System.out.println("Mã nv:" + dev2.getId() + "Tên nv:" + dev2.getName() + "Lương:" + dev2.getSalary());

	}

}
