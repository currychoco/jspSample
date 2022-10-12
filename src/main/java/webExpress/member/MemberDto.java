package webExpress.member;

import java.util.Date;

//Java Bean : 프로그램 안에서 데이터를 저장하는 자료구조
// 1) VO(Value Object) - VO는 read only임 -> getter 만 제공
// 2) DTO(Data Transfer Object) - 데이터베이스와 데이터를 주고받는 객체로 사용
// 3) DAO(Data Access Object) - DTO를 얻을 수 있도록 데이터베이스에 직접적으로 연동해주는 객체(데이터 처리 로직을 제공하는 인터페이스)


//회원정보에 대한 객체를 생성하는 클래스
public class MemberDto { //DTO
	//숙제 : Oracle Database의 member_tbl02, money_tbl_02에 매칭되어지는 MemberDto, MoneyDto만들고
	// Singleton Patter으로 MemberDao, MoneyDao를 만들어올 것
	// 총 4개의 코드블럭 제출	
	private int custno;
	private String custname;
	private String phone;
	private String address;
	private Date joindate;
	private String grade;
	private String city;
	
	public MemberDto(int custno, String custname, String phone, String address, Date joindate, String grade,
			String city) {
		super();
		this.custno = custno;
		this.custname = custname;
		this.phone = phone;
		this.address = address;
		this.joindate = joindate;
		this.grade = grade;
		this.city = city;
	}

	public int getCustno() {
		return custno;
	}

	public void setCustno(int custno) {
		this.custno = custno;
	}

	public String getCustname() {
		return custname;
	}

	public void setCustname(String custname) {
		this.custname = custname;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public Date getJoindate() {
		return joindate;
	}

	public void setJoindate(Date joindate) {
		this.joindate = joindate;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	
	
	
}
