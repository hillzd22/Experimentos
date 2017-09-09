package pe.edu.upc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Size;

@Entity
@Table(name="client")
public class Client {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name = "clientid")
	private int clientid;
	
	@Column(name = "firstname")
	@Size(max=100)
	private String firstname;
	
	@Column(name = "flastname")
	@Size(max=100)
	private String flastname;
	
	@Column(name = "mlastname")
	@Size(max=100)
	private String mlastname;
	
	@Column(name = "gender")
	@Size(max=1)
	private String gender;
	
	@Column(name = "address")
	@Size(max=150)
	private String address;
	
	@Column(name = "city")
	@Size(max=100)
	private String city;
	
	@Column(name = "region")
	@Size(max=100)
	private String region;
	
	@Column(name = "phonenumber")
	@Size(max=9)
	private String phonenumber;
	
	@Column(name = "dni")
	@Size(max=8)
	private String dni;
	
	@Column(name = "email")
	@Size(max=100)
	private String email;
	
    
	@Column(name = "password")
	private String password;
	

	@Column(name = "authorization")
	@Size(max=10)
	private String authorization;
	
	@Column(name = "state")
	@Size(max=5)
	private String state;
	
	public Client() {
		super();
		state = "ACT";
		// TODO Auto-generated constructor stub
	}

	public int getClientid() {
		return clientid;
	}

	public void setClientid(int clientid) {
		this.clientid = clientid;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getFlastname() {
		return flastname;
	}

	public void setFlastname(String flastname) {
		this.flastname = flastname;
	}

	public String getMlastname() {
		return mlastname;
	}

	public void setMlastname(String mlastname) {
		this.mlastname = mlastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getRegion() {
		return region;
	}

	public void setRegion(String region) {
		this.region = region;
	}

	public String getPhonenumber() {
		return phonenumber;
	}

	public void setPhonenumber(String phonenumber) {
		this.phonenumber = phonenumber;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getAuthorization() {
		return authorization;
	}

	public void setAuthorization(String authorization) {
		this.authorization = authorization;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}


	
}
