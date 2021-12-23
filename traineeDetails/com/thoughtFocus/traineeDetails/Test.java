package com.thoughtFocus.traineeDetails;

public class Test {
	public static void main(String[] args) {
		TraineeDetails details = new TraineeDetails(); // employee1
		details.setId(106588);
		details.setName("vamsi");
		details.setPhoneNumber(7680838372l);

		TraineeDetails details1 = new TraineeDetails(); // employee2
		details1.setId(106587);
		details1.setName("venkatesh");
		details1.setPhoneNumber(7680838375l);

		TraineeDetailsDao dao = new TraineeDetailsDao();

		dao.save(details);
		dao.save(details1);

		dao.printAll();
		System.out.println("--------------------------------");

		TraineeDetails details2 = new TraineeDetails(); // employee with incorrect details

		details2.setId(0);
		details2.setName(null);
		details2.setPhoneNumber(7680838372l);

		String saveStatus = dao.save(details2);

		System.out.println(saveStatus);
		System.out.println("--------------------------------");

		String deleteByIdStatus = dao.deleteById(106587); // deleting by id
		System.out.println(deleteByIdStatus);
		dao.printAll();
		System.out.println("--------------------------------");

		String deleteByNameStatus = dao.deleteByName("arjun"); // deleting unknown employee
		System.out.println(deleteByNameStatus);
		dao.printAll();
		System.out.println("--------------------------------");

		dao.updateEmployeeId(106588, 1065100); // updating id
		dao.printAll();

		System.out.println("--------------------------------");

		dao.updateName("vamsi", "vamsikrishna");// updating name
		dao.updateEmployeeMobile(7680838372l, 7680838371l);// updating number

		dao.printAll();

	}
}
