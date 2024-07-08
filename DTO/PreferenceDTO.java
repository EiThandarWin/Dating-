package DTO;

public class PreferenceDTO {
	
	private String p_id;
	private String u_id;
	private String p_gender;
	private String p_interest;
	private String relationship_type;
	private String p_age;
	private String p_sign;
	private String p_height;
	private String p_location;
	
	//constructor
	public PreferenceDTO(String p_id, String u_id, String p_gender, String p_interest, String relationship_type,
			String p_age, String p_sign, String p_height, String p_location) {
		this.p_id = p_id;
		this.u_id = u_id;
		this.p_gender = p_gender;
		this.p_interest = p_interest;
		this.relationship_type = relationship_type;
		this.p_age = p_age;
		this.p_sign = p_sign;
		this.p_height = p_height;
		this.p_location = p_location;
	}
	
	//getter & setter
	public String getP_id() {
		return p_id;
	}
	public void setP_id(String p_id) {
		this.p_id = p_id;
	}
	public String getU_id() {
		return u_id;
	}
	public void setU_id(String u_id) {
		this.u_id = u_id;
	}
	public String getP_gender() {
		return p_gender;
	}
	public void setP_gender(String p_gender) {
		this.p_gender = p_gender;
	}
	public String getP_interest() {
		return p_interest;
	}
	public void setP_interest(String p_interest) {
		this.p_interest = p_interest;
	}
	public String getRelationship_type() {
		return relationship_type;
	}
	public void setRelationship_type(String relationship_type) {
		this.relationship_type = relationship_type;
	}
	public String getP_age() {
		return p_age;
	}
	public void setP_age(String p_age) {
		this.p_age = p_age;
	}
	public String getP_sign() {
		return p_sign;
	}
	public void setP_sign(String p_sign) {
		this.p_sign = p_sign;
	}
	public String getP_height() {
		return p_height;
	}
	public void setP_height(String p_height) {
		this.p_height = p_height;
	}
	public String getP_location() {
		return p_location;
	}
	public void setP_location(String p_location) {
		this.p_location = p_location;
	}
	
	
}
