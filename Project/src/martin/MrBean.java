package martin;
class manga implements java.io.Serializable{
	private int id;
	private String name;
	private String author;
	
	public void setid(int id) {
		this.id =id;
	}
	public void setname(String name) {
		this.name = name;
	}
	public void setauthor(String author) {
		this.author = author;
	}
	public int getid() {
		return id;
	}
	public String getname() {
		return name;
	}
	public String getauthor() {
		return author;
	}
}

public class MrBean {
	public static void main(String[] arg) {
		manga obj= new manga();
		obj.setid(1);
		obj.setname("Seasons of Blooms");
		obj.setauthor("Megumi Fusikuro");
		System.out.println("Book ID : "+obj.getid());
		System.out.println("Book Name : "+obj.getname());
		System.out.println("Book Author : "+obj.getauthor());
	}
}
