package web.vo;

public class SemiVO {
	private String id,pw,name,address;
	private int age;
	
	public SemiVO() {
		super();
	}
	public SemiVO(String id, 
			String pw, String name) {
		this(id,pw,name,"대한민국",1);
	}
	public SemiVO(String id, String pw, String name, String address, int age) {
		setId(id);
		setPw(pw);
		setName(name);
		setAddress(address);
		setAge(age);
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		if(id!=null) {
			this.id = id;
		}else {
			System.out.println("id를 입력해주세요.");
		}
	}
	public String getPw() {
		return pw;
	}
	public void setPw(String pw) {
		if(pw!=null) {
			this.pw = pw;
		}else {
			System.out.println("pw를 입력해주세요.");
		}
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		if(name!=null) {
			this.name = name;
		}else {
			System.out.println("name를 입력해주세요.");
		}
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address!=null) {
			this.address = address;
		}else {
			System.out.println("address를 입력해주세요.");
		}
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		if(age>0) {
			this.age = age;
		}else {
			System.out.println("age를 입력해주세요.");
		}
	}
	
	@Override
	public String toString() {
		return "SemiVO [id=" + id + ", pw=" + pw + ", name=" + name + ", address=" + address + ", age=" + age + "]";
	}
}
